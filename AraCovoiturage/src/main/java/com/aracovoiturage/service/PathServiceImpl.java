package com.aracovoiturage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aracovoiturage.dao.PathDao;
import com.aracovoiturage.dto.PathDto;
import com.aracovoiturage.entity.City;
import com.aracovoiturage.entity.Path;
import com.aracovoiturage.service.mapper.ModelMapper;

@Service
public class PathServiceImpl implements PathService {

	@Autowired
	PathDao pathDao;

	@Autowired
	ModelMapper modelMapper;

	/**
	 * Method to get path with given id
	 */
	@Override
	public PathDto getPath(final Long id) {
		return modelMapper.map(pathDao.getPath(id), PathDto.class);
	}

	/**
	 * Method to get all paths
	 */
	@Override
	public List<PathDto> getAllPaths() {
		return (List<PathDto>) modelMapper.mapCollection(pathDao.getAllPaths(), PathDto.class);
	}

	/**
	 * Method to create an new path
	 */
	@Override
	public PathDto createPath(PathDto pathDto) {
		if (pathDto == null) {
			return null;
		}
		Path path = modelMapper.map(pathDto, Path.class);
		return modelMapper.map(pathDao.createPath(path), PathDto.class);
	}

	/**
	 * Method to update path
	 */
	@Override
	public PathDto updatePath(PathDto pathDto) {
		if (pathDto == null)
			return null;
		Path path = pathDao.getPath(pathDto.getId());
		if (path == null)
			return null;
		path.setCitySource(modelMapper.map(pathDto.getCitySource(), City.class));
		path.setCityDestination(modelMapper.map(pathDto.getCityDestination(), City.class));
		path.setDateDeparture(pathDto.getDateDeparture());
		path.setDateArrival(pathDto.getDateArrival());
		path.setDescription(pathDto.getDescription());
		path.setNumberPlaces(pathDto.getNumberPlaces());
		return modelMapper.map(pathDao.updatePath(path), pathDto.getClass());
	}

	/**
	 * Method to remove path
	 */
	@Override
	public PathDto removePath(PathDto pathDto) {
		if (pathDto == null)
			return null;
		Path path = modelMapper.map(pathDto, Path.class);
		pathDao.removePath(path);
		return pathDto;
	}

}
