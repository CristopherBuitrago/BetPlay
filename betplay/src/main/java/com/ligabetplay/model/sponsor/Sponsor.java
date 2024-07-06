package com.ligabetplay.model.sponsor;

// Clase pública de Sponsor
public class Sponsor {
  private int id;
  private String name;
  private int type;
  private double amount;
  private String startDate;
  private String endDate;

  /* Constructor vacio para instanciarla sin necesidad de declarar sus atributos nuevamente */
  public Sponsor() {
  }

  /*Constructor completo */
  public Sponsor(int id, String name, int type, double amount, String startDate, String endDate) {
    this.id = id;
    this.name = name;
    this.type = type;
    this.amount = amount;
    this.startDate = startDate;
    this.endDate = endDate;
  }

  // Getters and setters
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

  public int getType() {
    return type;
  }

  public void setType(int type) {
    this.type = type;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }
   
}

