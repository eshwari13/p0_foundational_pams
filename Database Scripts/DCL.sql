/*
		Author : Eshwari Burlawar
        Date 03/01/2023

*/

SHOW DATABASES;
USE pams;

-- Show current logged users
SELECT host,user, db,command
FROM information_schema.processlist;

-- Check previlages on the account

GRANT SELECT, INSERT, UPDATE, DELETE 
ON pams.*   
TO root@'localhost';

SHOW GRANTS
FOR root@'localhost';

FLUSH PRIVILEGES;

REVOKE INSERT, UPDATE, DELETE 
ON pams.* 
FROM root@'localhost';


