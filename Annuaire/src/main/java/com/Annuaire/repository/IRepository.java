package com.Annuaire.repository;

import java.util.Date;

import com.Annuaire.entities.Profil;

public interface IRepository {
	
	public Profil addProfil(String presentation, String offre, Date dateCreation, Date dateModification, Date dateDesactivation);

}
