package com.nestor.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nestor.demo.model.Inscripcion;


@Repository
public interface InscripcionRepository extends JpaRepository<Inscripcion, Long> {

}
