package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.StatusDTO;
import com.example.demo.DTO.TaskDTO;
import com.example.demo.service.StatusService;
import com.example.demo.service.TaskService;

@RestController
@RequestMapping("/task")
public class TaskController {
	private final TaskService taskService;

	@Autowired
    public TaskController(TaskService taskService) {
		
		this.taskService = taskService;
	}

	@GetMapping("/{id}")
    public TaskDTO getById(@PathVariable Long id) {
        return taskService.getById(id);
    }

    @GetMapping
    public List<TaskDTO> getAll() {        
        
        return taskService.getAll();
    }

    @PutMapping("/{id}")
    public void update(
            @PathVariable Long id,
            @RequestBody TaskDTO dto) {
    	taskService.update(id, dto);
    }

    @PostMapping
    public void add(@RequestBody TaskDTO dto) {
    	taskService.create(dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
    	taskService.delete(id);
    }
}
