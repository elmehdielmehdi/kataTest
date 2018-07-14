package com.aracovoiturage.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3492848191533453074L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String firstName;

	private String lastName;

	private String numberPhone;

	@Temporal(TemporalType.DATE)
	private Date birthday;

	private String email;

	@OneToMany(mappedBy = "passenger", fetch = FetchType.LAZY)
	private List<Traveler> travelersAsUser;

	@OneToMany(mappedBy = "passenger", fetch = FetchType.LAZY)
	private List<Opinion> opinionsAsPassenger;

	@OneToMany(mappedBy = "driver", fetch = FetchType.LAZY)
	private List<Opinion> opinionsAsDriver;

	public User() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNumberPhone() {
		return numberPhone;
	}

	public void setNumberPhone(String numberPhone) {
		this.numberPhone = numberPhone;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Traveler> getTravelersAsUser() {
		return travelersAsUser;
	}

	public void setTravelersAsUser(List<Traveler> travelersAsUser) {
		this.travelersAsUser = travelersAsUser;
	}

	public List<Opinion> getOpinionsAsPassenger() {
		return opinionsAsPassenger;
	}

	public void setOpinionsAsPassenger(List<Opinion> opinionsAsPassenger) {
		this.opinionsAsPassenger = opinionsAsPassenger;
	}

	public List<Opinion> getOpinionsAsDriver() {
		return opinionsAsDriver;
	}

	public void setOpinionsAsDriver(List<Opinion> opinionsAsDriver) {
		this.opinionsAsDriver = opinionsAsDriver;
	}

}
