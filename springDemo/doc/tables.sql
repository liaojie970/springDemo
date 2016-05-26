/*角色表*/
CREATE TABLE IF NOT EXISTS `role` (
	`id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	`name` VARCHAR (150),
	`mark` VARCHAR (150),
	`type` VARCHAR (150),
	`description` VARCHAR (750),
	`createTime` DATETIME ,
	`updateTime` DATETIME 
);

/*用户表*/
CREATE TABLE IF NOT EXISTS `user` (
	`id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	`account` VARCHAR (120),
	`password` VARCHAR (96),
	`name` VARCHAR (120),
	`sex` VARCHAR (3),
	`description` VARCHAR (750),
	`createTime` DATETIME ,
	`updateTime` DATETIME ,
	`unit` VARCHAR (765),
	`policeId` VARCHAR (765),
	`idCard` VARCHAR (765),
	`lastLoginIp` VARCHAR (45),
	`lastLoginTime` DATETIME ,
	`officePhone` VARCHAR (45),
	`mobilePhone` VARCHAR (45),
	`mailbox` VARCHAR (300),
	`roleId` INT ,
	CONSTRAINT FK_user_role FOREIGN KEY(roleId) REFERENCES role(id)
	
); 

/*菜单表*/
CREATE TABLE IF NOT EXISTS `resource` (
	`id` INT  NOT NULL AUTO_INCREMENT PRIMARY KEY,
	`name` VARCHAR (150),
	`title` VARCHAR (300),
	`description` VARCHAR (765),
	`icon` VARCHAR (765),
	`type` VARCHAR (150),
	`mark` VARCHAR (150),
	`url` VARCHAR (765),
	`sort` DOUBLE ,
	`tier` DOUBLE ,
	`createTime` DATETIME ,
	`updateTime` DATETIME ,
	`parentId` INT,
	CONSTRAINT FK_parentId FOREIGN KEY(parentId) REFERENCES resource(id)
); 

/*权限菜单表*/
CREATE TABLE IF NOT EXISTS `role_resource` (
	`resourceId` INT,
	`roleId` INT,
	PRIMARY KEY(resourceId,roleId),
	CONSTRAINT FK_resource_role FOREIGN KEY(resourceId) REFERENCES resource(id),
	CONSTRAINT FK_role_resource FOREIGN KEY(roleId) REFERENCES role(id)
);