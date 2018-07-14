package com.aracovoiturage.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class City implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7477962592785879763L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long longitude;
	private Long latitude;
	private String name;

	@OneToMany(mappedBy = "citySource", fetch = FetchType.LAZY)
	private List<Path> pathsAsCitySource;

	@OneToMany(mappedBy = "cityDestination", fetch = FetchType.LAZY)
	private List<Path> pathAsCityDestination;

	@OneToMany(mappedBy = "city", fetch = FetchType.LAZY)
	private List<IntermediateCity> intermediateCitiesAsCity;

	public City() {
		super();
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

	public List<Path> getPathsAsCitySource() {
		return pathsAsCitySource;
	}

	public void setPathsAsCitySource(List<Path> pathsAsCitySource) {
		this.pathsAsCitySource = pathsAsCitySource;
	}

	public List<Path> getPathAsCityDestination() {
		return pathAsCityDestination;
	}

	public void setPathAsCityDestination(List<Path> pathAsCityDestination) {
		this.pathAsCityDestination = pathAsCityDestination;
	}

	public List<IntermediateCity> getIntermediateCitiesAsCity() {
		return intermediateCitiesAsCity;
	}

	public void setIntermediateCitiesAsCity(List<IntermediateCity> intermediateCitiesAsCity) {
		this.intermediateCitiesAsCity = intermediateCitiesAsCity;
	}

}
