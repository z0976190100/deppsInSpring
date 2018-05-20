package com.depsinspring.proj.service;

import com.depsinspring.proj.persistence.entity.Department;

import java.util.List;

public interface DepartmentService {

    void saveDepartment(Department department);
    void updateDepartment(Department department);
    void removeDepartment(long id);
    Department getDepartmentById(long id);
    List<Department> findAllDepartments();
}
