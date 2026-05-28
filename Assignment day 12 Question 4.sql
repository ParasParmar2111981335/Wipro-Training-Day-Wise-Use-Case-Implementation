CREATE DATABASE coll_db;
USE coll_db;


CREATE TABLE students (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    course VARCHAR(50)
);

INSERT INTO students(id, name, course)
VALUES
(101, 'Paras', 'BCA'),
(102, 'Rahul', 'MCA'),
(103, 'Aman', 'BTech');

SELECT * FROM students;