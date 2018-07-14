package com.aracovoiturage.dao;

import java.util.List;

import com.aracovoiturage.entity.Opinion;

public interface OpinionDao {

	List<Opinion> getAllOpinions();

	Opinion createOpinion(final Opinion opinion);
	
	Opinion createOpinionTest(final Opinion opinion);
	
	

}
