package com.hotelapp.service;

import java.util.List;

import com.hotelapp.dao.HotelDAO;
import com.hotelapp.dao.HotelDAOImpl;
import com.hotelapp.model.Hotel;

public class HotelServiceImpl implements HotelService {
	HotelDAO hotelDAO = new HotelDAOImpl();
	@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		return hotelDAO.getAllHotels();
	}

	@Override
	public Hotel getById(int id) {
		// TODO Auto-generated method stub
		return hotelDAO.getById(id);
	}

	@Override
	public List<Hotel> getCity(String city) {
		// TODO Auto-generated method stub
		return hotelDAO.getCity(city);
	}

	@Override
	public List<Hotel> getByCuisine(String cuisine) {
		// TODO Auto-generated method stub
		return hotelDAO.getByCuisine(cuisine);
	}

}
