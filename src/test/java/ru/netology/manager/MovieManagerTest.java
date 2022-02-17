package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;
import ru.netology.manager.MovieManager;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {

    Movie first = new Movie(1, "Бладшот", "боевик");
    Movie second = new Movie(2, "Вперёд", "мультфильм");
    Movie third = new Movie(3, "Отель 'Белград'", "комедия");
    Movie forth = new Movie(4, "Джентельмены", "боевик");
    Movie fifth = new Movie(5, "Человек-невидимка", "ужасы");
    Movie sixth = new Movie(6, "Тролли.Мировой тур", "мультфильм");
    Movie seventh = new Movie(7, "Номер один", "комедия");

    MovieManager manager = new MovieManager();

    @BeforeEach
    void save() {
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(forth);
        manager.addMovie(fifth);
        manager.addMovie(sixth);
        manager.addMovie(seventh);
    }

    @Test
    public void showAll() {
        manager.findAll();
        Movie[] expected = {first, second, third, forth, fifth, sixth, seventh};
        Movie[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastAddedAll() {
        Movie[] expected = {seventh, sixth, fifth, forth, third, second, first};
        Movie[] actual = manager.returnLastViewed();
        assertArrayEquals(expected, actual);
    }

//    @Test
//    public void showLast5() {
    //       MovieManager manager = new MovieManager();
    //       Movie[] expected = {seventh, sixth, fifth, forth, third};
    //      Movie[] actual = manager.returnLastViewed();
    //     assertArrayEquals(expected, actual);
    //  }
}

