package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int DoctorID;
	private String Name;
	private String Specialty;
	private int Contact;
	private String Department;
	
	public int getDoctorID() {
		return DoctorID;
	}
	public void setDoctorID(int doctorID) {
		DoctorID = doctorID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSpecialty() {
		return Specialty;
	}
	public void setSpecialty(String specialty) {
		Specialty = specialty;
	}
	public int getContact() {
		return Contact;
	}
	public void setContact(int contact) {
		Contact = contact;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	


}
