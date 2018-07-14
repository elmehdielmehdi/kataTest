package com.aracovoiturage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aracovoiturage.dao.TravelerDao;
import com.aracovoiturage.dto.TravelerDto;
import com.aracovoiturage.dto.TravelerPKDto;
import com.aracovoiturage.entity.Traveler;
import com.aracovoiturage.entity.TravelerPK;
import com.aracovoiturage.service.mapper.ModelMapper;

@Service
public class TravelerServiceImpl implements TravelerService {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private TravelerDao travelerDao;

	/**
	 * Method to get traveler with given id of traveler
	 */
	@Override
	public TravelerDto getTraveler(TravelerPKDto travelerPKDto) {
		TravelerPK travelerPK = modelMapper.map(travelerPKDto, TravelerPK.class);
		return modelMapper.map(travelerDao.getTraveler(travelerPK), TravelerDto.class);
	}

	/**
	 * Method to get all travelers
	 */
	@Override
	public List<TravelerDto> getAllTravelers() {
		List<Traveler> travelers = travelerDao.getAllTravelers();
		return (List<TravelerDto>) modelMapper.mapCollection(travelers, TravelerDto.class);
	}

	/**
	 * Method to create an new traveler
	 */
	@Override
	public TravelerDto createTraveler(TravelerDto travelerDto) {
		travelerDao.createTraveler(modelMapper.map(travelerDto, Traveler.class));
		return travelerDto;

	}

	/**
	 * Method to remove traveler
	 */
	@Override
	public TravelerDto removeTraveler(TravelerDto travelerDto) {
		if (travelerDto == null)
			return null;

		Traveler traveler = modelMapper.map(travelerDto, Traveler.class);
		travelerDao.removeTraveler(traveler);
		return travelerDto;
	}

}
