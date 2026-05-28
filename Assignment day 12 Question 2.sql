CREATE DATABASE log_db;

USE log_db;
CREATE TABLE users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50),
    password VARCHAR(50)
);

INSERT INTO users(username, password)
VALUES
('paras', '1234'),
('admin', 'admin123');

SELECT * FROM users;