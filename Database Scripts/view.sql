
/*
		Author : Eshwari Burlawar
        Date 14/01/2023

*/
DROP VIEW HEART_PATEINT;

CREATE VIEW HEART_PATEINT
AS 
SELECT * 
FROM PATIENT_RECORD
WHERE physical_disability like "%heart%" ;

DROP VIEW punePatient;

CREATE VIEW punePatient
AS 
SELECT * 
FROM PATIENT_RECORD
WHERE address = 'pune' ;