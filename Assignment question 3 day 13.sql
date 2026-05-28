CREATE DATABASE paru;
USE paru;

CREATE TABLE employees (
    id INT,
    name VARCHAR(50),
    department VARCHAR(50)
);

INSERT INTO employees VALUES
(1, 'Paras', 'IT'),
(2, 'Rahul', 'HR'),
(3, 'Aman', 'IT'),
(4, 'Riya', 'Sales'),
(5, 'Karan', 'HR');


SELECT department, COUNT(*) AS total_records
FROM employees
GROUP BY department;