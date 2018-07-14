package com.aracovoiturage.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class IntermediateCity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8262604283362389521L;

	@EmbeddedId
	private IntermediateCityPk id;

	@ManyToOne()
	@JoinColumn(name = "cityId", referencedColumnName = "id", insertable = false, updatable = false)
	private City city;

	@ManyToOne
	@JoinColumn(name = "pathId", referencedColumnName = "id", insertable = false, updatable = false)
	private Path path;

	public IntermediateCity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IntermediateCityPk getId() {
		return id;
	}

	public void setId(IntermediateCityPk id) {
		this.id = id;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Path getPath() {
		return path;
	}

	public void setPath(Path path) {
		this.path = path;
	}

}
