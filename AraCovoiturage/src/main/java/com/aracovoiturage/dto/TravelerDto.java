package com.aracovoiturage.dto;

public class TravelerDto {

	private UserDto passenger;

	private PathDto pathDto;

	public TravelerDto() {
		super();
	}

	public UserDto getPassenger() {
		return passenger;
	}

	public void setPassenger(UserDto passenger) {
		this.passenger = passenger;
	}

	public PathDto getPathDto() {
		return pathDto;
	}

	public void setPathDto(PathDto pathDto) {
		this.pathDto = pathDto;
	}

}
