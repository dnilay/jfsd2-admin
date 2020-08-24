package com.example.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("department-service")
public interface DepartmentClient {
	
	@GetMapping("/api/v1/departments/{departmentId}")
	public Object findDepartmentDetailsByDepartmentId(@PathVariable("departmentId") Integer departmentId);

}
