package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.TaskDTO;
import com.example.demo.DTO.util.StatusDTOMapping;
import com.example.demo.DTO.util.TaskDTOMapping;
import com.example.demo.Entity.Status;
import com.example.demo.Entity.Task;
import com.example.demo.repository.StatusRepository;
import com.example.demo.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService {
	private final TaskRepository taskRepository;
    private final TaskDTOMapping taskDTOMapping;
    
    
    @Autowired
    public TaskServiceImpl(TaskRepository taskRepository, TaskDTOMapping taskDTOMapping) {
		super();
		this.taskRepository = taskRepository;
		this.taskDTOMapping = taskDTOMapping;
	}

	@Override
    public TaskDTO getById(Long id) {
        return taskDTOMapping.entityToDto(
        		taskRepository.findById(id).get());
    }

    

    @Override
    public List<TaskDTO> getAll() {
        return taskRepository.findAll().stream()
                .map(taskDTOMapping::entityToDto)
                .toList();
    }

    @Override
    public void update(Long id, TaskDTO dto) {
        Task task = taskRepository.findById(id).get();
        task.setTask_name(dto.getStatus_name());
        task.setTask_description(dto.getTask_description());
        task.setStatus(dto.getStatus());
        taskRepository.save(task);
    }

    @Override
    public void create(TaskDTO dto) {
    	
    	taskRepository.save(taskDTOMapping.dtoToEntity(dto));
    }

    @Override
    public void delete(Long id) {
    	taskRepository.deleteById(id);
    }

}
