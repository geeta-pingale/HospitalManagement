package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.MedicalRecord;
import com.example.demo.services.MedicalRecordService;

import java.util.List;

@RestController
@RequestMapping("/medicalrecords") // Base path for all endpoints
public class MedicalRecordController {

    @Autowired
    private MedicalRecordService recordService;

    // ✅ Add a new medical record
    @PostMapping
    public String addRecord(@RequestBody MedicalRecord record) {
        recordService.saveMedicalRecord(record);
        return "Medical record added successfully.";
    }

    // ✅ Get a record by ID
    @GetMapping("/{recordId}")
     MedicalRecord getRecord(@PathVariable int recordId) {
        return recordService.getMedicalRecord(recordId);
    }

    // ✅ Get all medical records
    @GetMapping
    public List<MedicalRecord> getAllRecords() {
        return recordService.getAllRecords();
    }

    // ✅ Delete a record by ID
    @DeleteMapping("/{recordId}")
    public String deleteRecord(@PathVariable int recordId) {
        recordService.deleteRecord(recordId);
        return "Record deleted.";
    }

    // ✅ Delete all records
    @DeleteMapping
    public String deleteAll() {
        recordService.deleteAllRecords();
        return "All medical records deleted.";
    }
}
