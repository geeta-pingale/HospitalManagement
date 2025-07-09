package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Patient;
import com.example.demo.repository.PatientRepo;

@Service
public class PatientService {

	@Autowired
	PatientRepo repo;

	public Patient savePatient(Patient P) {
		return repo.save(P);
	}

	public void deletePtient(int PatientId) {
		repo.deleteById(PatientId);
	}

	public Patient getPatient(int PatientId) {
		Optional<Patient> optional = repo.findById(PatientId);
		return optional.orElse(null);
	}

	public void deleteAll() {
		repo.deleteAll();

	}
}
