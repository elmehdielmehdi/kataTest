package com.aracovoiturage.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class IntermediateCityPk implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1157509937414567176L;

	@Column(name = "cityId")
	private Long cityId;

	@Column(name = "pathId")
	private Long pathId;

	public IntermediateCityPk() {
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
