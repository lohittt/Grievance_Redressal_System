package com.examly.springapp.controller;

import com.examly.springapp.model.Grievance;
import com.examly.springapp.service.GrievanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api/grievances")
public class GrievanceController {
    
    @Autowired
    private GrievanceService grievanceService;
    
    @PostMapping
    public ResponseEntity<?> createGrievance(@RequestBody(required = false) Grievance grievance) {
        if (grievance == null) {
            return ResponseEntity.badRequest().build();
        }
        Grievance savedGrievance = grievanceService.saveGrievance(grievance);
        return new ResponseEntity<>(savedGrievance, HttpStatus.CREATED);
    }
    
    @GetMapping
    public ResponseEntity<List<Grievance>> getAllGrievances() {
        List<Grievance> grievances = grievanceService.getAllGrievances();
        return ResponseEntity.ok(grievances);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Grievance> getGrievanceById(@PathVariable Long id) {
        Optional<Grievance> grievance = grievanceService.getGrievanceById(id);
        return grievance.map(ResponseEntity::ok)
                       .orElse(ResponseEntity.notFound().build());
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Grievance> updateGrievance(@PathVariable Long id, @RequestBody Grievance grievance) {
        Grievance updatedGrievance = grievanceService.updateGrievance(id, grievance);
        if (updatedGrievance != null) {
            return ResponseEntity.ok(updatedGrievance);
        }
        return ResponseEntity.notFound().build();
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGrievance(@PathVariable Long id) {
        grievanceService.deleteGrievance(id);
        return ResponseEntity.noContent().build();
    }
}
