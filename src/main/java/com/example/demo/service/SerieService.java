package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IDao;
import com.example.demo.entities.Serie;
import com.example.demo.repository.SerieRepository;

@Service
public class SerieService implements IDao<Serie> {
    @Autowired
    SerieRepository serierepository;
	@Override
	public Serie save(Serie o) {
		// TODO Auto-generated method stub
		return this.serierepository.save(o);
	}

	@Override
	public List<Serie> findAll() {
		// TODO Auto-generated method stub
		return this.serierepository.findAll();
	}

	@Override
	public Serie findById(int id) {
		// TODO Auto-generated method stub
		return this.serierepository.findById(id);
	}

	@Override
	public void update(Serie o) {
		this.serierepository.save(o);
		
	}

	@Override
	public void delete(Serie o) {
		this.serierepository.delete(o);
		
	}

}
