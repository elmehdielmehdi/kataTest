package com.aracovoiturage.service;

import java.util.List;

import com.aracovoiturage.dto.PathDto;

public interface PathService {
	
	public PathDto getPath(final Long id);

	public List<PathDto> getAllPaths();

	public PathDto createPath(final PathDto pathDto);

	public PathDto updatePath(final PathDto pathDto);

	public PathDto removePath(final PathDto pathDto);
}
