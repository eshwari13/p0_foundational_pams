package com.revature.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import com.revature.dao.impl.PatientDaoImpl;
import com.revature.model.Patient;


public class PatientDaoImplTest {


	PatientDao patientDao ;

	@Before
	public void setUp() throws Exception {
		System.out.println("---------RouteDaoImplTest before every test---------");
		patientDao = new PatientDaoImpl();
	}


	
	@Test
	public void testDelete() {
		Patient deleted = null;
		try {
			patientDao.delete("esh");
			deleted = patientDao.getPatientDetails("esh");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		assertNull(deleted);
	}
	
}
