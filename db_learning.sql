/*
 Navicat MySQL Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80021
 Source Host           : localhost:3306
 Source Schema         : db_test

 Target Server Type    : MySQL
 Target Server Version : 80021
 File Encoding         : 65001

 Date: 20/08/2020 20:27:32
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_money
-- ----------------------------
DROP TABLE IF EXISTS `t_money`;
CREATE TABLE `t_money` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `money` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_money
-- ----------------------------
BEGIN;
INSERT INTO `t_money` VALUES (1, 'libinkai', 1000);
INSERT INTO `t_money` VALUES (2, 'leo', 1000);
INSERT INTO `t_money` VALUES (3, 'liuyida', 1000);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
