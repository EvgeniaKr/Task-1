package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.StatusDTO;
import com.example.demo.DTO.util.StatusDTOMapping;
import com.example.demo.Entity.Status;
import com.example.demo.repository.StatusRepository;

@Service
public class StatusServiceImpl implements StatusService {
	private final StatusRepository statusRepository;
    private final StatusDTOMapping statusDTOMapping;
    
    
    @Autowired
    public StatusServiceImpl(StatusRepository statusRepository, StatusDTOMapping statusDTOMapping) {
		super();
		this.statusRepository = statusRepository;
		this.statusDTOMapping = statusDTOMapping;
	}

	@Override
    public StatusDTO getById(Long id) {
        return statusDTOMapping.entityToDto(
        		statusRepository.findById(id).get());
    }

    

    @Override
    public List<StatusDTO> getAll() {
        return statusRepository.findAll().stream()
                .map(statusDTOMapping::entityToDto)
                .toList();
    }

    @Override
    public void update(Long id, StatusDTO dto) {
        Status status = statusRepository.findById(id).get();
        status.setStatus_name(dto.getStatus_name());
        statusRepository.save(status);
    }

    @Override
    public void create(StatusDTO dto) {
    	
    	statusRepository.save(statusDTOMapping.dtoToEntity(dto));
    }

    @Override
    public void delete(Long id) {
    	statusRepository.deleteById(id);
    }

}
