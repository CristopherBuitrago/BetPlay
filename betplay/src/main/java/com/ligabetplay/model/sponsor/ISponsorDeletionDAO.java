package com.ligabetplay.model.sponsor;

import java.sql.SQLException;

// Interfaz para borrar sponsors
public interface ISponsorDeletionDAO {
  void deleteSponsor(Sponsor sponsor) throws SQLException;
}
