package com.CityBikeApp.journey;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

@Entity
public class Journey {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private long id;

	@NotBlank(message = "Departure time is mandatory")
	private String departureTime;

	@NotBlank(message = "Return time is mandatory")
	private String returnTime;

	private int departureStationId;

	@NotBlank(message = "Departure station name is mandatory")
	private String departureStationName;

	private int returnStationId;

	@NotBlank(message = "Return station name is mandatory")
	private String returnStationName;

	@Positive(message = "Covered distance cannot be zero")
	private double coveredDistanceInMeters;

	@Positive(message = "Journey duration cannot be zero")
	private double journeyDurationInSec;

	public Journey() {
		super();
	};

	public Journey(@NotBlank(message = "Departure time is mandatory") String departureTime,
			@NotBlank(message = "Return time is mandatory") String returnTime, int departureStationId,
			@NotBlank(message = "Departure station name is mandatory") String departureStationName, int returnStationId,
			@NotBlank(message = "Return station name is mandatory") String returnStationName,
			@Positive(message = "Covered distance cannot be zero") double coveredDistanceInMeters,
			@Positive(message = "Journey duration cannot be zero") double journeyDurationInSec) {
		super();
		this.departureTime = departureTime;
		this.returnTime = returnTime;
		this.departureStationId = departureStationId;
		this.departureStationName = departureStationName;
		this.returnStationId = returnStationId;
		this.returnStationName = returnStationName;
		this.coveredDistanceInMeters = coveredDistanceInMeters;
		this.journeyDurationInSec = journeyDurationInSec;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getReturnTime() {
		return returnTime;
	}

	public void setReturnTime(String returnTime) {
		this.returnTime = returnTime;
	}

	public int getDepartureStationId() {
		return departureStationId;
	}

	public void setDepartureStationId(int departureStationId) {
		this.departureStationId = departureStationId;
	}

	public String getDepartureStationName() {
		return departureStationName;
	}

	public void setDepartureStationName(String departureStationName) {
		this.departureStationName = departureStationName;
	}

	public int getReturnStationId() {
		return returnStationId;
	}

	public void setReturnStationId(int returnStationId) {
		this.returnStationId = returnStationId;
	}

	public String getReturnStationName() {
		return returnStationName;
	}

	public void setReturnStationName(String returnStationName) {
		this.returnStationName = returnStationName;
	}

	public double getCoveredDistanceInMeters() {
		return coveredDistanceInMeters;
	}

	public void setCoveredDistanceInMeters(double coveredDistanceInMeters) {
		this.coveredDistanceInMeters = coveredDistanceInMeters;
	}

	public double getJourneyDurationInSec() {
		return journeyDurationInSec;
	}

	public void setJourneyDurationInSec(double journeyDurationInSec) {
		this.journeyDurationInSec = journeyDurationInSec;
	}

	@Override
	public String toString() {
		return "Journey [id=" + id + ", departureTime=" + departureTime + ", returnTime=" + returnTime
				+ ", departureStationName=" + departureStationName + ", returnStationName=" + returnStationName
				+ ", coveredDistanceInMeters=" + coveredDistanceInMeters + ", journeyDurationInSec="
				+ journeyDurationInSec + "]";
	}

}
