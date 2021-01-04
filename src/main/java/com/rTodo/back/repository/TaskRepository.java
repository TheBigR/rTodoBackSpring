package com.rTodo.back.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rTodo.back.model.Task;

@Repository
public interface TaskRepository extends MongoRepository<Task, String> {
	public List<Task> findByTitle(String title);
	public Task findByMuuid(String muuid);
}
