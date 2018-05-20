package com.depsinspring.proj.persistence.dao;

import com.depsinspring.proj.persistence.entity.Department;
import com.depsinspring.proj.persistence.mapper.DepartmentMapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DepartmentDAOImpl implements DepartmentDAO {

    public JdbcTemplate template;

    @Autowired
    public DepartmentDAOImpl(JdbcTemplate template){
        this.template = template;
    }

    public void saveDepartment(Department department) {
        String sql = "INSERT INTO department2 (title) VALUES (?)";
        template.update(sql, department.getTitle());
    }

    public void updateDepartment(Department department) {
        String sql = "UPDATE department2 SET title=? WHERE id=?";
        template.update(sql, department.getTitle());
    }

    public void removeDepartment(long id) {
        String sql = "DELETE FROM department2 WHERE id=?";
        template.update(sql, id);
    }

    public Department getDepartmentById(long id) {
        String sql = "SELECT * FROM department2 WHERE id=?";
        return template.queryForObject(sql, new DepartmentMapperImpl(), id);
    }

    public List<Department> findAllDepartments() {
        String sql = "SELECT * FROM department2";
        return template.query(sql, new DepartmentMapperImpl());
    }
}

/*
@Repository
public class department2DaoImpl implements department2Dao {

    @Autowired
    public JdbcTemplate jdbcTemplate;

    public void save(department2 department2) {


    }

    public department2 getById(int id) {
        
    }

    public List<department2> findAll() {
        
    }

    public void update(department2 department2) {
        
    }

    public void delete(int id) {
        

    }
}*/
