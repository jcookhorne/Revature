package dao;

import pojo.MoviePojo;

public interface MovieDAO {
	//C.R.U.D
// create
	// add a movie entry
	MoviePojo addMovie(MoviePojo addMovie);
	
	//delete
	MoviePojo DeleteMovie(String movieName);
	
	//update
	MoviePojo UpdateMovie(MoviePojo updateMovie);
	
	// Read
	MoviePojo readMovie(String movieName);
	
}
