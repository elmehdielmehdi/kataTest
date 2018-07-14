package com.aracovoiturage.dao;

import java.util.List;

import com.aracovoiturage.entity.User;

public interface UserDao {

	public List<User> getAllUsers();

	public User getUser(final Long id);

	public User createUser(final User user);

	public User updateUser(final User user);

	public void removeUser(final User user);
}
