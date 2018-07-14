package com.aracovoiturage.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aracovoiturage.entity.Path;

@Repository
@Transactional
public class PathDaoImpl implements PathDao {

	@PersistenceContext
	EntityManager em;

	/**
	 * Method to get Path with given id
	 */
	@Override
	public Path getPath(final Long id) {
		return em.find(Path.class, id);
	}

	/**
	 * Method to get all paths
	 */
	@Override
	public List<Path> getAllPaths() {
		TypedQuery<Path> query = em.createQuery("From Path", Path.class);
		return query.getResultList();
	}

	/**
	 * Method to create an new path
	 */
	@Override
	public Path createPath(final Path path) {
		return em.merge(path);
	}

	/**
	 * Method to update path
	 */
	@Override
	public Path updatePath(final Path path) {
		return em.merge(path);
	}

	/**
	 * Method to remove path
	 */
	@Override
	public void removePath(final Path path) {
		em.remove(em.contains(path) ? path : em.merge(path));
	}

	@Override
	public List<Path> getPathsByCriteria(String citySource, String cityDestination, Date dateDeparture) {
		// TODO Auto-generated method stub
		return null;
	}



}
