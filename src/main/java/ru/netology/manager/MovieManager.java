package ru.netology.manager;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class MovieManager {
    private String[] movies = new String[0];

    private int resultLength;

    public MovieManager() {
        this.resultLength = 10;
    }

    public MovieManager(int resultLength) {
        this.resultLength = resultLength;
    }

    public int getResultLength() {
        return resultLength;
    }

    public void setResultLength(int resultLength) {
        this.resultLength = resultLength;
    }

    public String[] addMovie(String movie) {
        int length = movies.length + 1;
        String[] tmp = new String[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int newMovie = tmp.length - 1;
        tmp[newMovie] = movie;
        movies = tmp;
        return tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] returnLastAddedFromTheEnd() {
        int resultLength = getResultLength();
        if (movies.length < 10) {
            resultLength = movies.length;
        } else {
            resultLength = resultLength;
        }
//        if (movies.length >= resultLength) {
//            resultLength = this.resultLength;
//        } else {
//            resultLength = 10;
//        }
        String[] result = new String[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }
}
