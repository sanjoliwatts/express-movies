package com.project.expressmovies.service;

import com.project.expressmovies.model.Director;
import com.project.expressmovies.model.Movie;

public interface MovieDetailsService {
	public void insertMovie(Movie movie);
	public void insertDirector(Director director);
}
