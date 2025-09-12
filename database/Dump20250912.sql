CREATE DATABASE  IF NOT EXISTS `banksystem` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `banksystem`;
-- MySQL dump 10.13  Distrib 8.0.43, for Win64 (x86_64)
--
-- Host: localhost    Database: banksystem
-- ------------------------------------------------------
-- Server version	8.0.43

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bank`
--

DROP TABLE IF EXISTS `bank`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bank` (
  `pin` varchar(30) DEFAULT NULL,
  `date` varchar(30) DEFAULT NULL,
  `type` varchar(30) DEFAULT NULL,
  `amount` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bank`
--

LOCK TABLES `bank` WRITE;
/*!40000 ALTER TABLE `bank` DISABLE KEYS */;
INSERT INTO `bank` VALUES ('','Sun Aug 17 20:31:24 PKT 2025','Deposit','1000'),('','Sun Aug 17 20:35:31 PKT 2025','Deposit','2000'),('','Thu Aug 21 23:17:41 PKT 2025','Deposit','500'),('','Sun Aug 24 23:03:11 PKT 2025','Deposit','500'),('','Sun Aug 24 23:03:38 PKT 2025','Deposit','1000'),('','Sun Aug 24 23:13:50 PKT 2025','Withdraw','500'),('','Tue Aug 26 23:23:31 PKT 2025','Deposit','500'),('','Tue Aug 26 23:23:43 PKT 2025','Withdraw','500'),('','Wed Sep 03 12:27:39 PKT 2025','Deposit','500'),('','Wed Sep 03 12:40:34 PKT 2025','Deposit','500'),('','Wed Sep 03 17:03:28 PKT 2025','Withdraw','500'),('','Wed Sep 03 17:03:43 PKT 2025','Deposit','1500'),('','Wed Sep 03 17:03:50 PKT 2025','Withdraw','500'),('','Wed Sep 03 17:03:57 PKT 2025','Withdraw','100'),('','Wed Sep 03 17:06:33 PKT 2025','Deposit','100'),('','Wed Sep 03 17:06:40 PKT 2025','Withdraw','100'),('','Wed Sep 03 17:09:02 PKT 2025','Withdraw','100'),('','Wed Sep 03 17:09:16 PKT 2025','Withdraw','150'),('','Wed Sep 03 17:09:30 PKT 2025','Withdraw','150'),('','Wed Sep 03 17:09:42 PKT 2025','Withdraw','500'),('','Sun Sep 07 23:23:03 PKT 2025','Deposit','500'),('8126','Wed Sep 10 19:55:15 PKT 2025','Deposit','5000'),('8126','Wed Sep 10 19:55:27 PKT 2025','Withdraw','1000'),('8126','Wed Sep 10 19:59:24 PKT 2025','Withdraw','500'),('8126','Thu Sep 11 22:40:40 PKT 2025','Deposit','500');
/*!40000 ALTER TABLE `bank` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `login` (
  `form_no` varchar(30) DEFAULT NULL,
  `card_no` varchar(30) DEFAULT NULL,
  `pin` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES ('','8271889077063309',''),('','0738061866572068',''),('','0446208396111099',''),('1823','1093782891988704',''),('5672','8522749795869886',''),('8770','3228223340162736',''),('','8798614580994932',''),('5280','3654499233787164',''),('1445','8812471323661596',''),('','6700989682004681','8126'),('','0934920577404479','3957');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `signup`
--

DROP TABLE IF EXISTS `signup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `signup` (
  `form_no` varchar(30) DEFAULT NULL,
  `name` varchar(30) DEFAULT NULL,
  `fname` varchar(30) DEFAULT NULL,
  `gender` varchar(30) DEFAULT NULL,
  `dob` varchar(30) DEFAULT NULL,
  `email` varchar(60) DEFAULT NULL,
  `marital_status` varchar(30) DEFAULT NULL,
  `address` varchar(60) DEFAULT NULL,
  `city` varchar(30) DEFAULT NULL,
  `pincode` varchar(30) DEFAULT NULL,
  `state` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `signup`
--

LOCK TABLES `signup` WRITE;
/*!40000 ALTER TABLE `signup` DISABLE KEYS */;
INSERT INTO `signup` VALUES ('5310','s','s','Male','Aug 11, 2025','s','Married','s','s','s','s'),('5223','s','a','Male','Aug 13, 2025','a','Married','a','a','a','a'),('5089','a','a','Male','Aug 6, 2025','a','Married','s','s','s','s'),('1657','a','a','Male','Aug 13, 2025','a','Married','s','s','s','d'),('1657','a','a','Male','Aug 13, 2025','a','Married','s','s','s','d'),('1657','a','a','Male','Aug 13, 2025','a','Married','s','s','s','f'),('1657','a','a','Male','Aug 13, 2025','a','Married','s','s','s','f'),('2005','a','a','Male','Aug 7, 2025','a','Married','a','a','a','a'),('2005','a','a','Male','Aug 7, 2025','a','Married','a','a','a','a'),('2005','a','a','Male','Aug 7, 2025','a','Married','a','a','a','a'),('2005','a','a','Male','Aug 7, 2025','a','Married','a','a','a','a'),('1184','s','s','Male','Aug 8, 2025','s','Unmarried','s','s','s','s'),('2940','q','q','Male','Aug 5, 2025','q','Married','q','q','q','q'),('1392','sheeraz','ahmed','Male','Aug 4, 2025','shyksheeraz671@gmail.com','Unmarried','lkdsl','larkana','1234','larkana'),('1823','ed','d','Male','Aug 7, 2025','shyksheeraz671@gmail.com','Married','d','dd','d','d'),('5672','x','x','Male','Aug 7, 2025','x@gmail.com','Unmarried','x','x','x','x'),('3934','a','a','Male','Aug 19, 2025','a@gmail.com','Married','a','a','a','a'),('8770','q','q','Male','Aug 6, 2025','q@gmail.com','Married','q','q','q','q'),('5280','marco','ahmed','Male','Sep 2, 2025','lkdsjklsdlkf@gmail.com','Married',';lsdkf;llsdk','lslakdfl;sdk','12e78','sdjflksd'),('1445','sa','sa','Male','Sep 11, 2025','sa@gmail.com','Married','sa','sa','sa','sa');
/*!40000 ALTER TABLE `signup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `signup2`
--

DROP TABLE IF EXISTS `signup2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `signup2` (
  `form_no` varchar(30) DEFAULT NULL,
  `religion` varchar(30) DEFAULT NULL,
  `income` varchar(30) DEFAULT NULL,
  `education` varchar(30) DEFAULT NULL,
  `occupation` varchar(30) DEFAULT NULL,
  `cnic` varchar(60) DEFAULT NULL,
  `senior_citizen` varchar(30) DEFAULT NULL,
  `existing_acc` varchar(60) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `signup2`
--

LOCK TABLES `signup2` WRITE;
/*!40000 ALTER TABLE `signup2` DISABLE KEYS */;
INSERT INTO `signup2` VALUES ('','Muslim','null','Non-Graduate','Student','432033333333','No','No'),('1823','Muslim','null','Non-Graduate','Salaried','6348q29030329','No','No'),('5672','Muslim','null','Non-Graduate','Student','x','No','No'),('3934','Muslim','null','Non-Graduate','Salaried','a','No','No'),('8770','Muslim','null','Non-Graduate','Salaried','67328498230','Yes','Yes'),('5280','Muslim','null','Non-Graduate','Salaried','63278432980923','Yes','No'),('1445','Muslim','null','Non-Graduate','Salaried','sa','Yes','Yes');
/*!40000 ALTER TABLE `signup2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `signup3`
--

DROP TABLE IF EXISTS `signup3`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `signup3` (
  `form_no` varchar(30) DEFAULT NULL,
  `account_type` varchar(30) DEFAULT NULL,
  `card_no` varchar(30) DEFAULT NULL,
  `pin` varchar(30) DEFAULT NULL,
  `services` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `signup3`
--

LOCK TABLES `signup3` WRITE;
/*!40000 ALTER TABLE `signup3` DISABLE KEYS */;
INSERT INTO `signup3` VALUES ('','Saving Account','8271889077063309','9368','ATM Card, Cheque Book, E-Statement'),('','Saving Account','0738061866572068','9013','ATM Card, Cheque Book, Email Alerts, E-Statement'),('','Current Account','0446208396111099','6969','Internet Banking, E-Statement'),('1823','Current Account','1093782891988704','6441','Email Alerts, E-Statement'),('5672','Saving Account','8522749795869886','9638','ATM Card, Internet Banking, E-Statement'),('8770','Saving Account','3228223340162736','6436','ATM Card, E-Statement'),('','Saving Account','8798614580994932','7708','ATM Card, E-Statement'),('5280','Saving Account','3654499233787164','4603','ATM Card, E-Statement'),('1445','Saving Account','8812471323661596','','ATM Card, E-Statement'),('','Saving Account','6700989682004681','8126','Internet Banking, E-Statement'),('','Current Account','0934920577404479','3957','ATM Card, E-Statement');
/*!40000 ALTER TABLE `signup3` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-09-12 17:30:20
