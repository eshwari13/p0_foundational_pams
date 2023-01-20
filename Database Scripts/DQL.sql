/*
		Author : Eshwari Burlawar
        Date 01/01/23

*/

select * from PATIENT_RECORD;
-- DQL Script
SELECT `PATEINT_RECORD`.`pateint_name`, `PATEINT_RECORD`.`physical_disability`  # Relation Algebra : SELECTION Operation
FROM `pams`.`PATEINT_RECORD`;   


SELECT *
FROM `pams`.`PATEINT_RECORD`
WHERE pateint_ID ='P001' ; # Relation Algebra : PROJECTION Operation

-- view select command

SELECT * FROM punePatient;

