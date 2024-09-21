CREATE TABLE City (
    CityID INT PRIMARY KEY,
    Name VARCHAR(100) UNIQUE,
    Pincode INT NOT NULL,
    Remarks VARCHAR(255)
);

CREATE TABLE Village (
    VID INT PRIMARY KEY,
    Name VARCHAR(100) NOT NULL,
    CityID INT,
    FOREIGN KEY (CityID) REFERENCES City(CityID)
);

INSERT INTO City (CityID, Name, Pincode, Remarks) VALUES
(1, 'Rajkot', 360005, 'Good'),
(2, 'Surat', 335009, 'Very Good'),
(3, 'Baroda', 390001, 'Awesome'),
(4, 'Jamnagar', 361003, 'Smart'),
(5, 'Junagadh', 362229, 'Historic'),
(6, 'Morvi', 363641, 'Ceramic');

INSERT INTO Village (VID, Name, CityID) VALUES
(101, 'Raiya', 1),
(102, 'Madhapar', 1),
(103, 'Dodka', 3),
(104, 'Falla', 4),
(105, 'Bhesan', 5),
(106, 'Dhoraji', 5);

SELECT * FROM Village;
SELECT * FROM City;

--1.Display all the villages of Rajkot city.
SELECT City.Name,Village.Name 
FROM City JOIN Village
ON City.CityID = Village.CityID;

--2.Display city along with their villages & pin code.
SELECT City.Name,Village.Name ,City.Pincode
FROM City JOIN Village
ON City.CityID = Village.CityID;

--3.Display the city having more than one village.
SELECT  COUNT(City.CityID)
FROM CITY JOIN Village
ON City.CityID = Village.CityID
HAVING COUNT(City.CityID) > 1;

--4.Display the city having no village.
SELECT  COUNT(City.CityID)
FROM CITY JOIN Village
ON City.CityID = Village.CityID
HAVING COUNT(City.CityID) = 0;

--5.Count the total number of villages in each city.
SELECT  City.Name, COUNT(Village.VID) AS COUNT_VILLAGES
FROM CITY JOIN Village
ON City.CityID = Village.CityID
GROUP BY City.Name;

--6.Count the number of cities having more than one village.
SELECT  City.Name, COUNT(Village.VID) AS COUNT_VILLAGES
FROM CITY JOIN Village
ON City.CityID = Village.CityID
GROUP BY City.Name
HAVING COUNT(Village.VID) > 1;


--Create below table with following constraints

--1.Do not allow SPI more than 10
--2.Do not allow Bklog less than 0.
--3.Enter the default value as �General� in branch to all new records IF no other value is specified.

CREATE TABLE STU_MASTER1(
	RNO INT PRIMARY KEY,
	NAME VARCHAR(15),
	BRANCH VARCHAR(15) DEFAULT 'General',
	SPI DECIMAL(8,2) CHECK (SPI < 10),
	BKLOG INT CHECK (BKLOG > -1)
);

--DROP TABLE STU_MASTER1;


INSERT INTO STU_MASTER1(RNO , NAME , BRANCH , SPI , BKLOG) VALUES
(101 , 'RAJU' , 'CE' , 8.80 , 0),
(102 , 'AMIT' , 'CE' , 2.20 , 3),
(103 , 'SANJAY' , 'ME' , 1.50 , 6),
(104 , 'NEHA' , 'EC' , 7.65 , 0),
(105 , 'MEERA' , 'EE' , 5.52 , 2),
(106 , 'MAHESH' , '' , 4.50 , 3)


--4.Try to update SPI of Raju from 8.80 to 12.
UPDATE STU_MASTER1 SET SPI = 12 WHERE NAME = 'RAJU';

--5.Try to update Bklog of Neha from 0 to -1.
UPDATE STU_MASTER1 SET BKLOG = -1 WHERE NAME = 'NEHA';




--PART B

--Create table as per following schema with proper validation and try to insert data which violate your validation.
--Emp(Eid, Ename, Did, Cid, Salary, Experience)
--Dept(Did, Dname)
--City(Cid, Cname)

CREATE TABLE Dept_DETAILS (
    Did INT PRIMARY KEY,
    Dname VARCHAR(100) NOT NULL
);

CREATE TABLE City_DETAILS(
    Cid INT PRIMARY KEY,
    Cname VARCHAR(100) NOT NULL
);

