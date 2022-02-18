package ru.netology.manager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {

    @Test
    public void shouldShowAll() {
        MovieManager manager = new MovieManager();
        String[] expected = {"Сумерки", "Сумерки2", "Сумерки3", "Сумерки4", "Бладшот", "Вперёд", "Отель Белград", "Джентельмены", "Человек-Невидимка", "Тролли", "Номер один"};
        String[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddNew() {
        MovieManager manager = new MovieManager();
        String[] expected = {"Сумерки", "Сумерки2", "Сумерки3", "Сумерки4", "Бладшот", "Вперёд", "Отель Белград", "Джентельмены", "Человек-Невидимка", "Тролли", "Номер один", "Сумерки5"};
        String[] actual = manager.addMovie("Сумерки5");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowFourLastAdded() {
        MovieManager manager = new MovieManager(4);
        String[] expected = {"Номер один", "Тролли", "Человек-Невидимка", "Джентельмены"};
        String[] actual = manager.returnLastAddedFromTheEnd();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastAddedByDefault() {
        MovieManager manager = new MovieManager();
        String[] expected = {"Номер один", "Тролли", "Человек-Невидимка", "Джентельмены", "Отель Белград", "Вперёд", "Бладшот", "Сумерки4", "Сумерки3", "Сумерки2"};
        String[] actual = manager.returnLastAddedFromTheEnd();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShow11LastAdded() {
        MovieManager manager = new MovieManager(11);
        String[] expected = {"Номер один", "Тролли", "Человек-Невидимка", "Джентельмены", "Отель Белград", "Вперёд", "Бладшот", "Сумерки4", "Сумерки3", "Сумерки2", "Сумерки"};
        String[] actual = manager.returnLastAddedFromTheEnd();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShow10LastAdded() {
        MovieManager manager = new MovieManager(12);
        String[] expected = {"Номер один", "Тролли", "Человек-Невидимка", "Джентельмены", "Отель Белград", "Вперёд", "Бладшот", "Сумерки4", "Сумерки3", "Сумерки2"};
        String[] actual = manager.returnLastAddedFromTheEnd();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShow1LastAdded() {
        MovieManager manager = new MovieManager(1);
        String[] expected = {"Номер один"};
        String[] actual = manager.returnLastAddedFromTheEnd();
        assertArrayEquals(expected, actual);
    }
}

