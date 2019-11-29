SET MODE PostgreSQL;

CREATE TABLE IF NOT EXISTS departments (
 id int PRIMARY KEY auto_increment,
 departmentName VARCHAR,
 departmentDescription VARCHAR,
 numberOfEmployees VARCHAR
);

CREATE TABLE IF NOT EXISTS news (
 id int PRIMARY KEY auto_increment,
 content VARCHAR,
 description VARCHAR,
 departmentid INTEGER
);

CREATE TABLE IF NOT EXISTS userName (
 id int PRIMARY KEY auto_increment,
 name VARCHAR,
 departmentid INTEGER,
 role VARCHAR
);