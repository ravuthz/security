CREATE SEQUENCE role_seq;

CREATE TABLE roles (
  role_id INT NOT NULL DEFAULT NEXTVAL('role_seq'),
  role    VARCHAR(255) DEFAULT NULL,
  PRIMARY KEY (role_id)
);


CREATE SEQUENCE user_seq;

CREATE TABLE users (
  user_id   INT          NOT NULL DEFAULT NEXTVAL('user_seq'),
  active    INT                   DEFAULT NULL,
  email     VARCHAR(255) NOT NULL,
  last_name VARCHAR(255) NOT NULL,
  name      VARCHAR(255) NOT NULL,
  password  VARCHAR(255) NOT NULL,
  PRIMARY KEY (user_id)
);


CREATE TABLE user_role (
  user_id INT NOT NULL,
  role_id INT NOT NULL,
  PRIMARY KEY (user_id, role_id)
);

INSERT INTO roles VALUES (1, 'ADMIN');