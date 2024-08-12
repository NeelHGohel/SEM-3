CREATE TABLE STUDENT_DATA(
	NO INT,
	NAME VARCHAR(15),
	CITY VARCHAR(15),
	DID INT
);
SELECT * FROM STUDENT_DATA;

--DROP TABLE STUDENT_DATA

INSERT INTO STUDENT_DATA VALUES(101 , 'RAJU' , 'RAJKOT' , 10);
INSERT INTO STUDENT_DATA VALUES(102 , 'AMIT' , 'AHMEDABAD' , 20);
INSERT INTO STUDENT_DATA VALUES(103 , 'SANJAY' , 'BARODA' , 40);
INSERT INTO STUDENT_DATA VALUES(104 , 'NEHA' , 'RAJKOT' , 20);
INSERT INTO STUDENT_DATA VALUES(105 , 'MEERA' , 'AHMEDABAD' , 30);
INSERT INTO STUDENT_DATA VALUES(106 , 'MAHESH' , 'BARODA' , 10);

CREATE TABLE ACADMIC(
	RNO INT,
	SPI DECIMAL(8,2),
	BKLOG VARCHAR(5)
);

SELECT * FROM ACADMIC;

INSERT INTO ACADMIC VALUES(101 , 8.8 , '0');
INSERT INTO ACADMIC VALUES(102 , 9.2 , '2');
INSERT INTO ACADMIC VALUES(103 , 7.6 , '1');
INSERT INTO ACADMIC VALUES(104 , 8.2 , '4');
INSERT INTO ACADMIC VALUES(105 , 7.0 , '2');
INSERT INTO ACADMIC VALUES(106 , 8.9 , '3');

CREATE TABLE DEPARTMENT(
	DID INT ,
	DNAME VARCHAR(15),
);

SELECT * FROM DEPARTMENT;

INSERT INTO DEPARTMENT VALUES(10 , 'COMPUTER');
INSERT INTO DEPARTMENT VALUES(20 , 'ELECTRICAL');
INSERT INTO DEPARTMENT VALUES(30 , 'MECHANICAL');
INSERT INTO DEPARTMENT VALUES(40 , 'CIVIL');


--Part – A:

--1.Display details of students who are from computer department.
SELECT * FROM STUDENT_DATA 
WHERE DID IN 
(SELECT DID FROM DEPARTMENT WHERE DNAME = 'COMPUTER');

--2.Displays name of students whose SPI is more than 8.
SELECT NAME FROM STUDENT_DATA 
WHERE NO IN 
(SELECT RNO FROM ACADMIC WHERE SPI > 8);

--3.Display details of students of computer department who belongs to Rajkot city.
SELECT * FROM STUDENT_DATA WHERE CITY = 'RAJKOT'
AND DID IN 
(SELECT DID FROM DEPARTMENT WHERE DNAME = 'COMPUTER');

--4.Find total number of students of electrical department.
SELECT COUNT(NO) AS COUNT_STUDENT FROM STUDENT_DATA
WHERE DID IN 
(SELECT DID FROM DEPARTMENT WHERE DNAME = 'ELECTRICAL');

--5.Display name of student who is having maximum SPI.
SELECT * FROM STUDENT_DATA 
WHERE NO IN 
(SELECT RNO FROM ACADMIC 
WHERE SPI = (SELECT MAX(SPI) FROM ACADMIC));

--6.Display details of students having more than 1 backlog.
SELECT * FROM STUDENT_DATA 
WHERE NO IN
(SELECT RNO FROM ACADMIC WHERE BKLOG > 1);

--Part – B:

--1.Display name of students who are either from computer department or from mechanical department.
--2.Display name of students who are in same department as 102 studying in.


--Part – C:

--1.Display name of students whose SPI is more than 9 and who is from electrical department.
--2.Display name of student who is having second highest SPI.
--3.Display city names whose students branch wise SPI is 9.2.



--SET Operators

--Create below two tables as per following data.

CREATE TABLE COMPUTER(
	ROLLNO VARCHAR(15),
	NAME VARCHAR(15)
);
SELECT * FROM COMPUTER;

