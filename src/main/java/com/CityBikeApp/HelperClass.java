package com.CityBikeApp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.CityBikeApp.journey.Journey;
import com.CityBikeApp.journey.JourneyRepository;
import com.CityBikeApp.station.Station;
import com.CityBikeApp.station.StationRepository;

public class HelperClass {

	public static void uploadJourneys(JourneyRepository repository) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("..\\CityBikeApp\\data\\2021-05.csv"));
			String line;
			int i = 0;
			// skip first line
			br.readLine();
			// bring app data and ignore first 7 lines
			while ((line = br.readLine()) != null && i < 500) {
				try {
					String[] values = line.split(",");
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
					i++;
				} catch (NumberFormatException ex) {
					System.out.println("Error on parsing journey input data");
					continue;
				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	public static void uploadStations(StationRepository repository) {
		try {
			BufferedReader br = new BufferedReader(
					new FileReader("..\\CityBikeApp\\data\\Helsingin_ja_Espoon_kaupunkipasemat_avoin.csv"));
			String line;
			int i = 0;
			// skip first line
			br.readLine();
			while ((line = br.readLine()) != null) {
				try {
					String[] values = line.split(",");
					Station station = new Station();

					long stationId = Long.parseLong(values[1]);
					float latitude = Float.parseFloat(values[11]);
					float longitude = Float.parseFloat(values[12]);

					station.setStationId(stationId);
					station.setName_FI(values[2]);
					station.setName_SV(values[3]);
					station.setName(values[4]);
					station.setAddress_FI(values[5]);
					station.setAddress(values[6]);
					station.setCity_FI(values[7]);
					station.setCity_SV(values[8]);
					station.setOperator(values[9]);
					station.setCapacity(values[10]);
					station.setLatitude(latitude);
					station.setLongitude(longitude);
					repository.save(station);
					i++;
				} catch (NumberFormatException ex) {
					System.out.println(ex);
					continue;
				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}
}
