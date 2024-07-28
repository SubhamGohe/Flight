package com.filghts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.filghts.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
@Query
	User findByEmail(String emailId);

}
