package com.ligabetplay.model.sponsor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SponsorDeletionDAOImpl implements ISponsorDeletionDAO {
  private Connection connection;

  //Implementacion del método para eliminar Sponsors
	@Override
	public void deleteSponsor(Sponsor sponsor) throws SQLException {
      String sql = "DELETE FROM sponsor WHERE id = ?";
      PreparedStatement statement = connection.prepareStatement(sql);
      statement.setInt(1, sponsor.getId());
      statement.executeUpdate();
	}
}
