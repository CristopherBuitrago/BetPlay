package com.ligabetplay.model.sponsor;

import java.sql.SQLException;

// Interfaz para crear Sponsors
public interface ISponsorCreationDAO {
  void createSponsor(Sponsor sponsor) throws SQLException;
}
