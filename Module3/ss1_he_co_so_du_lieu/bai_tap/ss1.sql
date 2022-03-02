CREATE DATABASE IF NOT EXISTS ss1;
USE ss1;

CREATE TABLE class(
id INT,
`name` VARCHAR(50)
);
CREATE TABLE teacher(
id INT,
`name` VARCHAR(50),
age INT,
country VARCHAR(50)
);