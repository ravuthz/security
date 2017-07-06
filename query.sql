DROP SEQUENCE IF EXISTS role_seq;
CREATE SEQUENCE role_seq;

DROP TABLE IF EXISTS roles;
CREATE TABLE roles (
  role_id INT NOT NULL DEFAULT NEXTVAL('role_seq'),
  role    VARCHAR(255) DEFAULT NULL,
  PRIMARY KEY (role_id)
);

DROP SEQUENCE IF EXISTS user_seq;
CREATE SEQUENCE user_seq;

DROP TABLE IF EXISTS users;
CREATE TABLE users (
  user_id    INT          NOT NULL DEFAULT NEXTVAL('user_seq'),
  active     INT                   DEFAULT NULL,
  email      VARCHAR(255) NOT NULL,
  first_name VARCHAR(255) NOT NULL,
  last_name  VARCHAR(255) NOT NULL,
  password   VARCHAR(255) NOT NULL,
  PRIMARY KEY (user_id)
);

INSERT INTO roles VALUES (1, 'ADMIN');
INSERT INTO roles VALUES (2, 'USER');

DROP TABLE IF EXISTS user_role;
CREATE TABLE user_role (
  user_id INT NOT NULL,
  role_id INT NOT NULL,
  PRIMARY KEY (user_id, role_id)
);

SELECT * FROM roles;