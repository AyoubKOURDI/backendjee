package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entities.Specialite;
import com.example.demo.service.SpecialieService;

@RestController
@CrossOrigin
	@RequestMapping("api/specialites")
public class SpecialiteController {
	@Autowired
	private SpecialieService service;

	@PostMapping("/save")
	public Specialite save(@RequestBody Specialite o) {
		return service.save(o);
	}

	@GetMapping("/all")
	public List<Specialite> findAll() {
		return service.findAll();
	}

	@GetMapping("/find/{id}")
	public Specialite findById(@PathVariable String id) {
		return service.findById(Integer.parseInt(id));
	}

	@PutMapping("/update")
	public void update(@RequestBody Specialite o) {
		service.update(o);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		Specialite s = service.findById(id);
		service.delete(s);
	}
}
