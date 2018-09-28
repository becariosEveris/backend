package com.everis.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.backend.model.Offer;
@Repository
public interface OfferRepository extends JpaRepository<Offer, Integer>{
	
	Optional<Offer> findById(Integer id);
	
	Offer save(Offer o);

	void delete(Optional<Offer> offer);
}
