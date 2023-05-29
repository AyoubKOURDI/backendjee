package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Ville;

public interface VilleRepository extends JpaRepository <Ville,Integer> {
	Ville findById(int id);

}
