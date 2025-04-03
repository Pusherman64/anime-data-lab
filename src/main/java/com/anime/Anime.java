package com.anime;

import java.util.List;
import java.util.Objects;

public class Anime {
    private String title;
    private int episodes;
    private boolean completed;
    private List<String> genres;

    public Anime() {
        this("Unknown", 0, false, List.of());
    }

    public Anime(String title, int episodes, boolean completed, List<String> genres) {
        this.title = title;
        this.episodes = episodes;
        this.completed = completed;
        this.genres = genres;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", episodes=" + episodes +
                ", completed=" + completed +
                ", genres=" + genres +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Anime anime = (Anime) o;
        return Objects.equals(title, anime.title);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(title);
    }
}
