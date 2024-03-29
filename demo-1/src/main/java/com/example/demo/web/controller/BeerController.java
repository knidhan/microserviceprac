package com.example.demo.web.controller;

import java.util.UUID;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.web.model.BeerDto;
import com.example.demo.web.service.BeerService;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {
	
	private final BeerService beerService;
	

	public BeerController(BeerService beerService) {
	
		this.beerService = beerService;
	}


	@GetMapping("/{beerId}")
	public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId){
		
		return new ResponseEntity<>(beerService.getBeerById(beerId),HttpStatus.OK);	
	}

	@PostMapping
	public ResponseEntity saveBeer(BeerDto beerDto){
		BeerDto savedBeer=beerService.saveBeer(beerDto);
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("Location", savedBeer.getId().toString());
			return	new ResponseEntity<>(httpHeaders,HttpStatus.CREATED);
			
	}
	
	@PutMapping("/{beerId}")
	public ResponseEntity updateBeer(@PathVariable("beerId") UUID beerId, BeerDto beerDto){
		beerService.updateBeer(beerId,beerDto);
	//	HttpHeaders httpHeaders=new HttpHeaders();
	//	httpHeaders.add("Location", savedBeer.getId().toString());
			return	new ResponseEntity<>(HttpStatus.NO_CONTENT);
			
	}
}