CREATE TABLE Emp_DETAILS (
    Eid INT PRIMARY KEY,
    Ename VARCHAR(100) NOT NULL,
    Did INT,
    Cid INT,
    Salary DECIMAL(10, 2) CHECK (Salary > 0),
    Experience INT CHECK (Experience >= 0), 
    FOREIGN KEY (Did) REFERENCES Dept_DETAILS(Did),
    FOREIGN KEY (Cid) REFERENCES City_DETAILS(Cid)
);

INSERT INTO Dept_DETAILS(Did, Dname) VALUES
(1, 'HR'),
(2, 'Engineering'),
(3, 'Marketing');

INSERT INTO City_DETAILS(Cid, Cname) VALUES
(1, 'New York'),
(2, 'Los Angeles'),
(3, 'Chicago');

INSERT INTO Emp_DETAILS(Eid, Ename, Did, Cid, Salary, Experience) VALUES
(1, 'John Doe', 1, 1, 50000.00, 5),
(2, 'Jane Smith', 2, 2, 75000.00, 8),
(3, 'Mike Johnson', 3, 3, 60000.00, 3);

----------------------- PART C -----------------------

--Create table as per following schema with proper validation and try to insert data which violate your validation.
--1.	Emp(Eid, Ename, Did, Cid, Salary, Experience)
--		Dept(Did, Dname)
--		City(Cid, Cname, Did))
--		District(Did, Dname, Sid)
--		State(Sid, Sname, Cid)
--		Country(Cid, Cname)


CREATE TABLE Country_INFO (
    Cid INT PRIMARY KEY,
    Cname VARCHAR(100) NOT NULL
);

CREATE TABLE State_INFO (
    Sid INT PRIMARY KEY,
    Sname VARCHAR(100) NOT NULL,
    Cid INT,
    FOREIGN KEY (Cid) REFERENCES Country_INFO(Cid)
);

CREATE TABLE District_INFO (
    Did INT PRIMARY KEY,
    Dname VARCHAR(100) NOT NULL,
    Sid INT,
    FOREIGN KEY (Sid) REFERENCES State_INFO(Sid)
);

CREATE TABLE Dept_INFO (
    Did INT PRIMARY KEY,
    Dname VARCHAR(100) NOT NULL
);

CREATE TABLE City_INFO (
    Cid INT PRIMARY KEY,
    Cname VARCHAR(100) NOT NULL,
    Did INT,
    FOREIGN KEY (Did) REFERENCES District_INFO(Did)
);

CREATE TABLE Emp_INFO (
    Eid INT PRIMARY KEY,
    Ename VARCHAR(100) NOT NULL,
    Did INT,
    Cid INT,
    Salary DECIMAL(10, 2) CHECK (Salary > 0), -- Salary must be positive
    Experience INT CHECK (Experience >= 0),  -- Experience cannot be negative
    FOREIGN KEY (Did) REFERENCES Dept_INFO(Did),
    FOREIGN KEY (Cid) REFERENCES City_INFO(Cid)
);

INSERT INTO Country_INFO (Cid, Cname) VALUES
(1, 'USA'),
(2, 'Canada'),
(3, 'UK'),
(4, 'Australia'),
(5, 'India');

INSERT INTO State_INFO (Sid, Sname, Cid) VALUES
(1, 'California', 1),
(2, 'Ontario', 2),
(3, 'London', 3),
(4, 'New South Wales', 4),
(5, 'Gujarat', 5);

INSERT INTO District_INFO (Did, Dname, Sid) VALUES
(1, 'Los Angeles', 1),
(2, 'Toronto', 2),
(3, 'Westminster', 3),
(4, 'Sydney', 4),
(5, 'Ahmedabad', 5);

INSERT INTO Dept_INFO (Did, Dname) VALUES
(1, 'HR'),
(2, 'Engineering'),
(3, 'Marketing'),
(4, 'Sales'),
(5, 'Finance');

INSERT INTO City_INFO (Cid, Cname, Did) VALUES
(1, 'Los Angeles City', 1),
(2, 'Toronto City', 2),
(3, 'London City', 3),
(4, 'Sydney City', 4),
(5, 'Ahmedabad City', 5);

INSERT INTO Emp_INFO (Eid, Ename, Did, Cid, Salary, Experience) VALUES
(1, 'John Doe', 1, 1, 50000.00, 5),
(2, 'Jane Smith', 2, 2, 75000.00, 8),
(3, 'Mike Johnson', 3, 3, 60000.00, 3),
(4, 'Alice Brown', 4, 4, 45000.00, 2),
(5, 'Bob Green', 5, 5, 40000.00, 4);