package com.gfa.reddit.post;

import com.gfa.reddit.user.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue
    private long id;

    String title;@ManyToOne
    private int votes;
    private LocalDate date;
    String content;

    @ManyToOne
    User user;

}
