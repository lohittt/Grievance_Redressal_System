package com.examly.springapp.controller;

import com.examly.springapp.model.GrievanceCategory;
import com.examly.springapp.service.GrievanceCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api/grievance-categories")
public class GrievanceCategoryController {
    
    @Autowired
    private GrievanceCategoryService grievanceCategoryService;
    
    @PostMapping
    public ResponseEntity<GrievanceCategory> createGrievanceCategory(@RequestBody GrievanceCategory grievanceCategory) {
        GrievanceCategory savedCategory = grievanceCategoryService.saveGrievanceCategory(grievanceCategory);
        return new ResponseEntity<>(savedCategory, HttpStatus.CREATED);
    }
    
    @GetMapping
    public ResponseEntity<List<GrievanceCategory>> getAllGrievanceCategories() {
        List<GrievanceCategory> categories = grievanceCategoryService.getAllGrievanceCategories();
        return ResponseEntity.ok(categories);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<GrievanceCategory> getGrievanceCategoryById(@PathVariable Long id) {
        Optional<GrievanceCategory> category = grievanceCategoryService.getGrievanceCategoryById(id);
        return category.map(ResponseEntity::ok)
                      .orElse(ResponseEntity.notFound().build());
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<GrievanceCategory> updateGrievanceCategory(@PathVariable Long id, @RequestBody GrievanceCategory grievanceCategory) {
        GrievanceCategory updatedCategory = grievanceCategoryService.updateGrievanceCategory(id, grievanceCategory);
        if (updatedCategory != null) {
            return ResponseEntity.ok(updatedCategory);
        }
        return ResponseEntity.notFound().build();
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGrievanceCategory(@PathVariable Long id) {
        grievanceCategoryService.deleteGrievanceCategory(id);
        return ResponseEntity.noContent().build();
    }
    
    @GetMapping("/search/{keyword}")
    public ResponseEntity<List<GrievanceCategory>> searchGrievanceCategories(@PathVariable String keyword) {
        List<GrievanceCategory> categories = grievanceCategoryService.searchGrievanceCategories(keyword);
        return ResponseEntity.ok(categories);
    }
}
