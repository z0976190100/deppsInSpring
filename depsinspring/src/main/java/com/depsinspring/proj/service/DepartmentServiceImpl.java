package com.depsinspring.proj.service;

import com.depsinspring.proj.persistence.dao.DepartmentDAOImpl;
import com.depsinspring.proj.persistence.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DepartmentServiceImpl implements DepartmentService {

    public DepartmentDAOImpl dao;

    @Autowired
    public DepartmentServiceImpl(DepartmentDAOImpl dao){
        this.dao = dao;
    }

    public void saveDepartment(Department department) {

    }

    public void updateDepartment(Department department) {

    }

    public void removeDepartment(long id) {

    }

    public Department getDepartmentById(long id) {
        return null;
    }

    public List<Department> findAllDepartments() {
        return dao.findAllDepartments();
    }
}
