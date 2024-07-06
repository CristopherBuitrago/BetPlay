package com.ligabetplay.model.player;

public class Player {
    // attributes
    private int id;
    private String name;
    private String lastName;
    private int age;
    private int position;
    private String nationality;
    private int shirtNumber;

    // empty constructor
    public Player () {
    }    
    
    // full constructor
    public Player(int id, String name, String lastName, int age, int position, String nationality, int shirtNumber) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.position = position;
        this.nationality = nationality;
        this.shirtNumber = shirtNumber;
    }

    // getters and setters
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getShirtNumber() {
        return shirtNumber;
    }

    public void setShirtNumber(int shirtNumber) {
        this.shirtNumber = shirtNumber;
    }

    
}
