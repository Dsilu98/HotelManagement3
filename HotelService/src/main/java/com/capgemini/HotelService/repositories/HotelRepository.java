package com.capgemini.HotelService.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.HotelService.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String> {
	
}
