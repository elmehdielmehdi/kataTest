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

import com.aracovoiturage.dto.IntermediateCityDto;
import com.aracovoiturage.service.IntermediateCityService;

@RestController
@RequestMapping("IntermediateCity")
@CrossOrigin(origins = "\"http://localhost:4200")
public class IntermediateCityController {

	@Autowired
	IntermediateCityService intermediateCityService;

	@RequestMapping(value = "getAllIntermediateCities", method = RequestMethod.GET)
	public ResponseEntity<List<IntermediateCityDto>> getAllIntermediateCities() {
		try {
			List<IntermediateCityDto> intermediateCitiesDto = intermediateCityService.getAllIntermediateCities();
			return new ResponseEntity<List<IntermediateCityDto>>(intermediateCitiesDto,
					intermediateCitiesDto.isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<List<IntermediateCityDto>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@RequestMapping(value = "createIntermediateCity", method = RequestMethod.POST)
	public ResponseEntity<IntermediateCityDto> createIntermediateCity(
			@RequestBody IntermediateCityDto intermediateCityDto) {
		try {
			intermediateCityDto = intermediateCityService.createIntermediateCity(intermediateCityDto);
			return new ResponseEntity<>(intermediateCityDto,
					intermediateCityDto == null ? HttpStatus.NO_CONTENT : HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<IntermediateCityDto>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
