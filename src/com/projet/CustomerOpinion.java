package com.projet;

import org.w3c.dom.Text;

import java.time.LocalDate;
import java.util.List;

public class CustomerOpinion {
    private List<User> userList;
    private int score;
    private Text opinion;
    private LocalDate opinionDate;

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
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

    public void setOpinionDate(LocalDate opinionDate) {
        this.opinionDate = opinionDate;
    }

    public CustomerOpinion(List<User> userList, int score, Text opinion,LocalDate opinionDate) {
        this.userList = userList;
        this.score = score;
        this.opinion = opinion;
        this.opinionDate = opinionDate;

    }

    @Override
    public String toString() {
        return "CustomerOpinion{" +
                "userList=" + userList +
                ", score=" + score +
                ", opinion=" + opinion +
                '}';
    }
}
