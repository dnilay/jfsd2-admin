package com.example.demo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.client.DepartmentClient;

@RestController
@RequestMapping("/api/v1")
public class OrchestrationController {
	
	
	private DepartmentClient departmentClient;

	public OrchestrationController(DepartmentClient departmentClient) {
		super();
		this.departmentClient = departmentClient;
	}
	@GetMapping("/orcs/{departmentId}")
	public ResponseEntity<Object> getDepartmentById(@PathVariable("departmentId") Integer departmentId)
	{
		
		Object o= departmentClient.findDepartmentDetailsByDepartmentId(departmentId);
		return new ResponseEntity<Object>(o,HttpStatus.OK);
	}
	

}
