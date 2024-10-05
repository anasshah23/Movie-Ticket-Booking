package com.example.movieticket.userservice.service;

import java.util.List;

import com.example.movieticket.userservice.model.Movie;
import com.example.movieticket.userservice.repository.MovieRepository;

public class MovieService {

	private MovieRepository movieRepository;
	
	public Movie addMovie(Movie movie) {
		return movieRepository.save(movie);
	}
	
	public List<Movie> searchMovies(String title) {
		return movieRepository.findByTitleContaining(title);
	}
	
	public List<Movie> getAllMovies() {
		return movieRepository.findAll();
	}
}
