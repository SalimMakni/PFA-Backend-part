package com.javasampleapproach.jdbctemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan(basePackages = "com.javasampleapproach.jdbctemplate")
public class SpringJdbcPostgreSqlApplication {
	public static void main(String[] args) {

		SpringApplication.run(SpringJdbcPostgreSqlApplication.class, args);
	}
	public void run1 (String[] args ) throws Exception {
//		Random r = new Random();
//		DonneesEtudiant Student_1 = new DonneesEtudiant ();
//		String OR20180071 = r.toString();s
//		Student_1.setNumInscription("OR20180071");
//		Student_1.setCIN("11663431");
//		Student_1.setNomPrenomFr("TAOUALI SINDA");
//		Student_1.setIdentifiantGroupe (18043451);
//		Student_1.setNomGroupe ("LFDRT1 17");
//		Student_1.setNote(5);
//		DonneesEtudiant Student_2 = new DonneesEtudiant ();
//		String CR2017024 = r.toString();
//		Student_2.setNumInscription("CR2017-024");
//		Student_2.setCIN("11657262");
//		Student_2.setNomPrenomFr("CHAIBI WISSAL");
//		Student_2.setIdentifiantGroupe (18043451);
//		Student_2.setNomGroupe ("LFDRT1 17");
//		Student_2.setNote(10);
//		DonneesEtudiant Student_3 = new DonneesEtudiant ();
//		String i1700215 = r.toString();
//		Student_3.setNumInscription("1700215");
//		Student_3.setCIN("11414212");
//		Student_3.setNomPrenomFr("KRAIEM MERIEM");
//		Student_3.setIdentifiantGroupe (18043451);
//		Student_3.setNomGroupe ("LFDRT1 17");
//		Student_3.setNote(12.5);
//		DonneesEtudiant Student_4 = new DonneesEtudiant ();
//		String OR20180121 = r.toString();
//		Student_4.setNumInscription("OR20180121");
//		Student_4.setCIN("11118953");
//		Student_4.setNomPrenomFr("MAHFOUDH LILIA");
//		Student_4.setIdentifiantGroupe (18043451);
//		Student_4.setNomGroupe ("LFDRT1 17");
//		Student_4.setNote(11);
//		DonneesEtudiant Student_5 = new DonneesEtudiant ();
//		String OR20180150 = r.toString();
//		Student_5.setNumInscription("OR20180150");
//		Student_5.setCIN("09889392");
//		Student_5.setNomPrenomFr("METHLOUTHI ISLEM");
//		Student_5.setIdentifiantGroupe (18043451);
//		Student_5.setNomGroupe ("LFDRT1 17");
//		Student_5.setNote(12);
//		DonneesEtudiant Student_6 = new DonneesEtudiant ();
//		String OR20180042 = r.toString();
//		Student_6.setNumInscription("OR20180042");
//		Student_6.setCIN("09722458");
//		Student_6.setNomPrenomFr("ELFARJI LAMISS");
//		Student_6.setIdentifiantGroupe (18043451);
//		Student_6.setNomGroupe ("LFDRT1 17");
//		Student_6.setNote(3);
//		DonneesEtudiant Student_7 = new DonneesEtudiant ();
//		String 1718145 = r.toString();
//		Student_7.setNumInscription("1718145");
//		Student_7.setCIN("09631650");
//		Student_7.setNomPrenomFr("ABED ALLAOUI CHAIMA");
//		Student_7.setIdentifiantGroupe (18043451);
//		Student_7.setNomGroupe ("LFDRT1 17");
//		Student_7.setNote(5.25);
//		DonneesEtudiant Student_8 = new DonneesEtudiant ();
//		Student_8.setNumInscription("2L2018002");
//		Student_8.setCIN("09084575");
//		Student_8.setNomPrenomFr("AMRI AHLEM");
//		Student_8.setIdentifiantGroupe (18043451);
//		Student_8.setNomGroupe ("LFDRT1 17");
//		Student_8.setNote(6.5);
//		DonneesEtudiant Student_9 = new DonneesEtudiant ();
//		String OR20180092= r.toString();
//		Student_9.setNumInscription("OR20180092");
//		Student_9.setCIN("7499459");
//		Student_9.setNomPrenomFr("NASRI HADHEMI");
//		Student_9.setIdentifiantGroupe (18043451);
//		Student_9.setNomGroupe ("LFDRT1 17");
//		Student_9.setNote(8.75);
//		DonneesEtudiant Student_10 = new DonneesEtudiant ();
//		String CR20171021= r.toString();
//		Student_10.setNumInscription("CR2017-021");
//		Student_10.setCIN("07487114");
//		Student_10.setNomPrenomFr("CHAIEB MOHAMED KARIM");
//		Student_10.setIdentifiantGroupe (18043451);
//		Student_10.setNomGroupe  ("LFDRT1 17");
//		Student_10.setNote(15);
//		DonneesEtudiant Student_11 = new DonneesEtudiant ();
//		String 1800421 = r.toString();
//		Student_11.setNumInscription("1800421");
//		Student_11.setCIN("07234827");
//		Student_11.setNomPrenomFr("WESLATI SALWA");
//		Student_11.setIdentifiantGroupe (18043451);
//		Student_11.setNomGroupe ("LFDRT1 17");
//		Student_11.setNote(16);
//		DonneesEtudiant Student_12 = new DonneesEtudiant ();
//		String ET2017013= r.toString();
//		Student_12.setNumInscription("ET2017013");
//		Student_12.setCIN("MR170041");
//		Student_12.setNomPrenomFr("BIB MOHAMED MAHMOUD");
//		Student_12.setIdentifiantGroupe (18043451);
//		Student_12.setNomGroupe ("LFDRT1 17");
//		Student_12.setNote(10);
//		StudentService.insert(Student_1);
//		List<DonneesEtudiant> Students = new ArrayList <DonneesEtudiant>();
//		DonneesEtudiant.add(Student_2);
//		Students.add(Student_3);
//		Students.add(Student_4);
//		Students.add(Student_5);
//		Students.add(Student_6);
//		Students.add(Student_7);
//		Students.add(Student_8); 
//		Students.add(Student_9);
//		Students.add(Student_10);
//		Students.add(Student_11);
//		Students.add(Student_12);
//		StudentService.insertBatch(Students);
//		StudentService.loadAllEtudiant (); 
//		StudentService.getDonneesEtudiantById(String.valueOf("OR20180071"));
//		StudentService.getDonneesEtudiantNamerById("CR2017-024");
//		StudentService.getTotalNumberEtudiant();
	};


}
  