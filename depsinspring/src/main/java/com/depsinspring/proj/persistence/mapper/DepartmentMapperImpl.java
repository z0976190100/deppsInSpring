package com.depsinspring.proj.persistence.mapper;

import com.depsinspring.proj.persistence.entity.Department;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DepartmentMapperImpl implements DepartmentMapper{

    public Department mapRow(ResultSet resultSet, int id) throws SQLException {
        Department department = new Department();
        department.setId(resultSet.getLong("id"));
        department.setTitle(resultSet.getString("title"));
        return department;
    }

}
