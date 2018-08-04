//class with main function and providing various options
package com.cg.movietest;

import java.util.Scanner;

import com.assignment.movie_detailslist.Movie_DetailsList;

public class TestMovie {
	public static void main(String args[]) {

		Movie_DetailsList movieDetailsList = new Movie_DetailsList();
		Scanner get = new Scanner(System.in);

		int choice;

		do {
			System.out.println("Enter your choice.....");
			System.out.println("1. Add");
			System.out.println("2. Remove movie");
			System.out.println("3. Remove all");
			System.out.println("4. Get movie by movie name");
			System.out.println("5. Get movie by genre");
			System.out.println("6. Display");
			System.out.println("7. Sort");
			System.out.println("8. Exit");

			choice = get.nextInt();
			switch (choice) {
			// Add movie
			case 1:
				System.out.println("Enter Movie Name");
				String movName = get.next();

				System.out.println("Enter Lead Actor");
				String leadactor = get.next();

				System.out.println("Enter Lead Actress");
				String leadactress = get.next();

				System.out.println("Enter Genre");
				String genre = get.next();
				movieDetailsList.add(movName, leadactor, leadactress, genre);// Invoking add method
				break;
			// Remove movie by name
			case 2:

				System.out.println("Enter Movie Name");
				String movieToRemove = get.next();
				movieDetailsList.removeMovie(movieToRemove);// Invoking remove method
				break;
			// Remove all movies
			case 3:
				movieDetailsList.removeAllMovie();// Invoking reomveAll method
				break;
			// Find movie by name
			case 4:
				System.out.println("Enter Movie Name");
				String getMovieByName = get.next();
				movieDetailsList.findByMovieName(getMovieByName);// Invoking findByMovieName method
				break;
			// Find movie by genre
			case 5:
				System.out.println("Enter Genre");
				String getMovieByGenre = get.next();
				movieDetailsList.findMovieByGenre(getMovieByGenre);// Invoking findMovieByGenre method of
																	// Movie_DetailList
				break;
			// Display movie
			case 6:
				System.out.println("Print Movie Details");
				movieDetailsList.disp(); // Invoking disp method of Movie_DetailList
				break;
			// Sort by categories
			case 7:
				System.out.println("Sort By Categories");
				movieDetailsList.sortMovies(); // Invoking sort method of Movie_DetailList
				break;

			default:
				System.out.println("Invalid Option");
				break;
			}

		} while (choice != 8);
		get.close();
	}

}
