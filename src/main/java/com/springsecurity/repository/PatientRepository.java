package com.springsecurity.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springsecurity.model.Patient;

import java.util.List;
@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
    List<Patient> findByStatus(String status);
}
