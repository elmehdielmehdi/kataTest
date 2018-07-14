package com.aracovoiturage.controller;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aracovoiturage.dto.UserDto;
import com.aracovoiturage.service.PathService;
import com.aracovoiturage.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200/")
public class UserController {

	final static Logger logger = Logger.getLogger(UserController.class);

	@Autowired
	UserService userService;

	@Autowired
	PathService pathService;

	@RequestMapping(value = "getUser/{id}", method = RequestMethod.GET)
	public ResponseEntity<UserDto> getUser(@PathVariable final Long id) {
		try {
			UserDto userDto = userService.getUser(id);
			return new ResponseEntity<>(userDto, userDto == null ? HttpStatus.NO_CONTENT : HttpStatus.OK);
		} catch (Exception e) {
			logger.error(e.getMessage());
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "getAllUsers", method = RequestMethod.GET)
	public ResponseEntity<List<UserDto>> getUsers() {
		try {
			List<UserDto> usersDto = userService.getAllUsers();
			return new ResponseEntity<>(usersDto, usersDto.isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK);
		} catch (Exception e) {
			logger.error(e.getMessage());
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "createUser", method = RequestMethod.POST)
	public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {
		try {
			userDto = userService.createUser(userDto);
			return new ResponseEntity<>(userDto, userDto == null ? HttpStatus.NO_CONTENT : HttpStatus.OK);
		} catch (Exception e) {
			logger.error(e.getMessage());
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "updateUser", method = RequestMethod.PUT)
	public ResponseEntity<UserDto> updateUser(@RequestBody UserDto userDto) {
		try {
			userDto = userService.updateUser(userDto);
			return new ResponseEntity<>(userDto, userDto == null ? HttpStatus.NO_CONTENT : HttpStatus.OK);
		} catch (Exception e) {
			logger.error(e.getMessage());
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
