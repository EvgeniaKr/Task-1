package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Status;

public interface StatusRepository extends JpaRepository<Status, Long> {
}