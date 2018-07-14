package com.aracovoiturage.dto;

public class OpinionPkDto {

	private Long pathId;

	private Long driverId;

	private Long passengerId;

	public OpinionPkDto(Long pathId, Long driverId, Long passengerId) {
		super();
		this.pathId = pathId;
		this.driverId = driverId;
		this.passengerId = passengerId;
	}

	public OpinionPkDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getPathId() {
		return pathId;
	}

	public void setPathId(Long pathId) {
		this.pathId = pathId;
	}

	public Long getDriverId() {
		return driverId;
	}

	public void setDriverId(Long driverId) {
		this.driverId = driverId;
	}

	public Long getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(Long passengerId) {
		this.passengerId = passengerId;
	}

}
