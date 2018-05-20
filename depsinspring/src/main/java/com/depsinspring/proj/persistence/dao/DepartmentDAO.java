package com.depsinspring.proj.persistence.dao;

import com.depsinspring.proj.persistence.entity.Department;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public interface DepartmentDAO {

    void saveDepartment(Department department);
    void updateDepartment(Department department);
    void removeDepartment(long id);
    Department getDepartmentById(long id);
    List<Department> findAllDepartments();
}


