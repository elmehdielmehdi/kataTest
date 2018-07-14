package com.aracovoiturage.service;

import java.util.List;

import com.aracovoiturage.dto.TravelerDto;
import com.aracovoiturage.dto.TravelerPKDto;

public interface TravelerService {

	public TravelerDto getTraveler(final TravelerPKDto travelerPKDto);

	public List<TravelerDto> getAllTravelers();

	public TravelerDto createTraveler(final TravelerDto travelerDto);

	public TravelerDto removeTraveler(final TravelerDto travelerDto);

}
