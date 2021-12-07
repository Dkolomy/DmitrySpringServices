package com.russiannh.springframework.services;

import java.util.UUID;

import com.russiannh.springframework.web.model.BeerDto;

public interface BeerService {

	BeerDto getBeerById(UUID beerId);

}
