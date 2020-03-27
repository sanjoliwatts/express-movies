package com.project.expressmovies.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.expressmovies.model.Director;
import com.project.expressmovies.model.Movie;
import com.project.expressmovies.repository.DirectorRepository;
import com.project.expressmovies.repository.MovieRepository;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service("movieDetailsService")
public class MovieDetailsServiceImpl implements MovieDetailsService{
	    @Autowired
	    private MovieRepository movieRepository;  
	    
	    @Autowired
	    private DirectorRepository directorRepository; 
	   
	 final Logger logger = (Logger)LoggerFactory.getLogger(this.getClass());
		public void insertMovie(Movie movie) {
			logger.info("Inside insertMovie of movieDetailsService");
			movieRepository.save(movie);	
	    }
		
		public void insertDirector(Director director) {
			try {
				logger.info("Inside insertDirector of movieDetailsService");
				directorRepository.saveAndFlush(director);	
				logger.info("Director Added Successfully");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
	    }
		
//		public void removeMovie(String title) {
//			Optional<Movie> opt=movieRepository.findById(title);
//			if(opt.isPresent())
//			 {
//				Movie movie=opt.get();
//				movieRepository.delete(movie);
//			 } 
//		}
//		
//		public Employee findEmployee(int empId){
//			Optional<Employee> opt=employeeRepository.findById(empId);
//			if(opt.isPresent()) 
//				return opt.get();	
//			return null;
//		}
}

