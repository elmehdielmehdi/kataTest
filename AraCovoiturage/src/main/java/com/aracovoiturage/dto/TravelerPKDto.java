package com.aracovoiturage.dto;

public class TravelerPKDto {

	private int pathId;

	private int userId;

	public TravelerPKDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TravelerPKDto(int pathId, int userId) {
		super();
		this.pathId = pathId;
		this.userId = userId;
	}

	public int getPathId() {
		return pathId;
	}

	public void setPathId(int pathId) {
		this.pathId = pathId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}
