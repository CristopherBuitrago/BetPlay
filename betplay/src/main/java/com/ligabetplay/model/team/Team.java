package com.ligabetplay.model.team;

public class Team {
    private int id;
    private String name;
    private String city;
    private int stadium;
    private int trainer;
    
    public Team() {
    }

    public Team(int id, String name, String city, int stadium, int trainer) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.stadium = stadium;
        this.trainer = trainer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getStadium() {
        return stadium;
    }

    public void setStadium(int stadium) {
        this.stadium = stadium;
    }

    public int getTrainer() {
        return trainer;
    }

    public void setTrainer(int trainer) {
        this.trainer = trainer;
    }

    
}
