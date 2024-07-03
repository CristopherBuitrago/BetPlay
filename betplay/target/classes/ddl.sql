-- creation and usage of the database BetPlay
DROP DATABASE IF EXISTS betplay;
CREATE DATABASE betplay;
USE betplay;

-- creation of independent tables
CREATE TABLE card_type (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    color VARCHAR(45) NOT NULL,
    description MEDIUMTEXT NOT NULL
);

CREATE TABLE communication (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(45) NOT NULL,
    content MEDIUMTEXT NOT NULL,
    publicationDate DATE NOT NULL
);

CREATE TABLE injury_severity (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(45) NOT NULL,
    description MEDIUMTEXT NOT NULL
);

CREATE TABLE injury_type (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    type VARCHAR(45) NOT NULL,
    description MEDIUMTEXT NOT NULL
);

CREATE TABLE permission (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    description MEDIUMTEXT NOT NULL
);

CREATE TABLE position (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(45) NOT NULL,
    description TINYTEXT NOT NULL
);

CREATE TABLE role (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(45) NOT NULL
);

CREATE TABLE sponsor_type (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    description MEDIUMTEXT NOT NULL
);

CREATE TABLE stadium (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(49) NOT NULL,
    country VARCHAR(45) NOT NULL,
    city VARCHAR(45) NOT NULL,
    capacity INT NOT NULL
);

CREATE TABLE trainer (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(45) NOT NULL,
    lastName VARCHAR(45) NOT NULL,
    age INT NOT NULL
)

CREATE TABLE activity(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    description MEDIUMTEXT NOT NULL,
    duration TIME NOT NULL
)

-- creation of semi-independent tables

CREATE TABLE team (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(45) NOT NULL,
    city VARCHAR(45) NOT NULL,
    stadium INT NOT NULL,
    trainer INT NOT NULL,

    FOREIGN KEY (stadium) REFERENCES stadium (id),
    FOREIGN KEY (trainer) REFERENCES trainer (id)
);

CREATE TABLE `user` (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    email VARCHAR(45) NOT NULL,
    password VARCHAR(45) NOT NULL,
    role INT NOT NULL,
    
    FOREIGN KEY (role) REFERENCES role(id)
);

CREATE TABLE trainer (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(45) NOT NULL,
    lastName VARCHAR(45) NOT NULL,
    age INT NOT NULL
);

CREATE TABLE sponsor (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    type INT NOT NULL,
    amount DECIMAL(12,2) NOT NULL,
    startDate DATE NOT NULL,
    endDate DATE NOT NULL,
    FOREIGN KEY (type) REFERENCES sponsor_type(id)
);

CREATE TABLE player (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(45) NOT NULL,
    lastName VARCHAR(45) NOT NULL,
    age INT NOT NULL,
    position INT NOT NULL,
    nationality VARCHAR(45) NOT NULL,
    shirtNumber INT NOT NULL,
    FOREIGN KEY (position) REFERENCES position(id)
);

CREATE TABLE game (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    localTeam INT NOT NULL,
    guestTeam INT NOT NULL,
    gameDate DATETIME NOT NULL,
    stadium INT NOT NULL,
    FOREIGN KEY (localTeam) REFERENCES team(id),
    FOREIGN KEY (guestTeam) REFERENCES team(id),
    FOREIGN KEY (stadium) REFERENCES stadium(id)
);

CREATE TABLE role_has_permission (
    role INT NOT NULL,
    permission INT NOT NULL,
    PRIMARY KEY (role, permission),
    FOREIGN KEY (role) REFERENCES role(id),
    FOREIGN KEY (permission) REFERENCES permission(id)
);

CREATE TABLE role_has_communication (
    role_id INT NOT NULL,
    communication_id INT NOT NULL,
    PRIMARY KEY (role_id, communication_id),
    FOREIGN KEY (role_id) REFERENCES role(id),
    FOREIGN KEY (communication_id) REFERENCES communication(id)
);
