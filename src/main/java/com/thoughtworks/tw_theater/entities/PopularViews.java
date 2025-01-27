package com.thoughtworks.tw_theater.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Objects;

@Table("popular_review")
public class PopularViews {
    @Id
    private int id;
    private String summary;
    private String author;
    @Column("movie_id")
    private int movieId;
    private String title;

    public PopularViews() {
    }

    public PopularViews(int id, String summary, String author, int movieId, String title) {
        this.id = id;
        this.summary = summary;
        this.author = author;
        this.movieId = movieId;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "PopularViews{" +
            "id=" + id +
            ", summary='" + summary + '\'' +
            ", author='" + author + '\'' +
            ", movieId=" + movieId +
            ", title='" + title + '\'' +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PopularViews that = (PopularViews) o;
        return id == that.id &&
            movieId == that.movieId &&
            Objects.equals(summary, that.summary) &&
            Objects.equals(author, that.author) &&
            Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, summary, author, movieId, title);
    }
}
