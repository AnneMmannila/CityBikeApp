package com.CityBikeApp.station;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Station {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column(name = "id")
	private long id;

	@Column(name = "stationId")
	private long stationId;

	@Column(name = "name_FI")
	private String name_FI;

	@Column(name = "name_SV")
	private String name_SV;

	@Column(name = "name")
	private String name;

	@Column(name = "address_FI")
	private String address_FI;

	@Column(name = "address")
	private String address;

	@Column(name = "city_FI")
	private String city_FI;

	@Column(name = "stad")
	private String city_SV;

	@Column(name = "operator")
	private String operator;

	@Column(name = "capacity")
	private String capacity;

	@Column(name = "latitude")
	private float latitude;

	@Column(name = "longitude")
	private float longitude;

	public Station() {
		super();
	}

	public Station(long stationId, String name_FI, String name_SV, String name, String address_FI, String address,
			String city_FI, String city_SV, String operator, String capacity, float latitude) {
		this.stationId = stationId;
		this.name_FI = name_FI;
		this.name_SV = name_SV;
		this.name = name;
		this.address_FI = address_FI;
		this.address = address;
		this.city_FI = city_FI;
		this.city_SV = city_SV;
		this.operator = operator;
		this.capacity = capacity;
		this.latitude = latitude;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getStationId() {
		return stationId;
	}

	public void setStationId(long stationId) {
		this.stationId = stationId;
	}

	public String getName_FI() {
		return name_FI;
	}

	public void setName_FI(String name_FI) {
		this.name_FI = name_FI;
	}

	public String getName_SV() {
		return name_SV;
	}

	public void setName_SV(String name_SV) {
		this.name_SV = name_SV;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress_FI() {
		return address_FI;
	}

	public void setAddress_FI(String address_FI) {
		this.address_FI = address_FI;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity_FI() {
		return city_FI;
	}

	public void setCity_FI(String city_FI) {
		this.city_FI = city_FI;
	}

	public String getCity_SV() {
		return city_SV;
	}

	public void setCity_SV(String city_SV) {
		this.city_SV = city_SV;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

}
