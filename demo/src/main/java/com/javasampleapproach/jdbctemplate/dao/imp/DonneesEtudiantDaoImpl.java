package com.javasampleapproach.jdbctemplate.dao.imp;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.javasampleapproach.jdbctemplate.dao.DonneesEtudiantDao;
import com.javasampleapproach.jdbctemplate.model.DonneesEtudiant;

@Repository
public class DonneesEtudiantDaoImpl implements DonneesEtudiantDao {
	@Autowired
	DataSource dataSource;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;  



	@PostConstruct
	private void initialize() {
		setDataSource(dataSource);
	}

	private void setDataSource(DataSource dataSource2) {
		// TODO Auto-generated method stub

	}

	// ...
	@Override
	public void insert(DonneesEtudiant donneesEtudiant) {
		String sql ="INSERT INTO public.\"donneesEtudiants\" " + "( numInscription,CIN ,nomPrenomFr, identifiantGroupe , nomGroupe , note)"+
				"VALUES (?,?, ?, ?,?,?)";
		jdbcTemplate.update(sql,new Object[]{
			donneesEtudiant.getCIN() ,donneesEtudiant.getNomPrenomFr(),donneesEtudiant.getIdentifiantGroupe(),donneesEtudiant.getNomGroupe(),donneesEtudiant.getNote()
		} ) ;
					
	}

	private DataSource getJbdcTemplate() {
		// TODO Auto-generated method stub
		return dataSource;
	}

	@Override
	public void insertBatch(List<DonneesEtudiant> donnees) {
		String sql = "INSERT INTO DonneesEtudiant "
				+ "( numInscription,CIN ,nomPrenomFr, identifiantGroupe , nomGroupe , note)"
				+ "VALUES ('?,?, ?,?,?, ?)";
		jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				DonneesEtudiant donneesEtudiant = donnees.get(i);
				ps.setString(1, donneesEtudiant.getNumInscription());
				ps.setString(2, donneesEtudiant.getCIN());
				ps.setString(3, donneesEtudiant.getNomPrenomFr());
				ps.setInt(4, donneesEtudiant.getIdentifiantGroupe());
				ps.setString(5, donneesEtudiant.getNomGroupe());
				ps.setDouble(6, donneesEtudiant.getNote());
			}

			public int getBatchSize() {
				return donnees.size();
			}
		});

	}
	@Override
	public List<DonneesEtudiant> loadAllDonneesEtudiants() {
		String sql = "SELECT * FROM public.\"donneesEtudiants\"";
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		List<DonneesEtudiant> result = new ArrayList<DonneesEtudiant>();
		for (Map<String, Object> row : rows) {
			DonneesEtudiant Etudiant = new DonneesEtudiant();
			Etudiant.setNumInscription((String) row.get("N° Inscription"));
			Etudiant.setCIN((String) row.get("CIN"));
			Etudiant.setNomPrenomFr((String) row.get("Nom & Prénom Fr"));
			Etudiant.setIdentifiantGroupe((Integer) row.get("Identifiant Groupe"));
			Etudiant.setNomGroupe((String) row.get("Nom Groupe"));
			Etudiant.setNote((float) row.get("Note"));
			result.add(Etudiant);
		}

		return result;
	}

	@Override
	public String findNameById(String numInscription) {
		String sql = "SELECT name FROM DonneesEtudiant WHERE numInscription= ?";
		return jdbcTemplate.queryForObject(sql, new Object[] { numInscription }, String.class);

	}



	@Override
	public DonneesEtudiant findDonneesEtudiantById(String numInscription) {
		String sql = "SELECT * FROM DonneesEtudiant WHERE numInscription= ?";
		return jdbcTemplate.queryForObject(sql, new Object[] { numInscription }, DonneesEtudiant.class);


	}

	@Override
	public int getTotalNumberEtudiant() {
		String sql = "SELECT Count (*) FROM DonneesEtudiant ";
		int total = jdbcTemplate.queryForObject(sql, Integer.class);
		return total;

		
	}

}
