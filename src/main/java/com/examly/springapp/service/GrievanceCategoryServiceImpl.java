package com.examly.springapp.service;

import com.examly.springapp.model.GrievanceCategory;
import com.examly.springapp.repository.GrievanceCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class GrievanceCategoryServiceImpl implements GrievanceCategoryService {
    
    @Autowired
    private GrievanceCategoryRepository grievanceCategoryRepository;
    
    @Override
    public GrievanceCategory saveGrievanceCategory(GrievanceCategory grievanceCategory) {
        return grievanceCategoryRepository.save(grievanceCategory);
    }
    
    @Override
    public List<GrievanceCategory> getAllGrievanceCategories() {
        return grievanceCategoryRepository.findAll();
    }
    
    @Override
    public Optional<GrievanceCategory> getGrievanceCategoryById(Long id) {
        return grievanceCategoryRepository.findById(id);
    }
    
    @Override
    public GrievanceCategory updateGrievanceCategory(Long id, GrievanceCategory grievanceCategory) {
        if (grievanceCategoryRepository.existsById(id)) {
            grievanceCategory.setCategoryId(id);
            return grievanceCategoryRepository.save(grievanceCategory);
        }
        return null;
    }
    
    @Override
    public void deleteGrievanceCategory(Long id) {
        grievanceCategoryRepository.deleteById(id);
    }
    
    @Override
    public List<GrievanceCategory> searchGrievanceCategories(String keyword) {
        return grievanceCategoryRepository.findByCategoryNameContainingOrDescriptionContaining(keyword);
    }
}
