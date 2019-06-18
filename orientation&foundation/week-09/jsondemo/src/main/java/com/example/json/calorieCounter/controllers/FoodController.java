package com.example.json.calorieCounter.controllers;

import com.example.json.calorieCounter.models.Food;
import com.example.json.calorieCounter.services.FoodService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collection;

@RestController
@RequestMapping("/foods")
public class FoodController {

    private FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping
    public Collection<Food> list() {
        return foodService.findAll();
    }

    @PostMapping
    public ResponseEntity add(@RequestBody @Valid Food food) {
        foodService.add(food);

        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity delete(long id) {
        foodService.delete(id);

        return ResponseEntity.noContent().build();
    }

}
