package com.russiannh.springframework.services;

import java.util.UUID;

import com.russiannh.springframework.web.model.CustomerDto;

public interface CustomerService {

	CustomerDto getCustomerById(UUID customerId);
	
}
