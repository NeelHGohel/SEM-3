--Math functions
--Part – A:

--1.Display the result of 5 multiply by 30.
SELECT 5*30 AS _5_multiply_by_30;

--2.Find out the absolute value of -25, 25, -50 and 50.
SELECT ABS(-25),ABS(25),ABS(-50),ABS(50); 

--3.Find smallest integer value that is greater than or equal to 25.2, 25.7 and -25.2.
SELECT CEILING(25.2),CEILING(25.7),CEILING(-25.2);

--4.Find largest integer value that is smaller than or equal to 25.2, 25.7 and -25.2.
SELECT FLOOR(25.2),FLOOR(25.7),FLOOR(-25.2);

--5.Find out remainder of 5 divided 2 and 5 divided by 3.
SELECT 5 % 2 , 5 % 3;

--6.Find out value of 3 raised to 2nd power and 4 raised 3rd power.
SELECT POWER(3,2) AS _3_raised_to_2,POWER(4,3) AS _4_raised_to_3;

--7.Find out the square root of 25, 30 and 50.
SELECT SQRT(25) AS SQURE_ROOT_OF_25,SQRT(30) AS SQURE_ROOT_OF_30,SQRT(50) AS SQURE_ROOT_OF_50;

--8.Find out the square of 5, 15, and 25.
SELECT SQUARE(5) AS SQURE_OF_5,SQUARE(15) AS SQURE_OF_15,SQUARE(25)AS SQURE_OF_25;

--9.Find out the value of PI.
SELECT PI() AS PI_;

--10.Find out round value of 157.732 for 2, 0 and -2 decimal points.
SELECT ROUND(157.732,2) AS ROUNT_UPTO_2_DIGITS,
	   ROUND(157.732,0) AS ROUNT_UPTO_0_DIGITS,
	   ROUND(157.732,-2) AS ROUNT_UPTO_2_DIGITS;

--11.Find out exponential value of 2 and 3.
SELECT EXP(2) AS exponential_value_of_2 ,EXP(3) AS exponential_value_of_3;

--12.Find out logarithm having base e of 10 and 2.
SELECT LOG(10) AS LOG_OF_10_TO_BASE_e ,LOG(2) AS LOG_OF_2_TO_BASE_e;

--13.Find out logarithm having base b having value 10 of 5 and 100.
SELECT LOG10(5) AS LOG_OF_5_TO_BASE_10,LOG10(100) AS LOG_OF_100_TO_BASE_10 ;

--14.Find sine, cosine and tangent of 3.1415.
SELECT SIN(3.1415) AS SINE_OF_PI ,COS(3.1415) AS COSINE_OF_PI, TAN(3.1415) AS TAN_OF_PI;

--15.Find sign of -25, 0 and 25.
SELECT SIGN(-25),SIGN(0),SIGN(25);

--16.Generate random number using function.
SELECT RAND() AS Random_number;

--Part – B:
--Create and Insert the following records in the EMP_MASTER table.

CREATE TABLE EMP_MASTER(
	EMPNO INT,
	EMPNAME VARCHAR(25),
	JOININGDATE DATETIME,
	SALARY DECIMAL(8,2),
	COMMISSION DECIMAL(8,2),
	CITY VARCHAR(25),
	DEPTCODE VARCHAR(5)
);



INSERT INTO EMP_MASTER VALUES (101, 'KEYUR', '2002-01-05', 12000.00 , 4500, 'RAJKOT', '3@G');
INSERT INTO EMP_MASTER VALUES (102, 'HARDIK', '2004-02-15', 14000.00 , 2500, 'AHMEDABAD', '3@');
INSERT INTO EMP_MASTER VALUES (103, 'KAJAL', '2006-03-14', 15000.00 , 3000, 'BARODA', '3-GD');
INSERT INTO EMP_MASTER VALUES (104, 'BHOOMI', '2005-06-23', 12500.00 , 1000, 'AHMEDABAD', '1A3D');
INSERT INTO EMP_MASTER VALUES (105, 'HARMIT', '2004-02-15', 14000.00 , 2000, 'RAJKOT', '312A');

SELECT * FROM EMP_MASTER;

--1.Display the result of Salary plus Commission.
SELECT  SUM(SALARY+COMMISSION) AS RESULT FROM EMP_MASTER GROUP BY EMPNO;

--2.Find smallest integer value that is greater than or equal to 55.2, 35.7 and -55.2.
SELECT CEILING(55.2),CEILING(35.7),CEILING(-55.2);

