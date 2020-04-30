package com.Annuaire.projet;

import java.util.Date;
import java.util.GregorianCalendar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.Annuaire.entities.Profil;
import com.Annuaire.repository.IRepositoryImpl;


@ComponentScan(basePackages = {"com.Annuaire.repository"})
@EntityScan(basePackages = {"com.Annuaire.entities"})
@SpringBootApplication
public class AnnuaireApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnnuaireApplication.class, args);
	}
	
	@Autowired
	IRepositoryImpl implRepository;
	
	@Bean
	CommandLineRunner myMain() {
		return args -> {
			System.out.println("dans my main");
			
			Date dt = new GregorianCalendar(2020, 03, 30).getTime();
			Profil profil = implRepository.addProfil("je me presente", "mon offre", dt, null, null);
			
			System.out.println("Mon profil :"+ profil);
			
			System.out.println("---Fin---");
		};
	}

}
