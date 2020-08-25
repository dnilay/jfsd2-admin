package com.example.demo.rest;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Department;
import com.example.demo.service.DepartmentService;

@RestController
@RequestMapping("/api/v1")
public class DepartmentController {
	
	private DepartmentService departmentService;

	public DepartmentController(DepartmentService departmentService) {
		super();
		this.departmentService = departmentService;
	}
	@GetMapping("/departments/{departmentId}")
	public ResponseEntity<Optional<Department>> getDepartmentById(@PathVariable("departmentId") Integer departmentId)
	{
		return new ResponseEntity<Optional<Department>>(departmentService.getDepartmentById(departmentId),HttpStatus.OK);
	}
	@GetMapping("/departments")
	public ResponseEntity<Iterable<Department>> getAllDepartment()
	{
		return ResponseEntity.status(HttpStatus.OK).body(departmentService.findAllDepartment());
	}

}
