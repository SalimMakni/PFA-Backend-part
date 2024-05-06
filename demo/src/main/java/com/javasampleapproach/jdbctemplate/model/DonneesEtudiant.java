package com.javasampleapproach.jdbctemplate.model;
import java.io.Serializable;

	

	

	public class DonneesEtudiant implements Serializable {
		private String numInscription ;
		private String CIN ;
		private String nomPrenomFr ;
		private int identifiantGroupe ;
		private String nomGroupe ;
		private double note ;
		/**
		 * 
		 */
		private static final long serialVersionUID = -3665745036963891455L;
		public DonneesEtudiant () {	
		}
		public DonneesEtudiant (String numInscription , String CIN ,String nomPrenomFr
				,int identifiantGroupe , String nomGroupe , float note) {
			this.numInscription = numInscription ;
			this.CIN = CIN ;
			this.nomPrenomFr=nomPrenomFr;
			this.identifiantGroupe=identifiantGroupe;
			this.nomGroupe =nomGroupe;
			this.note = note ;
		
		}
		
		public String getNumInscription() {
			return numInscription;
		}
		public void setNumInscription(String numInscription) {
			this.numInscription = numInscription;
		}
		public String getCIN() {
			return CIN;
		}
		public void setCIN(String CIN) {
			this.CIN = CIN;
		}
		public String getNomPrenomFr() {
			return nomPrenomFr;
		}
		public void setNomPrenomFr(String nomPrenomFr) {
			this.nomPrenomFr = nomPrenomFr;
		}
		public int getIdentifiantGroupe() {
			return identifiantGroupe;
		}
		public void setIdentifiantGroupe(int identifiantGroupe) {
			this.identifiantGroupe = identifiantGroupe;
		}
		public String getNomGroupe() {
			return nomGroupe;
		}
		public void setNomGroupe(String nomGroupe) {
			this.nomGroupe = nomGroupe;
		}
		public double getNote() {
			return this.note;
		}
		public void setNote(double note ) {
			this.note = note ;
		}
		public String toString () {
			return "Etudiant [numInscription=" + numInscription +" ,CIN ="+ CIN + " ,nomPrenomFr=" + nomPrenomFr + " , identifiantGroupe " + identifiantGroupe + " ,note "+ note +"]";
					
					
		}
		public static void add(DonneesEtudiant student_2) {
			// TODO Auto-generated method stub
			
		}
		public int get(int i) {
			// TODO Auto-generated method stub
			return 0;
		}

	

}
