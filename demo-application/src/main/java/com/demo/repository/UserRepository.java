/**
 * 
 */
package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.User;

/**
 * @author User1
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
