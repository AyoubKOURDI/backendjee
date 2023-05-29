package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Serie;



public interface SerieRepository extends JpaRepository <Serie,Integer> {
	 Serie findById (int id);

}
