package ru.netology.manager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {

    @Test
    public void shouldShowAll() {
        MovieManager manager = new MovieManager();
        String[] expected = {
                "Сумерки",
                "Сумерки2",
                "Сумерки3",
                "Сумерки4",
                "Бладшот",
                "Вперёд",
                "Отель Белград",
                "Джентельмены",
                "Номер один"
        };
        String[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowAllWithAdded() {
        MovieManager manager = new MovieManager();
        manager.addMovie("New Movie");
        String[] expected = {
                "Сумерки",
                "Сумерки2",
                "Сумерки3",
                "Сумерки4",
                "Бладшот",
                "Вперёд",
                "Отель Белград",
                "Джентельмены",
                "Номер один",
                "New Movie"
        };
        String[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTenReturnLastAddedWhenAmountIsAboveLimit() {
        MovieManager manager = new MovieManager();
        String[] expected = {
                "Номер один",
                "Джентельмены",
                "Отель Белград",
                "Вперёд",
                "Бладшот",
                "Сумерки4",
                "Сумерки3",
                "Сумерки2",
                "Сумерки"
        };
        String[] actual = manager.returnLastAddedFromTheEnd();
    }

    @Test
    public void shouldReturnLastAddedWhenAmountIsUnderLimit() {
        MovieManager manager = new MovieManager(7);
        String[] expected = {
                "Номер один",
                "Джентельмены",
                "Отель Белград",
                "Вперёд",
                "Бладшот",
                "Сумерки4",
                "Cумерки3"
        };
        String[] actual = manager.returnLastAddedFromTheEnd();
    }

    @Test
    public void shouldReturnTenLastAddedFrom11() {
        MovieManager manager = new MovieManager();
        manager.addMovie("New Movie");
        manager.addMovie("Test");
        String[] expected = {
                "Test",
                "New Movie",
                "Номер один",
                "Джентельмены",
                "Отель Белград",
                "Вперёд",
                "Бладшот",
                "Сумерки4",
                "Сумерки3",
                "Сумерки2"
        };
        String[] actual = manager.returnLastAddedFromTheEnd();
    }

    @Test
    public void shouldShow1LastAdded() {
        MovieManager manager = new MovieManager(1);
        manager.addMovie("New Movie");
        String[] expected = {"New Movie"};
        String[] actual = manager.returnLastAddedFromTheEnd();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShow5LastAdded() {
        MovieManager manager = new MovieManager(5);
        manager.addMovie("New Movie");
        String[] expected = {
                "New Movie",
                "Номер один",
                "Джентельмены",
                "Отель Белград",
                "Вперёд"
        };
        String[] actual = manager.returnLastAddedFromTheEnd();
        assertArrayEquals(expected, actual);
    }
}

