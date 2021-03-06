package com.everis.backend.service.interfaces;

import com.everis.backend.model.Offer;

public interface OfferService {
	
	public Offer createOffer(Offer o);
	
	public Offer readOffer(Integer id);
	
	public Offer updateOffer(Offer offer);
	
	public void deleteOffer(Integer id);
}
