package com.ligabetplay.model.sponsor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class SponsorCreationDAOImpl implements ISponsorCreationDAO {
  // Conexion con la base de datos
  private final Connection connection;

  public SponsorCreationDAOImpl(Connection connection) {
    this.connection = connection;
  }

  //Metodo para crear el sponsor
  @Override
  public void createSponsor(Sponsor sponsor) throws SQLException {
    String sql = "INSERT INTO sponsor (name, type, amount, startDate, endDate) VALUES (?,?,?,?,?)";
    PreparedStatement statement = connection.prepareStatement(sql);
    statement.setString(1, sponsor.getName());
    statement.setInt(2, sponsor.getType());
    statement.setDouble(3, sponsor.getAmount());
    statement.setString(4, sponsor.getStartDate());
    statement.setString(5, sponsor.getEndDate());
  }
}
