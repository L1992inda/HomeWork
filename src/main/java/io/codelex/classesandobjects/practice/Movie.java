package io.codelex.classesandobjects.practice;

public class Movie {
    private String title;

    private String studio;
    private String rating;

    public static void main(String[] args) {
        Movie casinoRoyale = new Movie("Casino Royale", "Eon Productions", "PG13");
        Movie glass = new Movie("Glass", "Buena Vista International", "PG13");
        Movie spiderMan = new Movie("Spider-Man: Into the Spider-Verse", "Columbia Pictures", "PG");

//Movie.getPG(Movie[] );

    }

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;


    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public static Movie[] getPG(Movie[] film) {
        Movie[] pg = new Movie[film.length];
        int x = 0;

        for (int i = 0; i < film.length; i++) {
            if (film[i].rating.contains("PG")) {
                pg[x] = film[i];
                x++;
            }
        }
        return pg;
    }
}
