//class with all the movie details and its getters and setters and constructor
package com.assignment.movie_details;

public class Movie_Details {
	private String movName;
	private String leadactor;
	private String leadactress;
	private String genre;

	// getters and setters
	public String getMovName() {
		return movName;
	}

	public String getLeadactor() {
		return leadactor;
	}

	public String getLeadactress() {
		return leadactress;
	}

	public String getGenre() {
		return genre;
	}

	//constructor to initialize values
	public Movie_Details(String movName, String leadactor, String leadactress, String genre) {
		super();
		this.movName = movName;
		this.leadactor = leadactor;
		this.leadactress = leadactress;
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "MovieDetails [movName=" + movName + ", leadactor=" + leadactor + ", leadactress=" + leadactress
				+ ", genre=" + genre + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((movName == null) ? 0 : movName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie_Details other = (Movie_Details) obj;
		if (movName == null) {
			if (other.movName != null)
				return false;
		} else if (!movName.equals(other.movName))
			return false;
		return true;
	}

}