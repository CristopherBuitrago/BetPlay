package com.ligabetplay.model.sponsor;

import java.sql.Connection;

public class SponsorUpdateDAOImpl implements ISponsorUpdateDAO {
  private final Connection connection;

  public SponsorUpdateDAOImpl(Connection connection) {
    this.connection = connection;
  }

  @Override
  public void updateSponsor(Sponsor sponsor);
}


/*
 * Completar punto 11 de patrocinos"
 */