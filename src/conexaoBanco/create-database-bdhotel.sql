create database IF NOT EXISTS bdhotel;
use bdhotel;
CREATE TABLE IF NOT EXISTS tblhotel (
hotelid INTEGER AUTO_INCREMENT,
nome VARCHAR(255),
cidade VARCHAR(255),
quartos INTEGER,
valorDiaria DOUBLE,
estrelas INTEGER,
PRIMARY KEY (hotelid)
);