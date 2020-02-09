package com.demo.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Role;

/**
 * 
 * @author User1
 *
 */
public interface RoleRepository extends JpaRepository<Role, Long> {

	Page<Role> findByUserId(Long userId, Pageable pageable);

	Optional<Role> findByIdAndUserId(Long id, Long userId);
}
