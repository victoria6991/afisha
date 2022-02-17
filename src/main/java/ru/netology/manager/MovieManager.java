package ru.netology.manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.domain.Movie;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MovieManager {
    private Movie[] movies = new Movie[0];


//    public MovieManager(int movies) {      нужен какой-то такой констуктор или это фигня какая-то??..
//        this.movies = new Movie[4];
//    }

    public void addMovie(Movie movie) {
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int newMovie = tmp.length - 1;
        tmp[newMovie] = movie;
        movies = tmp;
    }

    public Movie[] findAll() {
        return movies;
    }

    public Movie[] returnLastViewed() {
        Movie[] movies = findAll();
        Movie[] newMovies = new Movie[movies.length];
        for (int i = 0; i < newMovies.length; i++) {
            int index = movies.length - i - 1;
            newMovies[i] = movies[index];
        }
        return newMovies;
    }
}
