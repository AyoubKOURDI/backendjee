package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Specialite;



public interface SpecialiteRepository extends JpaRepository <Specialite,Integer> {
	Specialite findById (int id);

}
