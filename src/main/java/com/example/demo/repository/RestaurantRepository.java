package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.Restaurant;

public interface RestaurantRepository extends JpaRepository <Restaurant,Integer> {
	 Restaurant findById (int id);
	 @Query("SELECT r FROM Restaurant r JOIN r.zone z JOIN z.ville v JOIN Specialite s WHERE v.nom= :ville And z.nom= :zone And s.nom= :specialite")
		List<Restaurant> findAllByVilleAndZoneAndSpecialite(@Param("ville") String ville,@Param("zone") String zone, @Param("specialite") String specialite );
		
		@Query("SELECT r FROM Restaurant r JOIN r.zone z JOIN z.ville v JOIN Serie s WHERE v.nom= :ville And z.nom= :zone And s.nom= :serie")
		List<Restaurant> findAllByVilleAndZoneAndSerie(@Param("ville") String ville,@Param("zone") String zone, @Param("serie") String serie );
}
