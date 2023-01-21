package com.revature.constants;

public class Constant {
	public static final String welcomeUserMessage = "\n=====Welcome to Dr.24/7=====";
	public static final String signIn = "\n1.Sign In";
	public static final String signUp = "\n2.Sign Up";
	public static final String SELECT_ALL_QUERY = "SELECT * FROM `pams`.`PATIENT_RECORD`";
	public static final String SELECT_SPECIFIC_QUERY = "SELECT `LOGIN_ID`,`PASSWORD`,`patient_name`,`email`,`phone_No`,`birth_date`,`age`,`address`,`physical_disability`,`identity_proof` FROM `pams`.`Patient_Record` WHERE `LOGIN_ID`=? ";
	public static final String INSERT_QUERY = "INSERT INTO `pams`.`PATIENT_RECORD` (`LOGIN_ID`,`PASSWORD`,`patient_name`,`email`,`phone_No`,`birth_date`,`age`) VALUES (?,?,?,?,?,?,?) ";
	public static final String UPDATE_QUERY = "UPDATE `pams`.`PATIENT_RECORD` SET `PASSWORD`=?,`patient_name`=?,`email`=?,`phone_No`=?,`birth_date`=?,`age`=?,`address`=?,`physical_disability`=?,`identity_proof`=? WHERE `LOGIN_ID`=? ";
	public static final String DELETE_QUERY = "DELETE FROM `pams`.`PATIENT_RECORD` WHERE `LOGIN_ID`=? ";
	public static final String exit = "\n3.Exit";
	public static final String exitMessage = "\n======Thank You do visit again=====";

	private Constant() {
	}

}
