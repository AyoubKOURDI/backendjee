package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IDao;
import com.example.demo.entities.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService implements IDao<User> {
    @Autowired
    UserRepository userrepository;
	@Override
	public User save(User o) {
		// TODO Auto-generated method stub
		return this.userrepository.save(o);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return this.userrepository.findAll();
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return this.userrepository.findById(id);
	}

	@Override
	public void update(User o) {
		this.userrepository.save(o);
		
	}

	@Override
	public void delete(User o) {
		this.userrepository.delete(o);
		
	}

}
