CREATE DATABASE employee_db;
USE employee_db;

CREATE TABLE employees (
    emp_id INT PRIMARY KEY AUTO_INCREMENT,
    emp_name VARCHAR(50),
    department VARCHAR(50),
    created_date DATE
);

INSERT INTO employees (emp_name, department, created_date) VALUES
('Paras', 'IT', CURDATE()),
('Rahul', 'HR', CURDATE() - INTERVAL 3 DAY),
('Aman', 'Sales', CURDATE() - INTERVAL 10 DAY),
('OM', 'IT', CURDATE() - INTERVAL 5 DAY);

SELECT *
FROM employees
WHERE created_date >= CURDATE() - INTERVAL 7 DAY;