package com.aracovoiturage.service;

import java.util.List;

import com.aracovoiturage.dto.IntermediateCityDto;

public interface IntermediateCityService {

	List<IntermediateCityDto> getAllIntermediateCities();

	IntermediateCityDto createIntermediateCity(final IntermediateCityDto intermediateCityDto);

}
