package com.example.movieticket.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.movieticket.userservice.model.Booking;
import com.example.movieticket.userservice.service.BookingService;

@RestController
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Booking>> getBookingsByUser(@PathVariable Long userId) {
        return ResponseEntity.ok(bookingService.getBookingsByUser(userId));
    }

    @GetMapping("/movie/{movieId}")
    public ResponseEntity<List<Booking>> getBookingsByMovie(@PathVariable Long movieId) {
        return ResponseEntity.ok(bookingService.getBookingsByMovie(movieId));
    }
}
