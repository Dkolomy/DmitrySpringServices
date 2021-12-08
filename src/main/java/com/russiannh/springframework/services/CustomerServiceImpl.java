package com.russiannh.springframework.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.russiannh.springframework.web.model.CustomerDto;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDto getCustomerById(UUID customerId) {
		return CustomerDto.builder().id(UUID.randomUUID())
				.customerName("Dmitry")
				.build();
	}

}
