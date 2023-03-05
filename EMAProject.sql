CREATE DATABASE project;

SHOW DATABASES;

USE project;

CREATE TABLE employee
(
	employee_id int primary key not null,
    employee_name varchar(50),
    employee_age int, 
    employee_contact varchar(10),
    employee_gender varchar(10),
    employee_salary double,
    employee_department varchar(50),
    employee_hiredate date
);

SELECT * FROM project.employee;


