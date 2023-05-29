package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IDao;
import com.example.demo.entities.Specialite;
import com.example.demo.repository.SpecialiteRepository;

@Service
public class SpecialieService implements IDao<Specialite> {
    @Autowired SpecialiteRepository specialiterepository;
	@Override
	public Specialite save(Specialite o) {
		// TODO Auto-generated method stub
		return this.specialiterepository.save(o);
	}

	@Override
	public List<Specialite> findAll() {
		// TODO Auto-generated method stub
		return this.specialiterepository.findAll();
	}

	@Override
	public Specialite findById(int id) {
		// TODO Auto-generated method stub
		return this.specialiterepository.findById(id);
	}

	@Override
	public void update(Specialite o) {
		this.specialiterepository.save(o);
		
	}

	@Override
	public void delete(Specialite o) {
		this.specialiterepository.delete(o);
		
	}

}
