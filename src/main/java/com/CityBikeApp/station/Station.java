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
	
	@Column(name = "nimi")
	private String nimi;
	
	@Column(name = "namn")
	private String namn;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "osoite")
	private String osoite;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "kaupunki")
	private String kaupunki;
	
	@Column(name = "stad")
	private String stad;
	
	@Column(name = "operaattor")
	private String operaattor;
	
	@Column(name = "kapasiteet")
	private String kapasiteet;
	
	@Column(name = "latitude")
	private long latitude;
	
	@Column(name = "longitude")
	private long longitude;
	
	public Station () {
		super();
	}
	
	public Station(String nimi, String namn, String name, String osoite, String address, String kaupunki, String stad,
			String operaattor, String kapasiteet, long latitude, long longitude) {
		super();
		this.nimi = nimi;
		this.namn = namn;
		this.name = name;
		this.osoite = osoite;
		this.address = address;
		this.kaupunki = kaupunki;
		this.stad = stad;
		this.operaattor = operaattor;
		this.kapasiteet = kapasiteet;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public String getNamn() {
		return namn;
	}

	public void setNamn(String namn) {
		this.namn = namn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOsoite() {
		return osoite;
	}

	public void setOsoite(String osoite) {
		this.osoite = osoite;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getKaupunki() {
		return kaupunki;
	}

	public void setKaupunki(String kaupunki) {
		this.kaupunki = kaupunki;
	}

	public String getStad() {
		return stad;
	}

	public void setStad(String stad) {
		this.stad = stad;
	}

	public String getOperaattor() {
		return operaattor;
	}

	public void setOperaattor(String operaattor) {
		this.operaattor = operaattor;
	}

	public String getKapasiteet() {
		return kapasiteet;
	}

	public void setKapasiteet(String kapasiteet) {
		this.kapasiteet = kapasiteet;
	}

	public long getLatitude() {
		return latitude;
	}

	public void setLatitude(long latitude) {
		this.latitude = latitude;
	}

	public long getLongitude() {
		return longitude;
	}

	public void setLongitude(long longitude) {
		this.longitude = longitude;
	}


}
