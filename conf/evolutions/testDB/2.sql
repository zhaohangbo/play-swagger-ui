# DC schema
 
# --- !Ups


CREATE TABLE DICTIONARY (
    ID integer NOT NULL AUTO_INCREMENT PRIMARY KEY,
    NAME varchar(255) NOT NULL,
    DOMAIN_ID integer NOT NULL
);

# --- !Downs

DROP TABLE DICTIONARY;
