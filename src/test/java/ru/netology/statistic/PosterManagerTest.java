package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    DataPoster film1 = new DataPoster(1, "Бладшот");
    DataPoster film2 = new DataPoster(2, "Вперед");
    DataPoster film3 = new DataPoster(3, "Отель");
    DataPoster film4 = new DataPoster(4, "Джентельмены");
    DataPoster film5 = new DataPoster(5, "Человек-невидимка");
    DataPoster film6 = new DataPoster(6, "Тролли");
    DataPoster film7 = new DataPoster(7, "Номер один");
    DataPoster film8 = new DataPoster(8, "Достать ножи");
    DataPoster film9 = new DataPoster(9, "Черная пантера");
    DataPoster film10 = new DataPoster(10, "Мстители");
    DataPoster film11 = new DataPoster(11, "Чебурашка");

    @Test
    public void shouldExist() {
        PosterManager repo = new PosterManager();
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.save(film4);
        repo.save(film5);
        repo.save(film6);
        repo.save(film7);
        repo.save(film8);
        repo.save(film9);
        repo.save(film10);
        repo.save(film11);
        DataPoster[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10, film11};
        DataPoster[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldMaxSize10() {
        PosterManager repo = new PosterManager();
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.save(film4);
        repo.save(film5);
        repo.save(film6);
        repo.save(film7);
        repo.save(film8);
        repo.save(film9);
        repo.save(film10);
        repo.save(film11);
        DataPoster[] expected = {film11, film10, film9, film8, film7, film6, film5, film4, film3, film2};
        DataPoster[] actual = repo.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldMaxSize5() {
        PosterManager repo = new PosterManager(5);
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.save(film4);
        repo.save(film5);
        repo.save(film6);
        repo.save(film7);
        repo.save(film8);
        repo.save(film9);
        repo.save(film10);
        repo.save(film11);
        DataPoster[] expected = {film11, film10, film9, film8, film7};
        DataPoster[] actual = repo.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldArrLessMaxSize() {
        PosterManager repo = new PosterManager();
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        DataPoster[] expected = {film3, film2, film1};
        DataPoster[] actual = repo.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }


}
