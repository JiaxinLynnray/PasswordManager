create database if not exists pm
  default character set utf8mb4
  collate utf8mb4_general_ci;
-- 用户表
CREATE TABLE user (
  user_id      BIGINT(20)                       NOT NULL
  COMMENT '用户ID',
  nick_name         VARCHAR(20)                      NOT NULL  DEFAULT ''
  COMMENT '昵称',
  username     VARCHAR(20)                      NOT NULL
  COMMENT '用户名',
  password     VARCHAR(32)                      NOT NULL
  COMMENT '密码',
  email        VARCHAR(255) COMMENT '邮箱'        NOT NULL  DEFAULT '',
  phone        CHAR(15) COMMENT '电话'            NOT NULL  DEFAULT '',
  gmt_create   DATETIME COMMENT '创建时间-格林尼治标准时间' NOT NULL,
  gmt_modified DATETIME COMMENT '更新时间-格林尼治标准时间' NOT NULL,
  PRIMARY KEY (user_id)
);

-- 网站表
CREATE TABLE website (
  website_id   BIGINT(20)                       NOT NULL
  COMMENT '网站ID',
  website_name VARCHAR(50)                      NOT NULL
  COMMENT '网站名称',
  website_url  VARCHAR(255)                     NOT NULL
  COMMENT '网站地址',
  login_name   VARCHAR(20)                      NOT NULL
  COMMENT '登录名',
  password     VARCHAR(32)                      NOT NULL
  COMMENT '登录密码',
  last_update  DATETIME COMMENT '上次更新时间'        NOT NULL,
  gmt_create   DATETIME COMMENT '创建时间-格林尼治标准时间' NOT NULL,
  gmt_modified DATETIME COMMENT '更新时间-格林尼治标准时间' NOT NULL,
  PRIMARY KEY (website_id)
);

-- 移动端应用程序表
CREATE TABLE app (
  app_id       BIGINT(20)                       NOT NULL
  COMMENT 'APP ID',
  app_name     VARCHAR(50)                      NOT NULL
  COMMENT 'APP名称',
  login_name   VARCHAR(20)                      NOT NULL
  COMMENT '登录名',
  password     VARCHAR(32)                      NOT NULL
  COMMENT '登录密码',
  login_type   INT                              NOT NULL DEFAULT 1
  COMMENT '登录类型',
  last_update  DATETIME COMMENT '上次更新时间'        NOT NULL,
  gmt_create   DATETIME COMMENT '创建时间-格林尼治标准时间' NOT NULL,
  gmt_modified DATETIME COMMENT '更新时间-格林尼治标准时间' NOT NULL,
  PRIMARY KEY (app_id)
);

-- 桌面应用程序表
CREATE TABLE desktop (
  desktop_id   BIGINT(20)                       NOT NULL
  COMMENT '桌面应用程序ID',
  desktop_name VARCHAR(50)                      NOT NULL
  COMMENT '桌面应用程序名称',
  login_name   VARCHAR(20)                      NOT NULL
  COMMENT '登录名',
  password     VARCHAR(32)                      NOT NULL
  COMMENT '登录密码',
  last_update  DATETIME COMMENT '上次更新时间'        NOT NULL,
  gmt_create   DATETIME COMMENT '创建时间-格林尼治标准时间' NOT NULL,
  gmt_modified DATETIME COMMENT '更新时间-格林尼治标准时间' NOT NULL,
  PRIMARY KEY (desktop_id)
);