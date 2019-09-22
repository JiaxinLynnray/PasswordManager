-- 查看数据库
show databases;
-- 查看表
show tables;
-- 查看默认字符集
show variables like '%character%';
-- 查看默认校对规则
show collation like 'utf8mb4%';

-- 测试utf8mb4的大小写敏感性及其修改方法
-- 以下是utf8mb4不区分大小写
-- 修改数据库:  
ALTER DATABASE database_name CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci;  
-- 修改表:  
ALTER TABLE table_name CONVERT TO CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;  
-- 修改表字段:  
ALTER TABLE table_name CHANGE column_name column_name VARCHAR(191) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL;  

-- 以下是utf8mb4区分大小写
-- 修改数据库:  
ALTER DATABASE database_name CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin;  
-- 修改表:  
ALTER TABLE table_name CONVERT TO CHARACTER SET utf8mb4 COLLATE utf8mb4_bin;  
-- 修改表字段:  
ALTER TABLE table_name CHANGE column_name column_name VARCHAR(191) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL ; 

ALTER USER 'root'@'localhost' IDENTIFIED BY "123456";