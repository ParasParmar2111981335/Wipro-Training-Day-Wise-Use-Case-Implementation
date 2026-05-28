Create database wiproEmployee;
select database();
use wiproEmployee;

CREATE table employee(
emp_id INT primary Key,
emp_name varchar (80),
department varchar(100),
salary decimal(10,2),
email varchar(200),
joining_date date
);

select * from employee;

INSERT INTO employee(emp_id,emp_name,department,salary,email,joining_date)
values
(102,"Paras","SDET",30000,"parasparmar73@gmail.com",'2026-06-22'),
(103,"sasta","SDET",35000,"sasta@gmail.com",'2026-06-22'),
(104,"Joshi","SDET",40000,"joshi@gmail.com",'2026-06-22'),
(105,"Anurag","SDET",50000,"anurag@gmail.com",'2026-06-22'),
(106,"Om","SDET",60000,"parasparmmar73@gmail.com",'2026-06-22');

/* Update salary */
UPDATE employee 
SET salary =salary+5000
where department='SDET';

/* Delete employee*/
DELETE FROM employee
WHERE emp_id=101;

/* ORDER BY */
SELECT * FROM employee
ORDER BY salary DESC;

/* Limit */
SELECT * FROM employee
ORDER BY salary DESC
LIMIT 2;

/* COUNT */
SELECT COUNT(*) AS total_employees
from employee;

/* average salary */
SELECT AVG(salary) AS average_salary
FROM employee;

/* Highest and lowest */
SELECT MAX(salary) AS highest_salary,
MIN(salary) AS lowest_salary
FROM employee;

/* Display more than one */
SELECT department, COUNT(*) AS total_employees
from employee
group by department
having COUNT(*)>1;

/* if email id are null */
select * from employee
where email IS NULL;

/* fetch whose name with r */
select * from employee
where emp_name like 'R%';

/* Question 3: display top 3 highest paid employee */
select emp_name,salary from employee
where salary>(
select avg(salary)
from employee
)
order by salary desc
limit 3;

/* Question 4: departments having more than 5 employee */
select department,count(*) as total_employees
from employee
group by department 
having count(*) >4;

