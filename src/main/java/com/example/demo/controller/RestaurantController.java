package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entities.Restaurant;

import com.example.demo.service.RestaurantService;

@RestController
@CrossOrigin("*")
@RequestMapping("api/restaurants")
public class RestaurantController {
	@Autowired
	private RestaurantService service;

	@PostMapping("/save")
	public Restaurant save(@RequestBody Restaurant o) {
		return service.save(o);
	}

	@GetMapping("/all")
	public List<Restaurant> findAll() {
		return service.findAll();
	}

	@GetMapping("/find/{id}")
	public Restaurant findById(@PathVariable String id) {
		return service.findById(Integer.parseInt(id));
	}

	@PutMapping("/update")
	public void update(@RequestBody Restaurant o) {
		service.update(o);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		Restaurant r = service.findById(id);
		service.delete(r);
	}
}
