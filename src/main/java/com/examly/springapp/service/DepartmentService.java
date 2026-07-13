package com.examly.springapp.service;

import com.examly.springapp.model.Department;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;
import java.util.Optional;

public interface DepartmentService {
    Department saveDepartment(Department department);
    List<Department> getAllDepartments();
    Optional<Department> getDepartmentById(Long id);
    Department updateDepartment(Long id, Department department);
    void deleteDepartment(Long id);
    Page<Department> getDepartmentsPaginated(Pageable pageable);
}
