package com.aracovoiturage.service;

import java.util.List;

import com.aracovoiturage.dto.OpinionDto;

public interface OpinionService {

	List<OpinionDto> getAllOpinionsDto();

	OpinionDto createOpinionDto(final OpinionDto opinionDto);

}
