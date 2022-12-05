package impl;

import classes.Cast;
import classes.Movie;
import interfaces.Findable;
import interfaces.Sortable;

import java.util.*;

public class InterfaceImpl implements Findable, Sortable {
    @Override
    public List<Movie> getAllMovies(List<Movie> movies) {
        for (Movie movie : movies) {
            return movies;

        }
        return null;
    }

    @Override
    public void findMovieByName(List<Movie> movies, String nameOfMovie) {
        for (Movie movie : movies) {
            if (movie.getName().contains(nameOfMovie)) {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Short information~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Name of the film: "+movie.getName()+"\nDescription of the film:"+movie.getDescription()+"\nYear of production: "+movie.getYear());
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }

        }

    }

    @Override
    public void findMovieByActorName(List<Movie> movies, String actor) {
        int i=0;
        for (Movie movie : movies) {
            if (movie.getCast().get(i).getActorFullName().equals(actor)) {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Short information~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Name of the film: "+movie.getName()+"\nDescription of the film:"+movie.getDescription()+"\nYear of production: "+movie.getYear());
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }

        }

    }

    @Override
    public void findMovieByYear(List<Movie> movies, int year) {
        for (Movie movie : movies) {
            if (movie.getYear()==year) {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Short information~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Year of production: "+movie.getYear()+"\nDescription of the film:"+movie.getDescription()+"\nName of film: "+movie.getName());
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }

        }

    }

    @Override
    public void findMovieByDirector(List<Movie> movies, String director) {
        for (Movie movie : movies) {
            if (movie.getDirector().getLastName().contains(director)) {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Short information~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Name of the film: "+movie.getName()+"\nDescription of the film:"+movie.getDescription()+"\nYear of production: "+movie.getYear());
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }

        }

    }

    @Override
    public void findMovieByDescription(List<Movie> movies, String description) {
        for (Movie movie : movies) {
            if (movie.getDescription().contains(description)) {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Short information~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Name of the film: "+movie.getName()+"\nDescription of the film:"+movie.getDescription()+"\nYear of production: "+movie.getYear());
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }

        }

    }

    @Override
    public void findMovieByRole(List<Movie> movies, String role) {
        int i = 0;
        for (Movie movie : movies) {
            if (movie.getCast().get(i).getRole().equals(role)) {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Short information~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println(movie);
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }

        }

    }

    @Override
    public void sortByMovieName(List<Movie> movies) {

    }

    public static Comparator<Movie> sortByNameAZ = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
    public static Comparator<Movie> sortByNameZA = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o2.getName().compareTo(o1.getName());
        }
    };


    @Override
    public void sortByYear(List<Movie> movies) {


    }
    public static Comparator<Movie> sortAgeAscending = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {

            return o1.getYear()-o2.getYear();
        }
    };
    public static Comparator<Movie> sortByAgeDescending = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o2.getYear()-o1.getYear();
        }
    };


    @Override
    public void sortByDirector(List<Movie> movies) {


    }
    public static Comparator<Movie> sortByDirector = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getDirector().getLastName().compareTo(o2.getDirector().getLastName());
        }
    };
}