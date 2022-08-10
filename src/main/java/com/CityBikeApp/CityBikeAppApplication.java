package com.CityBikeApp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.CityBikeApp.journey.Journey;
import com.CityBikeApp.journey.JourneyRepository;


@SpringBootApplication
public class CityBikeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CityBikeAppApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(JourneyRepository repository) {
		return (args) -> {
			try {
				BufferedReader br = new BufferedReader(new FileReader("..\\CityBikeApp\\data\\2021-05.csv"));
				String line;
				int i = 0;
				//bring app data and ignore first 7 lines
				while ((line = br.readLine()) != null && i < 500) {
					try {
						String[] values = line.split(",");
						if (i > 7) {
							Double distance = Double.parseDouble(values[6]);
							Double duration = Double.parseDouble(values[7]);
							if (distance > 10 && duration > 10) {
								Journey journey = new Journey();
								journey.setDepartureTime(values[0]);
								journey.setReturnTime(values[1]);
								journey.setDepartureStationId(Integer.parseInt(values[2]));
								journey.setDepartureStationName(values[3]);
								journey.setReturnStationId(Integer.parseInt(values[4]));
								journey.setReturnStationName(values[5]);
								journey.setCoveredDistanceInMeters(distance);
								journey.setJourneyDurationInSec(duration);
								repository.save(journey);
							}
						}
						i++;
					} catch (NumberFormatException ex) {
						System.out.println("Error on parsing input data");
						continue;
					}
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
		};
	}
}
