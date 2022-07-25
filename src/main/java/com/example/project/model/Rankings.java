package com.example.project.model;

import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.util.Date;

@Entity
public class Rankings {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private int id;
    private String namePlayer;
    private String countryPlayer;
    private int numberRankings;
    private int sumRankings;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateOfBirth;

    public Rankings() {
    }

    public Rankings(int id) {
        this.id = id;
    }

    public Rankings(int id, String namePlayer) {
        this.id = id;
        this.namePlayer = namePlayer;
    }

    public Rankings(int id, String namePlayer, String countryPlayer) {
        this.id = id;
        this.namePlayer = namePlayer;
        this.countryPlayer = countryPlayer;
    }

    public Rankings(int id, String namePlayer, String countryPlayer, int numberRankings) {
        this.id = id;
        this.namePlayer = namePlayer;
        this.countryPlayer = countryPlayer;
        this.numberRankings = numberRankings;
    }

    public Rankings(int id, String namePlayer, String countryPlayer, int numberRankings, int sumRankings) {
        this.id = id;
        this.namePlayer = namePlayer;
        this.countryPlayer = countryPlayer;
        this.numberRankings = numberRankings;
        this.sumRankings = sumRankings;
    }

    public Rankings(int id, String namePlayer, String countryPlayer, int numberRankings, int sumRankings, Date dateOfBirth) {
        this.id = id;
        this.namePlayer = namePlayer;
        this.countryPlayer = countryPlayer;
        this.numberRankings = numberRankings;
        this.sumRankings = sumRankings;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamePlayer() {
        return namePlayer;
    }

    public void setNamePlayer(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public String getCountryPlayer() {
        return countryPlayer;
    }

    public void setCountryPlayer(String countryPlayer) {
        this.countryPlayer = countryPlayer;
    }

    public int getNumberRankings() {
        return numberRankings;
    }

    public void setNumberRankings(int numberRankings) {
        this.numberRankings = numberRankings;
    }

    public int getSumRankings() {
        return sumRankings;
    }

    public void setSumRankings(int sumRankings) {
        this.sumRankings = sumRankings;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Rankings{" +
                "id=" + id +
                ", namePlayer='" + namePlayer + '\'' +
                ", countryPlayer='" + countryPlayer + '\'' +
                ", numberRankings=" + numberRankings +
                ", sumRankings=" + sumRankings +
                ", DateDateOfBirth=" + dateOfBirth +
                '}';
    }
}

