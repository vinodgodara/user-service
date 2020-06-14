package com.nagarro.usersservice.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.usersservice.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
