package com.example.movieticket.userservice.service;

import java.time.LocalDateTime;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
//sample test cases

import com.example.*;
//sample test cases
import com.example.movieticket.userservice.dto.UserRegistrationDto;
import com.example.movieticket.userservice.model.Booking;
import com.example.movieticket.userservice.model.Movie;
import com.example.movieticket.userservice.repository.*;
import com.example.movieticket.userservice.repository.BookingRepository;

@Service
public class BookingService {

	@Autowired
	private BookingRepository bookingRepository;
	
	public Booking createBooking(Long userId, Long movieId, int numberOfTickets) {
        // Assuming you have User and Movie objects available from respective services
		UserRegistrationDto user = getUserById(userId);
		Movie movie = getMovieById(movieId);
		Booking booking = new Booking(user, movie, LocalDateTime.now(), numberOfTickets);
		return bookingRepository.save(booking);
	}
	
	@GetMapping("/user/{userId}")
    public ResponseEntity<List<Booking>> getBookingsByUser(@PathVariable Long userId) {
        return ResponseEntity.ok(bookingService.getBookingsByUser(userId));
    }

    @GetMapping("/movie/{movieId}")
    public ResponseEntity<List<Booking>> getBookingsByMovie(@PathVariable Long movieId) {
        return ResponseEntity.ok(bookingService.getBookingsByMovie(movieId));
    }
}
