package com.rating.RatingService.implratingservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rating.RatingService.entities.Rating;
import com.rating.RatingService.ratingservice.RatingService;
import com.rating.RatingService.repository.RatingRepository;




@Service
public class RatingServiceImpl implements RatingService{
	
	
	@Autowired
	private RatingRepository repository;
	

	@Override
	public Rating create(Rating rating) {
		// TODO Auto-generated method stub
		return repository.save(rating);
	}

	@Override
	public List<Rating> getRatings() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public List<Rating> getRatingByUserId(String userId) {
		// TODO Auto-generated method stub
		return repository.findByUserId(userId);
	}

	@Override
	public List<Rating> getRatingByHotelId(String hotelId) {
		// TODO Auto-generated method stub
		return repository.findByHotelId(hotelId);
	}

}
