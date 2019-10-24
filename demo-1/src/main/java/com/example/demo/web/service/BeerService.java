package com.example.demo.web.service;

import java.util.UUID;

import com.example.demo.web.model.BeerDto;

public interface BeerService {

	BeerDto getBeerById(UUID beerId);

}
