package com.example.demo.controller;

import java.util.List;

import com.example.demo.entities.Ville;
import com.example.demo.service.VilleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entities.Zone;
import com.example.demo.service.ZoneService;

@RestController
@CrossOrigin
@RequestMapping("api/zones")
public class ZoneController {
	@Autowired
	private ZoneService service;
	@Autowired
	private VilleService villeService;


	@PostMapping("/save/{id}")
	public Zone save(@PathVariable int id, @RequestBody Zone o) {
		Ville v = villeService.findById(id);
		o.setVille(v);
		return service.save(o);
	}

	@GetMapping("/all")
	public List<Zone> findAll() {
		return service.findAll();
	}

	@GetMapping("/find/{id}")
	public Zone findById(@PathVariable int id) {
		return service.findById(id);
	}
	@PutMapping("/update/{id}")
	public void update(@PathVariable int id, @RequestBody Zone o) {
		Ville v = villeService.findById(id);
		o.setVille(v);
		service.save(o);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		Zone exist = service.findById(id);
		if (exist != null) {
			service.delete(exist);
		}
	}

	@GetMapping("/ville/{villeNom}")
	public List<Zone> findByNom(@PathVariable String villeNom){
		return service.findByNom(villeNom);
	}

}
