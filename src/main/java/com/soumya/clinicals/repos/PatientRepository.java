package com.soumya.clinicals.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soumya.clinicals.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
