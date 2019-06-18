package com.example.json.calorieCounter.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class Food {

    private long id;
    private String name;
    private int amount;
    private LocalDateTime addedAt;

}
