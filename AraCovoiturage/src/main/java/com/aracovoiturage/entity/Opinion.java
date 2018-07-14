package com.aracovoiturage.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Opinion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5015253305449347711L;

	@EmbeddedId
	private OpinionPk id;

	private String description;

	@Temporal(TemporalType.DATE)
	private Date dateOpinion;

	@ManyToOne
	@JoinColumn(name = "passengerId", referencedColumnName = "id", insertable = false, updatable = false)
	private User passenger;

	@ManyToOne
	@JoinColumn(name = "driverId", referencedColumnName = "id", insertable = false, updatable = false)
	private User driver;

	@ManyToOne
	@JoinColumn(name = "pathId", referencedColumnName = "id", insertable = false, updatable = false)
	private Path path;

	public Opinion() {
		super();
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

	public OpinionPk getId() {
		return id;
	}

	public void setId(OpinionPk id) {
		this.id = id;
	}

	public User getPassenger() {
		return passenger;
	}

	public void setPassenger(User passenger) {
		this.passenger = passenger;
	}

	public User getDriver() {
		return driver;
	}

	public void setDriver(User driver) {
		this.driver = driver;
	}

	public Path getPath() {
		return path;
	}

	public void setPath(Path path) {
		this.path = path;
	}

}
