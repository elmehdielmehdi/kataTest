package com.aracovoiturage.dao;

import java.util.List;

import com.aracovoiturage.entity.IntermediateCity;

public interface IntermediateCityDao {

	List<IntermediateCity> getAllIntermediateCities();

	IntermediateCity createIntermediateCity(final IntermediateCity intermediateCity);

}
