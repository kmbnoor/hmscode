package com.aybits.hms.func.hotel.cache;

import com.aybits.hms.func.hotel.beans.Hotel;

import java.util.*;

public class HotelCache {

    private HashMap<String, Hotel> hotelCache = new HashMap<>();
    private HashSet<String> hotelIds = new HashSet<>();

    public void addHotel(Hotel hotel) {
        if (hotelCache.get(String.valueOf(hotel.getHotelId())) == null) {
            hotelIds.add(hotel.getHotelId());
            hotelCache.put(hotel.getHotelId(), hotel);
        }
    }

    public void updateHotel(Hotel hotel) {
        String hotelId = hotel.getHotelId();
        hotelCache.remove(hotelId);
        hotelCache.put(hotelId, hotel);
    }


    public Hotel getHotelById(String hotelId) {
        Hotel hotel = hotelCache.get(hotelId);
        if (hotel != null)
            return hotel;
        else
            return null;
    }


    public List<Hotel> getAllHotels() {
        ArrayList<Hotel> hotels = new ArrayList<>();
        hotels.addAll(hotelCache.values());
        return hotels;
    }

    public List<String> getAllHotelIds() {
        ArrayList<String> hotelIds = new ArrayList<>();
        hotelIds.addAll(hotelCache.keySet());
        return hotelIds;
    }
}