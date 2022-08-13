package com.CityBikeApp.station;

import java.util.List;

import org.springframework.data.repository.CrudRepository;



public interface StationRepository extends CrudRepository <Station, Long> {
	List <Station> findAll();
}
