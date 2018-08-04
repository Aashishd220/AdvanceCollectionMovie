//class with different methods 
package com.assignment.movie_detailslist;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.Predicate;

import com.assignment.movie_details.Movie_Details;

public class Movie_DetailsList {

	TreeSet<com.assignment.movie_details.Movie_Details> moiveList;

	public Movie_DetailsList() {
		moiveList = new TreeSet<>((arg0, arg1) -> arg0.getMovName().compareTo(arg1.getMovName()));
	}

//add to movieList
	public void add(String movName, String lead_actor, String lead_actress, String genre) {
		moiveList.add(new Movie_Details(movName, lead_actor, lead_actress, genre));
	}

//display function
	public void disp() {
		moiveList.stream().forEach(System.out::println);
	}

//find movie by name
	public void findByMovieName(String movieName) {
		Predicate<Movie_Details> fetchMovie = (Movie_Details) -> Movie_Details.getMovName().equals(movieName);
		moiveList.stream().filter(fetchMovie).forEach(System.out::println);
	}

//remove movie by genre
	public void findMovieByGenre(String genre) {
		Predicate<Movie_Details> fetchMovie = (Movie_Details) -> Movie_Details.getGenre().equals(genre);
		moiveList.stream().filter(fetchMovie).forEach(System.out::println);
	}

//remove movie by name
	public void removeMovie(String movieName) {
		Predicate<Movie_Details> fetchMovie = (Movie_Details) -> Movie_Details.getMovName().equals(movieName);
		moiveList.removeIf(fetchMovie);
		moiveList.stream().forEach(System.out::println);
	}

//remove all movies
	public void removeAllMovie() {
		moiveList.removeAll(moiveList);
	}

//sorting is done by genre,lead actor,lead actress, and by movie name
	public void sortMovies() {
		System.out.println(".........Sorting by Genre........");
		moiveList.stream().sorted(Comparator.comparing(Movie_Details::getGenre)).forEach(System.out::println);
		System.out.println(".........Sorting by Lead Actor........");
		moiveList.stream().sorted(Comparator.comparing(Movie_Details::getLeadactor)).forEach(System.out::println);
		System.out.println(".........Sorting by Lead Actress........");
		moiveList.stream().sorted(Comparator.comparing(Movie_Details::getLeadactress)).forEach(System.out::println);
		System.out.println(".........Sorting by Movie Name........");
		moiveList.stream().sorted(Comparator.comparing(Movie_Details::getMovName)).forEach(System.out::println);
	}

}