INSERT INTO COMPUTER VALUES('101' , 'AJAY');
INSERT INTO COMPUTER VALUES('109' , 'HARESH');
INSERT INTO COMPUTER VALUES('115' , 'MANISH');

--DROP TABLE COMPUTER;

CREATE TABLE ELECTRICAL(
	ROLLNO VARCHAR(15),
	NAME VARCHAR(15)
);
SELECT * FROM ELECTRICAL;

INSERT INTO ELECTRICAL VALUES('105' , 'AJAY');
INSERT INTO ELECTRICAL VALUES('107' , 'MAHESH');
INSERT INTO ELECTRICAL VALUES('115' , 'MANISH');

--Part – A:

--1.Display name of students who is either in Computer or in Electrical.
SELECT NAME FROM COMPUTER
UNION
SELECT NAME FROM ELECTRICAL;

--2.Display name of students who is either in Computer or in Electrical including duplicate data.
SELECT NAME FROM COMPUTER
UNION ALL 
SELECT NAME FROM ELECTRICAL;

--3.Display name of students who is in both Computer and Electrical.
SELECT NAME FROM COMPUTER 
INTERSECT 
SELECT NAME FROM ELECTRICAL;

--4.Display name of students who are in Computer but not in Electrical.
SELECT NAME FROM COMPUTER 
EXCEPT 
SELECT NAME FROM ELECTRICAL;

--5.Display name of students who are in Electrical but not in Computer.
SELECT NAME FROM ELECTRICAL 
EXCEPT
SELECT NAME FROM COMPUTER;

--6.Display all the details of students who are either in Computer or in Electrical.
SELECT * FROM COMPUTER 
UNION 
SELECT * FROM ELECTRICAL;

--7.Display all the details of students who are in both Computer and Electrical.
SELECT * FROM COMPUTER 
INTERSECT 
SELECT * FROM ELECTRICAL;


--Part – B:
--Create below two tables as per following data.

CREATE TABLE EMP_DATA(
	EID VARCHAR(5),
	NAME VARCHAR(15)
);
SELECT * FROM EMP_DATA;

INSERT INTO EMP_DATA VALUES('1' , 'AJAY');
INSERT INTO EMP_DATA VALUES('9' , 'HARESH');
INSERT INTO EMP_DATA VALUES('5' , 'MANISH');

CREATE TABLE CUSTOMER(
	CID VARCHAR(5),
	NAME VARCHAR(15)
);
SELECT * FROM CUSTOMER;

INSERT INTO CUSTOMER VALUES('5' , 'AJAY');
INSERT INTO CUSTOMER VALUES('7' , 'MAHESH');
INSERT INTO CUSTOMER VALUES('5' , 'MANISH');

--1.Display name of persons who is either Employee or Customer.
SELECT NAME FROM EMP_DATA
UNION 
SELECT NAME FROM CUSTOMER;

--2.Display name of persons who is either Employee or Customer including duplicate data.
SELECT NAME FROM EMP_DATA 
UNION ALL 
SELECT NAME FROM CUSTOMER;

--3.Display name of persons who is both Employee as well as Customer.
SELECT NAME FROM EMP_DATA 
INTERSECT 
SELECT NAME FROM CUSTOMER;

--4.Display name of persons who are Employee but not Customer.
SELECT NAME FROM EMP_DATA 
EXCEPT 
SELECT NAME FROM CUSTOMER;

--5.Display name of persons who are Customer but not Employee.
SELECT NAME FROM CUSTOMER 
EXCEPT 
SELECT NAME FROM EMP_DATA;

--Part – C:
--1.Perform all the queries of Part-B but display ID and Name columns instead of Name only.


--1
SELECT * FROM EMP_DATA
UNION 
SELECT * FROM CUSTOMER;

--2
SELECT * FROM EMP_DATA 
UNION ALL 
SELECT * FROM CUSTOMER;

--3
SELECT * FROM EMP_DATA 
INTERSECT 
SELECT * FROM CUSTOMER;

--4
SELECT * FROM EMP_DATA 
EXCEPT 
SELECT * FROM CUSTOMER;

--5
SELECT * FROM CUSTOMER 
EXCEPT 
SELECT * FROM EMP_DATA;
