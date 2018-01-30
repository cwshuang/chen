/*
Navicat MySQL Data Transfer

Source Server         : my
Source Server Version : 50548
Source Host           : localhost:3306
Source Database       : myguanli

Target Server Type    : MYSQL
Target Server Version : 50548
File Encoding         : 65001

Date: 2018-01-17 06:09:41
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tadmin
-- ----------------------------
DROP TABLE IF EXISTS `tadmin`;
CREATE TABLE `tadmin` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(255) NOT NULL,
  `userPw` varchar(255) NOT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tadmin
-- ----------------------------

-- ----------------------------
-- Table structure for tbaoming
-- ----------------------------
DROP TABLE IF EXISTS `tbaoming`;
CREATE TABLE `tbaoming` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `xianluId` int(11) NOT NULL,
  `lianxifangshi` varchar(255) NOT NULL,
  `beizhu` varchar(255) NOT NULL,
  `baomingshi` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbaoming
-- ----------------------------

-- ----------------------------
-- Table structure for tgonggao
-- ----------------------------
DROP TABLE IF EXISTS `tgonggao`;
CREATE TABLE `tgonggao` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `biaoti` varchar(255) NOT NULL,
  `neirong` varchar(255) NOT NULL,
  ` shijian` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tgonggao
-- ----------------------------
INSERT INTO `tgonggao` VALUES ('1', '著名景点', '著名景点', '2018-01-17');

-- ----------------------------
-- Table structure for tjingdian
-- ----------------------------
DROP TABLE IF EXISTS `tjingdian`;
CREATE TABLE `tjingdian` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `dizhi` varchar(255) NOT NULL,
  `menpiao` varchar(255) NOT NULL,
  `jieshao` varchar(255) NOT NULL,
  `fujian` varchar(255) NOT NULL,
  `del` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tjingdian
-- ----------------------------
INSERT INTO `tjingdian` VALUES ('1', '黄山', '安徽黄山市', '200', '云海', '/upload/1388475335150.jpg', 'no');
INSERT INTO `tjingdian` VALUES ('2', '方特', '安徽芜湖', '150', '水上乐园', '/upload/1388475472352.gif', 'yes');

-- ----------------------------
-- Table structure for tliuyan
-- ----------------------------
DROP TABLE IF EXISTS `tliuyan`;
CREATE TABLE `tliuyan` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `neirong` varchar(255) NOT NULL,
  `liuyanshi` date NOT NULL,
  `userId` int(11) NOT NULL,
  `huifu` varchar(255) NOT NULL,
  `huifushi` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tliuyan
-- ----------------------------

-- ----------------------------
-- Table structure for tuser
-- ----------------------------
DROP TABLE IF EXISTS `tuser`;
CREATE TABLE `tuser` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(255) NOT NULL,
  `userPw` varchar(255) NOT NULL,
  `userRealname` varchar(255) NOT NULL,
  `userSex` varchar(255) NOT NULL,
  `userAge` varchar(255) NOT NULL,
  `userAddress` varchar(255) NOT NULL,
  `userTel` varchar(255) NOT NULL,
  `userEmail` varchar(255) NOT NULL,
  `userDel` varchar(255) NOT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tuser
-- ----------------------------

-- ----------------------------
-- Table structure for txianlu
-- ----------------------------
DROP TABLE IF EXISTS `txianlu`;
CREATE TABLE `txianlu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `xianlumincheng` varchar(255) NOT NULL,
  `fatuandidian` varchar(255) NOT NULL,
  `fatuanshiian` date NOT NULL,
  `xianlujiage` varchar(255) NOT NULL,
  `lianxidianhua` varchar(255) NOT NULL,
  `lianxiren` varchar(255) NOT NULL,
  `fabushijian` date NOT NULL,
  `del` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of txianlu
-- ----------------------------
INSERT INTO `txianlu` VALUES ('1', '芜湖方特到黄山', '芜湖', '2018-01-15', '200', '136888888888', '王先生', '2018-01-10', 'yes');
INSERT INTO `txianlu` VALUES ('2', '合肥到南京', '合肥', '2018-01-20', '150', '136888888888', '李先生', '2018-01-16', 'no');
