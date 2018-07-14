package com.aracovoiturage.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PathDto {

	private Long id;

	private Date dateDeparture;

	private Date dateArrival;

	private Long numberPlaces;

	private UserDto driver;

	private String description;

	private CityDto citySource;

	private CityDto cityDestination;

	private List<IntermediateCityDto> intermediateCity;

	private List<TravelerDto> travelers;

	private List<OpinionDto> opinions;

	public PathDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PathDto(Long id, CityDto citySource, CityDto cityDestination, Date dateDeparture, Date dateArrival,
			UserDto driver, String description, Long numberPlaces) {
		super();
		this.id = id;
		this.citySource = citySource;
		this.cityDestination = cityDestination;
		this.dateDeparture = dateDeparture;
		this.dateArrival = dateArrival;
		this.driver = driver;
		this.description = description;
		this.travelers = new ArrayList<>();
		this.opinions = new ArrayList<>();
		this.intermediateCity = new ArrayList<>();
		this.numberPlaces = numberPlaces;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDateDeparture() {
		return dateDeparture;
	}

	public void setDateDeparture(Date dateDeparture) {
		this.dateDeparture = dateDeparture;
	}

	public Date getDateArrival() {
		return dateArrival;
	}

	public void setDateArrival(Date dateArrival) {
		this.dateArrival = dateArrival;
	}

	public Long getNumberPlaces() {
		return numberPlaces;
	}

	public void setNumberPlaces(Long numberPlaces) {
		this.numberPlaces = numberPlaces;
	}

	public UserDto getDriver() {
		return driver;
	}

	public void setDriver(UserDto driver) {
		this.driver = driver;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public CityDto getCitySource() {
		return citySource;
	}

	public void setCitySource(CityDto citySource) {
		this.citySource = citySource;
	}

	public CityDto getCityDestination() {
		return cityDestination;
	}

	public void setCityDestination(CityDto cityDestination) {
		this.cityDestination = cityDestination;
	}

	public List<IntermediateCityDto> getIntermediateCity() {
		return intermediateCity;
	}

	public void setIntermediateCity(List<IntermediateCityDto> intermediateCity) {
		this.intermediateCity = intermediateCity;
	}

	public List<TravelerDto> getTravelers() {
		return travelers;
	}

	public void setTravelers(List<TravelerDto> travelers) {
		this.travelers = travelers;
	}

	public List<OpinionDto> getOpinions() {
		return opinions;
	}

	public void setOpinions(List<OpinionDto> opinions) {
		this.opinions = opinions;
	}

}
