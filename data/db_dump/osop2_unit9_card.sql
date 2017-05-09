CREATE DATABASE  IF NOT EXISTS `osop2` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `osop2`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: osop2
-- ------------------------------------------------------
-- Server version	5.7.18-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `unit9_card`
--

DROP TABLE IF EXISTS `unit9_card`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `unit9_card` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `protocol_creating_date` varchar(10) DEFAULT NULL,
  `commiting_AV_date` varchar(10) DEFAULT NULL,
  `theory` varchar(100) DEFAULT NULL,
  `offender_name` varchar(45) DEFAULT NULL,
  `birthday` varchar(10) DEFAULT NULL,
  `military_unit_name` varchar(45) DEFAULT NULL,
  `post` varchar(45) DEFAULT NULL,
  `refer_to_court_date` varchar(10) DEFAULT NULL,
  `receiving_court_decision_date` varchar(10) DEFAULT NULL,
  `repeated_refer_to_court_date` varchar(10) DEFAULT NULL,
  `court_decision_date` varchar(10) DEFAULT NULL,
  `receiving_date_main` varchar(10) DEFAULT NULL,
  `begining_punishment_date` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `unit9_card`
--

LOCK TABLES `unit9_card` WRITE;
/*!40000 ALTER TABLE `unit9_card` DISABLE KEYS */;
INSERT INTO `unit9_card` VALUES (1,'11.01.2015','12.11.2016','hfgnfg643634','trrythf64hfh','10.02.1922','gfdg436','jgj6hfg','11.11.2011','15.04.1999','02.05.2005','05.05.2005','05.08.2008','05.05.2006'),(2,'12.02.2000','12.11.2016','eryrty54654','hfdht64465','11.02.1955','reyre65yh','ggdfhfd','02.04.2000','02.02.2011','07.07.2007','07.07.2017','06.06.2006','08.09.2009');
/*!40000 ALTER TABLE `unit9_card` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-09 15:19:35
