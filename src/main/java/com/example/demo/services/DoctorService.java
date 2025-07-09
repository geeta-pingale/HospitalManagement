package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Doctor;
import com.example.demo.repository.DoctorRepo;

@Service
public class DoctorService {

	@Autowired
	DoctorRepo Repo;

	public void saveDoctor(Doctor D) {
		Repo.save(D);
	}

	public void deleteDoctor(int DoctorID) {
		Repo.deleteById(DoctorID);
	}

        public Doctor getDoctor(int DoctorID) {
		return Repo.findById(DoctorID).get();
	}

	public void deleteAll() {
		Repo.deleteAll();
	}
}
