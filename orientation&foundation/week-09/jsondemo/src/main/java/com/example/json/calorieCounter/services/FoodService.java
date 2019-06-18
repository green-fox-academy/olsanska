package com.example.json.calorieCounter.services;

import com.example.json.calorieCounter.models.Food;
import com.example.json.calorieCounter.models.WeeklyStatistic;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

public interface FoodService {

    Collection<Food> findAll();

    void add(Food food);

    void delete(long food);

    List<WeeklyStatistic> getStatistics(LocalDateTime from, LocalDateTime to);
}

