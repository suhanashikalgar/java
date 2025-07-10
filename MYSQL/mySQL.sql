-- to connect with the mysql
mysql -u root -p

-- to check all the existing databases
SHOW DATABASES;

-- to create a database
CREATE DATABASE dkte_db;

-- to use a existing database
USE dkte_db;

-- to display all the tables inside the database
SHOW TABLES;

-- create a student table (rollno , name, marks) 
CREATE TABLE student(rollno INT,name CHAR(10), marks DECIMAL(5,2));

-- add the dummy data inside the student
INSERT INTO student VALUES(1,"Suhana",50);
INSERT INTO student VALUES(2,"Mrunal",55);
INSERT INTO student VALUES(3,"Divya",60);
INSERT INTO student VALUES(4,"Akshata",65);
INSERT INTO student VALUES(5,"Amey",70);
INSERT INTO student VALUES(6,"Meet",75);

-- to display all the tables inside the database
SHOW TABLES;

-- display all the contents from the table
SELECT *  FROM student;


-- delete the student with rollno 4
DELETE FROM student WHERE rollno = 4;

-- delete the student having marks = 70
DELETE FROM student WHERE marks = 70;

-- delete the entire table
DROP TABLE student;

-- create a student table (rollno , name, marks) 
-- where rollno needs to be auto generated
CREATE TABLE student( rollno INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(100),marks DECIMAL(5,2));

INSERT INTO student VALUES("Anil",50);
-- error Column count doesn't match value count at row 1

INSERT INTO student(name,marks) VALUES("Amey",50);
INSERT INTO student(name,marks) VALUES("Meet",55);
INSERT INTO student(name,marks) VALUES("Rohan",60);
INSERT INTO student(name,marks) VALUES("Suhani",65);
INSERT INTO student(name,marks) VALUES("Sam",70);
INSERT INTO student(name,marks) VALUES("Vihaan",60);

-- update the roll no of rohan to 4
UPDATE student SET rollno = 4 WHERE name = "Rohan"; --ERROR 1062 (23000): Duplicate entry '4' for key 'student.PRIMARY'

-- add the student sham with no marks
INSERT INTO student(name) VALUES ("Krish");