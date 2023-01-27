package ru.netology.statistic;

public class PosterRepo {
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

    public DataPoster findById(int id) {
        DataPoster filmId = null;
        for (DataPoster poster : posters) {
            if (poster.getId() == id) {
                filmId = poster;
            }
        }
        return filmId;
    }

    public void removeById(int id) {
        int finLenght = 0;
        for (DataPoster poster : posters) {
            if (poster.getId() != id) {
                finLenght++;
            }
        }
        DataPoster[] tmp = new DataPoster[finLenght];
        int copyToIndex = 0;
        for (DataPoster poster : posters) {
            if (poster.getId() != id) {
                tmp[copyToIndex] = poster;
                copyToIndex++;
            }
        }
        posters = tmp;
    }

    public void removeAll() {
        DataPoster[] tmp = new DataPoster[0];
        posters = tmp;
    }


}
