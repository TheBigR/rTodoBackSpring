package com.rTodo.back.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Task {
	@Id
	String id;
	String title;
	int creationTime;
	int updateTime;
	boolean done;


	public Task(String title, int creationTime, int updateTime, boolean done) {
		this.title = title;
		this.creationTime = creationTime;
		this.updateTime = updateTime;
		this.done = done;
	}


	public boolean isDone() {
		return done;
	}


	public void setDone(boolean done) {
		this.done = done;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getCreationTime() {
		return creationTime;
	}


	public void setCreationTime(int creationTime) {
		this.creationTime = creationTime;
	}


	public int getUpdateTime() {
		return updateTime;
	}


	public void setUpdateTime(int updateTime) {
		this.updateTime = updateTime;
	}
}