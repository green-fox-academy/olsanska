package com.gfa.reddit.post;

import com.gfa.reddit.post.Post;
import com.gfa.reddit.user.User;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;

import java.awt.print.Pageable;
import java.util.Optional;

public interface PostRepository extends CrudRepository<Post, String> {

    Post findFirstById(Long number);

    Optional<Post> findOneByIdAndUser(long id, User user);
   // Page<Post> findAllByIdGreaterThanOrderByVotesDesc(Pageable pageable, Long number);
}

