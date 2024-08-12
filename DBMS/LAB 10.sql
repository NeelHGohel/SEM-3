--Implement SQL View

--Views (First create a view then display all views)

CREATE TABLE STUDENT_INFO(
	RNO VARCHAR(10),
	NAME VARCHAR(15),
	BRANCH VARCHAR(10),
	SPI DECIMAL(8,2),
	BKLOG VARCHAR(5)
);
SELECT * FROM STUDENT_INFO;

--DROP TABLE STUDENT_INFO;


INSERT INTO STUDENT_INFO VALUES('101' , 'RAJU' , 'CE' , 8.80 , '0');
INSERT INTO STUDENT_INFO VALUES('102' , 'AMIT' , 'CE' , 2.20 , '3');
INSERT INTO STUDENT_INFO VALUES('103' , 'SANJAY' , 'ME' , 1.50 , '6');
INSERT INTO STUDENT_INFO VALUES('104' , 'NEHA' , 'EC' , 7.65 , '1');
INSERT INTO STUDENT_INFO VALUES('105' , 'MEERA' , 'EE' , 5.52 , '2');
INSERT INTO STUDENT_INFO VALUES('106' , 'MAHESH' , 'EC' , 4.50 , '3');

--Part � A:
--1.Create a view Personal with all columns.
CREATE VIEW PERSONAL AS
SELECT * FROM STUDENT_INFO;

SELECT * FROM PERSONAL; 

--2.Create a view Student_Details having columns Name, Branch & SPI.
CREATE VIEW STUDENT_DETAILS AS
SELECT NAME , BRANCH , SPI FROM STUDENT_INFO;

SELECT * FROM STUDENT_DETAILS;

--3.Create a view AcademicData having columns RNo, Name, Branch.
CREATE VIEW ACADEMICDATA AS
SELECT RNO , NAME , BRANCH FROM STUDENT_INFO;

SELECT *  FROM ACADEMICDATA;

--4.Create a view Student_ bklog having all columns but students whose bklog more than 2.
CREATE VIEW STUDENT_BKLOG AS
SELECT * FROM STUDENT_INFO WHERE BKLOG>2;

SELECT * FROM STUDENT_BKLOG;

--5.Create a view Student_Pattern having RNo, Name & Branch columns in which Name consists of four letters.
CREATE VIEW STUDENT_PATTERN AS
SELECT RNO , NAME , BRANCH FROM STUDENT_INFO WHERE NAME LIKE '____';

SELECT * FROM STUDENT_PATTERN;
--6.Insert a new record to AcademicData view. (107, Meet, ME)
INSERT INTO ACADEMICDATA VALUES(107 , 'MEET' , 'ME');
SELECT * FROM ACADEMICDATA;

--7.Update the branch of Amit from CE to ME in Student_Details view.
UPDATE STUDENT_DETAILS SET BRANCH = 'ME' WHERE BRANCH = 'CE';
SELECT * FROM STUDENT_DETAILS;

--8.Delete a student whose roll number is 104 from AcademicData view.
DELETE FROM ACADEMICDATA WHERE RNO = 104;
SELECT * FROM ACADEMICDATA;

--Part � B:

--1.Create a view that displays information of all students whose SPI is above 8.5.
CREATE VIEW ABOVESPI AS
SELECT * FROM STUDENT_INFO WHERE SPI > 8.5;

SELECT * FROM ABOVESPI;

--2.Create a view that displays 0 backlog students.
CREATE VIEW BACKLOG AS
SELECT * FROM STUDENT_INFO WHERE BKLOG = 0;

SELECT * FROM BACKLOG;

--3.Create a view Computerview that displays CE branch data only.
CREATE VIEW COMPUTERVIEW AS
SELECT * FROM STUDENT_INFO WHERE BRANCH = 'CE';

SELECT * FROM COMPUTERVIEW;

--Part � C:
--1.Create a view Result_EC that displays the name and SPI of students with SPI less than 5 of branch EC.
CREATE VIEW RESULT_EC AS
SELECT NAME , SPI FROM STUDENT_INFO WHERE SPI < 5 AND BRANCH = 'EC';

SELECT * FROM RESULT_EC;

--2.Update the result of student MAHESH to 4.90 in Result_EC view.
UPDATE RESULT_EC SET SPI = 4.90 WHERE NAME = 'MAHESH';
SELECT * FROM RESULT_EC;

--3.Create a view Stu_Bklog with RNo, Name and Bklog columns in which name starts with �M� and having bklogs more than 5.
CREATE VIEW STU_BKLOG AS
SELECT RNO , NAME , BKLOG FROM STUDENT_INFO WHERE NAME LIKE 'M%' AND BKLOG > 5;

SELECT * FROM STU_BKLOG;

--4.Drop Computerview form the database.
DROP VIEW COMPUTERVIEW;