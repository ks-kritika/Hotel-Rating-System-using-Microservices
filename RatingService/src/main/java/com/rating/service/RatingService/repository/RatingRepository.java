package com.rating.service.RatingService.repository;

import com.rating.service.RatingService.entity.Ratings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RatingRepository extends JpaRepository<Ratings,String> {
    List<Ratings> findByUserId(String userId);
    List<Ratings> findByHotelId(String hotelId);
//    @Query("SELECT r FROM Ratings r WHERE r.userId = :userId")
//    List<Ratings> findByUserId(@Param("userId") String userId);
//
//    @Query(value = "SELECT * FROM ratings r WHERE r.hotel_id = :hotelId", nativeQuery = true)
//    List<Ratings> findByHotelId(@Param("hotelId") String hotelId);
}
