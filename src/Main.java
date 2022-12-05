import classes.Cast;
import classes.Director;
import classes.Movie;
import impl.InterfaceImpl;

import java.util.*;

import static impl.InterfaceImpl.*;

public class Main {
    public static void main(String[] args) {
        Director director1 = new Director("Barry ", "Jenkins");
        Director director2 = new Director("Martin ", "Scorsese");
        Director director3 = new Director("Terry ", "Gilliam ");
        Director director4 = new Director("Raoul  ", "Peck");
        Director director5 = new Director("Stanley  ", "Kubrick");


        Movie movie1 = new Movie("If Beale Street Could Talk", 2018, "Drama", director1,new ArrayList<>(List.of(new Cast("Stephan James", "Fonny"))) );
        Movie movie2 = new Movie("Monty Python and the Holy Grail", 1975, "Comedy", director2, new ArrayList<>(List.of(new Cast("  Peggy Sheeran ", "Lucy Gallina"))));
        Movie movie3 = new Movie("The Irishman", 2019, "Crime, Drama", director3,new ArrayList<>(List.of(new Cast("Malcolm McDowell", "Holy Grail"))) );
        Movie movie4 = new Movie(" I Am Not Your Negro", 2017, "Documentary", director4,new ArrayList<>(List.of( new Cast("Raoul Peck", "James Baldwin"))));
        Movie movie5 = new Movie("A Clockwork Orange", 1971, "Thriller", director5, new ArrayList<>(List.of(new Cast("Malcolm McDowell", "British Minister"))));
        LinkedList<Movie> movies = new LinkedList<>(Arrays.asList(movie1, movie2, movie3, movie4, movie5));
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        InterfaceImpl interfaceImpl = new InterfaceImpl();

        while (true) {
            switch (scanner1.nextByte()) {
                case 1 -> {
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~All Movies~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.print(interfaceImpl.getAllMovies(movies));
                    System.out.print("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Enjoy watching movies~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                }
                case 2 -> {
                    System.out.println("Please enter name of film: ");
                    interfaceImpl.findMovieByName(movies, scanner.nextLine());
                }
                case 3 -> {
                    System.out.println("Please enter the description: ");
                    interfaceImpl.findMovieByDescription(movies, scanner.nextLine());
                }
                case 4 -> {
                    System.out.println("Please enter the actor name: ");
                    interfaceImpl.findMovieByActorName(movies, scanner.nextLine());
                }
                case 5 -> {
                    System.out.println("Please enter the name of director: ");
                    interfaceImpl.findMovieByDirector(movies, scanner.nextLine());
                }
                case 6 -> {
                    System.out.println("Please enter the year of production: ");
                    interfaceImpl.findMovieByYear(movies, scanner2.nextInt());
                }
                case 7 -> {
                    System.out.println("Please enter the role of actor: ");
                    String name = scanner.nextLine();
                    interfaceImpl.findMovieByRole(movies,name);
                }
                case 8 -> {
                    System.out.println("~~~~~~~~~~~~~~~Sort by movie name~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    interfaceImpl.sortByMovieName(movies);
                    System.out.println(" -from A to Z");
                    for (Movie movie : movies) {
                        if (scanner2.nextInt() == 1) {
                            movies.sort(sortByNameAZ);
                            System.out.println(movie);
                        }
                    }
                    System.out.println("-from Z to A");
                    for (Movie movie : movies) {
                        if (scanner2.nextInt() == 2) {
                            movies.sort(sortByNameZA);
                            System.out.println(movie);
                        }
                    }
                }
                case 9 -> {
                    interfaceImpl.sortByYear(movies);
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~Sort by year~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("-Ascending");
                    for (Movie movie : movies) {
                        if (scanner2.nextInt() == 1) {
                            movies.sort(sortAgeAscending);
                            System.out.println(movie);

                        }
                        System.out.println("-Descending ");
                        for (Movie movie6 : movies) {
                            if (scanner2.nextInt() == 2) {
                                movies.sort(sortByAgeDescending);
                                System.out.println(movie6);
                            }

                        }
                    }
                }
                case 10 -> {
                    interfaceImpl.sortByDirector(movies);
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Sort by director~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    for (Movie movie : movies) {
                        movies.sort(sortByDirector);
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Thank you for choosing our cinema~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                    }
                }
            }
        }
    }
    static {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Choose your selections:~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("""
                1.All movies
                2.Find by movie name.
                3.Find by description.
                4.Find by actor name.
                5.Find by director.
                6.Find by year.
                7.Find by role.
                8.Sort by movie name.
                9.Sort by year
                10.Sort by director.
                """);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Have nice watching~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Please input the number:  ");
    }

    }
