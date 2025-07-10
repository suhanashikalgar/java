-- create a database classwork_db;
CREATE DATABASE classwork_db;
USE classwork_db;

SOURCE <path to the db file>

SHOW TABLES;

--SELECT
-- 1. select all the data from the emp table
SELECT * FROM emp;

--2.select all the data from the DEPT table
SELECT * FROM dept;

--1.select all the data from the books table
SELECT * FROM books;

--1.select all the data from the salgrade table
SELECT * FROM salgrade;

-- 2. display only the empno,ename and salary of all emps
SELECT empno,ename,sal FROM emp;

-- 3. display empname and commission.
SELECT ename,comm FROM emp;
-- 4. display all the jobs from emp table.
SELECT job FROM emp;

-- 5. find unique jobs in the organization
SELECT DISTINCT job FROM emp;

-- 5. find deptno in the organization
SELECT deptno FROM emp;

-- 5. find unique deptno in the organization
SELECT DISTINCT deptno FROM emp;

-- display deptno and job from the emp table;
SELECT deptno, job FROM emp;

-- display unique jobs in every dept
SELECT DISTINCT deptno, job FROM emp; 


