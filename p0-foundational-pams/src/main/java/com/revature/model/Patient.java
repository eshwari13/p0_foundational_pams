package com.revature.model;

import com.revature.util.DateUtil;

public class Patient {
	// pateint_ID ,pateint_name , email , phone_No,address , date_of_birth,
	// physical_disability , Adhar_card ,login_id ,login_password
	DateUtil dateUtil = new DateUtil();
	private String loginId;
	private String password;
	private String patientName;
	private String email;
	private String phoneNo;
	private String address;
	private String birthDate;
	private String physicalDisability;
	private String identityProof;
	private int age;

	public Patient() {
		super();
	}

	public Patient(String loginId, String password, String patientName, String email, String phoneNo) {
		super();
		this.loginId = loginId;
		this.password = password;
		this.patientName = patientName;
		this.email = email;
		this.phoneNo = phoneNo;
	}

	public Patient(String loginId, String password, String patientName, String email, String phoneNo, String address,
			String birthDate, String physicalDisability, String identityProof) {
		super();
		this.loginId = loginId;
		this.password = password;
		this.patientName = patientName;
		this.email = email;
		this.phoneNo = phoneNo;
		this.address = address;
		this.birthDate = birthDate;
		this.physicalDisability = physicalDisability;
		this.identityProof = identityProof;
	}

	@Override
	public String toString() {
		return "\n" + "=========Patient Details==========\n" + "\nloginId = " + loginId + "\n" + "password = " + password
				+ "\n" + "patientName = " + patientName + "\n" + "email = " + email + "\n" + "phoneNo = " + phoneNo
				+ "\n" + "address = " + address + "\n" + "birthDate = " + birthDate + "\n" + "age = " + age + "\n"
				+ "physical Disability = " + physicalDisability + "\n" + "identityProof = " + identityProof + "\n";

	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getPhysicalDisability() {
		return physicalDisability;
	}

	public void setPhysicalDisability(String physicalDisability) {
		this.physicalDisability = physicalDisability;
	}

	public String getIdentityProof() {
		return identityProof;
	}

	public void setIdentityProof(String identityProof) {
		this.identityProof = identityProof;
	}

	public int getAge() {
		return age;
	}

	public void setAge() {
		this.age = dateUtil.ageCalculator(birthDate);
	}

}