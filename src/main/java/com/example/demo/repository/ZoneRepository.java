package com.example.demo.repository;

import com.example.demo.entities.Ville;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Zone;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ZoneRepository extends JpaRepository <Zone,Integer> {
 Zone findById (int id);
 @Query("select z from Zone z where z.ville.nom= :nom order by z.nom")
 List<Zone> findByNom(@Param("nom") String nom);
}
