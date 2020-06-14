package com.nagarro.usersservice.model.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.usersservice.model.User;
import com.nagarro.usersservice.model.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User getUserById(Integer id) {
		final Optional<User> userOptional = userRepository.findById(id);

		if (userOptional.isPresent()) {
			return userOptional.get();
		} else {
			return null;
		}
	}

	@Override
	public List<User> getAll() {
		return userRepository.findAll();
	}

}
