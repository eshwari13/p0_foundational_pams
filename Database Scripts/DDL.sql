/*
		Author : Eshwari Burlawar
        Date : 29/12/22

*/


CREATE DATABASE pams;
USE pams;
DROP database pams;

DROP TABLE IF EXISTS PATIENT_RECORD;

CREATE TABLE PATIENT_RECORD(
	login_id VARCHAR(50) Primary Key,
    password VARCHAR(20),
	patient_name VARCHAR(200) , 
	email VARCHAR(100) , 
	phone_No VARCHAR(20),
	birth_date DATE, 
    address VARCHAR(200) NULL, 
	physical_disability VARCHAR(200) NULL, 
 identity_proof VARCHAR(50) NULL
	
); 

ALTER TABLE PATIENT_RECORD
ADD COLUMN (age int NULL);

CREATE TABLE reminder(
message_id int auto_increment PRIMARY KEY,
message varchar(100),
patient_id varchar(50),
FOREIGN KEY (patient_id) REFERENCES PATIENT_RECORD(login_id)
);
/*
The age of end user is automatically computed and added in DB column which is directly accessed while computing ticket price.
*/