package com.javasampleapproach.jdbctemplate.service;

import java.util.List;

import com.javasampleapproach.jdbctemplate.model.DonneesEtudiant;

public interface GestionEtudiantService {

	void insert (DonneesEtudiant donneesEtudiant );
	void insertBatch(List<DonneesEtudiant> Donnees);
	List<DonneesEtudiant> loadAllDonnees();
	DonneesEtudiant findDonneesById(String numInscription);
	String findNameById(String numInscription);
	int getTotalNumberStudent();
	
}
