package com.aracovoiturage.dto;

public class CityDto {

	private Long id;
	private Long longitude;
	private Long latitude;
	private String name;

	public CityDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CityDto(Long id, Long longitude, Long latitude, String name) {
		super();
		this.id = id;
		this.longitude = longitude;
		this.latitude = latitude;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getLongitude() {
		return longitude;
	}

	public void setLongitude(Long longitude) {
		this.longitude = longitude;
	}

	public Long getLatitude() {
		return latitude;
	}

	public void setLatitude(Long latitude) {
		this.latitude = latitude;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
