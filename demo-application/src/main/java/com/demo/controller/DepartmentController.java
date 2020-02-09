/**
 * 
 */
package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Department;
import com.demo.repository.DeptRepository;

/**
 * @author dev06
 *
 */
@RestController
public class DepartmentController {

	@Autowired
	private DeptRepository deptRepository;

	@PostMapping(value = "departments")
	public Department createDepartment(@RequestBody Department department) {
		return deptRepository.save(department);
	}

	@GetMapping(value = "departments")
	public List<Department> findAllDepartment() {
		return deptRepository.findAll();
	}

}
