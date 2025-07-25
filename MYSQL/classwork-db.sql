DROP TABLE IF EXISTS books;
DROP TABLE IF EXISTS dept;
DROP TABLE IF EXISTS emp;
DROP TABLE IF EXISTS salgrade;

CREATE TABLE books (id INT(4) PRIMARY KEY, name VARCHAR(50), author VARCHAR(50), subject VARCHAR(50), price FLOAT(7,3));

INSERT INTO books VALUES (1001,'Exploring C','Yashwant Kanetkar','C Programming',123.456);
INSERT INTO books VALUES (1002,'Pointers in C','Yashwant Kanetkar','C Programming',371.019);
INSERT INTO books VALUES (1003,'ANSI C Programming','E Balaguruswami','C Programming',334.215);
INSERT INTO books VALUES (1004,'ANSI C Programming','Dennis Ritchie','C Programming',140.121);
INSERT INTO books VALUES (2001,'C++ Complete Reference','Herbert Schildt','C++ Programming',417.764);
INSERT INTO books VALUES (2002,'C++ Primer','Stanley Lippman','C++ Programming',620.665);
INSERT INTO books VALUES (2003,'C++ Programming Language','Bjarne Stroustrup','C++ Programming',987.213);
INSERT INTO books VALUES (3001,'Java Complete Reference','Herbert Schildt','Java Programming',525.121);
INSERT INTO books VALUES (3002,'Core Java Volume I','Cay Horstmann','Java Programming',575.651);
INSERT INTO books VALUES (3003,'Java Programming Language','James Gosling','Java Programming',458.238);
INSERT INTO books VALUES (4001,'Operating System Concepts','Peter Galvin','Operating Systems',567.391);
INSERT INTO books VALUES (4002,'Design of UNIX Operating System','Mauris J Bach','Operating Systems',421.938);
INSERT INTO books VALUES (4003,'UNIX Internals','Uresh Vahalia','Operating Systems',352.822);

CREATE TABLE dept(deptno INT(4), dname VARCHAR(40), loc VARCHAR(40));

INSERT INTO dept VALUES (10,'ACCOUNTING','NEW YORK');
INSERT INTO dept VALUES (20,'RESEARCH','DALLAS');
INSERT INTO dept VALUES (30,'SALES','CHICAGO');
INSERT INTO dept VALUES (40,'OPERATIONS','BOSTON');

CREATE TABLE emp(empno INT(4), ename VARCHAR(40), job VARCHAR(40), mgr INT(4), hire DATE, sal DECIMAL(8,2), comm DECIMAL(8,2), deptno INT(4));

INSERT INTO emp VALUES (7369,'SMITH','CLERK',7902,'1980-12-17',800.00,NULL,20);
INSERT INTO emp VALUES (7499,'ALLEN','SALESMAN',7698,'1981-02-20',1600.00,300.00,30);
INSERT INTO emp VALUES (7521,'WARD','SALESMAN',7698,'1981-02-22',1250.00,500.00,30);
INSERT INTO emp VALUES (7566,'JONES','MANAGER',7839,'1981-04-02',2975.00,NULL,20);
INSERT INTO emp VALUES (7654,'MARTIN','SALESMAN',7698,'1981-09-28',1250.00,1400.00,30);
INSERT INTO emp VALUES (7698,'BLAKE','MANAGER',7839,'1981-05-01',2850.00,NULL,30);
INSERT INTO emp VALUES (7782,'CLARK','MANAGER',7839,'1981-06-09',2450.00,NULL,10);
INSERT INTO emp VALUES (7788,'SCOTT','ANALYST',7566,'1982-12-09',3000.00,NULL,20);
INSERT INTO emp VALUES (7839,'KING','PRESIDENT',NULL,'1981-11-17',5000.00,NULL,10);
INSERT INTO emp VALUES (7844,'TURNER','SALESMAN',7698,'1981-09-08',1500.00,0.00,30);
INSERT INTO emp VALUES (7876,'ADAMS','CLERK',7788,'1983-01-12',1100.00,NULL,20);
INSERT INTO emp VALUES (7900,'JAMES','CLERK',7698,'1981-12-03',950.00,NULL,30);
INSERT INTO emp VALUES (7902,'FORD','ANALYST',7566,'1981-12-03',3000.00,NULL,20);
INSERT INTO emp VALUES (7934,'MILLER','CLERK',7782,'1982-01-23',1300.00,NULL,10);

CREATE TABLE salgrade(grade INT, losal INT, hisal INT);
INSERT INTO salgrade VALUES (1,  700, 1200);
INSERT INTO salgrade VALUES (2, 1201, 1400);
INSERT INTO salgrade VALUES (3, 1401, 2000);
INSERT INTO salgrade VALUES (4, 2001, 3000);
INSERT INTO salgrade VALUES (5, 3001, 9999);


