create database if not exists pm
  default character set utf8mb4
  collate utf8mb4_general_ci;
-- 用户表
CREATE TABLE t_user (
  uid      BIGINT(20)  NOT NULL
  COMMENT '用户ID',
  username VARCHAR(20) NOT NULL
  COMMENT '用户名',
  password VARCHAR(32) NOT NULL
  COMMENT '密码',
  email    VARCHAR(255) COMMENT '邮箱',
  phone    CHAR(15) COMMENT '电话',
  PRIMARY KEY (uid)
);

-- 网站表
CREATE TABLE t_website (
  wid          BIGINT(20)   NOT NULL
  COMMENT '网站ID',
  website_name VARCHAR(50)  NOT NULL
  COMMENT '网站名称',
  website_url  VARCHAR(255) NOT NULL
  COMMENT '网站地址',
  login        VARCHAR(20)  NOT NULL
  COMMENT '登录账号',
  password     VARCHAR(32)  NOT NULL
  COMMENT '登录密码',
  last_update  DATETIME COMMENT '上次更新时间',
  PRIMARY KEY (wid)
);
-- 移动端应用程序表
CREATE TABLE t_app (
  aid         BIGINT(20)  NOT NULL
  COMMENT 'APP ID',
  app_name    VARCHAR(50) NOT NULL
  COMMENT 'APP名称',
  login       VARCHAR(20) NOT NULL
  COMMENT '登录账号',
  password    VARCHAR(32) NOT NULL
  COMMENT '登录密码',
  login_type  INT         NOT NULL DEFAULT 1
  COMMENT '登录类型',
  last_update DATETIME COMMENT '上次更新时间',
  PRIMARY KEY (aid)
);
-- 桌面应用程序表
CREATE TABLE t_desktop (
  did          BIGINT(20)  NOT NULL
  COMMENT '桌面应用程序ID',
  desktop_name VARCHAR(50) NOT NULL
  COMMENT '桌面应用程序名称',
  login        VARCHAR(20) NOT NULL
  COMMENT '登录账号',
  password     VARCHAR(32) NOT NULL
  COMMENT '登录密码',
  last_update  DATETIME COMMENT '上次更新时间',
  PRIMARY KEY (did)
);