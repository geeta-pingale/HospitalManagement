package com.example.demo.entity;
import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Appointment {

	@Id
	private int AppointmentID;
	private String Name;
	private int PatientID;
	private int DoctorID;
	private LocalDate date;
	private LocalTime time;
	private String Status;
	@Column(name="Reason",length=20)
	private String Reason;
	public int getAppointmentID() {
		return AppointmentID;
	}
	public void setAppointmentID(int appointmentID) {
		AppointmentID = appointmentID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPatientID() {
		return PatientID;
	}
	public void setPatientID(int patientID) {
		PatientID = patientID;
	}
	public int getDoctorID() {
		return DoctorID;
	}
	public void setDoctorID(int doctorID) {
		DoctorID = doctorID;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getReason() {
		return Reason;
	}
	public void setReason(String reason) {
		Reason = reason;
	}
	
	
	
}
