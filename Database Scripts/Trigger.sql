
/*
		Author : Eshwari Burlawar
        Date 14/01/2023

*/
USE ESHWARI;

DROP TRIGGER after_pateint_inserts;

DELIMITER $$
CREATE TRIGGER after_pateint_record_inserts
AFTER INSERT 
ON patient_record FOR EACH ROW
BEGIN #{
	IF NEW.birth_date IS  NULL THEN
		   INSERT INTO reminders(memberId, message)
        VALUES(NEW.login_id,CONCAT('Hi ', NEW.patient_name, ', please update your date of birth.'));
	END IF;
END $$  #}

DELIMITER ;
