package com.aracovoiturage.dto;

public class IntermediateCityDto {

	private CityDto city;

	private PathDto pathDto;

	public IntermediateCityDto() {
		super();
	}

	public IntermediateCityDto(IntermediateCityPKDto id, CityDto city, PathDto pathDto) {
		super();
		this.city = city;
		this.pathDto = pathDto;
	}

	public CityDto getCity() {
		return city;
	}

	public void setCity(CityDto city) {
		this.city = city;
	}

	public PathDto getPathDto() {
		return pathDto;
	}

	public void setPathDto(PathDto pathDto) {
		this.pathDto = pathDto;
	}

}
