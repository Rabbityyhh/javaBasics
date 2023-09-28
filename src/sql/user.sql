/*
 Navicat Premium Data Transfer

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 80032
 Source Host           : localhost:3306
 Source Schema         : javabasics

 Target Server Type    : MySQL
 Target Server Version : 80032
 File Encoding         : 65001

 Date: 28/09/2023 17:46:54
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `age` int NULL DEFAULT NULL,
  `identity` int NULL DEFAULT NULL COMMENT '0:生产者，1消费者',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1096119641765332346', '曾子异', 22, 1);
INSERT INTO `user` VALUES ('1151179802174246590', '梁岚', 21, 0);
INSERT INTO `user` VALUES ('1291063860601713804', '冯詩涵', 23, 0);
INSERT INTO `user` VALUES ('1924994945087136337', '秦子韬', 26, 1);
INSERT INTO `user` VALUES ('3479184839853250595', '谢宇宁', 23, 1);
INSERT INTO `user` VALUES ('4019890505703303811', '韦致远', 23, 1);
INSERT INTO `user` VALUES ('4803723646335669999', '常杰宏', 20, 0);
INSERT INTO `user` VALUES ('5418783893498787291', '严睿', 28, 1);
INSERT INTO `user` VALUES ('5435124891875040355', '刘睿', 20, 1);
INSERT INTO `user` VALUES ('5999561866877983572', '董云熙', 24, 0);
INSERT INTO `user` VALUES ('6936949334365923559', '金璐', 28, 0);
INSERT INTO `user` VALUES ('8041057480716105080', '冯杰宏', 21, 1);
INSERT INTO `user` VALUES ('8434894187213771603', '韩嘉伦', 25, 0);
INSERT INTO `user` VALUES ('8650874369417134651', '汤杰宏', 22, 1);
INSERT INTO `user` VALUES ('8877441947021223687', '何詩涵', 22, 0);
INSERT INTO `user` VALUES ('9128371746432730798', '邓秀英', 21, 1);
INSERT INTO `user` VALUES ('9195504654212666486', '雷安琪', 22, 0);
INSERT INTO `user` VALUES ('9518504536347782408', '吴安琪', 25, 1);
INSERT INTO `user` VALUES ('9701695022674845110', '贾秀英', 28, 0);
INSERT INTO `user` VALUES ('9744454360854095749', '陈杰宏', 29, 0);

SET FOREIGN_KEY_CHECKS = 1;
