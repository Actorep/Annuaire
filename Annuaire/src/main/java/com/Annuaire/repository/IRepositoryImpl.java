package com.Annuaire.repository;

import java.util.Date;
import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import com.Annuaire.entities.Profil;


public class IRepositoryImpl implements IRepository {
	
	@Autowired
	private EntityManager em;
	
	
	@Override
	public Profil addProfil(String presentation, String offre, Date dateCreation, Date dateModification,
			Date dateDesactivation) {
			
			Profil profil = new Profil(presentation, offre, dateCreation, dateModification, dateDesactivation);
			em.persist(profil);
			return profil;
		
	}
	
	//ggggggggggggggggggggggggggggggggggg
		
}

	


