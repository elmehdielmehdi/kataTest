package com.aracovoiturage.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aracovoiturage.entity.Opinion;

@Repository
@Transactional
public class OpinionDaoImpl implements OpinionDao {

	@PersistenceContext
	EntityManager em;

	/**
	 * Method to get All opinions
	 */
	@Override
	public List<Opinion> getAllOpinions() {
		TypedQuery<Opinion> query = em.createQuery("FROM Opinion", Opinion.class);
		return query.getResultList();
	}

	/**
	 * Method to create an new opinion
	 */
	@Override
	public Opinion createOpinion(final Opinion opinion) {
		return em.merge(opinion);
	}

}
