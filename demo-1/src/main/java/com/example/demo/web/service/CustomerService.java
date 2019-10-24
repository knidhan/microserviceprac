package com.example.demo.web.service;

import java.util.UUID;

import com.example.demo.web.model.CustomerDto;

public interface CustomerService {

	CustomerDto getCustomerById(UUID customerId);

}
