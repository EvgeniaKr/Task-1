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
import com.example.demo.service.StatusService;

@RestController
@RequestMapping("/status")
public class StatusController {
	private final StatusService statusService;

	@Autowired
    public StatusController(StatusService statusService) {
		
		this.statusService = statusService;
	}

	@GetMapping("/{id}")
    public StatusDTO getById(@PathVariable Long id) {
        return statusService.getById(id);
    }

    @GetMapping
    public List<StatusDTO> getAll() {        
        
        return statusService.getAll();
    }

    @PutMapping("/{id}")
    public void update(
            @PathVariable Long id,
            @RequestBody StatusDTO dto) {
        statusService.update(id, dto);
    }

    @PostMapping
    public void add(@RequestBody StatusDTO dto) {
        statusService.create(dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
    	statusService.delete(id);
    }

}
