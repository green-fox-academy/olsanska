package com.gfa.reddit.repositories;

import com.gfa.reddit.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, String> {
    Optional<User> findByCookie(String cookie);
}
