package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class PosterRepoTest {
    DataPoster film1 = new DataPoster(1, "Бладшот");
    DataPoster film2 = new DataPoster(2, "Вперед");
    DataPoster film3 = new DataPoster(3, "Отель");

    @Test
    public void shouldSave() {
        PosterRepo repo = new PosterRepo();
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        DataPoster[] expected = {film1, film2, film3};
        DataPoster[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindByIdExist() {
        PosterRepo repo = new PosterRepo();
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        DataPoster expected = film2;
        DataPoster actual = repo.findById(2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindByIdNoExist() {
        PosterRepo repo = new PosterRepo();
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        DataPoster expected = null;
        DataPoster actual = repo.findById(5);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRemoveByIdExist() {
        PosterRepo repo = new PosterRepo();
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.removeById(2);
        DataPoster[] expected = {film1, film3};
        DataPoster[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveByIdNoExist() {
        PosterRepo repo = new PosterRepo();
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.removeById(5);
        DataPoster[] expected = {film1, film2, film3};
        DataPoster[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveAll() {
        PosterRepo repo = new PosterRepo();
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.removeAll();
        DataPoster[] expected = {};
        DataPoster[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

}
