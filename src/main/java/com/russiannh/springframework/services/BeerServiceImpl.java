package com.russiannh.springframework.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.russiannh.springframework.web.model.BeerDto;

@Service
public class BeerServiceImpl implements BeerService {

	public BeerDto getBeerById(UUID beerId) {
		return BeerDto.builder().id(UUID.randomUUID())
				.beerName("Galaxy Cat")
				.beerStyle("Pale Ale")
				.build();
	}

}
