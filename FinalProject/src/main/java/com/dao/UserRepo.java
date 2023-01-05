package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.model.User;

@Repository
public interface UserRepo extends JpaRepository <User, Integer>{

	@Query("from User e where e.emailId = :emailId and e.password = :password")
	User login(@Param("emailId") String emailId, @Param("password") String password);
}
