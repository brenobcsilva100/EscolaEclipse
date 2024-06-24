package com.example.demo.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.persistence.model.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long>{

}
