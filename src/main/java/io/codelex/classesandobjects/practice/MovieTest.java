package io.codelex.classesandobjects.practice;

public class MovieTest {
    public static void main(String[] args) {
        Movie[] movies = {
                new Movie("Casino ", "Productions ABC", "PG13"),
                new Movie("Night out", "International", "PG13"),
                new Movie("Click", "Columbia Pictures", "PG")
        };

        Movie[] pgMovies = Movie.getPG(movies);
        for (Movie movie : pgMovies) {
            System.out.println(movie.getTitle());
            System.out.println(movie.getStudio());
        }
    }


    }
}
