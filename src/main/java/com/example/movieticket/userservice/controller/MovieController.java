package com.example.movieticket.userservice.controller;

import java.util.List;

import com.example.movieticket.userservice.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.movieticket.userservice.model.Movie;

@RestController
@RequestMapping("/movies")
public class MovieController {

	@Autowired
	private MovieService movieService;
	
	@PostMapping("/add")
	public ResponseEntity<Movie> addMovie(@RequestBody Movie movie) {
		return ResponseEntity.ok(movieService.addMovie(movie));
	}
	
	@GetMapping("/search")
	public ResponseEntity<List<Movie>> searchMovie(@RequestParam String title) {
		return ResponseEntity.ok(movieService.searchMovies(title));
		
	}	
	@GetMapping("/all")
	public ResponseEntity<List<Movie>> getAllMovies() {
		return ResponseEntity.ok(movieService.getAllMovies());
	}
}


