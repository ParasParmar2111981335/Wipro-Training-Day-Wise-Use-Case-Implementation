CREATE DATABASE stud_db;
USE stud_db;

CREATE TABLE students (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    marks INT
);

SELECT * FROM students;