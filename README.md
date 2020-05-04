
**Running the Application**
docker-compose up -- build

** Database init **
CREATE DATABASE juxta_database;
CREATE USER 'user'@'localhost' IDENTIFIED BY 'test';
GRANT ALL ON juxta_database.* TO 'user'@'localhost';