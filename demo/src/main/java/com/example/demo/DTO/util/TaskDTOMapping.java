package com.example.demo.DTO.util;

import org.springframework.stereotype.Component;

import com.example.demo.DTO.StatusDTO;
import com.example.demo.DTO.TaskDTO;
import com.example.demo.Entity.Task;

@Component
public class TaskDTOMapping {

    public Task dtoToEntity(TaskDTO dto) {
    	Task task = new Task();
    	task.setTask_name(dto.getStatus_name());
    	task.setTask_description(dto.getTask_description());
    	task.setStatus(dto.getStatus());
        return task;
    }

    public TaskDTO entityToDto(Task status) {
    	TaskDTO dto = new TaskDTO();
        dto.setStatus_name(status.getTask_name());
        dto.setTask_description(status.getTask_description());
        dto.setStatus(status.getStatus());
        return dto;
    }
}
