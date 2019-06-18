package com.example.json.unit;


import com.example.json.calorieCounter.models.Food;
import com.example.json.calorieCounter.models.WeeklyStatistic;
import com.example.json.calorieCounter.repositories.FoodRepository;
import com.example.json.calorieCounter.services.FoodServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;

public class FoodServiceTest {
    @Test
    public void getStatisticsReturnsValidResult() {
        // Arrange
        FoodRepository mockRepository = Mockito.mock(FoodRepository.class);

        Mockito.when(mockRepository.findAllByAddedAtAfterAndAddedAtBefore(any(), any()))
                .thenReturn(Arrays.asList(
                        new Food("Test food 1", 500, LocalDateTime.parse("2019-05-30T00:00")),
                        new Food("Test food 2", 200, LocalDateTime.parse("2019-06-03T00:00")),
                        new Food("Test food 3", 200, LocalDateTime.parse("2019-06-04T00:00"))
                ));

        FoodServiceImpl foodService = new FoodServiceImpl(mockRepository);

        //Act
        List<WeeklyStatistic> result = foodService.getStatistics(LocalDateTime.parse("2019-05-29T00:00"), LocalDateTime.parse("2019-06-05T00:00"));

        // Assert
        Assert.assertEquals(2, result.size());

    }
}

