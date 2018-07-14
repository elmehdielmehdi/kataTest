package com.aracovoiturage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aracovoiturage.dao.IntermediateCityDao;
import com.aracovoiturage.dto.IntermediateCityDto;
import com.aracovoiturage.entity.IntermediateCity;
import com.aracovoiturage.service.mapper.ModelMapper;

@Service
public class IntermediateCityServiceImpl implements IntermediateCityService {

	@Autowired
	private IntermediateCityDao intermediateCityDao;

	@Autowired
	private ModelMapper modelMapper;

	/**
	 * Method to get All intermediateCities
	 */
	@Override
	public List<IntermediateCityDto> getAllIntermediateCities() {
		return (List<IntermediateCityDto>) modelMapper.mapCollection(intermediateCityDao.getAllIntermediateCities(),
				IntermediateCityDto.class);
	}

	/**
	 * Method to create an new intermediateCity
	 */
	@Override
	public IntermediateCityDto createIntermediateCity(final IntermediateCityDto intermediateCityDto) {
		if (intermediateCityDao == null)
			return null;
		intermediateCityDao.createIntermediateCity(modelMapper.map(intermediateCityDto, IntermediateCity.class));
		return intermediateCityDto;
	}

}
