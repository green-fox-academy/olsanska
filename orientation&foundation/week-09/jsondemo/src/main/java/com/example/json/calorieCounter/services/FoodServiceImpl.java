package com.example.json.calorieCounter.services;


import com.example.json.calorieCounter.models.Food;
import com.example.json.calorieCounter.models.WeeklyStatistic;
import com.example.json.calorieCounter.repositories.FoodRepository;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class FoodServiceImpl implements FoodService {
    private FoodRepository foodRepository;

    public FoodServiceImpl(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    @Override
    public Collection<Food> findAll() {
        return foodRepository.findAll()
                .stream()
                .sorted(Comparator.comparing(food -> food.getAddedAt()))
                .collect(Collectors.toList());
    }

    @Override
    public void add(Food food) {
        if (food == null) {
            throw new IllegalArgumentException("Food must not be null");
        }

        if (StringUtils.isEmpty(food.getName())) {
            throw new IllegalArgumentException("Food name is required");
        }

        if (food.getAmount() < 0) {
            throw new IllegalArgumentException("Food amount must be non-negative");
        }

        food.setAddedAt(LocalDateTime.now(Clock.systemUTC()));

        foodRepository.save(food);
    }

    @Override
    public void delete(long foodId) {
        foodRepository.deleteById(foodId);
    }

    @Override
    public List<WeeklyStatistic> getStatistics(LocalDateTime from, LocalDateTime to) {
        Collection<Food> foods = foodRepository.findAllByAddedAtAfterAndAddedAtBefore(from, to);

        return foods.stream()
                .collect(Collectors.groupingBy(f -> getWeekStart(f.getAddedAt())))
                .entrySet()
                .stream()
                .map(e -> new WeeklyStatistic(e.getKey(), getSum(e)))
                .collect(Collectors.toList());
    }

    private int getSum(Map.Entry<LocalDateTime, List<Food>> e) {
        return e.getValue().stream().mapToInt(Food::getAmount).sum();
    }

    private LocalDateTime getWeekStart(LocalDateTime dateTime) {
        return dateTime.with(DayOfWeek.MONDAY).with(LocalTime.MIDNIGHT);
    }
}