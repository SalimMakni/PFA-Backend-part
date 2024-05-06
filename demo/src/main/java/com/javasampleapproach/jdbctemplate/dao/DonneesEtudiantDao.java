package com.javasampleapproach.jdbctemplate.dao;

import java.util.List;

import com.javasampleapproach.jdbctemplate.model.DonneesEtudiant;

public interface DonneesEtudiantDao {
	
	       void insert(DonneesEtudiant Etudiant);
	       void insertBatch(List  <DonneesEtudiant> Etudiants);
	       List<DonneesEtudiant> loadAllDonneesEtudiants();
	       DonneesEtudiant findDonneesEtudiantById(String numInscription);
	       String findNameById(String numInscription);       
	       int getTotalNumberEtudiant();
	}


