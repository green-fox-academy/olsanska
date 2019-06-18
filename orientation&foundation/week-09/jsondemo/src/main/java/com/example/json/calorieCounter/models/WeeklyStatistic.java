package com.example.json.calorieCounter.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class WeeklyStatistic {

    private LocalDateTime weekStart;
    private int totalCalories;

    public WeeklyStatistic(LocalDateTime weekStart, int totalCalories) {
        this.weekStart = weekStart;
        this.totalCalories = totalCalories;
    }
}
