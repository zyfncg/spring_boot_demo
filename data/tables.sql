DROP TABLE IF EXISTS user_info;
CREATE TABLE user_info (
  id int PRIMARY KEY,
  name char(255) NOT NULL,
  password char(20) NOT NULL,
  email char(50) NOT NULL ,
  type enum('student', 'teacher') DEFAULT 'student'
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO user_info VALUES (10001,'小米','123456','xiaomi@163.com','student');
INSERT INTO user_info VALUES (10002,'jack','123456','1111111@163.com','student');
INSERT INTO user_info VALUES (10003,'frank','123456','frank@163.com','student');
