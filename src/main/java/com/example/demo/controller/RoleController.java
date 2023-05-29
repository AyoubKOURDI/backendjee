package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Role;
import com.example.demo.service.RoleService;

@RestController
@RequestMapping("api/roles")
public class RoleController {
	@Autowired
	private RoleService service;

	@PostMapping("/save")
	public Role save(@RequestBody Role o) {
		return service.save(o);
	}

	@GetMapping("/all")
	public List<Role> findAll() {
		return service.findAll();
	}

	@GetMapping("/find/{id}")
	public Role findById(@PathVariable String id) {
		return service.findById(Integer.parseInt(id));
	}

	@PostMapping("/update")
	public void update(@RequestBody Role o) {
		service.update(o);
	}

	@DeleteMapping("/delete")
	public void delete(@RequestBody Role o) {
		service.delete(o);
	}
}
