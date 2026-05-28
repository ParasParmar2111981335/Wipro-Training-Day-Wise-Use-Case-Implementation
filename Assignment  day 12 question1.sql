CREATE DATABASE testdb;

USE testdb;

CREATE TABLE employees (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    salary DOUBLE
);

DESC employees;


SELECT * FROM employees;