--3.Find largest integer value that is smaller than or equal to 55.2, 35.7 and -55.2.
SELECT FLOOR(55.2),FLOOR(35.7),FLOOR(-55.2);

--4.Find out remainder of 55 divided 2 and 55 divided by 3.
SELECT 55%2 AS REMAINDER_55_DIVIDED_BY_2 , 55%3 AS REMAINDER_55_DIVIDED_BY_3;

--5.Find out value of 23 raised to 2nd power and 14 raised 3rd power.
SELECT SQUARE(23) AS SQURE_OF_23,POWER(14,3) AS POWER_OF_14_RAISE_TO_3;

--Part – C:
--1.Find out the square root of 36, 49 and 81.
SELECT SQRT(36) AS SQURE_ROOT_OF_36,SQRT(49) AS SQURE_ROOT_OF_49,SQRT(81) AS SQURE_ROOT_OF_81;

--2.Find out the square of 3, 9, and 12.
SELECT SQUARE(3) AS SQURE_OF_3,SQUARE(9) AS SQURE_OF_9,SQUARE(12)AS SQURE_OF_12;

--3.Find out round value of 280.8952 for 2, 0 and -2 decimal points.
SELECT ROUND(280.8952,2) AS ROUNT_UPTO_2_DIGITS,
	   ROUND(280.8952,0) AS ROUNT_UPTO_0_DIGITS,
	   ROUND(280.8952,-2) AS ROUNT_UPTO_2_DIGITS;

--4.Find sine, cosine and tangent of 4.2014.
SELECT SIN(4.2014) AS SINE ,COS(4.2014) AS COSINE, TAN(4.2014) AS TAN_;

--5.Find sign of -55, 0 and 95.
SELECT SIGN(-55),SIGN(0),SIGN(95);


--String functions


--Part – A:

--1.Find the length of following. (I) NULL (II) ‘ hello ’ (III) Blank
SELECT LEN('NULL') AS LENGTH_OF_NULL , LEN('HELLO') AS LENGTH_OF_HELLO , LEN('') AS LENGTH_OF_;

--2.Display your name in lower & upper case.
SELECT LOWER('NEEL') AS LOWER_CASE , UPPER('NEEL') AS UPPER_CASE;

--3.Display first three characters of your name.
SELECT SUBSTRING('NEEL' , 1 ,3);

--4.Display 3rd to 10th character of your name.
SELECT SUBSTRING('NEELGOHELH' ,3,10);

--5.Write a query to convert ‘abc123efg’ to ‘abcXYZefg’ & ‘abcabcabc’ to ‘ab5ab5ab5’ using REPLACE.
SELECT REPLACE('abc123efg' , '123' , 'XYZ'), REPLACE('abcabcabc' , 'C' , '5');

--6.Write a query to display ASCII code for ‘a’,’A’,’z’,’Z’, 0, 9.


--7.Write a query to display character based on number 97, 65,122,90,48,57.


--8.Write a query to remove spaces from left of a given string ‘ hello world ‘.


--9.Write a query to remove spaces from right of a given string ‘ hello world ‘.


--10.Write a query to display first 4 & Last 5 characters of ‘SQL Server’.


--11.Write a query to convert a string ‘1234.56’ to number (Use cast and convert function).


--12.Write a query to convert a float 10.58 to integer (Use cast and convert function).


--13.Put 10 space before your name using function.


--14.Combine two strings using + sign as well as CONCAT ().


--15.Find reverse of “Darshan”.


--16.Repeat your name 3 times.




--Part – B:
--Perform following queries on Student table of practical no 5.

--1.Find the length of FirstName and LastName columns.


--2.Display FirstName and LastName columns in lower & upper case.


--3.Display first three characters of FirstName column.


--4.Display 3rd to 10th character of Website column.


--5.Write a query to display first 4 & Last 5 characters of Website column.


--Part – C: Perform following queries on Student table of practical no 5.


--1.Put 10 space before FirstName using function.


--2.Combine FirstName and LastName columns using + sign as well as CONCAT ().


--3.Combine all columns using + sign as well as CONCAT ().


--4.Find reverse of FirstName column.


--5.Repeat FirstName column 3 times


--6.Give the Names which contains 5 characters.


--7.Combine the result as <FirstName> Lives in <City>.


--8.Combine the result as Student_ID of < FirstName > is <StuID>.

