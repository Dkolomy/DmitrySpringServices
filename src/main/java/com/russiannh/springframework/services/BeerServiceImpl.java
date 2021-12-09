package com.russiannh.springframework.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.russiannh.springframework.web.model.BeerDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {

	public BeerDto getBeerById(UUID beerId) {
		return BeerDto.builder().id(UUID.randomUUID()).beerName("Galaxy Cat").beerStyle("Pale Ale").build();
	}

	@Override
	public BeerDto saveNewBeer(BeerDto beerDto) {
		return BeerDto.builder().id(UUID.randomUUID()).build();
	}

	@Override
	public void updateBeer(UUID beerId, BeerDto beerDto) {		
		log.debug("Updating beer Id: "+beerId.toString());
	}

	@Override
	public void deleteById(UUID beerId) {
		log.debug("Deleting beer Id: "+beerId.toString());
	}

}
