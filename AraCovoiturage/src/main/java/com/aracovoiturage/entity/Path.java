package com.aracovoiturage.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Path implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2090867570627693740L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Temporal(TemporalType.DATE)
	private Date dateDeparture;

	@Temporal(TemporalType.DATE)
	private Date dateArrival;

	private Long numberPlaces;

	@ManyToOne()
	@JoinColumn(name = "driver")
	private User driver;

	private String description;

	@ManyToOne()
	@JoinColumn(name = "citySource")
	private City citySource;

	@ManyToOne()
	@JoinColumn(name = "cityDestination")
	private City cityDestination;

	@OneToMany(mappedBy = "path", fetch = FetchType.LAZY)
	private List<IntermediateCity> intermediateCity;

	@OneToMany(mappedBy = "path", fetch = FetchType.LAZY)
	private List<Traveler> travelers;

	@OneToMany(mappedBy = "path", fetch = FetchType.LAZY)
	private List<Opinion> opinions;

	public Path() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDateDeparture() {
		return dateDeparture;
	}

	public void setDateDeparture(Date dateDeparture) {
		this.dateDeparture = dateDeparture;
	}

	public Date getDateArrival() {
		return dateArrival;
	}

	public void setDateArrival(Date dateArrival) {
		this.dateArrival = dateArrival;
	}

	public Long getNumberPlaces() {
		return numberPlaces;
	}

	public void setNumberPlaces(Long numberPlaces) {
		this.numberPlaces = numberPlaces;
	}

	public User getDriver() {
		return driver;
	}

	public void setDriver(User driver) {
		this.driver = driver;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public City getCitySource() {
		return citySource;
	}

	public void setCitySource(City citySource) {
		this.citySource = citySource;
	}

	public City getCityDestination() {
		return cityDestination;
	}

	public void setCityDestination(City cityDestination) {
		this.cityDestination = cityDestination;
	}

	public List<IntermediateCity> getIntermediateCity() {
		return intermediateCity;
	}

	public void setIntermediateCity(List<IntermediateCity> intermediateCity) {
		this.intermediateCity = intermediateCity;
	}

	public List<Traveler> getTravelers() {
		return travelers;
	}

	public void setTravelers(List<Traveler> travelers) {
		this.travelers = travelers;
	}

	public List<Opinion> getOpinions() {
		return opinions;
	}

	public void setOpinions(List<Opinion> opinions) {
		this.opinions = opinions;
	}

}
