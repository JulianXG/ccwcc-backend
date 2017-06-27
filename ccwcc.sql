/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : ccwcc

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-04-27 11:06:50
*/

SET FOREIGN_KEY_CHECKS=0;

DROP TABLE IF EXISTS `validate_code`;
CREATE TABLE `validate_code` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `user_id` INT DEFAULT NULL COMMENT '用户ID',
  `code` VARCHAR(40) DEFAULT NULL COMMENT '验证码',
  `request_time` datetime DEFAULT NULL COMMENT '请求时间',
  `expire_time` int(10) DEFAULT '24' COMMENT '过期时间,单位分钟',
  `is_deleted` tinyint(1) DEFAULT '0' COMMENT '删除标签',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
)ENGINE = InnoDB DEFAULT CHARSET = utf8 COMMENT '验证码';

-- ----------------------------
-- Table structure for bird
-- ----------------------------
DROP TABLE IF EXISTS `bird`;
CREATE TABLE `bird` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '鸟类ID',
  `code` varchar(8) DEFAULT NULL COMMENT '鸟类编码',
  `name_zh` varchar(50) DEFAULT NULL COMMENT '中文名称',
  `name_en` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `name_lt` varchar(50) DEFAULT NULL COMMENT '拉丁文名称',
  `protect_class` int(2) DEFAULT NULL COMMENT '受保护等级',
  `nation` varchar(50) DEFAULT NULL COMMENT '国家',
  `order` varchar(10) DEFAULT NULL COMMENT '目',
  `family` varchar(10) DEFAULT NULL COMMENT '科',
  `genus` varchar(10) DEFAULT NULL COMMENT '种',
  `category` varchar(10) DEFAULT NULL COMMENT '分类',
  `one_percent_standard` int(11) DEFAULT NULL COMMENT '1%标准',
  `threatened` varchar(2) DEFAULT NULL COMMENT '受胁',
  `is_water_bird` tinyint(1) DEFAULT NULL COMMENT '是否为水鸟',
  `is_wetland_depend_bird` tinyint(1) DEFAULT NULL COMMENT '是否为湿地依赖鸟类',
  `zh_pinyin` varchar(20) DEFAULT NULL COMMENT '鸟种拼音',
  `is_alive` tinyint(1) DEFAULT NULL COMMENT '是否存活',
  `is_deleted` tinyint(1) DEFAULT '0' COMMENT '是否删除',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `birds_code_uindex` (`code`),
  UNIQUE KEY `birds_name_zh_name_en_name_lt_uindex` (`name_zh`,`name_en`,`name_lt`)
) ENGINE=InnoDB AUTO_INCREMENT=324 DEFAULT CHARSET=utf8 COMMENT='鸟类';

