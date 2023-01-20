package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.model.Patient;

public interface PatientDao {
	public int add() throws SQLException;

	public int delete(String loginId) throws SQLException;

	public Patient getPatientDetails(String loginId) throws SQLException;

	public List<Patient> getPatients() throws SQLException;

	public int update(Patient patient) throws SQLException;

}
