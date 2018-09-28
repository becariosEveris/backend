package com.everis.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.backend.model.Offer;
import com.everis.backend.repository.OfferRepository;
import com.everis.backend.service.interfaces.OfferService;

@Service
public class OfferServiceImpl implements OfferService{
	
	@Autowired
	OfferRepository oRepo;
	@Override
	public Offer createOffer(Offer o) {
		// TODO Auto-generated method stub
		return oRepo.save(o);
	}

	@Override
	public Offer readOffer(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Offer updateOffer(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteOffer(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
