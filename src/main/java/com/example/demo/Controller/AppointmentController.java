package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Appointment;
import com.example.demo.services.AppointmentService;

@RestController
public class AppointmentController {

	@Autowired
	AppointmentService as;

	@PostMapping("Appointment")
	String addAppointment(@RequestBody Appointment A)
	{
		as.saveAppointment(A);
		return "Appointment sucsessfully added";

	}

	@GetMapping("Appointment/{AppointmentID}")
	Appointment getAppointment(@PathVariable int AppointmentID) 
	{
	return as.getAppointment(AppointmentID);     

	}

	@DeleteMapping("Appointment/{AppointmentID}")
	String deleteAppointment(@PathVariable int AppointmentID) 
	{
		as.deleteAppointment(AppointmentID);
		return "Appointment deleted";
	}

	@DeleteMapping("Appointments")
	String deleteAll() {
		as.deleteAll();
		return" all data deleted";
	}

}
