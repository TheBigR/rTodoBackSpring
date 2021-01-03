package com.rTodo.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rTodo.back.model.Task;
import com.rTodo.back.repository.TaskRepository;

@Service
public class TaskService {
	
	@Autowired
	private TaskRepository taskRepository;
	
	public Task create(String title, int creationTime, int updateTime, boolean done) {
		return taskRepository.save(new Task(title, creationTime, updateTime, done));
	}
	
	public List<Task> getAll() {
		return taskRepository.findAll();		
	}
	
	public Task getByTitle(String title) {
		return taskRepository.findByTitle(title);
	}
	
	public Task update(String title,String newTitle, int updateTime, boolean done) {
		Task t = taskRepository.findByTitle(title);
		t.setTitle(newTitle);
		t.setUpdateTime(updateTime);
		t.setDone(done);
		return taskRepository.save(t);
	}
	
	public void deleteAll() {
		taskRepository.deleteAll();
	}
	
	public void delete(String title) {
		Task t = taskRepository.findByTitle(title);
		taskRepository.delete(t);
	}	
}
