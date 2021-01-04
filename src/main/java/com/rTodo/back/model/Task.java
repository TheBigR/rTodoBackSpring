package com.rTodo.back.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Task {
	@Id
	String id;	
	String title;
	long creationTime;
	long updateTime;
	boolean done;
	String muuid;

	public Task(String title, long creationTime, long updateTime, boolean done, String muuid) {
		this.title = title;
		this.creationTime = creationTime;
		this.updateTime = updateTime;
		this.done = done;
		this.muuid = muuid;
	}


	public boolean isDone() {
		return done;
	}


	public void setDone(boolean done) {
		this.done = done;
	}


	public String getMuuid() {
		return muuid;
	}


	public void setMuuid(String muuid) {
		this.muuid = muuid;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public long getCreationTime() {
		return creationTime;
	}


	public void setCreationTime(long creationTime) {
		this.creationTime = creationTime;
	}


	public long getUpdateTime() {
		return updateTime;
	}


	public void setUpdateTime(long updateTime) {
		this.updateTime = updateTime;
	}
}