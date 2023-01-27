package ru.netology.statistic;

public class PosterManager {
    private int maxSize = 10;

    public PosterManager(int size) {
        maxSize = size;
    }

    public PosterManager() {
    }

    private DataPoster[] posters = new DataPoster[0];

    public void save(DataPoster poster) {
        DataPoster[] tmp = new DataPoster[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        posters = tmp;
    }

    public DataPoster[] findAll() {
        return posters;
    }

    public DataPoster[] findLast() {
        int resultLength;
        if (posters.length > maxSize) {
            resultLength = maxSize;
        } else {
            resultLength = posters.length;
        }
        DataPoster[] result = new DataPoster[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = posters[posters.length - 1 - i];
        }
        return result;
    }

}
