-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: nostalgicbueno
-- ------------------------------------------------------
-- Server version	5.5.58-log

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
-- Table structure for table `conversacion`
--

DROP TABLE IF EXISTS `conversacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `conversacion` (
  `idconversacion` int(11) NOT NULL AUTO_INCREMENT,
  `Usuario_1` int(11) DEFAULT NULL,
  `Usuario_2` int(11) DEFAULT NULL,
  `Time` datetime DEFAULT NULL,
  `Actualizar` bit(1) DEFAULT NULL,
  `Usuario_1_Leido` bit(1) DEFAULT NULL,
  `Usuario_2_Leido` bit(1) DEFAULT NULL,
  PRIMARY KEY (`idconversacion`),
  KEY `fk_Usuario1_idx` (`Usuario_1`),
  KEY `fk_Usuario2_idx` (`Usuario_2`),
  CONSTRAINT `fk_Usuario1` FOREIGN KEY (`Usuario_1`) REFERENCES `usuario` (`idusuario`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Usuario2` FOREIGN KEY (`Usuario_2`) REFERENCES `usuario` (`idusuario`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `conversacion`
--

LOCK TABLES `conversacion` WRITE;
/*!40000 ALTER TABLE `conversacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `conversacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lista_contacto`
--

DROP TABLE IF EXISTS `lista_contacto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lista_contacto` (
  `idlista_Contacto` int(11) NOT NULL AUTO_INCREMENT,
  `lista_Contacto` varchar(45) DEFAULT NULL,
  `idUsuario` int(11) DEFAULT NULL,
  PRIMARY KEY (`idlista_Contacto`),
  KEY `fk_Usuario_Lista_idx` (`idUsuario`),
  CONSTRAINT `fk_Usuario_Lista` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idusuario`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lista_contacto`
--

LOCK TABLES `lista_contacto` WRITE;
/*!40000 ALTER TABLE `lista_contacto` DISABLE KEYS */;
/*!40000 ALTER TABLE `lista_contacto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reply`
--

DROP TABLE IF EXISTS `reply`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reply` (
  `idreply` int(11) NOT NULL AUTO_INCREMENT,
  `Reply` text,
  `User` int(11) DEFAULT NULL,
  `Time` datetime DEFAULT NULL,
  `Status` bit(1) DEFAULT NULL,
  `Status_1_Recibido` bit(1) DEFAULT NULL,
  `Status_2_Recibido` bit(1) DEFAULT NULL,
  `idConversacion` int(11) DEFAULT NULL,
  PRIMARY KEY (`idreply`),
  KEY `fk_Reply_Usuario_idx` (`User`),
  KEY `fk_Reply_Conversacion_idx` (`idConversacion`),
  CONSTRAINT `fk_Reply_Usuario` FOREIGN KEY (`User`) REFERENCES `usuario` (`idusuario`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Reply_Conversacion` FOREIGN KEY (`idConversacion`) REFERENCES `conversacion` (`idconversacion`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reply`
--

LOCK TABLES `reply` WRITE;
/*!40000 ALTER TABLE `reply` DISABLE KEYS */;
/*!40000 ALTER TABLE `reply` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `idusuario` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(45) DEFAULT NULL,
  `NickName` varchar(45) DEFAULT NULL,
  `Telefono` varchar(45) DEFAULT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `Contraseña` varchar(45) DEFAULT NULL,
  `Lista_Contacto` int(11) DEFAULT NULL,
  PRIMARY KEY (`idusuario`),
  KEY `fk_Lista_Contacto_idx` (`Lista_Contacto`),
  CONSTRAINT `fk_Lista_Contacto` FOREIGN KEY (`Lista_Contacto`) REFERENCES `lista_contacto` (`idlista_Contacto`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-11-16 21:21:36
