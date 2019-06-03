package com.gfa.todoapp.repository;

import com.gfa.todoapp.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}
