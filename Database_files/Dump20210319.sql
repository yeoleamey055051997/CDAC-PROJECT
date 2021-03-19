-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: localhost    Database: edac
-- ------------------------------------------------------
-- Server version	8.0.23

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
-- Table structure for table `conferm_four_wheeler`
--

DROP TABLE IF EXISTS `conferm_four_wheeler`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `conferm_four_wheeler` (
  `id` int NOT NULL,
  `floar` int NOT NULL,
  `name` varchar(50) NOT NULL DEFAULT '',
  `email` varchar(50) NOT NULL DEFAULT '',
  `date1` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `conferm_four_wheeler`
--

LOCK TABLES `conferm_four_wheeler` WRITE;
/*!40000 ALTER TABLE `conferm_four_wheeler` DISABLE KEYS */;
/*!40000 ALTER TABLE `conferm_four_wheeler` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `conferm_two_wheeler`
--

DROP TABLE IF EXISTS `conferm_two_wheeler`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `conferm_two_wheeler` (
  `id` int NOT NULL,
  `floar` int NOT NULL,
  `name` varchar(50) NOT NULL DEFAULT '',
  `email` varchar(50) NOT NULL DEFAULT '',
  `date1` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `conferm_two_wheeler`
--

LOCK TABLES `conferm_two_wheeler` WRITE;
/*!40000 ALTER TABLE `conferm_two_wheeler` DISABLE KEYS */;
INSERT INTO `conferm_two_wheeler` VALUES (1,2,'ameyyeole','ameyuauhjhcc','18/03/2021 17:13:44'),(2,2,'amey','ameyyeole ','17/03/2021 20:08:59');
/*!40000 ALTER TABLE `conferm_two_wheeler` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `four_w`
--

DROP TABLE IF EXISTS `four_w`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `four_w` (
  `id` int NOT NULL,
  `floar` int NOT NULL,
  `booking_status` bit(1) NOT NULL DEFAULT b'0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `four_w`
--

LOCK TABLES `four_w` WRITE;
/*!40000 ALTER TABLE `four_w` DISABLE KEYS */;
INSERT INTO `four_w` VALUES (3,1,_binary '');
/*!40000 ALTER TABLE `four_w` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `owner`
--

DROP TABLE IF EXISTS `owner`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `owner` (
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `owner`
--

LOCK TABLES `owner` WRITE;
/*!40000 ALTER TABLE `owner` DISABLE KEYS */;
INSERT INTO `owner` VALUES ('amey','yeole');
/*!40000 ALTER TABLE `owner` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `parking_details`
--

DROP TABLE IF EXISTS `parking_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `parking_details` (
  `id` int NOT NULL,
  `floar` int NOT NULL,
  `vehicle_type` varchar(50) NOT NULL DEFAULT '',
  `capacity` int NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `parking_details`
--

LOCK TABLES `parking_details` WRITE;
/*!40000 ALTER TABLE `parking_details` DISABLE KEYS */;
INSERT INTO `parking_details` VALUES (78,89,'lp',52),(85,96,'oiu',87),(75269,785,'kjhgf',4123);
/*!40000 ALTER TABLE `parking_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `two_w`
--

DROP TABLE IF EXISTS `two_w`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `two_w` (
  `id` int NOT NULL DEFAULT '0',
  `floar` int DEFAULT NULL,
  `booking_status` bit(1) NOT NULL DEFAULT b'0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `two_w`
--

LOCK TABLES `two_w` WRITE;
/*!40000 ALTER TABLE `two_w` DISABLE KEYS */;
INSERT INTO `two_w` VALUES (1,2,_binary ''),(2,2,_binary ''),(5,0,_binary '');
/*!40000 ALTER TABLE `two_w` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'edac'
--

--
-- Dumping routines for database 'edac'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-03-19 12:55:25
