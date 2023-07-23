package com.hotel.service.HotelService.service;

import com.hotel.service.HotelService.entity.Hotel;

import java.util.List;

public interface HotelService {
    Hotel create(Hotel hotel);
    List<Hotel> getAll();
    Hotel get(String id);
}
