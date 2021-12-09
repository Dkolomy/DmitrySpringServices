package com.russiannh.springframework.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.russiannh.springframework.web.model.CustomerDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDto getCustomerById(UUID customerId) {
		return CustomerDto.builder().id(UUID.randomUUID())
				.customerName("Dmitry")
				.build();
	}

	@Override
	public CustomerDto saveNewCustomer(CustomerDto customerDto) {
		return CustomerDto.builder().id(UUID.randomUUID()).build();
	}

	@Override
	public void updateCustomer(UUID customerId, CustomerDto customerDto) {
		log.debug("Updating customer Id: "+customerId.toString());
		
	}

	@Override
	public void deleteById(UUID customerId) {
		log.debug("Deleting customer Id: "+customerId.toString());
	}

}
