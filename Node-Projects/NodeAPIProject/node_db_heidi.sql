-- --------------------------------------------------------
-- Host:                         localhost
-- Server version:               5.7.18-log - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for node_db
CREATE DATABASE IF NOT EXISTS `node_db` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `node_db`;

-- Dumping structure for table node_db.tbl_book
CREATE TABLE IF NOT EXISTS `tbl_book` (
  `book_id` int(11) NOT NULL AUTO_INCREMENT,
  `isbn` varchar(17) NOT NULL,
  `title` varchar(256) NOT NULL,
  `author` varchar(256) NOT NULL,
  `publisher` varchar(256) NOT NULL,
  `yearpublisher` varchar(4) NOT NULL,
  `page` int(3) NOT NULL,
  `price` decimal(10,2) NOT NULL,
  `weight` float NOT NULL,
  `stock` int(11) NOT NULL,
  `createUpdate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `createDate` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- Dumping data for table node_db.tbl_book: ~15 rows (approximately)
/*!40000 ALTER TABLE `tbl_book` DISABLE KEYS */;
INSERT INTO `tbl_book` (`book_id`, `isbn`, `title`, `author`, `publisher`, `yearpublisher`, `page`, `price`, `weight`, `stock`, `createUpdate`, `createDate`) VALUES
	(1, '978-611-136-480-2', 'Visual Basic 2008 และ Visual C# 2008 ', 'พิรพร หมุนสนิท และอัจจิมา เลี้ยงอยู่', 'เคทีพี', '2552', 580, 400.00, 500, 1579, '2015-11-10 00:08:04', '2015-11-10 00:08:01'),
	(2, '978-611-90280-1-2', 'Visual Basic 2008 และ Visual C# 2008 ', 'พิรพร หมุนสนิท และอัจจิมา เลี้ยงอยู่', 'เคทีพี', '2552', 580, 400.00, 500, 1579, '2015-11-10 00:08:04', '2015-11-10 00:08:01'),
	(3, '978-616-90280-0-0', 'การวิเคราะห์และออกแบบระบบเชิงวัตถุด้วย UML', 'กิตติพงษ์ กลมกล่อม', 'เคทีพี', '2552', 388, 290.00, 500, 1499, '2015-11-10 00:07:52', '2015-11-10 00:07:50'),
	(4, '978-616-90280-1-7', 'การพัฒนาระบบเชิงวัตถุด้วย UML', 'พนิดา พานิชกุล', 'เคทีพี', '2552', 374, 280.00, 400, 3000, '2015-11-10 00:06:42', '2015-11-10 00:06:42'),
	(5, '978-616-913-701-7', 'การพัฒนาระบบเชิงวัตถุด้วย UML', 'พนิดา พานิชกุล', 'เคทีพี', '2552', 374, 280.00, 400, 3000, '2015-11-10 00:06:42', '2015-11-10 00:06:42'),
	(6, '978-616-996-700-0', 'การวิเคราะห์และออกแบบระบบเชิงวัตถุด้วย UML', 'กิตติพงษ์ กลมกล่อม', 'เคทีพี', '2552', 388, 290.00, 500, 1499, '2015-11-10 00:07:52', '2015-11-10 00:07:50'),
	(7, '978-974-001-360-4', 'การวิเคราะห์และออกแบบระบบ', 'กิตติ ภักดีวัฒนะกุล และพนิดา พานิชกุล ', 'เคทีพี', '2551', 496, 390.00, 1000, 400, '2015-12-03 13:27:28', '2015-11-10 00:08:08'),
	(8, '978-974-06-6220-4', 'การวิเคราะห์และออกแบบระบบ', 'กิตติ ภักดีวัฒนะกุล และพนิดา พานิชกุล ', 'เคทีพี', '2551', 496, 390.00, 1000, 400, '2015-12-03 13:27:28', '2015-11-10 00:08:08'),
	(9, '978-974-06-7357-6', 'Java เล่ม 1', 'กิตติ ภักดีวัฒนะกุล', 'เคทีพี', '2551', 560, 420.00, 1000, 2998, '2015-11-10 00:07:54', '2015-11-10 00:07:52'),
	(10, '978-974-067-357-6', 'Java เล่ม 2', 'กิตติ ภักดีวัฒนะกุล', 'เคทีพี', '2551', 560, 420.00, 1000, 2998, '2015-12-03 15:34:17', '2015-11-10 00:07:52'),
	(11, '978-974-09-4008-1', 'ภาษาซี ทีละก้าว เล่ม 2', 'กิตติชัย ชีวาสุขถาวร', 'เคทีพี', '2550', 384, 290.00, 600, 450, '2015-12-03 15:34:24', '2015-11-10 00:07:57'),
	(12, '978-974-094-008-1', 'ภาษาซี ทีละก้าว เล่ม 1', 'กิตติชัย ชีวาสุขถาวร', 'เคทีพี', '2550', 384, 290.00, 600, 450, '2015-12-03 15:34:34', '2015-11-10 00:07:57'),
	(13, '978-974-372-695-0', 'ASP.NET 3.5 ด้วย VB 2008 และ C# 2008 ', 'พิรพร หมุนสนิท และจันทรขจร แซ่อุ๊น', 'เคทีพี', '2552', 544, 360.00, 825, 797, '2015-11-10 00:08:07', '2015-11-10 00:08:05'),
	(14, '978-974-372-695-8', 'ASP.NET 3.5 ด้วย VB 2008 และ C# 2008 ', 'พิรพร หมุนสนิท และจันทรขจร แซ่อุ๊น', 'เคทีพี', '2552', 544, 360.00, 825, 797, '2015-11-10 00:08:07', '2015-11-10 00:08:05'),
	(15, '978-974-8424-74-3', 'วิศวกรรมซอฟต์แวร์ (Software Engineering)', 'กิตติ ภักดีวัฒนะกุล และพนิดา พานิชกุล', 'เคทีพี', '2550', 390, 390.00, 1000, 500, '2015-11-10 00:07:56', '2015-11-10 00:07:55');
/*!40000 ALTER TABLE `tbl_book` ENABLE KEYS */;

-- Dumping structure for table node_db.tbl_category
CREATE TABLE IF NOT EXISTS `tbl_category` (
  `category_id` int(11) NOT NULL AUTO_INCREMENT,
  `category_name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table node_db.tbl_category: ~0 rows (approximately)
/*!40000 ALTER TABLE `tbl_category` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_category` ENABLE KEYS */;

-- Dumping structure for table node_db.tbl_customer
CREATE TABLE IF NOT EXISTS `tbl_customer` (
  `customer_id` int(11) NOT NULL AUTO_INCREMENT,
  `fullfame` varchar(100) DEFAULT NULL,
  `sex` varchar(1) DEFAULT NULL,
  `idcard` varchar(17) DEFAULT NULL,
  `address` varchar(250) DEFAULT NULL,
  `province_id` varchar(2) DEFAULT NULL,
  `telephone` varchar(100) DEFAULT NULL,
  `customer_picture` tinyblob,
  PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table node_db.tbl_customer: ~0 rows (approximately)
/*!40000 ALTER TABLE `tbl_customer` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_customer` ENABLE KEYS */;

-- Dumping structure for table node_db.tbl_order
CREATE TABLE IF NOT EXISTS `tbl_order` (
  `order_id` int(11) NOT NULL AUTO_INCREMENT,
  `supplier_id` int(11) DEFAULT NULL,
  `po_no` varchar(15) DEFAULT NULL,
  `order_date` datetime DEFAULT NULL,
  `receive_date` datetime DEFAULT NULL,
  `paid_date` datetime DEFAULT NULL,
  `net_dc` double DEFAULT NULL,
  `vat_rate` double DEFAULT NULL,
  `net_vat` double DEFAULT NULL,
  `net` double DEFAULT NULL,
  `is_received_all` varchar(1) DEFAULT NULL,
  `is_paid` varchar(1) DEFAULT NULL,
  `is_normal` varchar(1) DEFAULT NULL,
  `order_by` varchar(16) DEFAULT NULL,
  `received_by` varchar(16) DEFAULT NULL,
  `paid_by` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table node_db.tbl_order: ~0 rows (approximately)
/*!40000 ALTER TABLE `tbl_order` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_order` ENABLE KEYS */;

-- Dumping structure for table node_db.tbl_order_detail
CREATE TABLE IF NOT EXISTS `tbl_order_detail` (
  `order_id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `number_to_order` int(11) DEFAULT NULL,
  `unit_id` varchar(4) DEFAULT NULL,
  `number_to_received` int(11) DEFAULT NULL,
  `cost` double DEFAULT NULL,
  `discount_per_unit` double DEFAULT NULL,
  `total_discount` double DEFAULT NULL,
  `total` double DEFAULT NULL,
  `is_received_all` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`product_id`,`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table node_db.tbl_order_detail: ~0 rows (approximately)
/*!40000 ALTER TABLE `tbl_order_detail` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_order_detail` ENABLE KEYS */;

-- Dumping structure for table node_db.tbl_product
CREATE TABLE IF NOT EXISTS `tbl_product` (
  `product_id` int(11) NOT NULL AUTO_INCREMENT,
  `product_name` varchar(100) DEFAULT NULL,
  `supplier_id` int(11) DEFAULT NULL,
  `category_id` int(11) DEFAULT NULL,
  `last_cost` double DEFAULT NULL,
  `cost_avg` double DEFAULT NULL,
  `sale_price` double DEFAULT NULL,
  `product_status` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- Dumping data for table node_db.tbl_product: ~5 rows (approximately)
/*!40000 ALTER TABLE `tbl_product` DISABLE KEYS */;
INSERT INTO `tbl_product` (`product_id`, `product_name`, `supplier_id`, `category_id`, `last_cost`, `cost_avg`, `sale_price`, `product_status`) VALUES
	(1, 'Java', 1, 2, 200.5, 200.5, 250.5, '1'),
	(2, 'Node.JS', 11220, 20123, 500, 500, 690, '1'),
	(3, 'Node.JS', 11220, 20123, 500, 500, 690, '1'),
	(4, 'Node.JS', 11220, 20123, 500, 500, 690, '1'),
	(5, 'Node.JS', 11220, 20123, 500, 500, 690, '1');
/*!40000 ALTER TABLE `tbl_product` ENABLE KEYS */;

-- Dumping structure for table node_db.tbl_role
CREATE TABLE IF NOT EXISTS `tbl_role` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `role_de_id` int(11) DEFAULT NULL,
  `role_name` varchar(50) DEFAULT NULL,
  `create_date` date DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Dumping data for table node_db.tbl_role: ~1 rows (approximately)
/*!40000 ALTER TABLE `tbl_role` DISABLE KEYS */;
INSERT INTO `tbl_role` (`role_id`, `role_de_id`, `role_name`, `create_date`) VALUES
	(2, 2, 'ADMIN', '2017-12-18');
/*!40000 ALTER TABLE `tbl_role` ENABLE KEYS */;

-- Dumping structure for table node_db.tbl_role_detail
CREATE TABLE IF NOT EXISTS `tbl_role_detail` (
  `role_de_id` int(11) NOT NULL,
  `permission` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`role_de_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table node_db.tbl_role_detail: ~1 rows (approximately)
/*!40000 ALTER TABLE `tbl_role_detail` DISABLE KEYS */;
INSERT INTO `tbl_role_detail` (`role_de_id`, `permission`) VALUES
	(2, 'INSERT,UPDATE,DELETE,PUT');
/*!40000 ALTER TABLE `tbl_role_detail` ENABLE KEYS */;

-- Dumping structure for table node_db.tbl_sale
CREATE TABLE IF NOT EXISTS `tbl_sale` (
  `sale_id` int(11) NOT NULL AUTO_INCREMENT,
  `customer_id` int(11) DEFAULT NULL,
  `sale_date` datetime DEFAULT NULL,
  `net_dc_by_sale` double DEFAULT NULL,
  `net_vat` double DEFAULT NULL,
  `net_total` double DEFAULT NULL,
  `net_paid_to_supplier` double DEFAULT NULL,
  `net_me_received` double DEFAULT NULL,
  `sale_by` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`sale_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table node_db.tbl_sale: ~0 rows (approximately)
/*!40000 ALTER TABLE `tbl_sale` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_sale` ENABLE KEYS */;

-- Dumping structure for table node_db.tbl_sale_detail
CREATE TABLE IF NOT EXISTS `tbl_sale_detail` (
  `sale_id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `amount` int(11) DEFAULT NULL,
  `sale_price` double DEFAULT NULL,
  `dc_by_member` double DEFAULT NULL,
  `dc_by_sale` double DEFAULT NULL,
  `vat` double DEFAULT NULL,
  `total` double DEFAULT NULL,
  `paid_to_supplier` double DEFAULT NULL,
  `me_received` double DEFAULT NULL,
  `is_paid` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`sale_id`,`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table node_db.tbl_sale_detail: ~0 rows (approximately)
/*!40000 ALTER TABLE `tbl_sale_detail` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_sale_detail` ENABLE KEYS */;

-- Dumping structure for table node_db.tbl_user
CREATE TABLE IF NOT EXISTS `tbl_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) DEFAULT NULL,
  `firstname` varchar(100) DEFAULT NULL,
  `lastname` varchar(100) DEFAULT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(65) NOT NULL,
  `token_no` varchar(256) DEFAULT NULL,
  `last_update` varchar(50) DEFAULT NULL,
  `create_date` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- Dumping data for table node_db.tbl_user: ~2 rows (approximately)
/*!40000 ALTER TABLE `tbl_user` DISABLE KEYS */;
INSERT INTO `tbl_user` (`user_id`, `role_id`, `firstname`, `lastname`, `username`, `password`, `token_no`, `last_update`, `create_date`) VALUES
	(2, 2, 'Kraipob', 'Saengkhunthod', 'pob@gmail.com', '1234', '991201', '2018-01-15', '2017-12-18'),
	(11, 0, 'sf', 'sdf', 'pob@gmail.com', '123456', '15160371942009461218589613e21f', '2018-01-16 12:26:34', '2018-01-16 12:26:34');
/*!40000 ALTER TABLE `tbl_user` ENABLE KEYS */;

-- Dumping structure for table node_db.tb_group_product
CREATE TABLE IF NOT EXISTS `tb_group_product` (
  `group_product_id` int(11) NOT NULL AUTO_INCREMENT,
  `group_product_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `group_product_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `group_product_detail` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `group_product_created_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `group_product_last_update` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`group_product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- Dumping data for table node_db.tb_group_product: ~6 rows (approximately)
/*!40000 ALTER TABLE `tb_group_product` DISABLE KEYS */;
INSERT INTO `tb_group_product` (`group_product_id`, `group_product_code`, `group_product_name`, `group_product_detail`, `group_product_created_date`, `group_product_last_update`) VALUES
	(4, 'AU-10022', 'อาหารแห้ง', 'สินค้าส่งขายในประเทศ', '2018-01-09 11:36:19', '2018-01-14 12:28:05'),
	(5, 'AC-00112', 'ขนมขมเขี้ยว', 'สินค้าส่งออก', '2018-01-12 00:29:36', '2018-01-12 00:29:47'),
	(6, 'AE-15209', 'สปริงเกอร์', 'สินค้านำเข้า', NULL, '2018-01-13 02:56:11'),
	(7, 'AP-12342', 'อาหารกระป๋อง', 'สินค้านำเข้า', '2018-01-10 10:00:07', '2018-01-13 12:33:41'),
	(8, 'CF-18433', 'เครื่องดื่มเกลือแร่', 'ขายในประเทศ', '2018-01-11 12:28:14', '2018-01-14 01:27:22'),
	(21, 'O-088734', 'น้ำเปล่า', 'ขายส่ง', '2018-01-14 01:28:26', '2018-01-14 01:28:26');
/*!40000 ALTER TABLE `tb_group_product` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
