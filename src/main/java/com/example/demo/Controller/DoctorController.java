package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Doctor;
import com.example.demo.services.DoctorService;

@RestController
public class DoctorController {

    @Autowired
    DoctorService DS;

   
    @PostMapping("doctor") 
    public String addDoctor(@RequestBody Doctor doctor) {
        DS.saveDoctor(doctor);
        return "Doctor added successfully.";
    }

    
    @GetMapping("doctor/{DoctorID}")
    Doctor getDoctor(@PathVariable int DoctorID) {
        return DS.getDoctor(DoctorID);
    }

    
    @DeleteMapping("doctor/{DoctorID}")
    public String deleteDoctor(@PathVariable int DoctorID) {
        DS.deleteDoctor(DoctorID);
        return "Doctor deleted successfully.";
    }

    
    @DeleteMapping("doctor")
    public String deleteAll() {
        DS.deleteAll();
        return "All doctor records deleted.";
    }
}
