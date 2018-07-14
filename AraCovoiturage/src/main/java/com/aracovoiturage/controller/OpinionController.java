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

import com.aracovoiturage.dto.OpinionDto;
import com.aracovoiturage.service.OpinionService;

@RestController
@RequestMapping("/opinion")
@CrossOrigin(origins = "\"http://localhost:4200")
public class OpinionController {

	@Autowired
	OpinionService opinionService;

	@RequestMapping(value = "getAllOpinions", method = RequestMethod.GET)
	public ResponseEntity<List<OpinionDto>> getAllOpinions() {
		try {
			List<OpinionDto> opinionsDto = opinionService.getAllOpinionsDto();
			return new ResponseEntity<List<OpinionDto>>(opinionsDto,
					opinionsDto.isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<List<OpinionDto>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "createOpinion", method = RequestMethod.POST)
	public ResponseEntity<OpinionDto> createOpiniion(@RequestBody OpinionDto opinionDto) {
		try {
			opinionDto = opinionService.createOpinionDto(opinionDto);
			return new ResponseEntity<OpinionDto>(opinionDto,
					opinionDto == null ? HttpStatus.NO_CONTENT : HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<OpinionDto>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
