package com.aracovoiturage.dto;

public class IntermediateCityPKDto {

	private Long cityId;

	private Long pathId;

	public IntermediateCityPKDto(Long cityId, Long pathId) {
		super();
		this.cityId = cityId;
		this.pathId = pathId;
	}

	public IntermediateCityPKDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getCityId() {
		return cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	public Long getPathId() {
		return pathId;
	}

	public void setPathId(Long pathId) {
		this.pathId = pathId;
	}

}
