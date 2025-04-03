package com.anime;

import java.util.*;
import java.util.stream.Collectors;

public class AnimeDatabase {
    private List<Anime> animes = new ArrayList<>();

    public void addAnime(Anime anime) {
        if (!this.animes.contains(anime)) {
            this.animes.add(anime);
            System.out.println("The anime successfully added to the database: " + anime.getTitle());
        } else {
            System.out.println("The anime already exists:" + anime.getTitle());
        }
    }

    public boolean searchAnimeByName(String title) {
        return this.animes.stream().anyMatch(anime -> anime.getTitle().equalsIgnoreCase(title));
    }

    public List<String> getSortedTitlesOfCompletedAnimes() {
        return this.animes.stream()
                .filter(Anime::isCompleted)
                .map(Anime::getTitle)
                .sorted()
                .collect(Collectors.toList());
    }

    public List<Anime> findAnimesByGenre(String genre) {
        return this.animes.stream()
                .filter(anime ->
                        anime.getGenres().stream()
                                .anyMatch(g -> g.equalsIgnoreCase(genre)))
                .collect(Collectors.toList());
    }

    public Set<String> getAllGenres() {
        return this.animes.stream()
                .flatMap(anime -> anime.getGenres().stream())
                .map(String::toLowerCase)
                .collect(Collectors.toSet());
    }
}
