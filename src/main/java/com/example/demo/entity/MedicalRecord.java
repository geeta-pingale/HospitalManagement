package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MedicalRecord {

	
	
	

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int recordId;

	    private int patientId;
	    private int doctorId;

	    private String diagnosis;
	    private String treatment;
	    private String prescription;

	    private LocalDate visitDate;

	    // Optional: Additional notes
	    private String notes;

	    // Getters and Setters

	    public int getRecordId() {
	        return recordId;
	    }

	    public void setRecordId(int recordId) {
	        this.recordId = recordId;
	    }

	    public int getPatientId() {
	        return patientId;
	    }

	    public void setPatientId(int patientId) {
	        this.patientId = patientId;
	    }

	    public int getDoctorId() {
	        return doctorId;
	    }

	    public void setDoctorId(int doctorId) {
	        this.doctorId = doctorId;
	    }

	    public String getDiagnosis() {
	        return diagnosis;
	    }

	    public void setDiagnosis(String diagnosis) {
	        this.diagnosis = diagnosis;
	    }

	    public String getTreatment() {
	        return treatment;
	    }

	    public void setTreatment(String treatment) {
	        this.treatment = treatment;
	    }

	    public String getPrescription() {
	        return prescription;
	    }

	    public void setPrescription(String prescription) {
	        this.prescription = prescription;
	    }

	    public LocalDate getVisitDate() {
	        return visitDate;
	    }

	    public void setVisitDate(LocalDate visitDate) {
	        this.visitDate = visitDate;
	    }

	    public String getNotes() {
	        return notes;
	    }

	    public void setNotes(String notes) {
	        this.notes = notes;
}
	}

