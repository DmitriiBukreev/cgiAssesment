DROP TABLE IF EXISTS EMPLOYEE;

CREATE TABLE EMPLOYEE (
                          id INT AUTO_INCREMENT  PRIMARY KEY,
                          name VARCHAR(250) NOT NULL,
                          lastname VARCHAR(250) NOT NULL,
                          department VARCHAR(250) DEFAULT NULL
);
INSERT INTO EMPLOYEE (id,name,lastname,department)
VALUES ('1', 'Evgeniy', 'Petrosyan','personal'),
       ('2', 'Dmitrii', 'Bukreev','verkauf'),
       ('3', 'Arnold', 'Schwarznegger','verkauf'),
       ('4', 'Hans', 'Zimmer','personal'),
       ('5', 'Vanessa', 'May','entwicklung');