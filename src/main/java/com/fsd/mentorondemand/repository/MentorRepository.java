package com.fsd.mentorondemand.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.fsd.mentorondemand.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MentorRepository extends JpaRepository<User, Integer> {

	//find/ search the data from row in database using From and To columns .. this is the magic
	//User findByusers(Long id, String userName);
	
       Optional<User> findById(Integer id);
     // public void  signUp(){
    	   
    	   
       }
        	
        

