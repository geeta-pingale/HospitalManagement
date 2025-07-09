package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Patient;
import com.example.demo.services.PatientService;

@RestController
public class PatientController {

	
	
	@Autowired
	PatientService PS;
	
	
	@PostMapping("Patient")
	String addPatient(@RequestBody Patient P) {
		 PS.savePatient(P);
		 return "Patient Added successfully";
	}
	
	@GetMapping("Patient/{PatientId}")
	Patient getPatient(@PathVariable int PatientId)
	{
	return PS.getPatient(PatientId);
		
	}
	@DeleteMapping("Patient/{PatientId}")
	String deletePatient(@PathVariable int PatientId) {
		PS.deletePtient(PatientId);
		return"Patient is delted";
	}
	@DeleteMapping("Patients")
	String deleteAll()
	{
		PS.deleteAll();
		return"All Data Deleted";

	}
	
}
