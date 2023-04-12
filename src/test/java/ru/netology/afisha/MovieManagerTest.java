package ru.netology.afisha;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class MovieManagerTest {

    @Test
    public void add0() {
        MovieManager manager = new MovieManager();
        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void add1() {
        MovieManager manager = new MovieManager();
        manager.add("Film 1");
        String[] expected = {"Film 1"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void add5() {
        MovieManager manager = new MovieManager();
        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");
        manager.add("Film 5");
        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast1() {
        MovieManager manager = new MovieManager();
        manager.add("Film 1");
        String[] expected = {"Film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast3() {
        MovieManager manager = new MovieManager();
        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        String[] expected = {"Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast7() {
        MovieManager manager = new MovieManager();
        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");
        manager.add("Film 5");
        manager.add("Film 6");
        manager.add("Film 7");
        String[] expected = {"Film 7", "Film 6", "Film 5", "Film 4", "Film 3"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast8Limit7() {
        MovieManager manager = new MovieManager(7);
        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");
        manager.add("Film 5");
        manager.add("Film 6");
        manager.add("Film 7");
        manager.add("Film 8");
        String[] expected = {"Film 8", "Film 7", "Film 6", "Film 5", "Film 4", "Film 3", "Film 2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast8Limit3() {
        MovieManager manager = new MovieManager(3);
        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");
        manager.add("Film 5");
        manager.add("Film 6");
        manager.add("Film 7");
        manager.add("Film 8");
        String[] expected = {"Film 8", "Film 7", "Film 6"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
