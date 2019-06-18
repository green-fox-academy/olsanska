package com.example.json.calorieCounter.repositories;

import com.example.json.calorieCounter.models.Food;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.Collection;

public interface FoodRepository extends CrudRepository<Food, Long> {
    Collection<Food> findAll();
    Collection<Food> findAllByAddedAtAfterAndAddedAtBefore(LocalDateTime from, LocalDateTime to);

}

