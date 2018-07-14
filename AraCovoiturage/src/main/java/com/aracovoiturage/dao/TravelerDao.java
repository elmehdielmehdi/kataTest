package com.aracovoiturage.dao;

import java.util.List;

import com.aracovoiturage.entity.Traveler;
import com.aracovoiturage.entity.TravelerPK;

public interface TravelerDao {

	public Traveler getTraveler(final TravelerPK travelerPK);

	public List<Traveler> getAllTravelers();

	public Traveler createTraveler(final Traveler traveler);

	public void removeTraveler(final Traveler traveler);

}
