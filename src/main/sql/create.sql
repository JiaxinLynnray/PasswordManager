create database if not exists pm default character set utf8mb4 collate utf8mb4_general_ci;
-- 用户表
CREATE TABLE t_user (
  uid      INT         NOT NULL PRIMARY KEY,
  username VARCHAR(20) NOT NULL,
  password VARCHAR(32) NOT NULL,
  email    VARCHAR(255),
  phone    CHAR(15)
);
-- 网站表
CREATE TABLE t_website (
  wid          INT          NOT NULL PRIMARY KEY,
  website_name VARCHAR(50)  NOT NULL,
  website_url  VARCHAR(255) NOT NULL,
  login        VARCHAR(20)  NOT NULL,
  password     VARCHAR(32)  NOT NULL,
  last_update  DATETIME
);
-- 移动端应用程序表
CREATE TABLE t_app (
  aid         INT         NOT NULL  PRIMARY KEY,
  app_name    VARCHAR(50) NOT NULL,
  login       VARCHAR(20) NOT NULL,
  password    VARCHAR(32) NOT NULL,
  login_type  INT         NOT NULL DEFAULT 1,
  last_update DATETIME
);
-- 桌面应用程序表
CREATE TABLE t_desktop (
  did          INT         NOT NULL PRIMARY KEY,
  desktop_name VARCHAR(50) NOT NULL,
  login        VARCHAR(20) NOT NULL,
  password     VARCHAR(32) NOT NULL,
  last_update  DATETIME
);