package com.revature.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.revature.config.DatabaseConnection;
import com.revature.constants.Constant;
import com.revature.dao.PatientDao;
import com.revature.dao.impl.PatientDaoImpl;
import com.revature.model.Patient;
import com.revature.service.Service;

public class ServiceImpl implements Service {
	private static final Logger logger = Logger.getLogger(ServiceImpl.class);
	PatientDao patient = new PatientDaoImpl();
	Scanner scan = new Scanner(System.in);
	Connection con = null;

	public static void main(String[] args) {
		ServiceImpl service = new ServiceImpl();
		service.authentication();
	}

	@Override
	public void authentication() {
		try {

			do {
				logger.info(Constant.welcomeUserMessage);
				System.out.println(Constant.signIn);
				System.out.println(Constant.signUp);
				System.out.println(Constant.exit);

				int choice = scan.nextInt();
				scan.nextLine();
				switch (choice) {
				case 1:
					login();
					break;
				case 2:
					signUp();
					break;
				case 3:
					exit();
					break;
				default:
					logger.info("\t\t\tWrong option selected!");
				}
			} while (true);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void login() throws SQLException {

		do {

			logger.info("\n======= ENTER LOGIN DETAILS ======= ");
			logger.info("\nEnter your USERNAME  :-");
			String id = scan.next();

			logger.info("\nEnter your PASSWORD :-");
			String pass = scan.next();
			boolean flag = false;
			for (Patient i : patient.getPatients()) {

				if (i.getLoginId().equals(id) && i.getPassword().equals(pass)) {

					signIn();
					flag = true;
					break;
				}
			}
			if (flag != true) {
				logger.info("\n======Please enter correct details=======");
			authentication();
			}

		} while (true);

	}

	private void exit() {
		logger.info(Constant.exitMessage);
	}

	private void signIn() {
		try {
			do {
				logger.info("-----Select from below options for further process-----");
				logger.info("1.Update Patient Details");
				logger.info("2.Dispaly Patient Details");
				logger.info("3.Delete Patient Details");
				// logger.info("4.Display All Patient Details");
				logger.info("4.Exit");
				logger.info("Enter your choice");

				int choice = scan.nextInt();
				scan.nextLine();

				switch (choice) {

				case 1:
					logger.info("Enter login Id which you want to update : ");
					String loginIdToUpdate = scan.nextLine();
					for (Patient i : patient.getPatients()) {
						if (i.getLoginId().equals(loginIdToUpdate)) {
							patient.update(i);
							break;
						}
					}
					break;
				case 2:
					logger.info("Enter your loginId you want to view: ");
					String loginId = scan.nextLine();
					logger.info(patient.getPatientDetails(loginId));
					break;
				case 3:

					logger.info("Enter your loginId you want to delete : ");
					String loginIdToDelete = scan.nextLine();
					patient.delete(loginIdToDelete);
					logger.info("Your's LoginId Deleted Successfully");
					break;

				case 4:
					System.exit(0);

				default:
					logger.info("Enter between 1 and 4 only");
					break;

				}
			} while (true);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private void signUp() throws SQLException {
		patient.add();
	}

}
