package com.everis.backend.service;

import com.everis.backend.model.Offer;

public interface OfferService {
	
	Offer findById(Integer id);
	
	void createOffer(Offer offer);
	
	void updateOffer(Offer offer);
	
	void readOffer(Offer offer);
	
	void deleteOffer(Offer offer);
	
}
