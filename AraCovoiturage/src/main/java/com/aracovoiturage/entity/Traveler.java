package com.aracovoiturage.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Traveler implements Serializable {

	private static final long serialVersionUID = -1356159385110400992L;

	@EmbeddedId
	private TravelerPK id;

	@ManyToOne()
	@JoinColumn(name = "pathId", referencedColumnName = "id", insertable = false, updatable = false)
	private Path path;

	@ManyToOne
	@JoinColumn(name = "userId", referencedColumnName = "id", insertable = false, updatable = false)
	private User passenger;

	public Traveler() {
		super();
	}

	public TravelerPK getId() {
		return id;
	}

	public void setId(TravelerPK id) {
		this.id = id;
	}

	public Path getPath() {
		return path;
	}

	public void setPath(Path path) {
		this.path = path;
	}

	public User getPassenger() {
		return passenger;
	}

	public void setPassenger(User passenger) {
		this.passenger = passenger;
	}

}
