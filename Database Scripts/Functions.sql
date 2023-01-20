DELIMITER $$
CREATE FUNCTION FUNC_CALCULATE_AGE(
	bod DATE
)
RETURNS INT deterministic
BEGIN
	DECLARE todaydate DATE;
    SELECT CURRENT_DATE() INTO todaydate;
    RETURN YEAR(todaydate) - YEAR(date_of_birth);
END$$
DELIMITER ;