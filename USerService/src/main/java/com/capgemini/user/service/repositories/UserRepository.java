package com.capgemini.user.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.user.service.entities.User;

public interface UserRepository extends JpaRepository<User, String>{

}
