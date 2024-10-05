package com.example.movieticket.userservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.movieticket.userservice.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

	List<Movie> findByTitleContaining(String title);
}
