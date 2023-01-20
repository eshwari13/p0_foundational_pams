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

//	@Test
//	public void testAdd() {
//		Patient toBeAdded = new Patient("esh","r","z","e","2000/12/02");
//		PatientDao r=new PatientDaoImpl();
//		Patient added = null;
//		try {
//			r.addTest(toBeAdded);
//			added = r.getPatientDetailsTest(toBeAdded.getLoginId());
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		assertEquals(toBeAdded.getLoginId(), added.getLoginId());
//		
//	}

	
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
	@Test
	public void testGetPatients() throws SQLException {
		
		
			patientDao.getPatients();
			int patientCount=PatientDaoImpl.count;
		assertNotEquals(0,PatientDaoImpl.count);
		
	}
}
