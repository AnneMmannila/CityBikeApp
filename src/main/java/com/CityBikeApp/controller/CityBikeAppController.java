package com.CityBikeApp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.CityBikeApp.journey.Journey;
import com.CityBikeApp.journey.JourneyRepository;
import com.CityBikeApp.station.Station;
import com.CityBikeApp.station.StationRepository;

@Controller
@ResponseBody
public class CityBikeAppController {
	@Autowired
	private JourneyRepository repository;

	@Autowired
	private StationRepository stationRepository;

	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(value = "/")
	public List<Journey> allJourneys() {
		List<Journey> journeys = repository.findAll();
		return journeys;
	}

	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(value = "/stationslist")
	public List<Station> allStations() {
		List<Station> stations = stationRepository.findAll();
		return stations;
	}

	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(value = "/find/{id}")
	public Optional<Station> singleStation(@PathVariable("id") Long stationId) {
		Optional<Station> station = stationRepository.findById(stationId);
		return station;
	}
}
