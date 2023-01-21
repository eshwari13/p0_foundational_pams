package com.revature.config;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;

import org.junit.Test;

public class DatabaseConnectionTest {

	@Test
	public void testGetConnection() {
		new DatabaseConnection();
		assertNotNull(DatabaseConnection.getConnection());
	}

}
