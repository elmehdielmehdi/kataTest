package com.aracovoiturage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aracovoiturage.dao.OpinionDao;
import com.aracovoiturage.dto.OpinionDto;
import com.aracovoiturage.entity.Opinion;
import com.aracovoiturage.service.mapper.ModelMapper;

@Service
public class OpinionServiceImpl implements OpinionService {

	@Autowired
	OpinionDao opinionDao;

	@Autowired
	ModelMapper modelMapper;

	/**
	 * Method to get all opinions
	 */
	@Override
	public List<OpinionDto> getAllOpinionsDto() {
		return (List<OpinionDto>) modelMapper.mapCollection(opinionDao.getAllOpinions(), OpinionDto.class);
	}

	/**
	 * Method to create an new opinion
	 */
	@Override
	public OpinionDto createOpinionDto(OpinionDto opinionDto) {
		if (opinionDto == null)
			return null;
		Opinion opinion = modelMapper.map(opinionDto, Opinion.class);
		opinionDao.createOpinion(opinion);
		return opinionDto;
	}

}
