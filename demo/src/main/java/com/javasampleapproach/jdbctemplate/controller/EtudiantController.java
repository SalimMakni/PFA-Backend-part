package com.javasampleapproach.jdbctemplate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javasampleapproach.jdbctemplate.model.DonneesEtudiant;
import com.javasampleapproach.jdbctemplate.service.GestionEtudiantService;

@RestController
@RequestMapping("/api")
@CrossOrigin()
public class EtudiantController {
	@Autowired
	private GestionEtudiantService etudiantService;
	@GetMapping(value = "/etudiants")
	public List<DonneesEtudiant> getEmployees() {
		return etudiantService.loadAllDonnees();

	}
	
	@PostMapping(value = "/creeretudiant")
	public void creerEmployees(DonneesEtudiant donneesEtudiant) {
		etudiantService.insert(donneesEtudiant);
	}
}
