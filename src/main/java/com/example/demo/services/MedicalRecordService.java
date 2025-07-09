package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.MedicalRecord;
import com.example.demo.repository.MedicalRecordRepo;

@Service
public class MedicalRecordService {

    @Autowired
    private MedicalRecordRepo recordRepository;

    // Save or update a medical record
    public void saveMedicalRecord(MedicalRecord record) {
        recordRepository.save(record);
    }

    // Get a medical record by ID
    public MedicalRecord getMedicalRecord(int recordId) {
        Optional<MedicalRecord> optional = recordRepository.findById(recordId);
        return optional.orElse(null);
    }

    // Get all medical records
    public List<MedicalRecord> getAllRecords() {
        return recordRepository.findAll();
    }

    // Delete a record by ID
    public void deleteRecord(int recordId) {
        recordRepository.deleteById(recordId);
    }

    // Delete all records
    public void deleteAllRecords() {
        recordRepository.deleteAll();
    }
}
