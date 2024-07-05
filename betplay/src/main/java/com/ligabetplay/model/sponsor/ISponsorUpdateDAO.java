package com.ligabetplay.model.sponsor;

import java.sql.SQLException;

// Interfaz para modificar los sponsors
public interface ISponsorUpdateDAO {
  void updateSponsor(Sponsor sponsor) throws SQLException;
}
