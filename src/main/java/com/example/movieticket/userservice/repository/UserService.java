package com.example.movieticket.userservice.repository;

import java.util.Optional;

import com.example.movieticket.userservice.User;

public class UserService {

	private UserRepository userRepository;
	
	public User registerUser(User user) {
		return userRepository.save(user);
	}
	
	public Optional<User> findUserByEmail(String email) {
		return userRepository.findByEmail(email);
	}
}
