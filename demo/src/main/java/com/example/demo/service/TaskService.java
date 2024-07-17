package com.example.demo.service;

import java.util.List;

import com.example.demo.DTO.StatusDTO;
import com.example.demo.DTO.TaskDTO;

public interface TaskService {
	TaskDTO getById(Long id);

    List<TaskDTO> getAll();

    void update(Long id, TaskDTO dto);

    void create(TaskDTO dto);

    void delete(Long id);
}
