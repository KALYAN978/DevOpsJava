package com.rating.RatingService.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rating.RatingService.entities.Rating;

public interface RatingRepository extends MongoRepository<Rating, String> {
	
	
	//custom finder Methods
	List<Rating> findByUserId(String userId);
	List<Rating> findByHotelId(String hotelId); 

}
