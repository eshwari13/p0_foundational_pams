package com.revature.service.impl;

import java.sql.SQLException;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.revature.constants.Constant;
import com.revature.dao.PatientDao;
import com.revature.dao.impl.PatientDaoImpl;
import com.revature.model.Patient;
import com.revature.service.Service;

public class ServiceImpl implements Service {
	private static final Logger logger = Logger.getLogger(ServiceImpl.class);
	PatientDao patient = new PatientDaoImpl();
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		ServiceImpl service = new ServiceImpl();
		service.login();
	}

	@Override
	public void login()  {
		try {
			
			do {
				logger.info(Constant.welcomeUserMessage);
				logger.info(Constant.signIn);
				logger.info(Constant.signUp);
				logger.info(Constant.exit);
				
				int choice = scan.nextInt();
				scan.nextLine();
				switch (choice) {
				case 1:
					signIn();
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
				}
			while(true);

			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

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
				logger.info("4.Dispaly All Patient Details");
				logger.info("5.Exit");
				logger.info("Enter your choice");

				int choice = scan.nextInt();
				scan.nextLine();

				switch (choice) {

				case 1:
					logger.info("Enter login Id which you want to update : ");
					String loginIdToUpdate = scan.nextLine();
					for (Patient i : patient.getPatients()) {
						logger.info("inside for");
						if (i.getLoginId().equals(loginIdToUpdate)) {
							logger.info("inside if");
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
					logger.info("list of patients" + "\n" + patient.getPatients());
					break;
				case 5:
					System.exit(0);

				default:
					logger.info("Enter between 1and 6 only");
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
