package com.example.streams;

public class Movie implements Comparable{
    private String title;
    private Integer likes;
    private Genre genre;

    public Movie(String title, Integer likes, Genre genre) {
        this.title = title;
        this.likes = likes;
        this.genre = genre;
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

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", likes=" + likes +
                '}';
    }

    public Genre getGenre() {
        return genre;
    }

}
