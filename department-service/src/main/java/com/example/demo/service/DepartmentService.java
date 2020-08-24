package com.example.demo.service;

import java.util.Optional;

import com.example.demo.model.Department;

public interface DepartmentService {
	
	public Optional<Department> getDepartmentById(Integer departmentId);
	public Iterable<Department> findAllDepartment();

}
