CREATE DATABASE organisational_api;
\c organisational_api;

CREATE TABLE IF NOT EXISTS departments (
 id serial PRIMARY KEY ,
 departmentname VARCHAR,
 departmentdescription VARCHAR,
 numberofemployees int
);

CREATE TABLE IF NOT EXISTS news (
 id serial PRIMARY KEY ,
 content VARCHAR,
 description VARCHAR,
 departmentid int
);

CREATE TABLE IF NOT EXISTS userName (
 id serial PRIMARY KEY ,
 name VARCHAR,
 departmentid int,
 role VARCHAR
);