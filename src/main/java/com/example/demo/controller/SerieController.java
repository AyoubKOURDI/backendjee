package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entities.Serie;
import com.example.demo.service.SerieService;

@RestController
@CrossOrigin

@RequestMapping("api/series")
public class SerieController {
	@Autowired
	private SerieService service;

	@PostMapping("/save")
	public Serie save(@RequestBody Serie o) {
		return service.save(o);
	}

	@GetMapping("/all")
	public List<Serie> findAll() {
		return service.findAll();
	}

	@GetMapping("/find/{id}")
	public Serie findById(@PathVariable int id) {
		return service.findById(id);
	}

	@PutMapping("/update")
	public void update(@RequestBody Serie o) {
		service.update(o);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		Serie s = findById(id);
		service.delete(s);
	}

}
