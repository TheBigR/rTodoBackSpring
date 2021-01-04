package com.rTodo.back.controller;

import java.util.List;
import java.util.UUID;

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
			@RequestParam long creationTime,
			@RequestParam long updateTime,
			@RequestParam boolean done
			) {
		String muuid = UUID.randomUUID().toString().replace("-", "");
		Task t = taskService.create(title, creationTime, updateTime, done, muuid);
		return t.toString();
	}
	
	@RequestMapping("/getByTitle")
	public List<Task> getTasksByTitle(@RequestParam String title) {
		return taskService.getByTitle(title);
	}
	
	@RequestMapping("/getByUuid")
	public Task getTaskByUuid(@RequestParam String uuid) {
		return taskService.getByUuid(uuid);
	}
	
	@RequestMapping("/getAll")
	public List<Task> getAll() {
		return taskService.getAll();
	}
	
	@RequestMapping("/update")
	public String update(
			@RequestParam String title,
			@RequestParam String newTitle,
			@RequestParam long updateTime,
			@RequestParam boolean done
			) {
		Task t = taskService.update(title, newTitle, updateTime, done);
		return t.toString();
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam String uuid) {
		taskService.delete(uuid);
		return "Deleted " + uuid;
	}	
	
	@RequestMapping("/deleteAll")
	public String deleteAll() {
		taskService.deleteAll();
		return "Deleted all records";
	}
}
