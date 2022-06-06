package com.jenkins.service;

import java.util.List;


import java.util.Optional;

import com.jenkins.dao.MovieDaoImpl;
import com.jenkins.dto.Movie;


public class MovieServiceImpl implements MovieService {
MovieDaoImpl movieDaoIMPL=new MovieDaoImpl();
	@Override
	public Optional<Movie> addMovie(Movie movie) {

		return movieDaoIMPL.addMovie(movie) ;
	}

	@Override
	public Optional<Movie> updateMovieDetails(Movie movie) {

		return movieDaoIMPL.updateMovieDetails(movie);
	}

	@Override
	public Optional<Movie> getMovieById(Integer movieId) {

		return movieDaoIMPL.getMovieById(movieId);
	}

	@Override
	public List<Movie> getAllMovieList(Movie movie) {

		return movieDaoIMPL.getAllMovieList(movie);
	}

}
