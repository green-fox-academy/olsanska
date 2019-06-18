package com.example.json.calorieCounter.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
@NoArgsConstructor
public class Food {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;

    @NotNull
    @Length(min = 1)
    private String name;

    @Min(0)
    private int amount;

    private LocalDateTime addedAt;

    public Food(String name, int amount, LocalDateTime addedAt) {
        this.name = name;
        this.amount = amount;
        this.addedAt = addedAt;
    }

    public Food() {
    }
}
