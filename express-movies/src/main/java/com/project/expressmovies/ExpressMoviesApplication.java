package com.project.expressmovies;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.project.expressmovies.model.Director;
import com.project.expressmovies.model.Movie;
import com.project.expressmovies.service.MovieDetailsService;
import com.project.expressmovies.service.MovieDetailsServiceImpl;
import com.project.expressmovies.utility.AppConfig;

@SpringBootApplication
public class ExpressMoviesApplication {
	//To start mysql server, Run command -> sudo service mysql start
	//To check whether mysql is running or not -> service mysql status
	//To establish connection to mysql using ubuntu terminal -> mysql -u root -p
	
	final Logger logger = (Logger)LoggerFactory.getLogger(this.getClass());
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ExpressMoviesApplication.class, args);
	
		 MovieDetailsService service =context.getBean("movieDetailsService",  MovieDetailsServiceImpl.class);
		 Movie movie = new Movie(1, "Walkside", LocalDate.now(), LocalDateTime.of(2019, 4, 25, 11, 0));
		// service.insertMovie(movie);
		 
		 Director director = new Director(1, "sanjoli", "watts", "B403", 7888, "sanjoli@gmail.com");
		 service.insertDirector(director);
	}
	
	public void run(String... arg0) throws Exception {
		logger.info("Inside run method");
	}

}





