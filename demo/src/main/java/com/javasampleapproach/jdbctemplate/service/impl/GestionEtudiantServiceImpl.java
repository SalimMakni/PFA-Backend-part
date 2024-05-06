package com.javasampleapproach.jdbctemplate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasampleapproach.jdbctemplate.dao.DonneesEtudiantDao;
import com.javasampleapproach.jdbctemplate.model.DonneesEtudiant;
import com.javasampleapproach.jdbctemplate.service.GestionEtudiantService;

@Service
public class GestionEtudiantServiceImpl implements GestionEtudiantService  {
	@Autowired  
	private DonneesEtudiantDao etudiantDao ;

	@Override
	public void insert(DonneesEtudiant donneesEtudiant) {
		etudiantDao.insert(donneesEtudiant);
		
	}

	@Override
	public void insertBatch(List<DonneesEtudiant> Donnees) {
		etudiantDao.insertBatch(Donnees);
		
	}

	@Override
	public List<DonneesEtudiant> loadAllDonnees() {
		return etudiantDao.loadAllDonneesEtudiants();
	}

	@Override
	public DonneesEtudiant findDonneesById(String numInscription) {
		return etudiantDao.findDonneesEtudiantById(numInscription);
	}

	@Override
	public String findNameById(String numInscription) {
		return etudiantDao.findNameById(numInscription);

	}

	@Override
	public int getTotalNumberStudent() {
		return etudiantDao.getTotalNumberEtudiant();
	}
	
	
}
