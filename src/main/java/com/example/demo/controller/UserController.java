package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entities.User;
import com.example.demo.service.UserService;

import jakarta.websocket.server.PathParam;

@RestController
@CrossOrigin
@RequestMapping("api/users")
public class UserController {
	@Autowired
	private UserService service;

	@PostMapping("/save")
	public User save(@RequestBody User o) {
		return service.save(o);
	}

	@GetMapping("/all")
	public List<User> findAll() {
		return service.findAll();
	}

	@GetMapping("/find")
	public User findById(@PathParam(value = "id") String id) {
		return service.findById(Integer.parseInt(id));
	}

	@PostMapping("/update")
	public void update(@RequestBody User o) {
		service.update(o);
	}

	@DeleteMapping("/delete")
	public void delete(@RequestBody User o) {
		service.delete(o);
	}

}
