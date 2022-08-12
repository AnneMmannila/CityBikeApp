package com.CityBikeApp.station;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.CityBikeApp.journey.Journey;


public interface StationRepository extends CrudRepository <Station, Long> {
	List <Station> findAll();
}
