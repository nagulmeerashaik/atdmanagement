DROP TABLE IF EXISTS ACCOUNT;  
CREATE TABLE ACCOUNT (  
ID INT AUTO_INCREMENT  PRIMARY KEY,  
FIRST_NAME VARCHAR(100) NOT NULL,  
LAST_NAME VARCHAR(100) NOT NULL,
EMAIL VARCHAR(255) NOT NULL,
PHONE_NUMBER  VARCHAR(20) NOT NULL,
GENDER VARCHAR(10) NOT NULL,
CURRENT_YEAR VARCHAR(10) NULL,
ACADEMIC_YEAR VARCHAR(10) NULL,
ACCOUNT_TYPE VARCHAR(10) NOT NULL
); 