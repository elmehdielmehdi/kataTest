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

import com.aracovoiturage.dto.PathDto;
import com.aracovoiturage.service.PathService;

@RestController
@RequestMapping("/path")
@CrossOrigin(origins = "\"http://localhost:4200")
public class PathController {

	final static Logger logger = Logger.getLogger(PathController.class);

	@Autowired
	PathService pathService;

	@RequestMapping(value = "getAllPaths", method = RequestMethod.GET)
	public ResponseEntity<List<PathDto>> getAllPaths() {
		try {
			List<PathDto> pathsDto = pathService.getAllPaths();
			return new ResponseEntity<>(pathsDto, pathsDto.isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK);
		} catch (Exception e) {
			logger.error(e.getMessage());
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "getPath/{id}", method = RequestMethod.GET)
	public ResponseEntity<PathDto> getPath(@PathVariable final Long id) {
		try {
			PathDto pathDto = pathService.getPath(id);
			return new ResponseEntity<PathDto>(pathDto, pathDto == null ? HttpStatus.NO_CONTENT : HttpStatus.OK);
		} catch (Exception e) {
			logger.error(e.getMessage());
			return new ResponseEntity<PathDto>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "createPath", method = RequestMethod.POST)
	public ResponseEntity<PathDto> createPath(@RequestBody PathDto pathDto) {
		try {
			PathDto newPathDto = pathService.createPath(pathDto);
			return new ResponseEntity<PathDto>(newPathDto, newPathDto == null ? HttpStatus.NO_CONTENT : HttpStatus.OK);
		} catch (Exception e) {
			logger.error(e.getMessage());
			return new ResponseEntity<PathDto>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "updatePath", method = RequestMethod.PUT)
	public ResponseEntity<PathDto> updatePath(@RequestBody PathDto pathDto) {
		try {
			pathDto = pathService.updatePath(pathDto);
			return new ResponseEntity<PathDto>(pathDto, pathDto == null ? HttpStatus.NO_CONTENT : HttpStatus.OK);
		} catch (Exception e) {
			logger.error(e.getMessage());
			return new ResponseEntity<PathDto>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "removePath", method = RequestMethod.DELETE)
	public ResponseEntity<PathDto> removePath(@RequestBody PathDto pathDto) {
		try {
			pathDto = pathService.removePath(pathDto);
			return new ResponseEntity<PathDto>(pathDto, pathDto == null ? HttpStatus.NO_CONTENT : HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<PathDto>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}