package com.rating.service.RatingService.service;

import com.rating.service.RatingService.entity.Ratings;

import java.util.List;

public interface RatingsService {
    //create
    Ratings create(Ratings rating);

    //get all ratings
    List<Ratings> getRatings();

    //get all by UserId
    List<Ratings> getRatingByUserId(String userId);

    //get all by hotel
    List<Ratings> getRatingByHotelId(String hotelId);
}