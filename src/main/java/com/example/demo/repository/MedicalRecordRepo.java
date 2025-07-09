package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.MedicalRecord;

public interface MedicalRecordRepo extends JpaRepository<MedicalRecord, Integer> {

}
