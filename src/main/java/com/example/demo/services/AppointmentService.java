package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Appointment;
import com.example.demo.repository.AppointmentRepo;

@Service
public class AppointmentService {

	
	@Autowired
	AppointmentRepo Repository;
	
	public void saveAppointment(Appointment A) 
	{
		Repository.save(A);
	}
	
	public void deleteAppointment(int AppointmentID) {
		 
		Repository.deleteById(AppointmentID);
	}
	
	public Appointment getAppointment(int AppointmentID) {
		return Repository.findById(AppointmentID).get();
	}
	
	public void deleteAll() {
		Repository.deleteAll();
	}
}
