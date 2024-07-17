package com.example.demo.DTO.util;

import org.springframework.stereotype.Component;

import com.example.demo.DTO.StatusDTO;
import com.example.demo.Entity.Status;

@Component
public class StatusDTOMapping {
	

    public Status dtoToEntity(StatusDTO dto) {
    	Status status = new Status();
    	status.setStatus_name(dto.getStatus_name());
        return status;
    }

    public StatusDTO entityToDto(Status status) {
    	StatusDTO dto = new StatusDTO();
        dto.setStatus_name(status.getStatus_name());
        return dto;
    }

}
