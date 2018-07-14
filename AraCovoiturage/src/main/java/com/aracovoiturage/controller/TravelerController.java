package com.aracovoiturage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aracovoiturage.dto.TravelerDto;
import com.aracovoiturage.dto.TravelerPKDto;
import com.aracovoiturage.service.TravelerService;

@RestController
@RequestMapping("/traveler")
@CrossOrigin(origins = "\"http://localhost:4200")
public class TravelerController {

	@Autowired
	private TravelerService travelerService;

	@RequestMapping(value = "getTraveler", method = RequestMethod.POST)
	public ResponseEntity<TravelerDto> getTraveler(@RequestBody final TravelerPKDto travelerPKDto) {
		try {
			TravelerDto travelerDto = travelerService.getTraveler(travelerPKDto);
			return new ResponseEntity<TravelerDto>(travelerDto,
					travelerDto == null ? HttpStatus.NO_CONTENT : HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<TravelerDto>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "getAllTravelers", method = RequestMethod.GET)
	public ResponseEntity<List<TravelerDto>> getAllTravelers() {
		try {
			List<TravelerDto> travelersDto = travelerService.getAllTravelers();
			return new ResponseEntity<List<TravelerDto>>(travelersDto,
					travelersDto.isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<List<TravelerDto>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "createTraveler", method = RequestMethod.POST)
	public ResponseEntity<TravelerDto> createTraveler(@RequestBody TravelerDto travelerDto) {
		try {
			travelerDto = travelerService.createTraveler(travelerDto);
			return new ResponseEntity<TravelerDto>(travelerDto,
					travelerDto == null ? HttpStatus.NO_CONTENT : HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "removeTraveler", method = RequestMethod.DELETE)
	public ResponseEntity<TravelerDto> removeTraveler(@RequestBody  TravelerDto travelerDto) {
		try {
			travelerDto = travelerService.removeTraveler(travelerDto);
			return new ResponseEntity<TravelerDto>(travelerDto,
					travelerDto == null ? HttpStatus.NO_CONTENT : HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<TravelerDto>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
