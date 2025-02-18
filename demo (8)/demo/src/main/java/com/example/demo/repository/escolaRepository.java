package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.controller.escolaControler.escola;
public interface escolaRepository extends JpaRepository<escola, Long> {
}