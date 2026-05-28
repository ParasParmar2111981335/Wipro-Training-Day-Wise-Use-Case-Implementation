CREATE DATABASE MNC;

USE MNC;

CREATE TABLE employees (
    id INT,
    name VARCHAR(50),
    salary INT
);

INSERT INTO employees VALUES
(1, 'Paras', 30000),
(2, 'Rahul', 25000),
(3, 'Aman', 20000);
SELECT * FROM employees;
SET SQL_SAFE_UPDATES=0;

UPDATE employees
SET salary = 35000
WHERE id = 1;
SET SQL_SAFE_UPDATES=1;
SELECT * FROM employees;