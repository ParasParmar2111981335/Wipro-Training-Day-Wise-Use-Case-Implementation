CREATE DATABASE login_db;
USE login_db;

CREATE TABLE users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50),
    password VARCHAR(50)
);

INSERT INTO users (username, password) VALUES
('admin', 'admin123'),
('paras', 'paras@123'),
('user1', 'test123');


SELECT * FROM users;


SELECT *
FROM users
WHERE username = 'admin'
AND password = 'admin123';


SELECT COUNT(*)
FROM users
WHERE username = 'admin'
AND password = 'admin123';