package com.aracovoiturage.dto;

import java.util.Date;

public class UserDto {

	public Long id;

	public String firstName;

	public String lastName;

	public String numberPhone;

	public Date birthday;

	public String email;


	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDto(Long id, String firstName, String lastName, String numberPhone, Date birthday, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.numberPhone = numberPhone;
		this.birthday = birthday;
		this.email = email;
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


}
