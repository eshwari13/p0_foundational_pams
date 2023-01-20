/*
		Author : Eshwari Burlawar
        Date 01/01/23

*/

-- `LOGIN_ID`,`PASSWORD`,`patient_name`,`email`,`phone_No`,`birth_date`,`address`,`physical_disability`,`identity_proof`,`age`
DELETE  FROM `pams`.`PATIENT_RECORD`;
-- pateint_ID ,pateint_name , email , phone_No,birth_date,address, physical_disability , Adhar_card ,login_id ,login_password 
INSERT INTO PATIENT_RECORD values 
('Eshwari_Burlawar', 'eshu@123','Eshwari Burlawar','eshwariburlawar123@gamil.com','9921738268','2000-05-13','Yavatmal','NA','7604 2345 6789',FUNC_CALCULATE_AGE(birth_date)),
('Mrunal1616', 'mrunal','Mrunal Barde','mbarde@gamil.com','992000268','2000-11-11','Pune','NA','8888 2345 6789',FUNC_CALCULATE_AGE(birth_date)),
('Sangeeta98', 'sangeeta','sangeeta Palankare','palankers@gamil.com','9921738111','2000-09-05','Belgam','lenses','1224 2345 6789',FUNC_CALCULATE_AGE(birth_date)),
('kumar_raj', 'rajsan','Raj Kumar','kumarraj567@gamil.com','7345639875','2000-12-05','Mumbai','Heart Attack','3460 5643 2308',FUNC_CALCULATE_AGE(birth_date)),
('Ashwin11', 'ashwin2345','Ashwin Vora','ashwinvora11@gamil.com','9836582374','2000-02-26','Pune','NA','9823 7655 6087',FUNC_CALCULATE_AGE(birth_date)),
('RishuKap23', 'rishu4545','Rishabh Kapoor','rishabhkapoor13@gamil.com','9262738965','2000-05-05','Pune','heart bypass','3749 5478 2048',FUNC_CALCULATE_AGE(birth_date));



INSERT INTO PATIENT_RECORD values 
('Gaytri234', 'gayatri','Gaytri ','gaytri@gamil.com','8845388569','2000-03-17','Banglore','NA','5375 5638 6438',FUNC_CALCULATE_AGE(birth_date));

DELETE FROM `pams`.`PATIENT_RECORD`
WHERE pateint = "P007";

UPDATE `pams`.`PATIENT_RECORD`
SET 
`physical_disability` = 'Handicap,Color Blind',
`phone_No` = '9975865768'
WHERE `login_id`= 'kumar_raj';


