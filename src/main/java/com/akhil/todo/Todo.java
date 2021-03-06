package com.akhil.todo;

import java.util.Date;

public class Todo {
	
	private int id;
	private String name;
	private String description;
	private String details;
	private Date startDate;
	private Date targetDate;
	private boolean isDone;
	
	
	public Todo(int id, String name, String description, String details, Date startDate, Date targetDate, boolean isDone) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.details = details;
		this.startDate = startDate;
		this.targetDate = targetDate;
		this.isDone = isDone;
	}
	
	
	@Override
	public String toString() {
		return "Todo [id=" + id + ", name=" + name + ", description=" + description + ", startDate=\" + startDate, targetDate=" + targetDate
				+ ", isDone=" + isDone + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		if (id != other.id)
			return false;
		return true;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}
	public boolean isDone() {
		return isDone;
	}
	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public String getDetails() {
		return details;
	}


	public void setDetails(String details) {
		this.details = details;
	}
	
	

}
