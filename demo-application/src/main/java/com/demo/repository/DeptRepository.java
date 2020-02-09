package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Department;

/**
 * 
 * @author User1
 *
 */
public interface DeptRepository extends JpaRepository<Department, Long> {

}
