CREATE TABLE STUDENT(
	STUID INT,
	FIRSTNAME VARCHAR(25),
	LASTNAME VARCHAR(25),
	WEBSITE VARCHAR(50),
	CITY VARCHAR(25),
	ADDRESS VARCHAR(100)
);
SELECT * FROM STUDENT;
INSERT INTO STUDENT VALUES(1011 , 'KEYUR' , 'PATEL' , 'techonthenet.com' , 'RAJKOT' , 'A-303 ''Vasant Kunj'', Rajkot');
INSERT INTO STUDENT VALUES(1022 , 'HARDIK' , 'SHAH' , 'tdigminecraft.com' , 'AHMEDABAD' , '"Ram Krupa", Raiya Road');
INSERT INTO STUDENT VALUES(1033 , 'KAJAL', 'TRIVEDI' , 'bigactivities.com' , 'BARODA' , 'Raj bhavan plot, near garden');
INSERT INTO STUDENT VALUES(1044 , 'BHOOMI' , 'GAJERA' , 'checkyourmath.com' , 'AHMEDABAD' , '“Jig’s Home”, Narol');
INSERT INTO STUDENT VALUES(1055 , 'HARMIT', 'MITEL' , '@me.darshan.com', 'RAJKOT' , 'B-55, Raj Residency');
INSERT INTO STUDENT VALUES(1066 , 'ASHOK' , 'JANI' ,NULL ,'BARODA', 'A502, Club House Building');

--From the above given tables perform the following queries (LIKE Operation):

--1.Display the name of students whose name starts with ‘k’.
SELECT FIRSTNAME FROM STUDENT WHERE FIRSTNAME LIKE '%K';
--2.Display the name of students whose name consists of five characters.
SELECT FIRSTNAME FROM STUDENT WHERE FIRSTNAME LIKE '_____';
--3.Retrieve the first name & last name of students whose city name ends with a & contains six characters.
SELECT FIRSTNAME,LASTNAME FROM STUDENT WHERE CITY LIKE '_____%A';
--4.Display all the students whose last name ends with ‘tel’.
SELECT FIRSTNAME,LASTNAME FROM STUDENT WHERE LASTNAME LIKE '%TEL'; 
--5.Display all the students whose first name starts with ‘ha’ & ends with‘t’.
--6.Display all the students whose first name starts with ‘k’ and third character is ‘y’.
--7.Display the name of students having no website and name consists of five characters.
--8.Display all the students whose last name consist of ‘jer’.
--9.Display all the students whose city name starts with either ‘r’ or ‘b’.
--10.Display all the name students having websites.
--11.Display all the students whose name starts from alphabet A to H.
--12.Display all the students whose name’s second character is vowel.
--13.Display the name of students having no website and name consists of minimum five characters.
--14.Display all the students whose last name starts with ‘Pat’.
--15.Display all the students whose city name does not starts with ‘b’.