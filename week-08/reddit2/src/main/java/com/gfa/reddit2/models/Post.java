package com.gfa.reddit2.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
public class Post {

    @Id
    @GeneratedValue
    private long id;

    private String title;
    private int score;
    private LocalDate date;
    String content;
}
