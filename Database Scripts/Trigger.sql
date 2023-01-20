
/*
		Author : Eshwari Burlawar
        Date 14/01/2023

*/
USE ESHWARI;

DROP TRIGGER after_pateint_inserts;

DELIMITER $$
CREATE TRIGGER after_pateint_inserts
AFTER INSERT 
ON PATIENT_RECORD FOR EACH ROW
BEGIN #{
	IF NEW.date_of_birth IS NOT NULL THEN
		INSERT INTO PATIENT_RECORD(age)
        VALUES(Func_Calculate_Age(NEW.date_of_birth));
	END IF;
END $$  #}

DELIMITER ;


    