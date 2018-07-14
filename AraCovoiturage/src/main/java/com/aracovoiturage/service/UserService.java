package com.aracovoiturage.service;

import java.util.List;

import com.aracovoiturage.dto.UserDto;

public interface UserService {

	public UserDto getUser(final Long id);

	public List<UserDto> getAllUsers();

	public UserDto createUser(final UserDto userDto);

	public UserDto updateUser(final UserDto userDto);
}
