package com.everis.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.backend.model.Offer;
import com.everis.backend.service.interfaces.OfferService;

@RestController
public class OfferController {
	@Autowired
	OfferService ofservice;

	@GetMapping("offer")
	public Offer creaOferta(Offer o) {
		Offer of = ofservice.createOffer(o);
		return of;
	}

	@PostMapping("offer/{id}")
	public Offer readOferta(@PathVariable Integer id) {
		Offer of = ofservice.readOffer(id);
		return of;
	}
	@PutMapping("offer/{id}")
	public Offer updateOferta(@PathVariable Integer id){
		Offer of  = ofservice.readOffer(id);
		Offer ofe= ofservice.updateOffer(of);
		return ofe;
	}
	@DeleteMapping("offer/{id}")
	public void deleteOferta(@PathVariable Integer id) {
		ofservice.deleteOffer(id);
	}
	
}
