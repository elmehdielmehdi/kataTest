package com.aracovoiturage.dto;

import java.util.Date;

public class OpinionDto {

	private String description;

	private Date dateOpinion;

	private UserDto passenger;

	private UserDto driver;

	private PathDto pathDto;

	public OpinionDto() {
		super();
	}

	public OpinionDto(OpinionPkDto id, String description, Date dateOpinion, UserDto passenger, UserDto driver,
			PathDto pathDto) {
		super();

		this.description = description;
		this.dateOpinion = dateOpinion;
		this.passenger = passenger;
		this.driver = driver;
		this.pathDto = pathDto;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateOpinion() {
		return dateOpinion;
	}

	public void setDateOpinion(Date dateOpinion) {
		this.dateOpinion = dateOpinion;
	}

	public UserDto getPassenger() {
		return passenger;
	}

	public void setPassenger(UserDto passenger) {
		this.passenger = passenger;
	}

	public UserDto getDriver() {
		return driver;
	}

	public void setDriver(UserDto driver) {
		this.driver = driver;
	}

	public PathDto getPathDto() {
		return pathDto;
	}

	public void setPathDto(PathDto pathDto) {
		this.pathDto = pathDto;
	}

}
