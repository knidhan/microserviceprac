package com.example.demo.Repository;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.domain.Beer;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID>{

}
