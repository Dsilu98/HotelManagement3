package com.capgemini.HotelService.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.HotelService.entity.Hotel;
import com.capgemini.HotelService.exceptions.ResourceNotFoundException;
import com.capgemini.HotelService.repositories.HotelRepository;
import com.capgemini.HotelService.services.HotelService;

import jakarta.websocket.server.ServerEndpoint;

@Service
public class HotelServiceImpl implements HotelService {
	@Autowired
	private HotelRepository repository;

	@Override
	public Hotel createHotel(Hotel hotel) {
		String randomUserId = UUID.randomUUID().toString();
		hotel.setId(randomUserId);
		return repository.save(hotel);
	}

	@Override
	public Hotel updatHotel(String id, Hotel hotelDetails) {
		Optional<Hotel> optionalHotel = repository.findById(id);
		if(optionalHotel.isPresent()) {
			Hotel existinhHotel = optionalHotel.get();
			existinhHotel.setHotelName(hotelDetails.getHotelName());
			existinhHotel.setLocation(hotelDetails.getLocation());
			existinhHotel.setAbout(hotelDetails.getAbout());
			return repository.save(existinhHotel);
		}
		else {
			throw new ResourceNotFoundException("Hotel not found with id : "+id);
		}
	}

	@Override
	public Hotel getHotelById(String id) {
		return repository.findById(id).orElseThrow(()->new ResourceNotFoundException("Hotel not found with id : "+id));
	}

	@Override
	public List<Hotel> getAllHotel() {
		return repository.findAll();
	}

	



}
