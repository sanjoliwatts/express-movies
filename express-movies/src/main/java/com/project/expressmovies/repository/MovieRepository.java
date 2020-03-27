package com.project.expressmovies.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.expressmovies.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Integer>{

}
