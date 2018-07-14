package com.aracovoiturage.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aracovoiturage.entity.User;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

	@PersistenceContext
	EntityManager em;

	/**
	 * Method to get user
	 */
	@Override
	public User getUser(final Long id) {
		return em.find(User.class, id);
	}

	/**
	 * Method to get all users
	 */
	@Override
	public List<User> getAllUsers() {
		TypedQuery<User> query = em.createQuery("From User", User.class);
		return query.getResultList();
	}

	/**
	 * Method to create an new user
	 */
	public User createUser(final User user) {
		return em.merge(user);
	}

	/**
	 * Method to update user
	 */
	@Override
	public User updateUser(final User user) {
		return em.merge(user);
	}

	/**
	 * Method to remove user with given id
	 */
	@Override
	public void removeUser(User user) {
		em.remove(user);
	}

}
