package com.rTodo.back.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rTodo.back.model.Task;
import com.rTodo.back.service.TaskService;

@RestController
public class TaskController {

	@Autowired
	private TaskService taskService;
	
	@RequestMapping("/create")
	public String create(
			@RequestParam String title, 
			@RequestParam int creationTime,
			@RequestParam int updateTime,
			@RequestParam boolean done
			) {
		Task t = taskService.create(title, creationTime, updateTime, done);
		return t.toString();
	}
	
	@RequestMapping("/get")
	public Task getTask(@RequestParam String title) {
		return taskService.getByTitle(title);
	}
	
	@RequestMapping("/getAll")
	public List<Task> getAll() {
		return taskService.getAll();
	}
	
	@RequestMapping("/update")
	public String update(
			@RequestParam String title,
			@RequestParam String newTitle,
			@RequestParam int updateTime,
			@RequestParam boolean done
			) {
		Task t = taskService.update(title, newTitle, updateTime, done);
		return t.toString();
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam String title) {
		taskService.delete(title);
		return "Deleted " + title;
	}	
	
	@RequestMapping("/deleteAll")
	public String deleteAll() {
		taskService.deleteAll();
		return "Deleted all records";
	}
}
