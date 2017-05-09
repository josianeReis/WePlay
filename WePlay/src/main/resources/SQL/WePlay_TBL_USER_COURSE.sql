CREATE DATABASE  IF NOT EXISTS `WePlay` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `WePlay`;
-- MySQL dump 10.13  Distrib 5.7.17, for Linux (x86_64)
--
-- Host: localhost    Database: WePlay
-- ------------------------------------------------------
-- Server version	5.7.18

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
-- Table structure for table `TBL_USER_COURSE`
--

DROP TABLE IF EXISTS `TBL_USER_COURSE`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `TBL_USER_COURSE` (
  `USERCOURSE_ID` int(11) NOT NULL AUTO_INCREMENT,
  `USERCOURSE_COURSER` int(11) NOT NULL,
  `USERCOURSE_USER` int(11) NOT NULL,
  `USERCOURSE_STATUS` varchar(10) DEFAULT NULL,
  `USERCOURSE_START` date DEFAULT NULL,
  `USERCOURSE_END` date DEFAULT NULL,
  PRIMARY KEY (`USERCOURSE_ID`),
  CONSTRAINT `USERCOURSE_COURSER` FOREIGN KEY (`USERCOURSE_ID`) REFERENCES `TBL_COURSE` (`COURSE_ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `USERCOURSE_USER_ID` FOREIGN KEY (`USERCOURSE_ID`) REFERENCES `TBL_USER` (`USER_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `TBL_USER_COURSE`
--

LOCK TABLES `TBL_USER_COURSE` WRITE;
/*!40000 ALTER TABLE `TBL_USER_COURSE` DISABLE KEYS */;
/*!40000 ALTER TABLE `TBL_USER_COURSE` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-09  8:13:46
