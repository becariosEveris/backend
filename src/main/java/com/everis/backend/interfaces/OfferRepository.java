package com.everis.backend.interfaces;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everis.backend.model.Offer;

public interface OfferRepository extends JpaRepository<Offer, Integer> {
	Optional<Offer> findById(Integer id);
}
