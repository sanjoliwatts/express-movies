/*
 * package com.project.expressmovies.utility;
 * 
 * 
 * import java.time.LocalDate; import java.time.LocalDateTime;
 * 
 * import org.slf4j.Logger; import org.slf4j.LoggerFactory; import
 * org.springframework.boot.CommandLineRunner; import
 * org.springframework.context.ApplicationContext; import
 * org.springframework.context.annotation.AnnotationConfigApplicationContext;
 * import org.springframework.stereotype.Component;
 * 
 * import com.project.expressmovies.model.Director; import
 * com.project.expressmovies.model.Movie; import
 * com.project.expressmovies.service.MovieDetailsService; import
 * com.project.expressmovies.service.MovieDetailsServiceImpl;
 * 
 * 
 * @Component public class ApplicationStartUpRunner implements
 * CommandLineRunner{
 * 
 * final Logger logger = (Logger)LoggerFactory.getLogger(this.getClass());
 * private MovieDetailsService movieDetailService;
 * 
 *//**
	 * The ComamdLineRunner run method will be executed before the
	 * SpringApplication.run
	 *//*
		 * @Override public void run(String... args) throws Exception {
		 * logger.info("Inside ApplicationStartUpRunner"); ApplicationContext context =
		 * new AnnotationConfigApplicationContext(AppConfig.class); //
		 * MovieDetailsService service = (MovieDetailsService)
		 * context.getBean("movieDetailsService"); movieDetailService = new
		 * MovieDetailsServiceImpl(); Movie movie = new Movie(1, "Walkside",
		 * LocalDate.now(), LocalDateTime.of(2019, 4, 25, 11, 0)); //
		 * movieDetailService.insertMovie(movie);
		 * 
		 * Director director = new Director(1, "sanjoli", "watts", "B403", 7888,
		 * "sanjoli@gmail.com"); movieDetailService.insertDirector(director);
		 * 
		 * } }
		 */