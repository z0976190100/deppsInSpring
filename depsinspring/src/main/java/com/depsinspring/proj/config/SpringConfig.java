package com.depsinspring.proj.config;

import com.depsinspring.proj.persistence.dao.DepartmentDAOImpl;
import com.depsinspring.proj.service.DepartmentService;
import com.depsinspring.proj.service.DepartmentServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"com.depsinspring.proj.persistence.dao", "com.depsinspring.proj.service"})
public class SpringConfig {


    @Bean
    public JdbcTemplate getJdbcTemplate() {
        return new JdbcTemplate(getDataSource());
    }

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5433/Departments?currentSchema=department1");
        dataSource.setUsername("postgres");
        dataSource.setPassword("rut");
        return dataSource;
    }

    @Bean
    public DepartmentDAOImpl getDepartmentDAOImpl() {
        return new DepartmentDAOImpl(getJdbcTemplate());
    }

    @Bean
    public DepartmentService getDepartmentService() {
        return new DepartmentServiceImpl(getDepartmentDAOImpl());
    }

}
