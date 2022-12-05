package interfaces;

import classes.Movie;

import java.util.List;

public interface Findable {
    List<Movie> getAllMovies(List<Movie>movies);
    void findMovieByName(List<Movie>movies,String nameOfMovie);
    void findMovieByActorName(List<Movie>movies,String actor);
    void findMovieByYear(List<Movie>movies,int year);
    void findMovieByDirector(List<Movie>movies,String director);
    void findMovieByDescription(List<Movie>movies,String description);
    void findMovieByRole(List<Movie>movies,String role);
}
