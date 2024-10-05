package com.example.movieticket.userservice.model;

import java.time.LocalDate;

import com.example.movieticket.userservice.User;
import com.example.movieticket.userservice.model.Movie;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Booking {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="movie_id", nullable=false)
	private User user;
	
	@Column(nullable = false)
	private Movie movie;
	
	@Column(nullable = false)
	private LocalDate bookingTime;
	
	@Column(nullable = false)
	private int numberOfTickets;
	
	//Constructors
	
	public Booking() {}
	
	public Booking (User user, Movie movie, LocalDate bookingTime, int numberOfTickets) {
		
		this.user=user;
		this.movie=movie;
		this.bookingTime=bookingTime;
		this.numberOfTickets=numberOfTickets;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public LocalDate getBookingTime() {
		return bookingTime;
	}

	public void setBookingTime(LocalDate bookingTime) {
		this.bookingTime = bookingTime;
	}

	public int getNumberOfTickets() {
		return numberOfTickets;
	}

	public void setNumberOfTickets(int numberOfTickets) {
		this.numberOfTickets = numberOfTickets;
	}
	
	
}
