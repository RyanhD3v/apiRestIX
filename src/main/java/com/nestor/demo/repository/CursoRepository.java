package com.nestor.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nestor.demo.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {

}
