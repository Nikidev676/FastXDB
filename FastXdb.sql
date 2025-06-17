select * from buses;

CREATE DATABASE fastx;

USE fastx;

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(60),
    email VARCHAR(40) UNIQUE,
    password VARCHAR(25),
    role ENUM('USER', 'ADMIN', 'OPERATOR')
);

CREATE TABLE buses (
    id INT AUTO_INCREMENT PRIMARY KEY,
    bus_name VARCHAR(60),
    bus_number VARCHAR(20),
    type VARCHAR(50),
    total_seats INT,
    amenities VARCHAR(25)
);

CREATE TABLE routes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    bus_id INT,
    origin VARCHAR(50),
    destination VARCHAR(50),
    departure_time DATETIME,
    arrival_time DATETIME,
    fare DECIMAL(10,2),
    FOREIGN KEY (bus_id) REFERENCES buses(id)
);


CREATE TABLE bus_operators (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    company_name VARCHAR(100),
    FOREIGN KEY (user_id) REFERENCES users(id)
);



CREATE TABLE seats (
    id INT AUTO_INCREMENT PRIMARY KEY,
    route_id INT NOT NULL,
    seat_number VARCHAR(10),
    is_booked BOOLEAN DEFAULT FALSE,
    FOREIGN KEY (route_id) REFERENCES routes(id)
);

CREATE TABLE bookings (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    route_id INT NOT NULL,
    booking_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    total_amount DECIMAL(10,2),
    status ENUM('CONFIRMED', 'CANCELLED') DEFAULT 'CONFIRMED',
    FOREIGN KEY (user_id) REFERENCES users(id),
    FOREIGN KEY (route_id) REFERENCES routes(id)
);


CREATE TABLE booking_seats (
    id INT AUTO_INCREMENT PRIMARY KEY,
    booking_id INT NOT NULL,
    seat_id INT NOT NULL,
    FOREIGN KEY (booking_id) REFERENCES bookings(id),
    FOREIGN KEY (seat_id) REFERENCES seats(id)
);



INSERT INTO users (name, email, password, role) VALUES
('Sharma', 'sharma@example.com', 'password123', 'USER'),
('Ram', 'ramin@example.com', 'adminpass', 'ADMIN'),
('Charu', 'charu@egs.com', 'operator123', 'OPERATOR');


INSERT INTO buses (bus_name, bus_number, type, total_seats, amenities) VALUES
('Chetan Express', 'MH12AB1234', 'SLEEPER_AC', 40, 'Water Bottle,TV,Blanket'),
('City Rider', 'KA01BC5678', 'SEATER_NONAC', 30, 'Charging Point'),
('Night Queen', 'DL03CD4321', 'SLEEPER_NONAC', 36, 'Blanket,Charging Point');

INSERT INTO routes (bus_id, origin, destination, departure_time, arrival_time, fare) VALUES
(1, 'Mumbai', 'Pune', '2025-06-09 07:00:00', '2025-06-09 10:00:00', 500.00),
(2, 'Bangalore', 'Chennai', '2025-06-09 08:00:00', '2025-06-09 13:00:00', 750.00),
(3, 'Delhi', 'Jaipur', '2025-06-09 22:00:00', '2025-06-10 04:00:00', 600.00);


INSERT INTO seats (route_id, seat_number, is_booked) VALUES
(1, 'A1', FALSE), (1, 'A2', FALSE), (1, 'A3', TRUE),
(2, 'B1', FALSE), (2, 'B2', TRUE), (2, 'B3', FALSE),
(3, 'C1', FALSE), (3, 'C2', FALSE), (3, 'C3', TRUE);


