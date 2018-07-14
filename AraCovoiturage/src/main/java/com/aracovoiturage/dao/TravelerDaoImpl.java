package com.aracovoiturage.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aracovoiturage.entity.Traveler;
import com.aracovoiturage.entity.TravelerPK;

@Repository
@Transactional
public class TravelerDaoImpl implements TravelerDao {

	@PersistenceContext
	EntityManager em;

	/**
	 * method to get traveler
	 */
	@Override
	public Traveler getTraveler(final TravelerPK travelerPK) {
		return em.find(Traveler.class, travelerPK);
	}

	/**
	 * Method to get All travelers
	 */
	@Override
	public List<Traveler> getAllTravelers() {
		TypedQuery<Traveler> query = em.createQuery("From Traveler", Traveler.class);
		return query.getResultList();
	}

	/**
	 * Method to create an new traveler
	 */
	@Override
	public Traveler createTraveler(final Traveler traveler) {
		return em.merge(traveler);
	}

	/**
	 * Method to remove traveler
	 */
	@Override
	public void removeTraveler(final Traveler traveler) {
		em.remove(traveler);
	}

}
