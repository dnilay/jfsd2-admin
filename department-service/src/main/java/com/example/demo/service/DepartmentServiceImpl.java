package com.example.demo.service;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Department;
import com.example.demo.repo.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	private DepartmentRepository departmentRepository;
	
	public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
		super();
		this.departmentRepository = departmentRepository;
	}

	@Override
	@Transactional
	public Optional<Department> getDepartmentById(Integer departmentId) {
		// TODO Auto-generated method stub
		return departmentRepository.findById(departmentId);
	}

	@Override
	@Transactional
	public Iterable<Department> findAllDepartment() {
		// TODO Auto-generated method stub
		return departmentRepository.findAll();
	}

}
