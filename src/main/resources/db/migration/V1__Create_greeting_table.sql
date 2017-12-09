CREATE TABLE greeting
(
  id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
  greeting_message VARCHAR(255) DEFAULT 'Hello World' NOT NULL
);
CREATE UNIQUE INDEX greeting_id_uindex ON greeting (id);