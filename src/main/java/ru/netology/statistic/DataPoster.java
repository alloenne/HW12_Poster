package ru.netology.statistic;
public class DataPoster {
    private int id;
    private String posterName;

    public DataPoster(int id, String posterName) {
        this.id = id;
        this.posterName = posterName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosterName() {
        return posterName;
    }

    public void setPosterName(String posterName) {
        this.posterName = posterName;
    }
}
