package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Ville;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IDao;
import com.example.demo.entities.Zone;
import com.example.demo.repository.ZoneRepository;

@Service
public class ZoneService implements IDao<Zone> {
	@Autowired
	private ZoneRepository zonerepository;

	@Override
	public Zone save(Zone o) {
		// TODO Auto-generated method stub
		return this.zonerepository.save(o);
	}

	@Override
	public List<Zone> findAll() {
		// TODO Auto-generated method stub
		return this.zonerepository.findAll();
	}

	@Override
	public Zone findById(int id) {
		// TODO Auto-generated method stub
		return this.zonerepository.findById(id);
	}

	@Override
	public void update(Zone o) {
		this.zonerepository.save(o);

	}

	public List<Zone> findByNom(String nom){

		return zonerepository.findByNom(nom);
	}
	@Override
	public void delete(Zone o) {
		this.zonerepository.delete(o);

	}

}
