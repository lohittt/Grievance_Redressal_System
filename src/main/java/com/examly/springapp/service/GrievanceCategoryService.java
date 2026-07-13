package com.examly.springapp.service;

import com.examly.springapp.model.GrievanceCategory;
import java.util.List;
import java.util.Optional;

public interface GrievanceCategoryService {
    GrievanceCategory saveGrievanceCategory(GrievanceCategory grievanceCategory);
    List<GrievanceCategory> getAllGrievanceCategories();
    Optional<GrievanceCategory> getGrievanceCategoryById(Long id);
    GrievanceCategory updateGrievanceCategory(Long id, GrievanceCategory grievanceCategory);
    void deleteGrievanceCategory(Long id);
    List<GrievanceCategory> searchGrievanceCategories(String keyword);
}
