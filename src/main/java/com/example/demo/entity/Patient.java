package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Patient {
	
	@Id
	private int patientId;
	private String name;
	private int Age;
	private String Gender;
	private String Address;
	private String ContactNumber;
	private String Email;
	private String MedicalHistory;
	private String CurrentMedications;
	private String Allergies;
	private String BloodType;
	private String EmergencyContact;
	private String AdmissionDate;
	private String DischargeDate;
	private String DoctorAssigned;
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getContactNumber() {
		return ContactNumber;
	}
	public void setContactNumber(String contactNumber) {
		ContactNumber = contactNumber;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getMedicalHistory() {
		return MedicalHistory;
	}
	public void setMedicalHistory(String medicalHistory) {
		MedicalHistory = medicalHistory;
	}
	public String getCurrentMedications() {
		return CurrentMedications;
	}
	public void setCurrentMedications(String currentMedications) {
		CurrentMedications = currentMedications;
	}
	public String getAllergies() {
		return Allergies;
	}
	public void setAllergies(String allergies) {
		Allergies = allergies;
	}
	public String getBloodType() {
		return BloodType;
	}
	public void setBloodType(String bloodType) {
		BloodType = bloodType;
	}
	public String getEmergencyContact() {
		return EmergencyContact;
	}
	public void setEmergencyContact(String emergencyContact) {
		EmergencyContact = emergencyContact;
	}
	public String getAdmissionDate() {
		return AdmissionDate;
	}
	public void setAdmissionDate(String admissionDate) {
		AdmissionDate = admissionDate;
	}
	public String getDischargeDate() {
		return DischargeDate;
	}
	public void setDischargeDate(String dischargeDate) {
		DischargeDate = dischargeDate;
	}
	public String getDoctorAssigned() {
		return DoctorAssigned;
	}
	public void setDoctorAssigned(String doctorAssigned) {
		DoctorAssigned = doctorAssigned;
	}
	 

}
