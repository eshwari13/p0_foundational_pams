package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;

import com.revature.service.impl.*;
import com.revature.constants.Constant;

public class MySQLAccess {
	public static final Logger logger = Logger.getLogger(MySQLAccess.class);
	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;

	public void crud() throws Exception {
		try {
			// This will load the MySQL driver, each DB has its own driver
			Class.forName("com.mysql.jdbc.Driver");
			// Setup the connection with the DB
			connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/pams?" + "user=root&password=admin");

			// Statements allow to issue SQL queries to the database
			statement = connect.createStatement();
			// Result set get the result of the SQL query
			resultSet = statement.executeQuery(Constant.SELECT_ALL_QUERY);
			writeResultSet(resultSet);

			// PreparedStatements can use variables and are more efficient
			preparedStatement = connect.prepareStatement(Constant.INSERT_QUERY);
			// Parameters start with 1
			preparedStatement.setString(1, "TestId");
			preparedStatement.setString(2, "Test1");
			preparedStatement.executeUpdate(); // INSERT

			preparedStatement = connect.prepareStatement(Constant.INSERT_QUERY);
			// Parameters start with 1
			preparedStatement.setString(1, "TestId1");
			preparedStatement.setString(2, "Test2");
			preparedStatement.executeUpdate(); // INSERT

			// Remove again the insert comment
			preparedStatement = connect.prepareStatement(Constant.DELETE_QUERY);
			preparedStatement.setString(1, "TestID1");
			preparedStatement.executeUpdate(); // DELETE

			resultSet = statement.executeQuery(Constant.SELECT_ALL_QUERY);
			writeMetaData(resultSet); // SELECT MetaData of Table

		} catch (Exception e) {
			throw e;
		} finally {
			close();
		}

	}

	private void writeMetaData(ResultSet resultSet) throws SQLException {
		// Now get some metadata from the database
		// Result set get the result of the SQL query

		logger.info("The columns in the table are: ");

		logger.info("Table: " + resultSet.getMetaData().getTableName(1));
		for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
			logger.info("Column " + i + " " + resultSet.getMetaData().getColumnName(i));
		}
	}

	private void writeResultSet(ResultSet resultSet) throws SQLException {
		// ResultSet is initially before the first data set
		while (resultSet.next()) {
			// It is possible to get the columns via name
			// also possible to get the columns via the column number
			// which starts at 1
			// e.g. resultSet.getSTring(2);
			String loginId = resultSet.getString("LOGIN_ID");
			String password = resultSet.getString("PASSWORD");
			logger.info("User ID: " + loginId);
			logger.info("Password: " + password);

		}
	}

	// You need to close the resultSet
	private void close() {
		try {
			if (resultSet != null) {
				resultSet.close();
			}

			if (statement != null) {
				statement.close();
			}

			if (connect != null) {
				connect.close();
			}
		} catch (Exception e) {

		}
	}

	public static void main(String[] args) throws Exception {
		new MySQLAccess().crud();
	}
}
