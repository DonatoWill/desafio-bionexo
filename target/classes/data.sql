
DROP TABLE IF EXISTS UBS ;

CREATE TABLE UBS AS SELECT * FROM CSVREAD('classpath:ubs.csv');