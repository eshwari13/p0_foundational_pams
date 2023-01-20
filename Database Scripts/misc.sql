/*
		Author : Eshwari Burlawar
        Date 14/01/2023

*/
-- INDEX --
DROP INDEX fastSearchByPhysicalDisability ON patient_record;
SHOW INDEXES FROM PATIENT_RECORD;
CREATE INDEX fastSearchByPhysicalDisability ON PATIENT_RECORD(physical_disability);
-- SELECT * FROM TABLE WITH(fastSearchByPhysicalDisability());

DROP INDEX fastSearchByPhysicalDisabilityAndAddress ON patient_record;
SHOW INDEXES FROM PATIENT_RECORD;
CREATE INDEX fastSearchByPhysicalDisabilityAndAddress ON PATIENT_RECORD(physical_disability,address);

-- view--
