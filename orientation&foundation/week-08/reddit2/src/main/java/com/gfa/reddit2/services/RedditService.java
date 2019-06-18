package com.gfa.reddit2.services;

import com.gfa.reddit2.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedditService {

    @Autowired
    PostRepository postRepository;
}
