package com.aracovoiturage.dao;

import java.util.Date;
import java.util.List;

import com.aracovoiturage.entity.Path;

public interface PathDao {

	public Path getPath(final Long id);

	public List<Path> getAllPaths();

	public List<Path> getPathsByCriteria(final String citySource, final String cityDestination,final Date dateDeparture);

	public Path createPath(final Path path);

	public Path updatePath(final Path path);

	public void removePath(final Path path);

}
