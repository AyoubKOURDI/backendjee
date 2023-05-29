package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IDao;
import com.example.demo.entities.Ville;
import com.example.demo.repository.VilleRepository;

@Service
public class VilleService implements IDao<Ville> {
	@Autowired
	private VilleRepository villeRepository;
	
	@Override
	public Ville save(Ville o) {
		return villeRepository.save(o);
	}

	@Override
	public List<Ville> findAll() {
		// TODO Auto-generated method stub
		return villeRepository.findAll();
	}

	@Override
	public Ville findById(int id) {
		// TODO Auto-generated method stub
		return villeRepository.findById(id);
	}

	@Override
	public void update(Ville o) {
		this.villeRepository.save(o);
	}

	@Override
	public void delete(Ville o) {
		this.villeRepository.delete(o);
		
	}



}
