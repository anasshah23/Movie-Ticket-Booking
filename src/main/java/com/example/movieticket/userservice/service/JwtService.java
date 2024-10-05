package com.example.movieticket.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.movieticket.userservice.config.JwtProperties;

@Service
public class JwtService {

	private final JwtProperties jwtProperties;
	
	@Autowired
	public JwtService(JwtProperties jwtProperties) {
		this.jwtProperties = jwtProperties;
	}
	
	public void generateToken() {
		String secret = jwtProperties.getSecret();
		long expiration = jwtProperties.getExpiration();
		
		
	}
}
