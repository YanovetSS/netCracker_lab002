package com.ukraine.springmvc.dao;

import com.ukraine.springmvc.model.Employee;
import com.ukraine.springmvc.model.Project;

import java.util.List;

public interface ProjectDao {
    void update(Project project);

    void delete(int projectId);

    Project getProject(int employeeId);

    List<Project> projectList();

    void insertProject(Project project);

    void insertUser(Employee employee);

    List<Employee> findAllObject();

    List<Employee> findAllEmployeeIntoProject(int projectId);
}
