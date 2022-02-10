package dao;

import java.util.List;

import pojo.MoviePojo;

public class MovieDaoImpl implements MovieDAO{
	List<MoviePojo> allMovies;  
	
	
	public MovieDaoImpl() {
		allMovies.add(new MoviePojo(101, "Star Wars", 1998, "ScieFi", 126, "PG13", "George Lucas"));
		allMovies.add(new MoviePojo(102, "Treasure Planet", 2002, "Fantasy", 110, "G", "Disney"));
		allMovies.add(new MoviePojo(103, "Meet the Robinsons", 2005, "ScieFi", 118, "G", "DreamWorks"));

	}
	
	@Override
	public MoviePojo addMovie(MoviePojo addMovie) {
		// TODO Auto-generated method stub
		String movieAdd = allMovies.get(allMovies.size() - 1).getMovieName() +1; 
		//MoviePojo.setMovieName(movieAdd);
		
		return null;
	}	
	
	@Override
	public MoviePojo DeleteMovie(String movieName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MoviePojo UpdateMovie(MoviePojo updateMovie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MoviePojo readMovie(String movieName) {
		// TODO Auto-generated method stub
		return null;
	}

}
