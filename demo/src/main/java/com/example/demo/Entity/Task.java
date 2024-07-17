package com.example.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "task")
public class Task {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "task_id")
    private Long task_id;
	
	@Column(name = "task_name")
	private String task_name;

	@Column(name = "task_description")
	private String task_description;
	
	@ManyToOne
    @JoinColumn(name = "status_id")	
    private Status status;

	public Long getTask_id() {
		return task_id;
	}

	public void setTask_id(Long task_id) {
		this.task_id = task_id;
	}

	public String getTask_name() {
		return task_name;
	}

	public void setTask_name(String task_name) {
		this.task_name = task_name;
	}

	public String getTask_description() {
		return task_description;
	}

	public void setTask_description(String task_description) {
		this.task_description = task_description;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	
}
