package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IDao;
import com.example.demo.entities.Restaurant;
import com.example.demo.repository.RestaurantRepository;

@Service
public class RestaurantService implements IDao<Restaurant> {
	@Autowired(required = true)
	private RestaurantRepository restaurantrepository;

	@Override
	public Restaurant save(Restaurant o) {
		// TODO Auto-generated method stub
		return this.restaurantrepository.save(o);
	}

	@Override
	public List<Restaurant> findAll() {
		// TODO Auto-generated method stub
		return this.restaurantrepository.findAll();
	}

	@Override
	public Restaurant findById(int id) {
		// TODO Auto-generated method stub
		return this.restaurantrepository.findById(id);
	}

	@Override
	public void update(Restaurant o) {
		this.restaurantrepository.save(o);

	}

	@Override
	public void delete(Restaurant o) {
		this.restaurantrepository.delete(o);

	}

}
