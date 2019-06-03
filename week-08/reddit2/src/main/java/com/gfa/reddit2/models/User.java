package com.gfa.reddit2.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue
    private long id;

    private String username;
    private List<Post> posts;

    public User(String username) {
        this.username = username;
    }

}
