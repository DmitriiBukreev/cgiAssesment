DROP TABLE IF EXISTS EMPLOYEE;

CREATE TABLE EMPLOYEE
(
    id         INT AUTO_INCREMENT PRIMARY KEY,
    name       VARCHAR(250) NOT NULL,
    lastname   VARCHAR(250) NOT NULL,
    birthdate  VARCHAR(250) NOT NULL,
    department VARCHAR(250) DEFAULT NULL
);
INSERT INTO EMPLOYEE (id, name, lastname, birthdate, department)
VALUES ('1', 'Evgeniy', 'Petrosyan', '1964-02-03', 'personal'),
       ('2', 'Dmitrii', 'Bukreev', '1992-07-15', 'entwicklung'),
       ('3', 'Arnold', 'Miller', '1987-09-05', 'verkauf'),
       ('4', 'Hans', 'Zimmer', '1991-03-17', 'personal'),
       ('5', 'Vanessa', 'May', '1995-12-13', 'entwicklung');