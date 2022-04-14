package com.example.streams;

public class Movie implements Comparable{
    private String title;
    private Integer likes;

    public Movie(String title, Integer likes) {
        this.title = title;
        this.likes = likes;
    }

    public Integer getLikes() {
        return likes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