-- ----------------------------
-- Records of bird
-- ----------------------------
INSERT INTO `bird` VALUES ('1', '0064#', '栗树鸭', 'Lesser Whistling Duck', 'Dendrocygna javanica', '0', null, '雁形目', '鸭科', '树鸭属', '雁鸭类', '10000', null, '1', '0', 'lsy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('2', '0065#', '白头硬尾鸭', 'White-headed Duck', 'Oxyura leucocephala', '0', null, '雁形目', '鸭科', '硬尾鸭属', '雁鸭类', '0', 'EN', '1', '0', 'btywy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('3', '0066#', '疣鼻天鹅', 'Mute Swan', 'Cygnus olor', '2', null, '雁形目', '鸭科', '天鹅属', '雁鸭类', '20', null, '1', '0', 'ybte', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('4', '0067#', '大天鹅', 'Whooper Swan', 'Cygnus cygnus', '2', '日', '雁形目', '鸭科', '天鹅属', '雁鸭类', '600', null, '1', '0', 'dte', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('5', '0068#', '小天鹅', 'Tundra Swan', 'Cygnus columbianus', '2', '日', '雁形目', '鸭科', '天鹅属', '雁鸭类', '920', null, '1', '0', 'xte', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('6', '0069#', '鸿雁', 'Swan Goose', 'Anser cygnoides', '0', '日', '雁形目', '鸭科', '雁属', '雁鸭类', '800', 'VU', '1', '0', 'hy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('7', '0070#', '豆雁', 'Bean Goose', 'Anser fabalis', '0', '日', '雁形目', '鸭科', '雁属', '雁鸭类', '800', null, '1', '0', 'dy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('8', '0071#', '白额雁', 'Greater White-fronted Goose', 'Anser albifrons', '2', '日', '雁形目', '鸭科', '雁属', '雁鸭类', '1800', null, '1', '0', 'bey', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('9', '0072#', '小白额雁', 'Lesser White-fronted Goose', 'Anser erythropus', '0', '日', '雁形目', '鸭科', '雁属', '雁鸭类', '200', 'VU', '1', '0', 'xbey', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('10', '0073#', '灰雁', 'Greylag Goose', 'Anser anser', '0', null, '雁形目', '鸭科', '雁属', '雁鸭类', '750', null, '1', '0', 'hy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('11', '0074#', '斑头雁', 'Bar-headed Goose', 'Anser indicus', '0', null, '雁形目', '鸭科', '雁属', '雁鸭类', '560', null, '1', '0', 'bty', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('12', '0075#', '雪雁', 'Snow Goose', 'Chen caerulescens', '0', null, '雁形目', '鸭科', '雁属', '雁鸭类', '1', null, '1', '0', 'xy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('13', '0076#', '加拿大雁', 'Cackling Goose', 'Branta hutchinsii', '0', null, '雁形目', '鸭科', '黑雁属', '雁鸭类', '0', null, '1', '0', 'jndy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('14', '0077#', '黑雁', 'Brent Goose', 'Branta bernicla', '0', '日', '雁形目', '鸭科', '黑雁属', '雁鸭类', '0', null, '1', '0', 'hy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('15', '0078#', '红胸黑雁', 'Red-breasted Goose', 'Branta ruficollis', '2', null, '雁形目', '鸭科', '黑雁属', '雁鸭类', '0', null, '1', '0', 'hxhy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('16', '0079#', '赤麻鸭', 'Ruddy Shelduck', 'Tadorna ferruginea', '0', '日', '雁形目', '鸭科', '麻鸭属', '雁鸭类', '750', null, '1', '0', 'cmy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('17', '0080#', '冠麻鸭', 'Crested Shelduck', 'Tadorna cristata', '0', null, '雁形目', '鸭科', '麻鸭属', '雁鸭类', '0', null, '1', '0', 'gmy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('18', '0081#', '翘鼻麻鸭', 'Common Shelduck', 'Tadorna tadorna', '0', '日', '雁形目', '鸭科', '麻鸭属', '雁鸭类', '1300', null, '1', '0', 'qbmy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('19', '0082#', '瘤鸭', 'Comb Duck', 'Sarkidiornis melanotos', '0', null, '雁形目', '鸭科', '瘤鸭属', '雁鸭类', '0', null, '1', '0', 'ly', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('20', '0083#', '棉凫', 'Cotton Pygmy Goose', 'Nettapus coromandelianus', '0', null, '雁形目', '鸭科', '棉凫属', '雁鸭类', '0', null, '1', '0', 'mf', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('21', '0084#', '鸳鸯', 'Mandarin Duck', 'Aix galericulata', '2', null, '雁形目', '鸭科', '鸳鸯属', '雁鸭类', '200', null, '1', '0', 'yy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('22', '0085#', '赤膀鸭', 'Gadwall', 'Anas strepera', '0', '日', '雁形目', '鸭科', '[河]鸭属', '雁鸭类', '7500', null, '1', '0', 'cby', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('23', '0086#', '罗纹鸭', 'Falcated Duck', 'Anas falcata', '0', '日', '雁形目', '鸭科', '[河]鸭属', '雁鸭类', '350', null, '1', '0', 'lwy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('24', '0087#', '赤颈鸭', 'Eurasian Wigeon', 'Anas penelope', '0', '日', '雁形目', '鸭科', '[河]鸭属', '雁鸭类', '7500', null, '1', '0', 'cjy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('25', '0088#', '葡萄胸鸭', 'American Wigeon', 'Anas americana', '0', null, '雁形目', '鸭科', '[河]鸭属', '雁鸭类', '0', null, '1', '0', 'ptxy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('26', '0089#', '绿头鸭', 'Mallard', 'Anas platyrhynchos', '0', '日', '雁形目', '鸭科', '[河]鸭属', '雁鸭类', '15000', null, '1', '0', 'lty', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('27', '0090#', '斑嘴鸭', 'Spot-billed Duck', 'Anas poecilorhyncha', '0', null, '雁形目', '鸭科', '[河]鸭属', '雁鸭类', '12000', null, '1', '0', 'bzy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('28', '0091#', '棕颈鸭', 'Philippine Duck', 'Anas luzonica', '0', null, '雁形目', '鸭科', '[河]鸭属', '雁鸭类', '0', null, '1', '0', 'zjy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('29', '0092#', '琵嘴鸭', 'Northern Shoveler', 'Anas clypeata', '0', '日澳', '雁形目', '鸭科', '[河]鸭属', '雁鸭类', '5000', null, '1', '0', 'pzy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('30', '0093#', '针尾鸭', 'Northern Pintail', 'Anas acuta', '0', '日', '雁形目', '鸭科', '[河]鸭属', '雁鸭类', '2500', null, '1', '0', 'zwy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('31', '0094#', '白眉鸭', 'Garganey', 'Anas querquedula', '0', '日澳', '雁形目', '鸭科', '[河]鸭属', '雁鸭类', '1500', null, '1', '0', 'bmy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('32', '0095#', '花脸鸭', 'Baikal Teal', 'Anas formosa', '0', '日', '雁形目', '鸭科', '[河]鸭属', '雁鸭类', '5000', 'VU', '1', '0', 'hly', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('33', '0096.1#', '绿翅鸭', 'Eurasian Teal', 'Anas crecca', '0', '日', '雁形目', '鸭科', '[河]鸭属', '雁鸭类', '8000', null, '1', '0', 'lcy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('34', '0096.2#', '美洲绿翅鸭', 'Green-winged Teal', 'Anas carolinensis', '0', null, '雁形目', '鸭科', '[河]鸭属', '雁鸭类', '0', null, '1', '0', 'mzlcy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('35', '0097#', '云石斑鸭', 'Marbled Teal', 'Marmaronetta angustirostris', '0', null, '雁形目', '鸭科', '云石斑鸭属', '雁鸭类', '35', 'VU', '1', '0', 'ysby', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('36', '0098#', '赤嘴潜鸭', 'Red-crested Pochard', 'Netta rufina', '0', null, '雁形目', '鸭科', '狭嘴潜鸭属', '雁鸭类', '0', null, '1', '0', 'czqy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('37', '0099#', '红头潜鸭', 'Common Pochard', 'Aythya ferina', '0', '日', '雁形目', '鸭科', '潜鸭属', '雁鸭类', '3000', null, '1', '0', 'htqy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('38', '0100#', '帆背潜鸭', 'Canvasback', 'Aythya valisineria', '0', null, '雁形目', '鸭科', '潜鸭属', '雁鸭类', '0', null, '1', '0', 'fbqy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('39', '0101#', '白眼潜鸭', 'Ferruginous Pochard', 'Aythya nyroca', '0', null, '雁形目', '鸭科', '潜鸭属', '雁鸭类', '1000', null, '1', '0', 'byqy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('40', '0102#', '青头潜鸭', 'Baer\'s Pochard', 'Aythya baeri', '0', '日', '雁形目', '鸭科', '潜鸭属', '雁鸭类', '150', 'EN', '1', '0', 'qtqy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('41', '0103#', '凤头潜鸭', 'Tufted Duck', 'Aythya fuligula', '0', '日', '雁形目', '鸭科', '潜鸭属', '雁鸭类', '2500', null, '1', '0', 'ftqy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('42', '0104#', '斑背潜鸭', 'Greater Scaup', 'Aythya marila', '0', '日', '雁形目', '鸭科', '潜鸭属', '雁鸭类', '2500', null, '1', '0', 'bbqy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('43', '0105#', '小绒鸭', 'Steller\'s Eider', 'Polysticta stelleri', '0', null, '雁形目', '鸭科', '小绒鸭属', '雁鸭类', '0', null, '1', '0', 'xry', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('44', '0106#', '丑鸭', 'Harlequin Duck', 'Histrionicus histrionicus', '0', '日', '雁形目', '鸭科', '丑鸭属', '雁鸭类', '1000', null, '1', '0', 'cy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('45', '0107#', '长尾鸭', 'Long-tailed Duck', 'Clangula hyemalis', '0', '日', '雁形目', '鸭科', '长尾鸭属', '雁鸭类', '7500', null, '1', '0', 'zwy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('46', '0108#', '黑海番鸭', 'Black Scoter', 'Melanitta nigra', '0', null, '雁形目', '鸭科', '海番鸭属', '雁鸭类', '4000', null, '1', '0', 'hhfy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('47', '0109#', '斑脸海番鸭', 'White-winged Scoter', 'Melanitta fusca', '0', '日', '雁形目', '鸭科', '海番鸭属', '雁鸭类', '8000', null, '1', '0', 'blhfy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('48', '0110#', '鹊鸭', 'Common Goldeneye', 'Bucephala clangula', '0', '日', '雁形目', '鸭科', '鹊鸭属', '雁鸭类', '10000', null, '1', '0', 'qy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('49', '0111#', '白秋沙鸭', 'Smew', 'Mergellus albellus', '0', '日', '雁形目', '鸭科', '白秋沙鸭属', '雁鸭类', '250', null, '1', '0', 'bqsy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('50', '0112#', '红胸秋沙鸭', 'Red-breasted Merganser', 'Mergus serrator', '0', '日', '雁形目', '鸭科', '秋沙鸭属', '雁鸭类', '1000', null, '1', '0', 'hxqsy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('51', '0113#', '中华秋沙鸭', 'Scaly-sided Merganser', 'Mergus squamatus', '1', null, '雁形目', '鸭科', '秋沙鸭属', '雁鸭类', '18', 'EN', '1', '0', 'zhqsy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('52', '0114#', '普通秋沙鸭', 'Common Merganser', 'Mergus merganser', '0', '日', '雁形目', '鸭科', '秋沙鸭属', '雁鸭类', '750', null, '1', '0', 'ptqsy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('53', '0294#', '小鸨', 'Little Bustard', 'Tetrax tetrax', '1', null, '鹤形目', '鸨科', '小鸨属', '鹤鹳类', '0', null, '1', '0', 'xb', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('54', '0295#', '大鸨', 'Great Bustard', 'Otis tarda', '1', null, '鹤形目', '鸨科', '鸨属', '鹤鹳类', '0', 'VU', '1', '0', 'db', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('55', '0296#', '波斑鸨', 'Macqueen\'s Bustard', 'Chlamydotis macqueenii', '1', null, '鹤形目', '鸨科', '波斑鸨属', '鹤鹳类', '0', 'VU', '1', '0', 'bbb', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('56', '0297#', '白鹤', 'Siberian Crane', 'Grus leucogeranus', '1', null, '鹤形目', '鹤科', '鹤属', '鹤鹳类', '30', 'CR', '1', '0', 'bh', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('57', '0298#', '赤颈鹤', 'Sarus Crane', 'Grus antigone', '1', '澳', '鹤形目', '鹤科', '鹤属', '鹤鹳类', '0', 'VU', '1', '0', 'cjh', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('58', '0299#', '白枕鹤', 'White-naped Crane', 'Grus vipio', '2', '日', '鹤形目', '鹤科', '鹤属', '鹤鹳类', '30', 'VU', '1', '0', 'bzh', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('59', '0300#', '沙丘鹤', 'Sandhill Crane', 'Grus canadensis', '2', null, '鹤形目', '鹤科', '鹤属', '鹤鹳类', '0', null, '1', '0', 'sqh', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('60', '0301#', '蓑羽鹤', 'Demoiselle Crane', 'Grus virgo', '2', null, '鹤形目', '鹤科', '鹤属', '鹤鹳类', '850', null, '1', '0', 'syh', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('61', '0302#', '灰鹤', 'Common Crane', 'Grus grus', '2', '日', '鹤形目', '鹤科', '鹤属', '鹤鹳类', '110', null, '1', '0', 'hh', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('62', '0303#', '白头鹤', 'Hooded Crane', 'Grus monacha', '1', '日', '鹤形目', '鹤科', '鹤属', '鹤鹳类', '15', 'VU', '1', '0', 'bth', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('63', '0304#', '黑颈鹤', 'Black-necked Crane', 'Grus nigricollis', '1', null, '鹤形目', '鹤科', '鹤属', '鹤鹳类', '80', 'VU', '1', '0', 'hjh', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('64', '0305#', '丹顶鹤', 'Red-crowned Crane', 'Grus japonensis', '1', null, '鹤形目', '鹤科', '鹤属', '鹤鹳类', '10', 'EN', '1', '0', 'ddh', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('65', '0306#', '花田鸡', 'Swinhoe\'s Yellow Rail', 'Coturnicops exquisitus', '2', '日', '鹤形目', '秧鸡科', '花田鸡属', '秧鸡类', '100', 'VU', '1', '0', 'htj', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('66', '0307#', '红腿斑秧鸡', 'Red-legged Crake', 'Rallina fasciata', '0', '澳', '鹤形目', '秧鸡科', '斑秧鸡属', '秧鸡类', '0', null, '1', '0', 'htbyj', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('67', '0308#', '白喉斑秧鸡', 'Slaty-legged Crake', 'Rallina eurizonoides', '0', null, '鹤形目', '秧鸡科', '斑秧鸡属', '秧鸡类', '0', null, '1', '0', 'bhbyj', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('68', '0309#', '蓝胸秧鸡', 'Slaty-breasted Rail', 'Gallirallus striatus', '0', null, '鹤形目', '秧鸡科', '蓝胸秧鸡属', '秧鸡类', '0', null, '1', '0', 'lxyj', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('69', '0310#', '普通秧鸡', 'Water Rail', 'Rallus aquaticus', '0', '日', '鹤形目', '秧鸡科', '秧鸡属', '秧鸡类', '0', null, '1', '0', 'ptyj', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('70', '0311#', '长脚秧鸡', 'Corn Crake', 'Crex crex', '2', '澳', '鹤形目', '秧鸡科', '长脚秧鸡属', '秧鸡类', '0', null, '1', '0', 'zjyj', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('71', '0312#', '红脚苦恶鸟', 'Brown Crake', 'Amaurornis akool', '0', null, '鹤形目', '秧鸡科', '苦恶鸟属', '秧鸡类', '0', null, '1', '0', 'hjken', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('72', '0313#', '白胸苦恶鸟', 'White-breasted Waterhen', 'Amaurornis phoenicurus', '0', null, '鹤形目', '秧鸡科', '苦恶鸟属', '秧鸡类', '0', null, '1', '0', 'bxken', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('73', '0314#', '棕背田鸡', 'Black-tailed Crake', 'Porzana bicolor', '2', null, '鹤形目', '秧鸡科', '田鸡属', '秧鸡类', '0', null, '1', '0', 'zbtj', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('74', '0315#', '姬田鸡', 'Little Crake', 'Porzana parva', '2', null, '鹤形目', '秧鸡科', '田鸡属', '秧鸡类', '0', null, '1', '0', 'jtj', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('75', '0316#', '小田鸡', 'Baillon\'s Crake', 'Porzana pusilla', '0', '日', '鹤形目', '秧鸡科', '田鸡属', '秧鸡类', '0', null, '1', '0', 'xtj', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('76', '0317#', '斑胸田鸡', 'Spotted Crake', 'Porzana porzana', '0', null, '鹤形目', '秧鸡科', '田鸡属', '秧鸡类', '0', null, '1', '0', 'bxtj', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('77', '0318#', '红胸田鸡', 'Ruddy-breasted Crake', 'Porzana fusca', '0', '日', '鹤形目', '秧鸡科', '田鸡属', '秧鸡类', '0', null, '1', '0', 'hxtj', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('78', '0319#', '斑胁田鸡', 'Band-bellied Crake', 'Porzana paykullii', '0', null, '鹤形目', '秧鸡科', '田鸡属', '秧鸡类', '0', null, '1', '0', 'bxtj', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('79', '0320#', '白眉秧鸡', 'White-browed Crake', 'Porzana cinerea', '0', null, '鹤形目', '秧鸡科', '田鸡属', '秧鸡类', '0', null, '1', '0', 'bmyj', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('80', '0321#', '董鸡', 'Watercock', 'Gallicrex cinerea', '0', '日', '鹤形目', '秧鸡科', '董鸡属', '秧鸡类', '0', null, '1', '0', 'dj', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('81', '0322#', '紫水鸡', 'Purple Swamphen', 'Porphyrio porphyrio', '0', null, '鹤形目', '秧鸡科', '紫水鸡属', '秧鸡类', '0', null, '1', '0', 'zsj', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('82', '0323#', '黑水鸡', 'Common Moorhen', 'Gallinula chloropus', '0', '日', '鹤形目', '秧鸡科', '黑水鸡属', '秧鸡类', '0', null, '1', '0', 'hsj', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('83', '0324#', '骨顶鸡', 'Common Coot', 'Fulica atra', '0', null, '鹤形目', '秧鸡科', '骨顶属', '秧鸡类', '0', null, '1', '0', 'gdj', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('84', '0328#', '丘鹬', 'Eurasian Woodcock', 'Scolopax rusticola', '0', '日', '鹳形目', '丘鹬科', '丘鹬属', '鸻鹬类', '0', null, '1', '0', 'qy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('85', '0329#', '孤沙锥', 'Solitary Snipe', 'Gallinago solitaria', '0', '日', '鹳形目', '丘鹬科', '沙锥属', '鸻鹬类', '100', null, '1', '0', 'gsz', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('86', '0330#', '澳南沙锥', 'Latham\'s Snipe', 'Gallinago hardwickii', '0', '澳', '鹳形目', '丘鹬科', '沙锥属', '鸻鹬类', '1000', null, '1', '0', 'ansz', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('87', '0331#', '林沙锥', 'Wood Snipe', 'Gallinago nemoricola', '0', null, '鹳形目', '丘鹬科', '沙锥属', '鸻鹬类', '0', 'VU', '1', '0', 'lsz', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('88', '0332#', '针尾沙锥', 'Pintail Snipe', 'Gallinago stenura', '0', '澳', '鹳形目', '丘鹬科', '沙锥属', '鸻鹬类', '0', null, '1', '0', 'zwsz', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('89', '0333#', '大沙锥', 'Swinhoe\'s Snipe', 'Gallinago megala', '0', '日澳', '鹳形目', '丘鹬科', '沙锥属', '鸻鹬类', '1000', null, '1', '0', 'dsz', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('90', '0334#', '扇尾沙锥', 'Common Snipe', 'Gallinago gallinago', '0', '日', '鹳形目', '丘鹬科', '沙锥属', '鸻鹬类', '10000', null, '1', '0', 'swsz', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('91', '0335#', '姬鹬', 'Jack Snipe', 'Lymnocryptes minimus', '0', null, '鹳形目', '丘鹬科', '姬鹬属', '鸻鹬类', '100', null, '1', '0', 'jy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('92', '0336#', '黑尾塍鹬', 'Black-tailed Godwit', 'Limosa limosa', '0', '日澳', '鹳形目', '丘鹬科', '塍鹬属', '鸻鹬类', '1600', null, '1', '0', 'hwcy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('93', '0337#', '斑尾塍鹬', 'Bar-tailed Godwit', 'Limosa lapponica', '0', '日澳', '鹳形目', '丘鹬科', '塍鹬属', '鸻鹬类', '1700', null, '1', '0', 'bwcy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('94', '0338#', '小杓鹬', 'Little curlew', 'Numenius minutus', '2', '澳', '鹳形目', '丘鹬科', '杓鹬属', '鸻鹬类', '0', null, '1', '0', 'xsy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('95', '0339#', '中杓鹬', 'Whimbrel', 'Numenius phaeopus', '0', '日澳', '鹳形目', '丘鹬科', '杓鹬属', '鸻鹬类', '550', null, '1', '0', 'zsy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('96', '0340#', '白腰杓鹬', 'Eurasian Curlew', 'Numenius arquata', '0', '日澳', '鹳形目', '丘鹬科', '杓鹬属', '鸻鹬类', '350', null, '1', '0', 'bysy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('97', '0341#', '大杓鹬', 'Eastern Curlew', 'Numenius madagascariensis', '0', '日澳', '鹳形目', '丘鹬科', '杓鹬属', '鸻鹬类', '380', 'VU', '1', '0', 'dsy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('98', '0342#', '鹤鹬', 'Spotted Redshank', 'Tringa erythropus', '0', '日', '鹳形目', '丘鹬科', '鹬属', '鸻鹬类', '1000', null, '1', '0', 'hy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('99', '0343#', '红脚鹬', 'Common Redshank', 'Tringa totanus', '0', '日澳', '鹳形目', '丘鹬科', '鹬属', '鸻鹬类', '1000', null, '1', '0', 'hjy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('100', '0344#', '泽鹬', 'Marsh Sandpiper', 'Tringa stagnatilis', '0', '日澳', '鹳形目', '丘鹬科', '鹬属', '鸻鹬类', '10000', null, '1', '0', 'zy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('101', '0345#', '青脚鹬', 'Common Greenshank', 'Tringa nebularia', '0', '日澳', '鹳形目', '丘鹬科', '鹬属', '鸻鹬类', '1000', null, '1', '0', 'qjy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('102', '0346#', '小青脚鹬', 'Nordmann\'s Greenshank', 'Tringa guttifer', '2', '日', '鹳形目', '丘鹬科', '鹬属', '鸻鹬类', '0', 'EN', '1', '0', 'xqjy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('103', '0347#', '小黄脚鹬', 'Lesser Yellowlegs', 'Tringa flavipes', '0', null, '鹳形目', '丘鹬科', '鹬属', '鸻鹬类', '0', null, '1', '0', 'xhjy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('104', '0348#', '白腰草鹬', 'Green Sandpiper', 'Tringa ochropus', '0', '日', '鹳形目', '丘鹬科', '鹬属', '鸻鹬类', '1000', null, '1', '0', 'bycy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('105', '0349#', '林鹬', 'Wood Sandpiper', 'Tringa glareola', '0', '日澳', '鹳形目', '丘鹬科', '鹬属', '鸻鹬类', '1000', null, '1', '0', 'ly', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('106', '0350#', '翘嘴鹬', 'Terek Sandpiper', 'Xenus cinereus', '0', '日澳', '鹳形目', '丘鹬科', '翘嘴鹬属', '鸻鹬类', '500', null, '1', '0', 'qzy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('107', '0351#', '矶鹬', 'Common Sandpiper', 'Actitis hypoleucos', '0', '日澳', '鹳形目', '丘鹬科', '鹬属', '鸻鹬类', '500', null, '1', '0', 'jy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('108', '0352#', '灰尾漂鹬', 'Grey-tailed Tattler', 'Heteroscelus brevipes', '0', '日', '鹳形目', '丘鹬科', '漂鹬属', '鸻鹬类', '0', null, '1', '0', 'hwpy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('109', '0353#', '漂鹬', 'Wandering Tattler', 'Heteroscelus incanus', '0', '澳', '鹳形目', '丘鹬科', '漂鹬属', '鸻鹬类', '0', null, '1', '0', 'py', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('110', '0354#', '翻石鹬', 'Ruddy Turnstone', 'Arenaria interpres', '0', '日澳', '鹳形目', '丘鹬科', '翻石鹬属', '鸻鹬类', '1000', null, '1', '0', 'fsy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('111', '0355#', '长嘴鹬', 'Long-billed Dowitcher', 'Limnodromus scolopaceus', '0', null, '鹳形目', '丘鹬科', '半蹼鹬属', '鸻鹬类', '0', null, '1', '0', 'zzy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('112', '0356#', '半蹼鹬', 'Asian Dowitcher', 'Limnodromus semipalmatus', '0', '澳', '鹳形目', '丘鹬科', '半蹼鹬属', '鸻鹬类', '230', null, '1', '0', 'bpy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('113', '0357#', '大滨鹬', 'Great Knot', 'Calidris tenuirostris', '0', '日澳', '鹳形目', '丘鹬科', '滨鹬属', '鸻鹬类', '3800', 'VU', '1', '0', 'dby', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('114', '0358#', '红腹滨鹬', 'Red Knot', 'Calidris canutus', '0', '日澳', '鹳形目', '丘鹬科', '滨鹬属', '鸻鹬类', '0', null, '1', '0', 'hfby', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('115', '0359#', '三趾滨鹬', 'Sanderling', 'Calidris alba', '0', '日澳', '鹳形目', '丘鹬科', '滨鹬属', '鸻鹬类', '220', null, '1', '0', 'szby', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('116', '0360#', '西方滨鹬', 'Western Sandpiper', 'Calidris mauri', '0', null, '鹳形目', '丘鹬科', '滨鹬属', '鸻鹬类', '0', null, '1', '0', 'xfby', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('117', '0361#', '勺嘴鹬', 'Spoon-billed Sandpiper', 'Eurynorhynchus pygmeus', '0', '日', '鹳形目', '丘鹬科', '勺嘴鹬属', '鸻鹬类', '0', 'CR', '1', '0', 'szy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('118', '0362#', '小滨鹬', 'Little Stint', 'Calidris minuta', '0', null, '鹳形目', '丘鹬科', '滨鹬属', '鸻鹬类', '0', null, '1', '0', 'xby', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('119', '0363#', '红颈滨鹬', 'Red-necked Stint', 'Calidris ruficollis', '0', '日澳', '鹳形目', '丘鹬科', '滨鹬属', '鸻鹬类', '3200', null, '1', '0', 'hjby', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('120', '0364#', '青脚滨鹬', 'Temminck\'s Stint', 'Calidris temminckii', '0', '日', '鹳形目', '丘鹬科', '滨鹬属', '鸻鹬类', '1000', null, '1', '0', 'qjby', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('121', '0365#', '长趾滨鹬', 'Long-toed Stint', 'Calidris subminuta', '0', '日澳', '鹳形目', '丘鹬科', '滨鹬属', '鸻鹬类', '250', null, '1', '0', 'zzby', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('122', '0366#', '姬滨鹬', 'Least Sandpiper', 'Calidris minutilla', '0', null, '鹳形目', '丘鹬科', '滨鹬属', '鸻鹬类', '0', null, '1', '0', 'jby', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('123', '0366.a#', '白腰滨鹬', 'White-rumped Sandpiper', 'Calidris fuscicollis', '0', null, '鹳形目', '丘鹬科', '滨鹬属', '鸻鹬类', '0', null, '1', '0', 'byby', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('124', '0367#', '黑腰滨鹬', 'Baird\'s Sandpiper', 'Calidris bairdii', '0', null, '鹳形目', '丘鹬科', '滨鹬属', '鸻鹬类', '0', null, '1', '0', 'hyby', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('125', '0368#', '斑胸滨鹬', 'Pectoral Sandpiper', 'Calidris melanotos', '0', null, '鹳形目', '丘鹬科', '滨鹬属', '鸻鹬类', '0', null, '1', '0', 'bxby', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('126', '0369#', '尖尾滨鹬', 'Sharp-tailed Sandpiper', 'Calidris acuminata', '0', '日澳', '鹳形目', '丘鹬科', '滨鹬属', '鸻鹬类', '1600', null, '1', '0', 'jwby', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('127', '0370#', '岩滨鹬', 'Rock Sandpiper', 'Calidris ptilocnemis', '0', null, '鹳形目', '丘鹬科', '滨鹬属', '鸻鹬类', '0', null, '1', '0', 'yby', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('128', '0371#', '黑腹滨鹬', 'Dunlin', 'Calidris alpina', '0', '日澳', '鹳形目', '丘鹬科', '滨鹬属', '鸻鹬类', '10000', null, '1', '0', 'hfby', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('129', '0372#', '弯嘴滨鹬', 'Curlew Sandpiper', 'Calidris ferruginea', '0', '日澳', '鹳形目', '丘鹬科', '滨鹬属', '鸻鹬类', '1800', null, '1', '0', 'wzby', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('130', '0373#', '高跷鹬', 'Stilt Sandpiper', 'Calidris himantopus', '0', null, '鹳形目', '丘鹬科', '高跷鹬属', '鸻鹬类', '0', null, '1', '0', 'gqy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('131', '0374#', '饰胸鹬', 'Buff-breasted Sandpiper', 'Tryngites subruficollis', '0', null, '鹳形目', '丘鹬科', '饰胸鹬属', '鸻鹬类', '0', null, '1', '0', 'sxy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('132', '0375#', '阔嘴鹬', 'Broad-billed Sandpiper', 'Limicola falcinellus', '0', '日澳', '鹳形目', '丘鹬科', '阔嘴鹬属', '鸻鹬类', '1000', null, '1', '0', 'kzy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('133', '0376#', '流苏鹬', 'Ruff', 'Philomachus pugnax', '0', '日澳', '鹳形目', '丘鹬科', '流苏鹬属', '鸻鹬类', '0', null, '1', '0', 'lsy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('134', '0377#', '红颈瓣蹼鹬', 'Red-necked Phalarope', 'Phalaropus lobatus', '0', '日澳', '鹳形目', '丘鹬科', '瓣蹼鹬属', '鸻鹬类', '0', null, '1', '0', 'hjbpy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('135', '0378#', '灰瓣蹼鹬', 'Red Phalarope', 'Phalaropus fulicarius', '0', '日澳', '鹳形目', '丘鹬科', '瓣蹼鹬属', '鸻鹬类', '0', null, '1', '0', 'hbpy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('136', '0379#', '彩鹬', 'Greater Painted-snipe', 'Rostratula benghalensis', '0', '日澳', '鹳形目', '彩鹬科', '彩鹬属', '鸻鹬类', '250', null, '1', '0', 'cy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('137', '0380#', '水雉', 'Pheasant-tailed Jacana', 'Hydrophasianus chirurgus', '0', '澳', '鹳形目', '雉鸻科', '水雉属', '鸻鹬类', '1250', null, '1', '0', 'sz', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('138', '0381#', '铜翅水雉', 'Bronze-winged Jacana', 'Metopidius indicus', '2', null, '鹳形目', '雉鸻科', '铜翅水雉属', '鸻鹬类', '750', null, '1', '0', 'tcsz', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('139', '0382#', '欧石鸻', 'Eurasian Thick-knee', 'Burhinus oedicnemus', '0', null, '鹳形目', '石鸻科', '石鸻属', '鸻鹬类', '0', null, '1', '0', 'osh', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('140', '0383#', '大石鸻', 'Great Thick-knee', 'Esacus recurvirostris', '0', null, '鹳形目', '石鸻科', '大石鸻属', '鸻鹬类', '250', null, '1', '0', 'dsh', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('141', '0384#', '蛎鹬', 'Eurasian Oystercatcher', 'Haematopus ostralegus', '0', '日', '鹳形目', '鸻科', '蛎鹬属', '鸻鹬类', '100', null, '1', '0', 'ly', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('142', '0385#', '鹮嘴鹬', 'Ibisbill', 'Ibidorhyncha struthersii', '0', null, '鹳形目', '鸻科', '鹮嘴鹬属', '鸻鹬类', '0', null, '1', '0', 'hzy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('143', '0386#', '黑翅长脚鹬', 'Black-winged Stilt', 'Himantopus himantopus', '0', '日', '鹳形目', '鸻科', '长脚鹬属', '鸻鹬类', '1000', null, '1', '0', 'hczjy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('144', '0387#', '反嘴鹬', 'Pied Avocet', 'Recurvirostra avosetta', '0', '日', '鹳形目', '鸻科', '反嘴鹬属', '鸻鹬类', '1000', null, '1', '0', 'fzy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('145', '0388#', '金斑鸻', 'Pacific Golden Plover', 'Pluvialis fulva', '0', null, '鹳形目', '鸻科', '斑鸻属', '鸻鹬类', '1000', null, '1', '0', 'jbh', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('146', '0388.a#', '欧金斑鸻', 'European Golden Plover', 'Pluvialis apricaria', '0', null, '鹳形目', '鸻科', '斑鸻属', '鸻鹬类', '0', null, '1', '0', 'ojbh', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('147', '0389#', '灰斑鸻', 'Grey Plover', 'Pluvialis squatarola', '0', '日澳', '鹳形目', '鸻科', '斑鸻属', '鸻鹬类', '1300', null, '1', '0', 'hbh', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('148', '0390#', '剑鸻', 'Common Ringed Plover', 'Charadrius hiaticula', '0', '澳', '鹳形目', '鸻科', '鸻属', '鸻鹬类', '0', null, '1', '0', 'jh', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('149', '0391#', '长嘴剑鸻', 'Long-billed Plover', 'Charadrius placidus', '0', null, '鹳形目', '鸻科', '鸻属', '鸻鹬类', '250', null, '1', '0', 'zzjh', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('150', '0392#', '金眶鸻', 'Little Ringed Plover', 'Charadrius dubius', '0', '澳', '鹳形目', '鸻科', '鸻属', '鸻鹬类', '250', null, '1', '0', 'jkh', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('151', '0393#', '环颈鸻', 'Kentish Plover', 'Charadrius alexandrinus', '0', null, '鹳形目', '鸻科', '鸻属', '鸻鹬类', '1000', null, '1', '0', 'hjh', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('152', '0394#', '马来鸻', 'Malaysian Plover', 'Charadrius peronii', '0', null, '鹳形目', '鸻科', '鸻属', '鸻鹬类', '0', null, '1', '0', 'mlh', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('153', '0395#', '蒙古沙鸻', 'Lesser Sand Plover', 'Charadrius mongolus', '0', '日澳', '鹳形目', '鸻科', '鸻属', '鸻鹬类', '200', null, '1', '0', 'mgsh', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('154', '0396#', '铁嘴沙鸻', 'Greater Sand Plover', 'Charadrius leschenaultii', '0', '日澳', '鹳形目', '鸻科', '鸻属', '鸻鹬类', '1000', null, '1', '0', 'tzsh', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('155', '0397#', '红胸鸻', 'Caspian Plover', 'Charadrius asiaticus', '0', '澳', '鹳形目', '鸻科', '鸻属', '鸻鹬类', '0', null, '1', '0', 'hxh', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('156', '0398#', '东方鸻', 'Oriental Plover', 'Charadrius veredus', '0', null, '鹳形目', '鸻科', '鸻属', '鸻鹬类', '700', null, '1', '0', 'dfh', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('157', '0399#', '小嘴鸻', 'Eurasian Dotterel', 'Charadrius morinellus', '0', null, '鹳形目', '鸻科', '鸻属', '鸻鹬类', '0', null, '1', '0', 'xzh', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('158', '0400#', '凤头麦鸡', 'Northern Lapwing', 'Vanellus vanellus', '0', '日', '鹳形目', '鸻科', '麦鸡属', '鸻鹬类', '10000', null, '1', '0', 'ftmj', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('159', '0401#', '距翅麦鸡', 'River Lapwing', 'Vanellus duvaucelii', '0', null, '鹳形目', '鸻科', '麦鸡属', '鸻鹬类', '250', null, '1', '0', 'jcmj', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('160', '0402#', '灰头麦鸡', 'Grey-headed Lapwing', 'Vanellus cinereus', '0', null, '鹳形目', '鸻科', '麦鸡属', '鸻鹬类', '1000', null, '1', '0', 'htmj', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('161', '0403#', '肉垂麦鸡', 'Red-wattled Lapwing', 'Vanellus indicus', '0', null, '鹳形目', '鸻科', '麦鸡属', '鸻鹬类', '0', null, '1', '0', 'rcmj', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('162', '0403.a#', '黄颊麦鸡', 'Sociable Lapwing', 'Vanellus gregarius', '0', null, '鹳形目', '鸻科', '麦鸡属', '鸻鹬类', '0', null, '1', '0', 'hjmj', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('163', '0404#', '领燕鸻', 'Collared Pratincole', 'Glareola pratincola', '0', null, '鹳形目', '燕鸻科', '燕鸻属', '鸻鹬类', '0', null, '1', '0', 'lyh', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('164', '0405#', '普通燕鸻', 'Oriental Pratincole', 'Glareola maldivarum', '0', '日澳', '鹳形目', '燕鸻科', '燕鸻属', '鸻鹬类', '20000', null, '1', '0', 'ptyh', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('165', '0406#', '灰燕鸻', 'Small Pratincole', 'Glareola lactea', '2', null, '鹳形目', '燕鸻科', '燕鸻属', '鸻鹬类', '750', null, '1', '0', 'hyh', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('166', '0407#', '大贼鸥', 'Brown Skua', 'Stercorarius skua', '0', null, '鹳形目', '鸥科', '大贼鸥属', '鸥类', '0', null, '1', '0', 'dzo', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('167', '0408#', '麦氏贼鸥', 'South polar Skua', 'Stercorarius maccormicki', '0', null, '鹳形目', '鸥科', '大贼鸥属', '鸥类', '0', null, '1', '0', 'mszo', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('168', '0409#', '中贼鸥', 'Pomarine Jaeger', 'Stercorarius pomarinus', '0', '日澳', '鹳形目', '鸥科', '贼鸥属', '鸥类', '0', null, '1', '0', 'zzo', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('169', '0410#', '短尾贼鸥', 'Parasitic Jaeger', 'Stercorarius parasiticus', '0', null, '鹳形目', '鸥科', '贼鸥属', '鸥类', '0', null, '1', '0', 'dwzo', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('170', '0411#', '长尾贼鸥', 'Long-tailed Jaeger', 'Stercorarius longicaudus', '0', null, '鹳形目', '鸥科', '贼鸥属', '鸥类', '0', null, '1', '0', 'zwzo', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('171', '0412#', '剪嘴鸥', 'Indian Skimmer', 'Rynchops albicollis', '0', null, '鹳形目', '鸥科', '剪嘴鸥属', '鸥类', '80', 'VU', '1', '0', 'jzo', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('172', '0413#', '黑尾鸥', 'Black-tailed Gull', 'Larus crassirostris', '0', null, '鹳形目', '鸥科', '鸥属', '鸥类', '10500', null, '1', '0', 'hwo', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('173', '0414#', '海鸥', 'Mew Gull', 'Larus canus', '0', '日', '鹳形目', '鸥科', '鸥属', '鸥类', '1000', null, '1', '0', 'ho', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('174', '0415#', '灰翅鸥', 'Glaucous-winged Gull', 'Larus glaucescens', '0', null, '鹳形目', '鸥科', '鸥属', '鸥类', '5700', null, '1', '0', 'hco', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('175', '0416#', '北极鸥', 'Glaucous Gull', 'Larus hyperboreus', '0', null, '鹳形目', '鸥科', '鸥属', '鸥类', '0', null, '1', '0', 'bjo', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('176', '0417#', '灰背鸥', 'Slaty-backed Gull', 'Larus schistisagus', '0', '日', '鹳形目', '鸥科', '鸥属', '鸥类', '0', null, '1', '0', 'hbo', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('177', '0418#', '银鸥', 'Herring Gull', 'Larus argentatus', '0', '日', '鹳形目', '鸥科', '鸥属', '鸥类', '620', null, '1', '0', 'yo', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('178', '0419#', '乌灰银鸥', 'Heuglin\'s Gull', 'Larus heuglini', '0', null, '鹳形目', '鸥科', '鸥属', '鸥类', '0', null, '1', '0', 'whyo', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('179', '0420#', '西伯利亚银鸥', 'Vega Gull', 'Larus vegae', '0', null, '鹳形目', '鸥科', '鸥属', '鸥类', '0', null, '1', '0', 'xblyyo', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('180', '0421#', '蒙古银鸥', 'Mongolian Gull', 'Larus mongolicus', '0', null, '鹳形目', '鸥科', '鸥属', '鸥类', '0', null, '1', '0', 'mgyo', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('181', '0421.1#', '黄脚银鸥', 'Yellow-legged Gull', 'Larus cachinnans', '0', null, '鹳形目', '鸥科', '鸥属', '鸥类', '0', null, '1', '0', 'hjyo', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('182', '0422#', '渔鸥', 'Pallas\'s Gull', 'Larus ichthyaetus', '0', null, '鹳形目', '鸥科', '鸥属', '鸥类', '0', null, '1', '0', 'yo', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('183', '0423#', '棕头鸥', 'Brown-headed Gull', 'Larus brunnicephalus', '0', null, '鹳形目', '鸥科', '鸥属', '鸥类', '1500', null, '1', '0', 'zto', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('184', '0424#', '红嘴鸥', 'Common Black-headed Gull', 'Larus ridibundus', '0', '日', '鹳形目', '鸥科', '鸥属', '鸥类', '0', null, '1', '0', 'hzo', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('185', '0425#', '细嘴鸥', 'Slender-billed Gull', 'Larus genei', '0', null, '鹳形目', '鸥科', '鸥属', '鸥类', '0', null, '1', '0', 'xzo', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('186', '0426#', '黑嘴鸥', 'Saunders\'s Gull', 'Larus saundersi', '0', null, '鹳形目', '鸥科', '鸥属', '鸥类', '85', 'VU', '1', '0', 'hzo', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('187', '0427#', '遗鸥', 'Relict Gull', 'Larus relictus', '1', null, '鹳形目', '鸥科', '鸥属', '鸥类', '120', 'VU', '1', '0', 'yo', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('188', '0428#', '小鸥', 'Little Gull', 'Larus minutus', '2', null, '鹳形目', '鸥科', '鸥属', '鸥类', '0', null, '1', '0', 'xo', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('189', '0428.a#', '弗氏鸥', 'Franklin\'s Gull', 'Larus pipixca', '0', null, '鹳形目', '鸥科', '鸥属', '鸥类', '0', null, '1', '0', 'fso', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('190', '0429#', '楔尾鸥', 'Ross\'s Gull', 'Rhodostethia rosea', '0', null, '鹳形目', '鸥科', '楔尾鸥属', '鸥类', '0', null, '1', '0', 'xwo', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('191', '0430#', '叉尾鸥', 'Sabine\'s Gull', 'Xema sabini', '0', null, '鹳形目', '鸥科', '叉尾鸥属', '鸥类', '0', null, '1', '0', 'cwo', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('192', '0431#', '三趾鸥', 'Black-legged Kittiwake', 'Rissa tridactyla', '0', '日', '鹳形目', '鸥科', '三趾鸥属', '鸥类', '0', null, '1', '0', 'szo', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('193', '0432#', '鸥嘴噪鸥', 'Gull-billed Tern', 'Gelochelidon nilotica', '0', null, '鹳形目', '鸥科', '噪鸥属', '鸥类', '1000', null, '1', '0', 'ozzo', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('194', '0433#', '红嘴巨鸥', 'Caspian Tern', 'Hydroprogne caspia', '0', '澳', '鹳形目', '鸥科', '燕鸥属', '鸥类', '250', null, '1', '0', 'hzjo', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('195', '0434#', '黄嘴河燕鸥', 'River Tern', 'Sterna aurantia', '2', null, '鹳形目', '鸥科', '燕鸥属', '鸥类', '750', null, '1', '0', 'hzhyo', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('196', '0435#', '小凤头燕鸥', 'Lesser Crested Tern', 'Sterna bengalensis', '0', '澳', '鹳形目', '鸥科', '燕鸥属', '鸥类', '0', null, '1', '0', 'xftyo', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('197', '0436#', '大凤头燕鸥', 'Great Crested Tern', 'Sterna bergii', '0', null, '鹳形目', '鸥科', '燕鸥属', '鸥类', '0', null, '1', '0', 'dftyo', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('198', '0437#', '黑嘴端凤头燕鸥', 'Chinese Crested Tern', 'Sterna bernsteini', '2', null, '鹳形目', '鸥科', '燕鸥属', '鸥类', '1', 'CR', '1', '0', 'hzdftyo', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('199', '0438#', '粉红燕鸥', 'Roseate Tern', 'Sterna dougallii', '0', '日', '鹳形目', '鸥科', '燕鸥属', '鸥类', '0', null, '1', '0', 'fhyo', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('200', '0439#', '黑枕燕鸥', 'Black-naped Tern', 'Sterna sumatrana', '0', '日澳', '鹳形目', '鸥科', '燕鸥属', '鸥类', '0', null, '1', '0', 'hzyo', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('201', '0440#', '普通燕鸥', 'Common Tern', 'Sterna hirundo', '0', '日澳', '鹳形目', '鸥科', '燕鸥属', '鸥类', '0', null, '1', '0', 'ptyo', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('202', '0441#', '白额燕鸥', 'Little Tern', 'Sterna albifrons', '0', '日澳', '鹳形目', '鸥科', '燕鸥属', '鸥类', '1000', null, '1', '0', 'beyo', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('203', '0442#', '尖尾燕鸥', 'Black-bellied Tern', 'Sterna acuticauda', '0', null, '鹳形目', '鸥科', '燕鸥属', '鸥类', '250', null, '1', '0', 'jwyo', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('204', '0443#', '白腰燕鸥', 'Aleutian Tern', 'Sterna aleutica', '0', null, '鹳形目', '鸥科', '燕鸥属', '鸥类', '330', null, '1', '0', 'byyo', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('205', '0444#', '褐翅燕鸥', 'Bridled Tern', 'Sterna anaethetus', '0', '日澳', '鹳形目', '鸥科', '燕鸥属', '鸥类', '0', null, '1', '0', 'hcyo', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('206', '0445#', '乌燕鸥', 'Sooty Tern', 'Sterna fuscata', '0', '日', '鹳形目', '鸥科', '燕鸥属', '鸥类', '0', null, '1', '0', 'wyo', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('207', '0446#', '须浮鸥', 'Whiskered Tern', 'Chlidonias hybrida', '0', null, '鹳形目', '鸥科', '浮鸥属', '鸥类', '0', null, '1', '0', 'xfo', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('208', '0447#', '白翅浮鸥', 'White-winged Tern', 'Chlidonias leucoptera', '0', '澳', '鹳形目', '鸥科', '浮鸥属', '鸥类', '0', null, '1', '0', 'bcfo', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('209', '0448#', '黑浮鸥', 'Black Tern', 'Chlidonias niger', '2', '澳', '鹳形目', '鸥科', '浮鸥属', '鸥类', '0', null, '1', '0', 'hfo', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('210', '0449#', '白顶玄鸥', 'Brown Noddy', 'Anous stolidus', '0', '澳', '鹳形目', '鸥科', '玄燕鸥属', '鸥类', '0', null, '1', '0', 'bdxo', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('211', '0450#', '白玄鸥', 'White Tern', 'Gygis alba', '0', null, '鹳形目', '鸥科', '玄燕鸥属', '鸥类', '0', null, '1', '0', 'bxo', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('212', '0451#', '斑海雀', 'Long-billed Murrelet', 'Brachyramphus perdix', '0', '日', '鹳形目', '鸥科', '斑海雀属', '鸥类', '0', null, '1', '0', 'bhq', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('213', '0452#', '扁嘴海雀', 'Ancient Murrelet', 'Synthliboramphus antiquus', '0', '日', '鹳形目', '鸥科', '扁嘴海雀属', '鸥类', '0', null, '1', '0', 'bzhq', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('214', '0453#', '冠海雀', 'Japanese Murrelet', 'Synthliboramphus wumizusume', '0', null, '鹳形目', '鸥科', '扁嘴海雀属', '鸥类', '0', null, '1', '0', 'ghq', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('215', '0454#', '角嘴海雀', 'Rhinoceros Auklet', 'Cerorhinca monocerata', '0', null, '鹳形目', '鸥科', '角嘴海雀属', '鸥类', '0', null, '1', '0', 'jzhq', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('216', '0518#', '小䴙䴘', 'Little Grebe', 'Tachybaptus ruficollis', '0', null, '鹳形目', '科', '属', '雁鸭类', '10000', null, '1', '0', 'xpt', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('217', '0519#', '赤颈䴙䴘', 'Red-necked Grebe', 'Podiceps grisegena', '2', null, '鹳形目', '科', '属', '雁鸭类', '500', null, '1', '0', 'cjpt', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('218', '0520#', '凤头䴙䴘', 'Great Crested Grebe', 'Podiceps cristatus', '0', '日', '鹳形目', '科', '属', '雁鸭类', '375', null, '1', '0', 'ftpt', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('219', '0521#', '角䴙䴘', 'Horned Grebe', 'Podiceps auritus', '2', '日', '鹳形目', '科', '属', '雁鸭类', '250', null, '1', '0', 'jpt', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('220', '0522#', '黑颈䴙䴘', 'Black-necked Grebe', 'Podiceps nigricollis', '0', '日', '鹳形目', '科', '属', '雁鸭类', '1000', null, '1', '0', 'hjpt', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('221', '0523#', '短尾鹲', 'Red-billed Tropicbird', 'Phaethon aethereus', '0', null, '鹳形目', '鹲科', '鹲属', '海洋鸟类', '0', null, '1', '0', 'dwm', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('222', '0524#', '红尾鹲', 'Red-tailed Tropicbird', 'Phaethon rubricauda', '0', null, '鹳形目', '鹲科', '鹲属', '海洋鸟类', '0', null, '1', '0', 'hwm', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('223', '0525#', '白尾鹲', 'White-tailed Tropicbird', 'Phaethon lepturus', '0', '澳', '鹳形目', '鹲科', '鹲属', '海洋鸟类', '0', null, '1', '0', 'bwm', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('224', '0526#', '蓝脸鲣鸟', 'Masked Booby', 'Sula dactylatra', '2', null, '鹳形目', '鲣鸟科', '鲣鸟属', '海洋鸟类', '0', null, '1', '0', 'lljn', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('225', '0527#', '红脚鲣鸟', 'Red-footed Booby', 'Sula sula', '2', '澳', '鹳形目', '鲣鸟科', '鲣鸟属', '海洋鸟类', '0', null, '1', '0', 'hjjn', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('226', '0528#', '褐鲣鸟', 'Brown Booby', 'Sula leucogaster', '2', '澳', '鹳形目', '鲣鸟科', '鲣鸟属', '海洋鸟类', '0', null, '1', '0', 'hjn', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('227', '0529#', '黑腹蛇鹈', 'Oriental Darter', 'Anhinga melanogaster', '0', null, '鹳形目', '蛇鹈科', '蛇鹈属', '鸬鹚类', '0', null, '1', '0', 'hfst', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('228', '0530#', '黑颈鸬鹚', 'Little Cormorant', 'Phalacrocorax niger', '2', null, '鹳形目', '鸬鹚科', '鸬鹚属', '鸬鹚类', '0', null, '1', '0', 'hjlc', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('229', '0531#', '普通鸬鹚', 'Great Cormorant', 'Phalacrocorax carbo', '0', null, '鹳形目', '鸬鹚科', '鸬鹚属', '鸬鹚类', '1000', null, '1', '0', 'ptlc', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('230', '0532#', '暗绿背鸬鹚', 'Japanese Cormorant', 'Phalacrocorax capillatus', '0', null, '鹳形目', '鸬鹚科', '鸬鹚属', '鸬鹚类', '1000', null, '1', '0', 'alblc', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('231', '0533#', '红脸鸬鹚', 'Red-faced Cormorant', 'Phalacrocorax urile', '0', null, '鹳形目', '鸬鹚科', '鸬鹚属', '鸬鹚类', '0', null, '1', '0', 'hllc', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('232', '0534#', '海鸬鹚', 'Pelagic Cormorant', 'Phalacrocorax pelagicus', '2', '日', '鹳形目', '鸬鹚科', '鸬鹚属', '鸬鹚类', '0', null, '1', '0', 'hlc', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('233', '0535#', '小白鹭', 'Little Egret', 'Egretta garzetta', '0', null, '鹳形目', '鹭科', '白鹭属', '鹭类', '10000', null, '1', '0', 'xbl', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('234', '0536#', '黄嘴白鹭', 'Chinese Egret', 'Egretta eulophotes', '2', null, '鹳形目', '鹭科', '白鹭属', '鹭类', '30', 'VU', '1', '0', 'hzbl', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('235', '0537#', '岩鹭', 'Pacific Reef Heron', 'Egretta sacra', '2', '澳', '鹳形目', '鹭科', '白鹭属', '鹭类', '10000', null, '1', '0', 'yl', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('236', '0538#', '斑鹭', 'Pied Heron', 'Egretta picata', '0', null, '鹳形目', '鹭科', '白鹭属', '鹭类', '0', null, '1', '0', 'bl', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('237', '0538.a#', '白脸鹭', 'White-faced Heron', 'Egretta novaehollandiae', '0', null, '鹳形目', '鹭科', '白鹭属', '鹭类', '0', null, '1', '0', 'bll', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('238', '0539#', '苍鹭', 'Grey Heron', 'Ardea cinerea', '0', null, '鹳形目', '鹭科', '鹭属', '鹭类', '10000', null, '1', '0', 'cl', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('239', '0540#', '白腹鹭', 'White-bellied Heron', 'Ardea insignis', '0', null, '鹳形目', '鹭科', '鹭属', '鹭类', '0', null, '1', '0', 'bfl', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('240', '0541#', '草鹭', 'Purple Heron', 'Ardea purpurea', '0', '日', '鹳形目', '鹭科', '鹭属', '鹭类', '1000', null, '1', '0', 'cl', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('241', '0542#', '大白鹭', 'Great Egret', 'Casmerodius albus', '0', '日澳', '鹳形目', '鹭科', '白鹭属', '鹭类', '1000', null, '1', '0', 'dbl', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('242', '0543#', '中白鹭', 'Intermediate Egret', 'Mesophoyx intermedia', '0', '日', '鹳形目', '鹭科', '白鹭属', '鹭类', '1000', null, '1', '0', 'zbl', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('243', '0544#', '牛背鹭', 'Cattle Egret', 'Bubulcus ibis', '0', '日澳', '鹳形目', '鹭科', '牛背鹭属', '鹭类', '10000', null, '1', '0', 'nbl', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('244', '0545#', '池鹭', 'Chinese Pond Heron', 'Ardeola bacchus', '0', null, '鹳形目', '鹭科', '池鹭属', '鹭类', '0', null, '1', '0', 'cl', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('245', '0546#', '绿鹭', 'Striated Heron', 'Butorides striata', '0', '日', '鹳形目', '鹭科', '绿鹭属', '鹭类', '0', null, '1', '0', 'll', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('246', '0547#', '夜鹭', 'Black-crowned Night Heron', 'Nycticorax nycticorax', '0', '日', '鹳形目', '鹭科', '夜鹭属', '鹭类', '10000', null, '1', '0', 'yl', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('247', '0548#', '海南鳽', 'White-eared Night Heron', 'Gorsachius magnificus', '2', null, '鹳形目', '鹭科', '鳽属', '鹭类', '6', 'EN', '1', '0', 'hnj', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('248', '0549#', '栗鳽', 'Japanese Night Heron', 'Gorsachius goisagi', '0', '日', '鹳形目', '鹭科', '鳽属', '鹭类', '6', 'EN', '1', '0', 'lj', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('249', '0550#', '黑冠鳽', 'Malayan Night Heron', 'Gorsachius melanolophus', '0', '日', '鹳形目', '鹭科', '鳽属', '鹭类', '0', null, '1', '0', 'hgj', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('250', '0551#', '小苇鳽', 'Little Bittern', 'Ixobrychus minutus', '2', null, '鹳形目', '鹭科', '苇鳽属', '鹭类', '0', null, '1', '0', 'xwj', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('251', '0552#', '黄苇鳽', 'Yellow Bittern', 'Ixobrychus sinensis', '0', '日澳', '鹳形目', '鹭科', '苇鳽属', '鹭类', '10000', null, '1', '0', 'hwj', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('252', '0553#', '紫背苇鳽', 'Von Schrenck\'s Bittern', 'Ixobrychus eurhythmus', '0', '日', '鹳形目', '鹭科', '苇鳽属', '鹭类', '250', null, '1', '0', 'zbwj', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('253', '0554#', '栗苇鳽', 'Cinnamon Bittern', 'Ixobrychus cinnamomeus', '0', null, '鹳形目', '鹭科', '苇鳽属', '鹭类', '10000', null, '1', '0', 'lwj', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('254', '0555#', '黑鳽', 'Black Bittern', 'Dupetor flavicollis', '0', null, '鹳形目', '鹭科', '黑鳽属', '鹭类', '1000', null, '1', '0', 'hj', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('255', '0556#', '大麻鳽', 'Great Bittern', 'Botaurus stellaris', '0', '日', '鹳形目', '鹭科', '麻鳽属', '鹭类', '1000', null, '1', '0', 'dmj', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('256', '0557#', '大火烈鸟', 'Greater Flamingo', 'Phoenicopterus ruber', '0', null, '鹳形目', '红鹳科', '火烈鸟属', '鹤鹳类', '0', null, '1', '0', 'dhln', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('257', '0558#', '彩鹮', 'Glossy Ibis', 'Plegadis falcinellus', '2', '澳', '鹳形目', '鹮科', '彩鹮属', '鹤鹳类', '0', null, '1', '0', 'ch', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('258', '0559#', '黑头白鹮', 'Black-headed Ibis', 'Threskiornis melanocephalus', '2', null, '鹳形目', '鹮科', '白鹮属', '鹤鹳类', '1', null, '1', '0', 'htbh', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('259', '0560#', '白肩黑鹮', 'White-shouldered Ibis', 'Pseudibis davisoni', '2', null, '鹳形目', '鹮科', '黑鹮属', '鹤鹳类', '0', 'CR', '1', '0', 'bjhh', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('260', '0561#', '朱鹮', 'Crested Ibis', 'Nipponia nippon', '1', null, '鹳形目', '鹮科', '朱鹮属', '鹤鹳类', '3', 'EN', '1', '0', 'zh', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('261', '0562#', '白琵鹭', 'Eurasian Spoonbill', 'Platalea leucorodia', '2', '日', '鹳形目', '鹮科', '琵鹭属', '鹭类', '100', null, '1', '0', 'bpl', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('262', '0563#', '黑脸琵鹭', 'Black-faced Spoonbill', 'Platalea minor', '2', '日', '鹳形目', '鹮科', '琵鹭属', '鹭类', '15', 'EN', '1', '0', 'hlpl', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('263', '0564#', '白鹈鹕', 'Great White Pelican', 'Pelecanus onocrotalus', '2', null, '鹳形目', '鹈鹕科', '鹈鹕属', '雁鸭类', '0', null, '1', '0', 'bth', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('264', '0565#', '卷羽鹈鹕', 'Dalmatian Pelican', 'Pelecanus crispus', '2', null, '鹳形目', '鹈鹕科', '鹈鹕属', '雁鸭类', '1', 'VU', '1', '0', 'jyth', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('265', '0566#', '斑嘴鹈鹕', 'Spot-billed Pelican', 'Pelecanus philippensis', '2', null, '鹳形目', '鹈鹕科', '鹈鹕属', '雁鸭类', '45', null, '1', '0', 'bzth', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('266', '0567#', '白头鹮鹳', 'Painted Stork', 'Mycteria leucocephala', '2', null, '鹳形目', '鹳科', '鹮鹳属', '鹤鹳类', '0', null, '1', '0', 'bthg', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('267', '0567.a#', '钳嘴鹳', 'Asian Openbill', 'Anastomus oscitans', '0', null, '鹳形目', '鹳科', '', '鹤鹳类', '0', null, '1', '0', 'qzg', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('268', '0568#', '黑鹳', 'Black Stork', 'Ciconia nigra', '1', '日', '鹳形目', '鹳科', '鹳属', '鹤鹳类', '5', null, '1', '0', 'hg', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('269', '0569#', '白鹳', 'White Stork', 'Ciconia ciconia', '1', '日', '鹳形目', '鹳科', '鹳属', '鹤鹳类', '0', null, '1', '0', 'bg', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('270', '0570#', '东方白鹳', 'Oriental Stork', 'Ciconia boyciana', '0', null, '鹳形目', '鹳科', '鹳属', '鹤鹳类', '30', 'EN', '1', '0', 'dfbg', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('271', '0571#', '秃鹳', 'Lesser Adjutant', 'Leptoptilos javanicus', '0', null, '鹳形目', '鹳科', '秃鹳属', '鹤鹳类', '50', 'VU', '1', '0', 'tg', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('272', '0572#', '小军舰鸟', 'Great Frigatebird', 'Fregata minor', '0', '澳', '鹳形目', '军舰鸟科', '军舰鸟属', '海洋鸟类', '0', null, '1', '0', 'xjjn', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('273', '0573#', '白斑军舰鸟', 'Lesser Frigatebird', 'Fregata ariel', '0', '澳', '鹳形目', '军舰鸟科', '军舰鸟属', '海洋鸟类', '0', null, '1', '0', 'bbjjn', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('274', '0574#', '白腹军舰鸟', 'Christmas Island Frigatebird', 'Fregata andrewsi', '1', '澳', '鹳形目', '军舰鸟科', '军舰鸟属', '海洋鸟类', '0', 'CR', '1', '0', 'bfjjn', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('275', '0575#', '红喉潜鸟', 'Red-throated Loon', 'Gavia stellata', '0', '日', '鹳形目', '潜鸟科', '潜鸟属', '海洋鸟类', '1000', null, '1', '0', 'hhqn', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('276', '0576#', '黑喉潜鸟', 'Black-throated Loon', 'Gavia arctica', '0', '日', '鹳形目', '潜鸟科', '潜鸟属', '海洋鸟类', '0', null, '1', '0', 'hhqn', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('277', '0577#', '太平洋潜鸟', 'Pacific Loon', 'Gavia pacifica', '0', null, '鹳形目', '潜鸟科', '潜鸟属', '海洋鸟类', '1000', null, '1', '0', 'tpyqn', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('278', '0578#', '普通潜鸟', 'Common Loon', 'Gavia immer', '0', '日', '鹳形目', '潜鸟科', '潜鸟属', '海洋鸟类', '0', null, '1', '0', 'ptqn', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('279', '0579#', '白嘴潜鸟', 'Yellow-billed Loon', 'Gavia adamsii', '0', null, '鹳形目', '潜鸟科', '潜鸟属', '海洋鸟类', '0', null, '1', '0', 'bzqn', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('280', '0580#', '暴雪鹱', 'Northern Fulmar', 'Fulmarus glacialis', '0', null, '鹳形目', '鹱科', '暴雪鹱属', '海洋鸟类', '0', null, '1', '0', 'bxh', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('281', '0581#', '钩嘴圆尾鹱', 'Tahiti Petrel', 'Pseudobulweria rostrata', '0', null, '鹳形目', '鹱科', '圆尾鹱属', '海洋鸟类', '0', null, '1', '0', 'gzywh', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('282', '0582#', '点额圆尾鹱', 'Bonin Petrel', 'Pterodroma hypoleuca', '0', null, '鹳形目', '鹱科', '圆尾鹱属', '海洋鸟类', '0', null, '1', '0', 'deywh', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('283', '0583#', '纯褐鹱', 'Bulwer\'s Petrel', 'Bulweria bulwerii', '0', '日', '鹳形目', '鹱科', '纯褐鹱属', '海洋鸟类', '0', null, '1', '0', 'chh', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('284', '0584#', '白额鹱', 'Streaked Shearwater', 'Calonectris leucomelas', '0', '澳', '鹳形目', '鹱科', '鹱属', '海洋鸟类', '0', null, '1', '0', 'beh', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('285', '0585#', '曳尾鹱', 'Wedge-tailed Shearwater', 'Puffinus pacificus', '0', null, '鹳形目', '鹱科', '剪水鹱属', '海洋鸟类', '0', null, '1', '0', 'ywh', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('286', '0586#', '肉足鹱', 'Flesh-footed Shearwater', 'Puffinus carneipes', '0', null, '鹳形目', '鹱科', '剪水鹱属', '海洋鸟类', '0', null, '1', '0', 'rzh', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('287', '0587#', '灰鹱', 'Sooty Shearwater', 'Puffinus griseus', '0', '澳', '鹳形目', '鹱科', '剪水鹱属', '海洋鸟类', '0', null, '1', '0', 'hh', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('288', '0588#', '短尾鹱', 'Short-tailed Shearwater', 'Puffinus tenuirostris', '0', null, '鹳形目', '鹱科', '剪水鹱属', '海洋鸟类', '0', null, '1', '0', 'dwh', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('289', '0589#', '短尾信天翁', 'Short-tailed Albatross', 'Phoebastria albatrus', '1', '日', '鹳形目', '鹱科', '信天翁属', '海洋鸟类', '0', 'VU', '1', '0', 'dwxtw', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('290', '0590#', '黑脚信天翁', 'Black-footed Albatross', 'Phoebastria nigripes', '0', '日', '鹳形目', '鹱科', '信天翁属', '海洋鸟类', '0', 'EN', '1', '0', 'hjxtw', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('291', '0591#', '黑背信天翁', 'Laysan Albatross', 'Phoebastria immutabilis', '0', null, '鹳形目', '鹱科', '信天翁属', '海洋鸟类', '0', null, '1', '0', 'hbxtw', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('292', '0592#', '烟黑叉尾海燕', 'Matsudaira\'s Storm Petrel', 'Oceanodroma matsudairae', '0', null, '鹳形目', '鹱科', '烟黑叉尾海燕属', '海洋鸟类', '0', null, '1', '0', 'yhcwhy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('293', '0593#', '白腰叉尾海燕', 'Leach\'s Storm-petrel', 'Oceanodroma leucorhoa', '0', '澳', '鹳形目', '鹱科', '烟黑叉尾海燕属', '海洋鸟类', '0', null, '1', '0', 'bycwhy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('294', '0594#', '黑叉尾海燕', 'Swinhoe\'s Storm-petrel', 'Oceanodroma monorhis', '0', '日', '鹳形目', '鹱科', '叉尾海燕属', '海洋鸟类', '0', null, '1', '0', 'hcwhy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('295', '0595#', '日本叉尾海燕', 'Matsudaira\'s Storm-petrel', 'Oceanodroma matsudairae', '0', null, '鹳形目', '鹱科', '叉尾海燕属', '海洋鸟类', '0', null, '1', '0', 'rbcwhy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('296', 'xxxS', '不能辨认的沙锥', 'Snipe sp.', '', '0', null, '', '', '', '鸻鹬类', '0', null, '0', '0', 'bnbrdsz', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('297', 'xxxG', '不能辨认的银鸥', 'Herring Gull sp.', '', '0', null, '', '', '', '鸥类', '0', null, '0', '0', 'bnbrdyo', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('298', 'xxxD', '不能辨认的鸭类', 'Duck sp.', '', '0', null, '', '', '', '雁鸭类', '0', null, '0', '0', 'bnbrdyl', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('299', 'xxxLG', '不能辨认的大型鸥', 'Large Gull spp.', '', '0', null, '', '', '', '鸥类', '0', null, '0', '0', 'bnbrddxo', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('300', 'xxxSW', '不能辨认的小型涉禽（不包括沙锥）', 'Small Wader spp.', '', '0', null, '', '', '', '鸻鹬类', '0', null, '0', '0', 'bnbrdxxsq（bbksz）', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('301', 'xxxW', '不能辨认的涉禽类', 'Wader sp.', '', '0', null, '', '', '', '鸻鹬类', '0', null, '0', '0', 'bnbrdsql', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('302', '0171#', '普通翠鸟', 'Common Kingfisher', 'Alcedo atthis', '0', null, '佛法僧目', '翠鸟科', '翠鸟属', '尚未归类', '0', null, '0', '1', 'ptcn', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('303', '0176#', '白胸翡翠', 'White-throated Kingfisher', 'Halcyon smyrnensis', '0', null, '佛法僧目', '翠鸟科', '翡翠属', '尚未归类', '0', null, '0', '1', 'bxfc', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('304', '0177#', '蓝翡翠', 'Black-capped Kingfisher', 'Halcyon pileata', '0', null, '佛法僧目', '翠鸟科', '翡翠属', '尚未归类', '0', null, '0', '1', 'lfc', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('305', '0180#', '斑鱼狗', 'Pied Kingfisher', 'Ceryle rudis', '0', null, '佛法僧目', '鱼狗科', '鱼狗属', '尚未归类', '0', null, '0', '1', 'byg', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('306', '0455#', '鹗', 'Osprey', 'Pandion haliaetus', '2', null, '鹳形目', '鹰科', '鹗属', '尚未归类', '0', null, '0', '1', 'e', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('307', '0459#', '黑翅鸢', 'Black-winged Kite', 'Elanus caeruleus', '2', null, '鹳形目', '鹰科', '黑翅鸢属', '尚未归类', '0', null, '0', '1', 'hcy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('308', '0460#', '黑鸢', 'Black Kite', 'Milvus migrans', '2', null, '鹳形目', '鹰科', '鸢属', '尚未归类', '0', null, '0', '1', 'hy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('309', '0461#', '黑耳鸢', 'Black-eared Kite', 'Milvus lineatus', '2', null, '鹳形目', '鹰科', '鸢属', '尚未归类', '0', null, '0', '1', 'hey', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('310', '0463#', '白腹海雕', 'White-bellied Eagle', 'Haliaeetus leucogaster', '2', '澳', '鹳形目', '鹰科', '海雕属', '尚未归类', '0', null, '0', '1', 'bfhd', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('311', '0464#', '玉带海雕', 'Pallas\'s Fish Eagle', 'Haliaeetus leucoryphus', '1', null, '鹳形目', '鹰科', '海雕属', '尚未归类', '0', 'VU', '0', '1', 'ydhd', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('312', '0465#', '白尾海雕', 'White-tailed Sea Eagle', 'Haliaeetus albicilla', '1', null, '鹳形目', '鹰科', '海雕属', '尚未归类', '0', null, '0', '1', 'bwhd', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('313', '0466#', '虎头海雕', 'Steller\'s Sea Eagle', 'Haliaeetus pelagicus', '1', '日', '鹳形目', '鹰科', '海雕属', '尚未归类', '0', 'VU', '0', '1', 'hthd', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('314', '0467#', '渔雕', 'Lesser Fish Eagle', 'Ichthyophaga humilis', '2', null, '鹳形目', '鹰科', '渔雕属', '尚未归类', '0', null, '0', '1', 'yd', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('315', '0476#', '白头鹞', 'Western Marsh Harrier', 'Circus aeruginosus', '2', '日', '鹳形目', '鹰科', '鹞属', '尚未归类', '0', null, '0', '1', 'bty', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('316', '0477#', '白腹鹞', 'Eastern Marsh Harrier', 'Circus spilonotus', '2', null, '鹳形目', '鹰科', '鹞属', '尚未归类', '0', null, '0', '1', 'bfy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('317', '0478#', '白尾鹞', 'Northern Harrier', 'Circus cyaneus', '2', '日', '鹳形目', '鹰科', '鹞属', '尚未归类', '0', null, '0', '1', 'bwy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('318', '0492#', '普通鵟', 'Common Buzzard', 'Buteo buteo', '2', null, '鹳形目', '鹰科', '鵟属', '尚未归类', '0', null, '0', '1', 'ptk', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('319', '0497#', '乌雕', 'Greater Spotted Eagle', 'Aquila clanga', '2', null, '鹳形目', '鹰科', '雕属', '尚未归类', '0', 'VU', '0', '1', 'wd', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('320', '0499#', '白肩雕', 'Eastern Imperial Eagle', 'Aquila heliaca', '1', null, '鹳形目', '鹰科', '雕属', '尚未归类', '0', 'VU', '0', '1', 'bjd', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('321', '0516#', '游隼', 'Peregrine Falcon', 'Falco peregrinus', '2', null, '鹳形目', '隼科', '隼属', '尚未归类', '0', null, '0', '1', 'ys', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('322', '0650#', '白颈鸦', 'Collared Crow', 'Corvus pectoralis', '0', null, '雀形目', '鸦科', '鸦属', '尚未归类', '0', null, '0', '1', 'bjy', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');
INSERT INTO `bird` VALUES ('323', '0815#', '丝光椋鸟', 'Red-billed Starling', 'Sturnus sericeus', '0', null, '雀形目', '椋鸟科', '椋鸟属', '尚未归类', '0', null, '0', '1', 'sgln', null, '0', '2016-12-17 22:07:00', '2016-12-17 22:07:00');

-- ----------------------------
-- Table structure for checkpoint
-- ----------------------------
DROP TABLE IF EXISTS `checkpoint`;
CREATE TABLE `checkpoint` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '检查地ID',
  `name` varchar(255) DEFAULT NULL COMMENT '检查地名称',
  `description` varchar(255) DEFAULT NULL COMMENT '检查地详细描述',
  `province` varchar(40) DEFAULT NULL COMMENT '省',
  `city` varchar(40) DEFAULT NULL COMMENT '市',
  `county` varchar(40) DEFAULT NULL COMMENT '县、区',
  `detail` varchar(255) DEFAULT NULL COMMENT '详细地址',
  `longitude` double(9,6) DEFAULT NULL COMMENT '经度',
  `latitude` double(9,6) DEFAULT NULL COMMENT '纬度',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `is_deleted` tinyint(1) DEFAULT '0' COMMENT '删除标签',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of checkpoint
-- ----------------------------
INSERT INTO `checkpoint` VALUES ('1', '辽宁丹东鸭绿江口', '丹东鸭绿江口湿地国家级自然保护区', '辽宁省', '丹东市', '东港县级市', '丹东市东港市	', '123.640678', '39.889526', '2017-01-25 19:09:50', '2017-01-25 19:09:50', '0');
INSERT INTO `checkpoint` VALUES ('2', '辽宁盘锦双台子河口', '双台子河口自然保护区', '辽宁省', '盘锦市', '盘山县', '双台子河口自然保护区', '121.805359', '40.967525', '2017-01-25 19:09:50', '2017-01-25 19:09:50', '0');
INSERT INTO `checkpoint` VALUES ('3', '天津', '天津', '天津市', '天津市', null, '天津市', '117.208214', '39.090908', '2017-01-25 19:09:50', '2017-01-25 19:38:42', '0');
INSERT INTO `checkpoint` VALUES ('4', '河北沧州', '河北沧州', '河北省', '沧州市', null, '河北省沧州市', '116.844122', '38.310447', '2017-01-25 19:34:31', '2017-01-25 19:34:31', '0');
INSERT INTO `checkpoint` VALUES ('5', '山东黄河三角洲', '山东黄河三角洲国家级自然保护区', '山东省', '东营市', '垦利县', '山东省东营市垦利县', '118.998073', '37.766488', '2017-01-25 19:36:46', '2017-01-25 19:36:46', '0');
INSERT INTO `checkpoint` VALUES ('6', '连云港', '江苏连云港', '江苏省', '连云港市', null, '江苏省连云港市', '119.202550', '34.600440', '2017-01-25 19:37:39', '2017-01-25 19:37:39', '0');
INSERT INTO `checkpoint` VALUES ('7', '江苏如东', '江苏如东', '江苏省', '南通市', '如东县', '江苏省南通市如东县', '121.183987', '32.336796', '2017-01-25 19:38:42', '2017-01-25 19:38:42', '0');
INSERT INTO `checkpoint` VALUES ('8', '上海南汇东滩', '浦东南汇东滩湿地', '上海市', '上海市', '浦东新区', '上海市浦东新区', '121.982139', '30.906554', '2017-01-25 19:39:49', '2017-01-25 19:39:49', '0');
INSERT INTO `checkpoint` VALUES ('9', '福建泉州湾', '泉州湾河口湿地省级自然保护区', '福建省', '泉州市', '其他地区', '泉州湾河口湿地省级自然保护区', '118.706594', '24.798679', '2017-01-25 19:43:26', '2017-01-25 19:43:26', '0');
INSERT INTO `checkpoint` VALUES ('10', '广东海丰鸟类自然保护区', '海丰县公平水库省级鸟类自然保护区', '广东省', '汕尾市', '海丰县', '335省道附近', '115.417077', '23.058376', '2017-01-25 19:44:36', '2017-01-25 19:44:36', '0');
INSERT INTO `checkpoint` VALUES ('11', '广东深圳', '广东深圳', '广东省', '深圳市', null, '广东省深圳市', '114.063812', '22.549583', '2017-01-25 19:45:27', '2017-01-25 19:45:27', '0');
INSERT INTO `checkpoint` VALUES ('12', '香港米埔和后海湾', '香港米埔和后海湾国际重要湿地', '', '', '香港特别行政区', '担竿洲路	', '114.058178', '22.498662', '2017-01-25 19:50:08', '2017-01-25 19:50:08', '0');

-- ----------------------------
-- Table structure for flag
-- ----------------------------
DROP TABLE IF EXISTS `flag`;
CREATE TABLE `flag` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '旗标ID',
  `user_id` int(10) DEFAULT NULL COMMENT '用户ID',
  `bird_id` int(10) DEFAULT NULL COMMENT '鸟种ID',
  `code` varchar(255) DEFAULT NULL COMMENT '旗标编码',
  `flag_color_combination` set('R','G','B','O','W','Y') DEFAULT NULL COMMENT '旗标颜色组合',
  `lu` enum('r','g','b','l','y','w') DEFAULT NULL COMMENT '旗标彩环组合左胫',
  `ru` enum('r','g','b','l','y','w') DEFAULT NULL COMMENT '旗标彩环组合右胫',
  `ld` enum('r','g','b','l','y','w') DEFAULT NULL COMMENT '旗标彩环组合左跗',
  `rd` enum('r','g','b','l','y','w') DEFAULT NULL COMMENT '旗标彩环组合右跗',
  `discovered_time` datetime DEFAULT NULL COMMENT '发现时间',
  `note` varchar(255) DEFAULT NULL COMMENT '备注',
  `is_deleted` tinyint(1) DEFAULT '0' COMMENT '是否删除',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `flag_user_id_create_time_update_time_uindex` (`user_id`,`create_time`,`update_time`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='旗标';

-- ----------------------------
-- Records of flag
-- ----------------------------
INSERT INTO `flag` VALUES ('1', null, null, 'I w', 'R,G,B', null, null, null, null, null, null, '0', '2016-12-18 09:29:14', '2016-12-18 10:00:32');

-- ----------------------------
-- Table structure for permission
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '权限ID',
  `name` varchar(30) NOT NULL COMMENT '权限名称',
  `description` varchar(30) NOT NULL COMMENT '权限描述',
  `is_deleted` tinyint(1) DEFAULT '0' COMMENT '删除标签',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of permission
-- ----------------------------
INSERT INTO `permission` VALUES ('1', 'create', '插入', '0', '2016-12-18 14:55:39', '2016-12-18 14:56:50');
INSERT INTO `permission` VALUES ('2', 'retrieve', '查找', '0', '2016-12-18 14:56:00', '2016-12-18 14:57:48');
INSERT INTO `permission` VALUES ('3', 'update', '更改', '0', '2016-12-18 14:56:15', '2016-12-18 14:56:15');
INSERT INTO `permission` VALUES ('4', 'delete', '删除', '0', '2016-12-18 14:56:25', '2016-12-18 14:56:25');
INSERT INTO `permission` VALUES ('5', 'role_root', '超级管理员权限', '0', '2017-01-25 18:45:57', '2017-01-25 18:45:57');
INSERT INTO `permission` VALUES ('6', 'role_admin', '管理员权限', '0', '2017-01-25 18:45:57', '2017-01-25 18:45:57');
INSERT INTO `permission` VALUES ('7', 'role_user', '普通用户权限', '0', '2017-01-25 18:45:57', '2017-01-25 18:45:57');

-- ----------------------------
-- Table structure for record
-- ----------------------------
DROP TABLE IF EXISTS `record`;
CREATE TABLE `record` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '记录ID',
  `bird_id` int(10) DEFAULT NULL COMMENT '鸟种ID',
  `user_id` int(10) DEFAULT NULL COMMENT '用户ID',
  `bird_count` int(11) DEFAULT NULL COMMENT '鸟种数量',
  `checkpoint_id` INT DEFAULT NULL COMMENT '检查地ID',
  `detail` varchar(255) DEFAULT NULL COMMENT '详情',
  `latitude` double(10,6) DEFAULT NULL COMMENT '纬度',
  `longitude` double(10,6) DEFAULT NULL COMMENT '经度',
  `weather` varchar(50) DEFAULT NULL COMMENT '天气',
  `record_time` datetime DEFAULT NULL COMMENT '记录时间',
  `visit_times` INT DEFAULT NULL COMMENT '访问次数',
  `is_deleted` tinyint(1) DEFAULT '0' COMMENT '是否删除',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='记录';

-- ----------------------------
-- Records of record
-- ----------------------------

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '角色ID',
  `name` varchar(30) NOT NULL COMMENT '角色名称',
  `description` varchar(30) NOT NULL COMMENT '描述',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `is_deleted` tinyint(1) DEFAULT '0' COMMENT '删除标签',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', 'ROLE_ROOT', '超级管理员', '2016-12-18 15:26:20', '2017-01-25 18:45:04', '0');
INSERT INTO `role` VALUES ('2', 'ROLE_ADMIN', '管理员', '2016-12-18 15:26:37', '2016-12-18 16:06:56', '0');
INSERT INTO `role` VALUES ('3', 'ROLE_USER', '普通用户', '2017-01-25 18:45:04', '2017-01-25 18:45:04', '0');

-- ----------------------------
-- Table structure for role_permission
-- ----------------------------
DROP TABLE IF EXISTS `role_permission`;
CREATE TABLE `role_permission` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '权限ID',
  `role_id` int(10) NOT NULL COMMENT '角色ID',
  `permission_id` int(10) NOT NULL COMMENT '权限ID',
  `is_deleted` tinyint(1) DEFAULT '0' COMMENT '删除标签',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_permission
-- ----------------------------
INSERT INTO `role_permission` VALUES ('1', '1', '5', '0', '2016-12-18 15:26:53', '2017-01-25 18:46:46');
INSERT INTO `role_permission` VALUES ('2', '1', '6', '0', '2017-01-25 18:46:46', '2017-01-25 18:46:46');
INSERT INTO `role_permission` VALUES ('3', '1', '7', '0', '2017-01-25 18:46:46', '2017-01-25 18:46:46');
INSERT INTO `role_permission` VALUES ('4', '2', '6', '0', '2017-01-25 18:46:46', '2017-01-25 18:46:46');
INSERT INTO `role_permission` VALUES ('5', '2', '7', '0', '2017-01-25 18:46:46', '2017-01-25 18:46:46');
INSERT INTO `role_permission` VALUES ('6', '3', '7', '0', '2017-01-25 18:46:46', '2017-01-25 18:46:46');

-- ----------------------------
-- Table structure for statistics
-- ----------------------------
# DROP TABLE IF EXISTS `statistics`;
# CREATE TABLE `statistics` (
#   `itemname` varchar(20) DEFAULT NULL,
#   `quantity` int(11) DEFAULT '0',
#   `speciescount` int(11) DEFAULT '0'
# ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
#
# -- ----------------------------
# -- Records of statistics
# -- ----------------------------
# INSERT INTO `statistics` VALUES ('雁鸭类', null, '15');
# INSERT INTO `statistics` VALUES ('鹤鹳类', '0', '0');
# INSERT INTO `statistics` VALUES ('秧鸡类', '1268', '4');
# INSERT INTO `statistics` VALUES ('鸻鹬类', '410', '3');
# INSERT INTO `statistics` VALUES ('鸥类', '60', '1');
# INSERT INTO `statistics` VALUES ('海洋鸟类', '1908', '2');
# INSERT INTO `statistics` VALUES ('鸬鹚类', '0', '0');
# INSERT INTO `statistics` VALUES ('鹭类', '0', '0');
# INSERT INTO `statistics` VALUES ('水鸟', null, '25');
# INSERT INTO `statistics` VALUES ('湿地依赖鸟', '12345', '7');
# INSERT INTO `statistics` VALUES ('受胁', '5614', '11');

-- ----------------------------
-- Table structure for token
-- ----------------------------
DROP TABLE IF EXISTS `token`;
CREATE TABLE `token` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '权限ID',
  `user_id` int(10) NOT NULL COMMENT '用户ID',
  `request_time` datetime DEFAULT NULL COMMENT '请求时间',
  `token` varchar(255) NOT NULL COMMENT 'token值',
  `expire_time` int(10) DEFAULT '24' COMMENT '过期时间,单位小时',
  `is_deleted` tinyint(1) DEFAULT '0' COMMENT '删除标签',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `token_token_uindex` (`token`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of token
-- ----------------------------
INSERT INTO `token` VALUES ('1', '1', '2016-12-24 19:47:47', '141120E38065BD91AFCF6C761CA01BD5', '24', '0', '2016-12-24 19:47:47', '2016-12-24 19:47:47');
INSERT INTO `token` VALUES ('2', '1', '2016-12-24 20:20:25', 'D2B0F9CFC17FB1F7DF36D9E449133F3D', '24', '0', '2016-12-24 20:20:25', '2016-12-24 20:20:25');
INSERT INTO `token` VALUES ('3', '1', '2016-12-24 20:26:04', '9420E46B3AAE7BECF4328FF0B8C111FE', '24', '0', '2016-12-24 20:26:04', '2016-12-24 20:26:04');
INSERT INTO `token` VALUES ('4', '1', '2016-12-25 10:10:15', 'F9A52522E1ABB2F919D4EECF5F77EA3A', '24', '0', '2016-12-25 10:10:15', '2016-12-25 10:10:15');
INSERT INTO `token` VALUES ('5', '1', '2016-12-25 10:38:19', 'B25785BF3127AE591A848221237C48D6', '24', '0', '2016-12-25 10:38:19', '2016-12-25 10:38:19');
INSERT INTO `token` VALUES ('6', '1', '2016-12-25 11:08:55', '45EDE0AA9C9A876ABACDC85DB1BF6B3F', '24', '0', '2016-12-25 11:08:55', '2016-12-25 11:08:55');
INSERT INTO `token` VALUES ('7', '1', '2016-12-27 16:07:23', 'B856A07DBF3A13EB21FA6A386665E2FD', '24', '0', '2016-12-27 16:07:23', '2016-12-27 16:07:23');
INSERT INTO `token` VALUES ('8', '1', '2017-01-01 23:21:20', '4633B83A518732E5DEBE786A6E6ADFC9', '24', '0', '2017-01-01 23:21:20', '2017-01-01 23:21:20');
INSERT INTO `token` VALUES ('9', '1', '2017-01-02 16:55:31', '3CA5A48E7D2181DFF89A90EFEF1F446F', '24', '0', '2017-01-02 16:55:31', '2017-01-02 16:55:31');
INSERT INTO `token` VALUES ('10', '1', '2017-01-02 17:45:32', '902E888FE362FA41C6CF49DBCEC59C34', '24', '0', '2017-01-02 17:45:32', '2017-01-02 17:45:32');
INSERT INTO `token` VALUES ('11', '1', '2017-04-26 19:00:34', 'BA8F23B3452CB2F991D36367E1CE3755', '24', '0', '2017-04-26 19:00:34', '2017-04-26 19:00:34');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `username` varchar(50) DEFAULT NULL COMMENT '用户名',
  `email` varchar(255) DEFAULT NULL COMMENT '电邮地址',
  `avatar` varchar(255) DEFAULT NULL COMMENT '头像图片地址',
  `password` varchar(32) DEFAULT NULL COMMENT '用户密码',
  `sex` enum('MAN','WOMAN') DEFAULT NULL COMMENT '性别',
  `qq` varchar(16) DEFAULT NULL COMMENT 'qq号码',
  `nickname` varchar(50) DEFAULT NULL COMMENT '用户昵称',
  `tel` varchar(13) DEFAULT NULL COMMENT '手机号码',
  `birthday` date DEFAULT NULL COMMENT '用户生日',
  `status` INT(1) DEFAULT 0 COMMENT '账号状态：0，待认证;1，正常可用',
  `login_time` datetime DEFAULT NULL COMMENT '此次登录时间',
  `login_count` int(10) DEFAULT NULL COMMENT '登录次数统计',
  `last_login_time` datetime DEFAULT NULL COMMENT '上次登录时间',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `is_deleted` tinyint(1) DEFAULT '0' COMMENT '删除标签',
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_username_uindex` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'lili', null, null, 'e10adc3949ba59abbe56e057f20f883e', 'MAN', null, 'lili', null, null, null, '2017-04-26 19:00:34', '2', '2017-01-02 17:45:32', '2016-12-18 15:27:24', '2017-04-26 10:59:34', '0');
INSERT INTO `user` VALUES ('2', 'root', null, null, '63a9f0ea7bb98050796b649e85481845', null, null, null, null, null, null, null, null, null, '2017-01-25 18:47:19', '2017-04-26 10:59:34', '0');
INSERT INTO `user` VALUES ('3', 'admin', null, null, '63a9f0ea7bb98050796b649e85481845', null, null, null, null, null, null, null, null, null, '2017-01-25 18:47:19', '2017-04-26 11:00:22', '0');

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '权限ID',
  `user_id` int(10) NOT NULL COMMENT '用户ID',
  `role_id` int(10) NOT NULL COMMENT '角色ID',
  `is_deleted` tinyint(1) DEFAULT '0' COMMENT '删除标签',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES ('1', '1', '3', '0', '2016-12-18 15:27:35', '2017-01-25 18:47:40');
INSERT INTO `user_role` VALUES ('2', '2', '1', '0', '2017-01-25 18:47:40', '2017-01-25 18:47:40');
INSERT INTO `user_role` VALUES ('3', '3', '2', '0', '2017-01-25 18:47:40', '2017-01-25 18:47:40');


-- ----------------------------
-- Table structure for user_checkpoint
-- ----------------------------
DROP TABLE IF EXISTS `user_checkpoint`;
CREATE TABLE `user_checkpoint` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '权限ID',
  `user_id` int(10) NOT NULL COMMENT '用户ID',
  `checkpoint_id` int(10) NOT NULL COMMENT '检查地ID',
  `checkpoint_name` VARCHAR(20) NOT NULL COMMENT '检查地检查地名称',
  `is_deleted` tinyint(1) DEFAULT '0' COMMENT '删除标签',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '用户-检查地';

