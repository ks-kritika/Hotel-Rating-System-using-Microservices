package com.hotel.service.HotelService.service.implementation;

import com.hotel.service.HotelService.entity.Hotel;
import com.hotel.service.HotelService.exceptions.ResourceNotFoundException;
import com.hotel.service.HotelService.repository.HotelRepository;
import com.hotel.service.HotelService.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    private HotelRepository hotelRepo;

    @Override
    public Hotel create(Hotel hotel) {
        String hotelId = UUID.randomUUID().toString();
        hotel.setId(hotelId);
        return hotelRepo.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return hotelRepo.findAll();
    }

    @Override
    public Hotel get(String id) {
        Hotel hotel = hotelRepo.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Hotel","ID", id)
        );
        return hotel;
    }
}
