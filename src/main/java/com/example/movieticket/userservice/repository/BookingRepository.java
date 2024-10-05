package com.example.movieticket.userservice.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.movieticket.userservice.repository.*;
import com.example.movieticket.userservice.service.BookingService;

public interface BookingRepository extends JpaRepository<BookingService, Long>{
	
	List<BookingService>findByUserId(Long userId);
	List<BookingService>findByMovieId(Long MovieId);

}
