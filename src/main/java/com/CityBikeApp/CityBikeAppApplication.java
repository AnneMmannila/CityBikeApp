package com.CityBikeApp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.CityBikeApp.journey.JourneyRepository;
import com.CityBikeApp.station.StationRepository;


@SpringBootApplication
public class CityBikeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CityBikeAppApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(JourneyRepository repository, StationRepository stationRepository) {
		return (args) -> {
			HelperClass.uploadJourneys(repository);
			HelperClass.uploadStations(stationRepository);
	};
}
}




