
DROP TABLE IF EXISTS roles CASCADE;
DROP TABLE IF EXISTS users CASCADE;
DROP TABLE IF EXISTS user_role CASCADE;

DROP SEQUENCE IF EXISTS role_id_seq;
DROP SEQUENCE IF EXISTS user_id_seq;

CREATE SEQUENCE role_id_seq;
CREATE SEQUENCE user_id_seq;

CREATE TABLE roles (
  role_id INT NOT NULL DEFAULT NEXTVAL('role_id_seq'),
  role    VARCHAR(255) DEFAULT NULL,
  PRIMARY KEY (role_id)
);

CREATE TABLE users (
  user_id    INT          NOT NULL DEFAULT NEXTVAL('user_id_seq'),
  active     INT                   DEFAULT NULL,
  email      VARCHAR(255) NOT NULL,
  first_name VARCHAR(255) NOT NULL,
  last_name  VARCHAR(255) NOT NULL,
  password   VARCHAR(255) NOT NULL,
  PRIMARY KEY (user_id)
);

CREATE TABLE user_role (
  user_id INT NOT NULL,
  role_id INT NOT NULL,
  PRIMARY KEY (user_id, role_id)
);


INSERT INTO roles VALUES (1, 'ADMIN');
INSERT INTO roles VALUES (2, 'USER');

-- INSERT INTO users VALUES (1, 1, 'admin@gm.com', 'admin', 'mr.', '123123');
-- INSERT INTO users VALUES (2, 1, 'user@gm.com', 'user', 'mr.', '123123');

-- INSERT INTO user_role VALUES (1, 1);
-- INSERT INTO user_role VALUES (2, 2);



SELECT * FROM roles;
SELECT * FROM users;
SELECT * FROM user_role;
