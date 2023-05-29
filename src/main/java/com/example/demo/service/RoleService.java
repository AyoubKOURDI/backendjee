package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IDao;
import com.example.demo.entities.Role;
import com.example.demo.repository.RoleRepository;

@Service
public class RoleService implements IDao<Role> {
    @Autowired
    RoleRepository rolerepository;
	@Override
	public Role save(Role o) {
		// TODO Auto-generated method stub
		return this.rolerepository.save(o);
	}

	@Override
	public List<Role> findAll() {
		// TODO Auto-generated method stub
		return this.rolerepository.findAll();
	}

	@Override
	public Role findById(int id) {
		// TODO Auto-generated method stub
		return this.rolerepository.findById(id);
	}

	@Override
	public void update(Role o) {
		this.rolerepository.save(o);
		
	}

	@Override
	public void delete(Role o) {
		this.rolerepository.delete(o);
		
	}

}
