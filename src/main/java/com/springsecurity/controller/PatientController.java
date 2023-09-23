package com.springsecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.springsecurity.model.Patient;
import com.springsecurity.repository.PatientRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/patients")
public class PatientController {
	@Autowired
	private PatientRepository patientRepository;

	@PostMapping("/admit")
	public ResponseEntity<Patient> admitPatient(@RequestBody Patient patient) {
		// Ensure the patient is marked as admitted
		patient.setStatus("admitted");

		// Save the patient to the database
		Patient savedPatient = patientRepository.save(patient);

		return new ResponseEntity<>(savedPatient, HttpStatus.CREATED);
	}

	@GetMapping("/all")
	public ResponseEntity<List<Patient>> getAllPatients() {
		List<Patient> patients = patientRepository.findAll();
		return new ResponseEntity<>(patients, HttpStatus.OK);
	}

	@GetMapping("/{patientId}")
	public ResponseEntity<Patient> getPatientById(@PathVariable Long patientId) {
		Optional<Patient> optionalPatient = patientRepository.findById(patientId);
		if (optionalPatient.isPresent()) {
			return new ResponseEntity<>(optionalPatient.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PutMapping("/discharge/{patientId}")
	public ResponseEntity<Patient> dischargePatient(@PathVariable Long patientId) {
		Optional<Patient> optionalPatient = patientRepository.findById(patientId);
		if (optionalPatient.isPresent()) {
			Patient patient = optionalPatient.get();
			patient.setStatus("discharged");
			patientRepository.save(patient);
			return new ResponseEntity<>(patient, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
