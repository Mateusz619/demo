DROP TABLE IF EXISTS CINEMA;

CREATE TABLE CINEMA(
    id INT AUTO_INCREMENT PRIMARY KEY,
    place VARCHAR(100) NOT NULL,
    ticket_price INT NOT NULL
);