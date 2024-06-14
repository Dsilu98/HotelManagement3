package com.capgemini.rating.services;

import java.util.List;

import com.capgemini.rating.entities.Rating;

public interface RatingService {
	//create
	Rating createRating(Rating rating);
	//update
	Rating updateRating(Rating ratingDetails);
	//delete
	//find by id
	Rating getRatingById(String id);
	//find all
	List<Rating> getRatings();
	
    //get all by UserId
    List<Rating> getRatingByUserId(String userId);

    //get all by hotelId
    List<Rating> getRatingByHotelId(String hotelId);
	
}
