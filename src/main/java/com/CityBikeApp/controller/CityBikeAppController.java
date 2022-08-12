package com.CityBikeApp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
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
	public List<Journey> allJourneys(Model model) {
		List<Journey> journeys = repository.findAll();
		return journeys;
	}

	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(value = "/stationslist")
	public List<Station> allStations(Model model) {
		List<Station> stations = stationRepository.findAll();

		return stations;
	}
}
