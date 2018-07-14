package com.aracovoiturage.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aracovoiturage.entity.IntermediateCity;

@Repository

@Transactional
public class IntermediateCityDaoImpl implements IntermediateCityDao {

	@PersistenceContext
	private EntityManager em;

	/**
	 * Method to get All intermediateCities
	 */
	@Override
	public List<IntermediateCity> getAllIntermediateCities() {
		TypedQuery<IntermediateCity> query = em.createQuery("FROM IntermediateCity", IntermediateCity.class);
		return query.getResultList();
	}

	public IntermediateCity createIntermediateCity(final IntermediateCity intermediateCity) {
		return em.merge(intermediateCity);
	}

}
