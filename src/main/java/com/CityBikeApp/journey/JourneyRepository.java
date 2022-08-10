package com.CityBikeApp.journey;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface JourneyRepository extends CrudRepository <Journey, Long>{
	List <Journey> findAll();
}


	
	

