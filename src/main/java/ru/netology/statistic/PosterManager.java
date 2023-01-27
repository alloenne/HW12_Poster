package ru.netology.statistic;

public class PosterManager {
    private PosterRepo repo;
    private int maxSize = 10;

    public PosterManager(PosterRepo repo, int size) {
        this.repo = repo;
        maxSize = size;
    }

    public PosterManager(PosterRepo repo) {
        this.repo = repo;
    }

    public void save(DataPoster poster) {
        repo.save(poster);
    }

    public DataPoster[] findAll() {
        return repo.findAll();
    }

    public DataPoster[] findLast() {
        int resultLength;
        DataPoster[] all = repo.findAll();
        if (all.length > maxSize) {
            resultLength = maxSize;
        } else {
            resultLength = all.length;
        }
        DataPoster[] result = new DataPoster[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = all[all.length - 1 - i];
        }
        return result;
    }

}
