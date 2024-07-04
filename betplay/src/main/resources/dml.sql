-- Insert data

-- Insert permissions
INSERT INTO permission(description) VALUES
("Team management"),
("Player management"),
("Match scheduling"),
("Recording results"),
("Viewing statistics"),
("News and communications management"),
("Coach management"),
("Coach management"),
("Referee management"),
("Stadium management"),
("Ticket sales"),
("Sponsorship management"),
("Report generation"),
("Incident and sanction management"),
("Match schedule consultation"),
("Media management"),
("Player injury management"),
("Training management"),
("Player performance tracking"),
("Player transfer management"),
("Equipment management"),
("Player call-up management"),
("Awards and recognitions management"),
("User and role management"),
("Sponsors and advertising management"),
("Public relations management");

-- Insert roles
INSERT INTO role(name) VALUES
("League administrator"),
("Technical team"),
("Referee"),
("Fan"),
("Journalist"),
("Team doctor");

-- Insert permission to roles
INSERT INTO role_has_permission(role, permission) VALUES
-- league administrator
(1,1),
(1,2),
(1,3),
(1,4),
(1,6),
(1,7),
(1,8),
(1,9),
(1,11),
(1,12),
(1,13),
(1,15),
(1,19),
(1,20),
(1,22),
(1,23),
(1,24),
(1,25),
-- technical team
(2,2),
(2,5),
(2,7),
(2,12),
(2,14),
(2,16),
(2,17),
(2,18),
(2,19),
(2,20),
(2,21),
-- referee
(3,4),
(3,13),
-- fan
(4,5),
(4,10),
(4,14),
-- journalist
(5,5),
(5,6),
(5,14),
(5,15),
(5,25),
-- team doctor
(6,16);

-- Insert card types
INSERT INTO card_type(color, description) VALUES
("Yellow", "The player had a minor foul due to behavior, it can be either physical or verbal."),
("Red", "The player committed a serious foul due to behavior, it can be either physical or verbal.");

-- Insert injury_severity
INSERT INTO injury_severity (name, description) VALUES
("Minor", "Examples: bruises, etc; The player will recover quickly, with a little care and attention it's enough."),
("Moderate", "Examples: swelling, moderate blows, etc; The player will recover within weeks."),
("Severe", "Examples: tears, fractures, etc; The player will be incapacitated until recovery. It could be months or weeks.");

-- Insert injury_type
INSERT INTO injury_type (type, description) VALUES
("Physical", "The injury was received on the body or a part of it.");

-- Insert position
INSERT INTO position (name, description) VALUES
("Goalkeeper", "Responsible for preventing the ball from entering the goal."),
("Defender", "Tries to stop the opposing team from reaching their goal."),
("Midfielder", "Helps both forwards and defenders, they are strategically positioned for better mobility."),
("Forward", "Responsible for attempting to score goals in the opponent's goal to secure victory.");

-- Insert activity
INSERT INTO activity (title, description, duration) VALUES
("Physical activity", "With physical activity, we ensure to improve the resistance and physical condition of our players to gain an advantage against opposing teams.", '2:00'),
("Strategic activity", "Study of different strategies to apply in matches", '2:00'),
("Psychological activity", "Focuses on studying the movements of the opposing team to gain more advantage", '2:00');
