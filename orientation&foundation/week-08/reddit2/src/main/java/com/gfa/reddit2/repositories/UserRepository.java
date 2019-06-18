package com.gfa.reddit2.repositories;

import com.gfa.reddit2.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
