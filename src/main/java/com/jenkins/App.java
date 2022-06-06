package com.jenkins;

import java.util.List;
import java.util.Optional;

import com.jenkins.dto.Movie;
import com.jenkins.service.MovieServiceImpl;



public class App 
{
    public static void main( String[] args )
    {
        MovieServiceImpl movieService = new MovieServiceImpl();
        Movie movie = new Movie(1401, "MAJOR", 500.0,"BLOCKBUSTER" );
        Optional<Movie> addedEmpoyee= movieService.addMovie(movie);
        if(addedEmpoyee.isPresent()) {
     	   System.out.println("Employee added Success fully");
        }
        
        List<Movie> employees = movieService.getAllMovieList(movie);
        System.out.println(employees);
        
     }
    }

