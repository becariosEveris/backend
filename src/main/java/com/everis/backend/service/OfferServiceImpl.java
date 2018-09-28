package com.everis.backend.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.everis.backend.interfaces.OfferRepository;
import com.everis.backend.model.Offer;

public class OfferServiceImpl implements OfferService {

	@Autowired
	private OfferRepository offerRepository;
	
	@Override
	public Offer findById(Integer id) {
		return this.offerRepository.findById(id).get();
	}
	
	public void createOffer(Offer offer) {
		this.offerRepository.save(offer);
	}
	
	public void updateOffer(Offer offer) {
		this.offerRepository.save(offer);
	}
	
	public void readOffer(Offer offer) {
		this.offerRepository.getOne(offer.getId());
	}
	
	public void deleteOffer(Offer offer) {
		this.offerRepository.delete(offer);
	}

}
