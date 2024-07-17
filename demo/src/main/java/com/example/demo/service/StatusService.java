package com.example.demo.service;

import java.util.List;

import com.example.demo.DTO.StatusDTO;

public interface StatusService {
	StatusDTO getById(Long id);

    List<StatusDTO> getAll();

    void update(Long id, StatusDTO dto);

    void create(StatusDTO dto);

    void delete(Long id);
}
