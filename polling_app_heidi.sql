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


-- Dumping database structure for polling_app
CREATE DATABASE IF NOT EXISTS `polling_app` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `polling_app`;

-- Dumping structure for table polling_app.choices
CREATE TABLE IF NOT EXISTS `choices` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `text` varchar(40) NOT NULL,
  `poll_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_choices_poll_id` (`poll_id`),
  CONSTRAINT `fk_choices_poll_id` FOREIGN KEY (`poll_id`) REFERENCES `polls` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- Dumping data for table polling_app.choices: ~6 rows (approximately)
/*!40000 ALTER TABLE `choices` DISABLE KEYS */;
INSERT INTO `choices` (`id`, `text`, `poll_id`) VALUES
	(1, 'It\'s a progressive web framework', 1),
	(2, 'web for building user interface', 1),
	(3, 'test1', 2),
	(4, 'test2', 2),
	(5, 'Yes.', 3),
	(6, 'No.', 3);
/*!40000 ALTER TABLE `choices` ENABLE KEYS */;

-- Dumping structure for table polling_app.parties
CREATE TABLE IF NOT EXISTS `parties` (
  `party_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `location` varchar(64) DEFAULT NULL,
  `party_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`party_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Dumping data for table polling_app.parties: ~2 rows (approximately)
/*!40000 ALTER TABLE `parties` DISABLE KEYS */;
INSERT INTO `parties` (`party_id`, `location`, `party_date`) VALUES
	(1, 'Old Folks Club', '2016-09-20 00:00:00'),
	(2, 'Luxury Yacht Party', '2016-12-05 00:00:00');
/*!40000 ALTER TABLE `parties` ENABLE KEYS */;

-- Dumping structure for table polling_app.people
CREATE TABLE IF NOT EXISTS `people` (
  `person_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`person_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Dumping data for table polling_app.people: ~3 rows (approximately)
/*!40000 ALTER TABLE `people` DISABLE KEYS */;
INSERT INTO `people` (`person_id`, `name`, `age`) VALUES
	(1, 'Peter', 25),
	(2, 'John', 30),
	(3, 'Katie', 18);
/*!40000 ALTER TABLE `people` ENABLE KEYS */;

-- Dumping structure for table polling_app.people_parties
CREATE TABLE IF NOT EXISTS `people_parties` (
  `person_id` bigint(20) NOT NULL,
  `party_id` bigint(20) NOT NULL,
  PRIMARY KEY (`person_id`,`party_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table polling_app.people_parties: ~4 rows (approximately)
/*!40000 ALTER TABLE `people_parties` DISABLE KEYS */;
INSERT INTO `people_parties` (`person_id`, `party_id`) VALUES
	(1, 1),
	(1, 2),
	(2, 1),
	(3, 2);
/*!40000 ALTER TABLE `people_parties` ENABLE KEYS */;

-- Dumping structure for table polling_app.polls
CREATE TABLE IF NOT EXISTS `polls` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `question` varchar(140) NOT NULL,
  `expiration_date_time` datetime NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `created_by` bigint(20) DEFAULT NULL,
  `updated_by` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Dumping data for table polling_app.polls: ~0 rows (approximately)
/*!40000 ALTER TABLE `polls` DISABLE KEYS */;
INSERT INTO `polls` (`id`, `question`, `expiration_date_time`, `created_at`, `updated_at`, `created_by`, `updated_by`) VALUES
	(1, 'What is Vue.js?', '2018-05-22 17:55:49', '2018-05-21 16:55:49', '2018-05-21 16:55:49', 1, 1),
	(2, 'Spring boot', '2018-06-05 19:19:54', '2018-06-04 18:19:54', '2018-06-04 18:19:54', 4, 4),
	(3, 'VueJS is a framework which most the best performance', '2018-09-25 10:05:35', '2018-09-17 14:05:35', '2018-09-17 14:05:35', 1, 1);
/*!40000 ALTER TABLE `polls` ENABLE KEYS */;

-- Dumping structure for table polling_app.role
CREATE TABLE IF NOT EXISTS `role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table polling_app.role: ~0 rows (approximately)
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
/*!40000 ALTER TABLE `role` ENABLE KEYS */;

-- Dumping structure for table polling_app.roles
CREATE TABLE IF NOT EXISTS `roles` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(60) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_roles_name` (`name`),
  UNIQUE KEY `UK_nb4h0p6txrmfc0xbrd1kglp9t` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- Dumping data for table polling_app.roles: ~2 rows (approximately)
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
INSERT INTO `roles` (`id`, `name`) VALUES
	(5, 'ROLE_ADMIN'),
	(4, 'ROLE_USER');
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;

-- Dumping structure for table polling_app.skills
CREATE TABLE IF NOT EXISTS `skills` (
  `skill_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `person_id` bigint(20) DEFAULT NULL,
  `name` varchar(16) DEFAULT NULL,
  `level` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`skill_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- Dumping data for table polling_app.skills: ~5 rows (approximately)
/*!40000 ALTER TABLE `skills` DISABLE KEYS */;
INSERT INTO `skills` (`skill_id`, `person_id`, `name`, `level`) VALUES
	(1, 1, 'Juggling', 'GOOD'),
	(2, 1, 'Dancing', 'AWESOME'),
	(3, 2, 'Juggling', 'AWESOME'),
	(4, 2, 'Story-telling', 'GODLIKE'),
	(5, 3, 'Singing', 'GOOD');
/*!40000 ALTER TABLE `skills` ENABLE KEYS */;

-- Dumping structure for table polling_app.tasks
CREATE TABLE IF NOT EXISTS `tasks` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `is_completed` bit(1) NOT NULL,
  `task_text` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table polling_app.tasks: ~0 rows (approximately)
/*!40000 ALTER TABLE `tasks` DISABLE KEYS */;
/*!40000 ALTER TABLE `tasks` ENABLE KEYS */;

-- Dumping structure for table polling_app.user
CREATE TABLE IF NOT EXISTS `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `age` int(11) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `salary` bigint(20) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table polling_app.user: ~0 rows (approximately)
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

-- Dumping structure for table polling_app.users
CREATE TABLE IF NOT EXISTS `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) NOT NULL,
  `username` varchar(15) NOT NULL,
  `email` varchar(40) NOT NULL,
  `password` varchar(100) NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_users_username` (`username`),
  UNIQUE KEY `uk_users_email` (`email`),
  UNIQUE KEY `UKr43af9ap4edm43mmtq01oddj6` (`username`),
  UNIQUE KEY `UK6dotkott2kjsp8vw4d0m25fb7` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- Dumping data for table polling_app.users: ~3 rows (approximately)
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` (`id`, `name`, `username`, `email`, `password`, `created_at`, `updated_at`) VALUES
	(1, 'Kraipob', 'Saengkhunthod', 'pobsaeng@gmail.com', '$2a$10$BRb5vH97f3vO8ucElmWBmeHvwDgfO08uswfgAuQ/UFMYa31wVDMlu', '2018-05-21 16:52:55', '2018-05-21 16:52:55'),
	(4, 'John', 'john', 'john@gmail.com', '$2a$10$BRb5vH97f3vO8ucElmWBmeHvwDgfO08uswfgAuQ/UFMYa31wVDMlu', '2018-06-04 17:33:17', '2018-06-04 17:33:17'),
	(5, 'paew', 'paew', 'paew@gmail.com', '$2a$10$bYD5a7sS3Bj8WTGap4YQv.htZ1ggnIbegxbRLMcsacdUJ/UGUR4Ky', '2018-06-04 17:41:32', '2018-06-04 17:41:32');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;

-- Dumping structure for table polling_app.user_roles
CREATE TABLE IF NOT EXISTS `user_roles` (
  `user_id` bigint(20) NOT NULL,
  `role_id` bigint(20) NOT NULL,
  PRIMARY KEY (`user_id`,`role_id`),
  KEY `fk_user_roles_role_id` (`role_id`),
  CONSTRAINT `FKh8ciramu9cc9q3qcqiv4ue8a6` FOREIGN KEY (`role_id`) REFERENCES `roles` (`id`),
  CONSTRAINT `FKhfh9dx7w3ubf1co1vdev94g3f` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`),
  CONSTRAINT `fk_user_roles_role_id` FOREIGN KEY (`role_id`) REFERENCES `roles` (`id`),
  CONSTRAINT `fk_user_roles_user_id` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table polling_app.user_roles: ~3 rows (approximately)
/*!40000 ALTER TABLE `user_roles` DISABLE KEYS */;
INSERT INTO `user_roles` (`user_id`, `role_id`) VALUES
	(1, 4),
	(4, 4),
	(5, 4);
/*!40000 ALTER TABLE `user_roles` ENABLE KEYS */;

-- Dumping structure for table polling_app.votes
CREATE TABLE IF NOT EXISTS `votes` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NOT NULL,
  `poll_id` bigint(20) NOT NULL,
  `choice_id` bigint(20) NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK8um9h2wxsdjrgx3rjjwvny676` (`poll_id`,`user_id`),
  KEY `fk_votes_user_id` (`user_id`),
  KEY `fk_votes_poll_id` (`poll_id`),
  KEY `fk_votes_choice_id` (`choice_id`),
  CONSTRAINT `fk_votes_choice_id` FOREIGN KEY (`choice_id`) REFERENCES `choices` (`id`),
  CONSTRAINT `fk_votes_poll_id` FOREIGN KEY (`poll_id`) REFERENCES `polls` (`id`),
  CONSTRAINT `fk_votes_user_id` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Dumping data for table polling_app.votes: ~0 rows (approximately)
/*!40000 ALTER TABLE `votes` DISABLE KEYS */;
INSERT INTO `votes` (`id`, `user_id`, `poll_id`, `choice_id`, `created_at`, `updated_at`) VALUES
	(1, 1, 1, 1, '2018-05-21 16:55:53', '2018-05-21 16:55:53'),
	(2, 1, 3, 5, '2018-09-17 14:06:49', '2018-09-17 14:06:49');
/*!40000 ALTER TABLE `votes` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
