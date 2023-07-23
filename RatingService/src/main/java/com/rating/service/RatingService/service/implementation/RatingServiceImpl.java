package com.rating.service.RatingService.service.implementation;

import com.rating.service.RatingService.entity.Ratings;
import com.rating.service.RatingService.repository.RatingRepository;
import com.rating.service.RatingService.service.RatingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RatingServiceImpl implements RatingsService {


    @Autowired
    private RatingRepository ratingRepo;
    @Override
    public Ratings create(Ratings rating) {
        String randomRatingId = UUID.randomUUID().toString();
        rating.setRatingId(randomRatingId);
        return ratingRepo.save(rating);
    }

    @Override
    public List<Ratings> getRatings() {
        return ratingRepo.findAll();
    }

    @Override
    public List<Ratings> getRatingByUserId(String userId) {
        return ratingRepo.findByUserId(userId);
    }

    @Override
    public List<Ratings> getRatingByHotelId(String hotelId) {
        return ratingRepo.findByHotelId(hotelId);
    }
}
