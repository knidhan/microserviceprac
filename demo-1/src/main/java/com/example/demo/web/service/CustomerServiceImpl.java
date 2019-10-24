package com.example.demo.web.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.demo.web.model.CustomerDto;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDto getCustomerById(UUID customerId) {
		// TODO Auto-generated method stub
		return CustomerDto.builder().id(UUID.randomUUID()).CustomerName("bhaloo").build();
		//return null;
	}


}
