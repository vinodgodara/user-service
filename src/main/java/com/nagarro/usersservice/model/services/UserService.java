package com.nagarro.usersservice.model.services;

import java.util.List;

import com.nagarro.usersservice.model.User;

public interface UserService {

	User getUserById(final Integer id);

	List<User> getAll();
}
