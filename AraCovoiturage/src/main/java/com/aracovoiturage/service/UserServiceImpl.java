package com.aracovoiturage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aracovoiturage.dao.UserDao;
import com.aracovoiturage.dto.UserDto;
import com.aracovoiturage.entity.User;
import com.aracovoiturage.service.mapper.ModelMapper;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	ModelMapper modelMapper;

	@Autowired
	UserDao userDao;

	/**
	 * Method to get user with given id
	 */
	@Override
	public UserDto getUser(Long id) {
		return modelMapper.map(userDao.getUser(id), UserDto.class);
	}

	/**
	 * Method to get All users
	 */
	@Override
	public List<UserDto> getAllUsers() {
		List<UserDto> usersDto = (List<UserDto>) modelMapper.mapCollection(userDao.getAllUsers(), UserDto.class);
		return usersDto;
	}

	/**
	 * Method to create an new user
	 */
	@Override
	public UserDto createUser(final UserDto userDto) {
		if (userDto == null) {
			return null;
		}
		User user = modelMapper.map(userDto, User.class);
		return modelMapper.map(userDao.createUser(user), UserDto.class);
	}

	/**
	 * Method to update user
	 */
	@Override
	public UserDto updateUser(UserDto userDto) {

		if (userDto == null)
			return null;
		User user = userDao.getUser(userDto.getId());
		if (user == null)
			return null;
		user.setFirstName(userDto.getFirstName());
		user.setLastName(userDto.getLastName());
		user.setEmail(userDto.getNumberPhone());
		user.setNumberPhone(userDto.numberPhone);
		user.setBirthday(userDto.getBirthday());
		return modelMapper.map(userDao.updateUser(user), UserDto.class);
	}

}
