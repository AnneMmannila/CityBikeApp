package com.CityBikeApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.CityBikeApp.journey.Journey;
import com.CityBikeApp.journey.JourneyRepository;

@Controller
@ResponseBody
public class CityBikeAppController {
	@Autowired
	private JourneyRepository repository;

	@RequestMapping(value = "/")
	public List<Journey> allJourneys(Model model) {
		List<Journey> journeys = repository.findAll();
		return journeys;
	}
}
