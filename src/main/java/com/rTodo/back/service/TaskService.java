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
	
	public Task create(String title, long creationTime, long updateTime, boolean done, String muuid) {		
		return taskRepository.save(new Task(title, creationTime, updateTime, done, muuid));
	}
	
	public List<Task> getAll() {
		return taskRepository.findAll();		
	}
	
	public List<Task> getByTitle(String title) {
		return taskRepository.findByTitle(title);
	}
	
	public Task getByUuid(String uuid) {
		return taskRepository.findByMuuid(uuid);
	}
	
	public Task update(String uuid,String title, long updateTime, boolean done) {
		Task t = taskRepository.findByMuuid(uuid);
		t.setTitle(title);
		t.setUpdateTime(updateTime);
		t.setDone(done);
		return taskRepository.save(t);
	}
	
	public void deleteAll() {
		taskRepository.deleteAll();
	}
	
	public void delete(String uuid) {
		Task t = taskRepository.findByMuuid(uuid);
		taskRepository.delete(t);
	}	
}
