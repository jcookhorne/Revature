package pojo;

public class MoviePojo {
	// everything will lead back to here
	int movieId;
	String movieName;
	int yearItWasMade;
	String genre;
	int runTime;
	String rating;
	String director;
	public MoviePojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MoviePojo(int movieId, String movieName, int yearItWasMade, String genre, int runTime, String rating, String director) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.yearItWasMade = yearItWasMade;
		this.genre = genre;
		this.runTime = runTime;
		this.rating = rating;
		this.director = director;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getYearItWasMade() {
		return yearItWasMade;
	}
	public void setYearItWasMade(int yearItWasMade) {
		this.yearItWasMade = yearItWasMade;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getRunTime() {
		return runTime;
	}
	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	@Override
	public String toString() {
		return "MoviePojo [movieName=" + movieName + ", yearItWasMade=" + yearItWasMade + ", genre=" + genre
				+ ", runTime=" + runTime + ", rating=" + rating + ", director=" + director + "]";
	}
	
	
	
	
	
	
}
