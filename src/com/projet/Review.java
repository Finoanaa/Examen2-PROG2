package com.projet;

import org.w3c.dom.Text;

import java.time.LocalDate;
import java.util.List;

public class Review {
    private User user;
    private int score;
    private Text opinion;
    private final LocalDate opinionDate;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Text getOpinion() {
        return opinion;
    }

    public void setOpinion(Text opinion) {
        this.opinion = opinion;
    }

    public LocalDate getOpinionDate() {
        return opinionDate;
    }


    public Review(User user, int score, Text opinion,LocalDate opinionDate) {
        this.user = user;
        this.score = score;
        this.opinion = opinion;
        this.opinionDate = LocalDate.now();

    }
    public List<Review> getAllReviews(List<Review> reviews) {
        return reviews;
    }

    @Override
    public String toString() {
        return "CustomerOpinion{" +
                "userList=" + user +
                ", score=" + score +
                ", opinion=" + opinion +
                '}';
    }
}
