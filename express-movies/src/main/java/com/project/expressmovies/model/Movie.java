package com.project.expressmovies.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Movie")
public class Movie {
	@Id
    @Column(name = "Movie_Id")
	private int id;
	
	@Column(name = "Movie_Title")
    private String title;
	
	 @Column(name = "Date_Released")
	 private LocalDate date;
	 
	 @Column(name = "Movie_Running_Time")
	 private LocalDateTime running_time;
  
    public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public LocalDateTime getRunning_time() {
		return running_time;
	}


	public void setRunning_time(LocalDateTime running_time) {
		this.running_time = running_time;
	}
	
	public Movie() {
		
	}

	public Movie(int id, String title, LocalDate date, LocalDateTime running_time) {
		this.id = id;
		this.title = title;
		this.date = date;
		this.running_time = running_time;
	}
	
    
    
    @Override
    public String toString() {
        return "  Movie_Id = " + id + " Movie_Title = " + title + " Date_Released= " + date ;
    }
}

