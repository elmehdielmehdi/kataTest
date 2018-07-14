package com.aracovoiturage.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class OpinionPk implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9112422294152319430L;

	@Column(name = "pathId")
	private Long pathId;

	@Column(name = "driverId")
	private Long driverId;

	@Column(name = "passengerId")
	private Long passengerId;

	public OpinionPk() {
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
