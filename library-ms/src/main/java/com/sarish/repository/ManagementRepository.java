package com.sarish.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sarish.model.Users;
@Repository
public interface ManagementRepository extends JpaRepository<Users, Integer>{
	
}
