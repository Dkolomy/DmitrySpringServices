package com.russiannh.springframework.services.v2;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.russiannh.springframework.web.model.v2.BeerDtoV2;
import com.russiannh.springframework.web.model.v2.BeerStyleEnum;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BeerServiceV2Impl implements BeerServiceV2 {

	@Override
	public BeerDtoV2 getBeerById(UUID beerId) {
		return BeerDtoV2.builder().id(UUID.randomUUID()).beerName("Galaxy Cat").beerStyle(BeerStyleEnum.ALE).build();
	}

	@Override
	public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {
		return BeerDtoV2.builder().id(UUID.randomUUID()).build();
	}

	@Override
	public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {
		log.debug("Updating beer Id: "+beerId.toString());
	}

	@Override
	public void deleteById(UUID beerId) {
		log.debug("Deleting beer Id: "+beerId.toString());
	}

}
