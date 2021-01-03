package com.rTodo.back.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rTodo.back.model.Task;

@Repository
public interface TaskRepository extends MongoRepository<Task, String> {
	public Task findByTitle(String title);
}
