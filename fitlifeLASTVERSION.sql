-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: localhost    Database: academiafitlife
-- ------------------------------------------------------
-- Server version	8.0.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `aluno`
--

DROP TABLE IF EXISTS `aluno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `aluno` (
  `idMatricula` int(10) NOT NULL AUTO_INCREMENT,
  `idade` varchar(10) NOT NULL,
  `nome` varchar(20) NOT NULL,
  `sexo` varchar(15) NOT NULL,
  `celular` varchar(15) NOT NULL,
  `dataMatricula` varchar(15) NOT NULL,
  `id_plano` int(15) NOT NULL,
  `id_endereco` int(10) NOT NULL,
  PRIMARY KEY (`idMatricula`),
  KEY `id_aluno_endereco_idx` (`id_endereco`),
  CONSTRAINT `id_aluno_endereco` FOREIGN KEY (`id_endereco`) REFERENCES `endereco` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aluno`
--

LOCK TABLES `aluno` WRITE;
/*!40000 ALTER TABLE `aluno` DISABLE KEYS */;
INSERT INTO `aluno` VALUES (5,'23','Roberto Sousa','Masculino','37998099055','21/09/2017',2,34),(6,'28','Fernando Assis','Masculino','37992830098','11/05/2018',1,37),(7,'35','Andre Farias Fonseca','Masculino','37991202293','12/03/2017',2,38),(8,'24','Lucas de Morais','Masculino','319923302843','11/12/2018',2,40),(9,'41','Luiz Silva de Sousa','Masculino','37929229222','11/12/2018',1,41),(10,'22','Bruna Vieira','Outro','31992566776','18/02/2019',1,42),(11,'21','Amanda Silva','Feminino','37992309200','21/01/2019',1,44),(12,'20','Brenda Badaro','Feminino','77928301293','11/03/2019',3,45),(13,'20','Matheus Cotrim','Masculino','77990299089','11/03/2019',1,46),(14,'28','Paloma Oliveira','Feminino','77938192123','11/03/2019',1,47),(15,'23','asdasda','Feminino','21313123','32/13/3233',3,48);
/*!40000 ALTER TABLE `aluno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `caixa`
--

DROP TABLE IF EXISTS `caixa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `caixa` (
  `id_cnpj` int(15) NOT NULL,
  `saldo` int(10) NOT NULL,
  `data` int(10) NOT NULL,
  PRIMARY KEY (`id_cnpj`),
  UNIQUE KEY `id_cnpj_UNIQUE` (`id_cnpj`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `caixa`
--

LOCK TABLES `caixa` WRITE;
/*!40000 ALTER TABLE `caixa` DISABLE KEYS */;
/*!40000 ALTER TABLE `caixa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `endereco`
--

DROP TABLE IF EXISTS `endereco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `endereco` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `endereco` varchar(50) NOT NULL,
  `bairro` varchar(40) NOT NULL,
  `cep` varchar(10) DEFAULT NULL,
  `cidade` varchar(30) NOT NULL,
  `uf` varchar(15) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `endereco`
--

LOCK TABLES `endereco` WRITE;
/*!40000 ALTER TABLE `endereco` DISABLE KEYS */;
INSERT INTO `endereco` VALUES (25,'Rua do Limao','Centro','46430-000','Guanambi','BA'),(26,'Rua do Morango','Centro','35501-284','Formiga','MG'),(28,'','','     -   ','',''),(29,'','','     -   ','',''),(30,'','','     -   ','',''),(31,'','','     -   ','',''),(32,'','','     -   ','',''),(33,'','','     -   ','',''),(34,'Rua Roxa, 1293','Morada Nova','21341-242','Ermida','MG'),(35,'Rua Cinza, 2313','Paraiso','24324-234','Guanambi','BA'),(36,'Rua das Flores, 17','Pitanga','21312-312','Araujos','SP'),(37,'Rua Antonio Lima','Centro','23123-213','Carmo do Cajuru','MG'),(38,'Rua Verde, 1273','Pitangui','23132-131','Formiga','MG'),(39,'Rua Gustavo Limao','Bela Vista','35501-232','Divinopolis','MG'),(40,'Rua Sao Joao, 12','Morada Nova','34324-323','Divinopolis','MG'),(41,'Rua Antonieta, 233','Cacoco','23231-231','Divinopolis','MG'),(42,'Rua Lilas, 1273','Centro','21313-231','Governador Valadares','MG'),(43,'Rua Rosa com Roxo, 120','Nova Visao','21313-123','Ponte Grossa','MG'),(44,'Rua Joao Amaral, 1770','Morada Nova','12313-113','Divinopolis','MG'),(45,'Rua 02, 1720','Caipora','46430-000','Guanambi','BA'),(46,'Rua Espirito Santo, 32','Nova Visao','12381-093','Guanambi','BA'),(47,'Rua Azul, 100','Paraiso','46430-000','Guanambi','BA'),(48,'21312312','21312321','31231-232','21323','ba'),(49,'Rua do Abacaxi','Morada Nova','35501-253','Divinopolis','MG');
/*!40000 ALTER TABLE `endereco` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `exercicio`
--

DROP TABLE IF EXISTS `exercicio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `exercicio` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `nome` varchar(40) NOT NULL,
  `repeticao` int(5) DEFAULT NULL,
  `serie` int(5) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exercicio`
--

LOCK TABLES `exercicio` WRITE;
/*!40000 ALTER TABLE `exercicio` DISABLE KEYS */;
INSERT INTO `exercicio` VALUES (1,'Supino Reto',NULL,NULL),(2,'Supino Inclinado',NULL,NULL),(3,'Voador',NULL,NULL),(4,'Pullover',NULL,NULL),(5,'Barra Fixa',NULL,NULL),(6,'Elevação Lateral',NULL,NULL),(7,'Elevação Frontal',NULL,NULL),(8,'Triceps Testa',NULL,NULL),(9,'Triceps Pulley',NULL,NULL),(10,'Triceps Francês',NULL,NULL),(11,'Puxador Costas',NULL,NULL),(12,'Puxador Frente',NULL,NULL),(13,'Remada Unilateral',NULL,NULL),(14,'Encolhimento Ombro',NULL,NULL),(15,'Remada Alta',NULL,NULL),(16,'Remada Baixa',NULL,NULL),(17,'Rosca Direta',NULL,NULL),(18,'Rosca Concentrada',NULL,NULL),(19,'Rosca Alternada',NULL,NULL),(20,'Schoot',NULL,NULL),(21,'Cadeira Extensora',NULL,NULL),(22,'Leg Press',NULL,NULL),(23,'Agachamento Hack',NULL,NULL),(24,'Stiff',NULL,NULL),(25,'Cama Flexora',NULL,NULL),(26,'Leg 45',NULL,NULL),(27,'Leg 60',NULL,NULL),(28,'Gemeos Sentado',NULL,NULL),(29,'Cross Over',NULL,NULL),(30,'Voador Costas',NULL,NULL);
/*!40000 ALTER TABLE `exercicio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ficha`
--

DROP TABLE IF EXISTS `ficha`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `ficha` (
  `id_treino` int(10) NOT NULL,
  `id_exercicio` int(10) NOT NULL,
  `id_aluno` int(10) NOT NULL,
  `observacao` int(20) DEFAULT NULL,
  `id` int(10) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ficha`
--

LOCK TABLES `ficha` WRITE;
/*!40000 ALTER TABLE `ficha` DISABLE KEYS */;
INSERT INTO `ficha` VALUES (19,9,14,NULL,1),(19,4,14,NULL,2),(19,3,14,NULL,3),(19,2,14,NULL,4),(19,1,14,NULL,5),(19,18,14,NULL,6),(19,15,14,NULL,7),(20,6,15,NULL,8),(20,3,15,NULL,9),(20,2,15,NULL,10),(20,1,15,NULL,11),(21,12,16,NULL,12),(21,8,16,NULL,13),(21,5,16,NULL,14),(21,3,16,NULL,15),(22,12,12,NULL,16),(22,8,12,NULL,17),(22,5,12,NULL,18),(22,3,12,NULL,19);
/*!40000 ALTER TABLE `ficha` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcionario`
--

DROP TABLE IF EXISTS `funcionario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `funcionario` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `idade` int(5) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `cpf` varchar(14) NOT NULL,
  `cargo` varchar(30) NOT NULL,
  `sexo` varchar(50) NOT NULL,
  `celular` varchar(30) NOT NULL,
  `dataInicio` varchar(40) NOT NULL,
  `salario` int(10) NOT NULL,
  `usuario` varchar(50) NOT NULL,
  `senha` varchar(50) NOT NULL,
  `nivelAcesso` int(11) NOT NULL,
  `id_Endereco` int(10) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_funcionario_endereco_idx` (`id_Endereco`),
  CONSTRAINT `fk_func_endereco` FOREIGN KEY (`id_Endereco`) REFERENCES `endereco` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=196 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcionario`
--

LOCK TABLES `funcionario` WRITE;
/*!40000 ALTER TABLE `funcionario` DISABLE KEYS */;
INSERT INTO `funcionario` VALUES (191,25,'Andre Beda','073.823.918-32','Instrutor','Masculino','77998809032','11/03/2018',1500,'andre123','00000',2,25),(192,26,'Alice Biscardi','009.990.183.22','Secretaria','Feminino','37998380098','20/01/2018',2000,'alice123','55555',3,25),(193,22,'Cristina Lima','044.049.484-84','Instrutor','Feminino','35998708999','23/03/2017',1500,'cristina123','00000',2,26),(194,25,'Paulo Andre da Silva','213.123.123-21','Instrutor','Masculino','77981490079','19/02/2018',2000,'paulo123`','00000',2,35),(195,21,'Pedro Beto','073.009.328-23','Instrutor','Masculino','37999268384','05/02/2019',1800,'pedro123','00000',2,49);
/*!40000 ALTER TABLE `funcionario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `plano`
--

DROP TABLE IF EXISTS `plano`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `plano` (
  `id` int(10) NOT NULL,
  `nome` varchar(40) NOT NULL,
  `valor` int(15) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `plano`
--

LOCK TABLES `plano` WRITE;
/*!40000 ALTER TABLE `plano` DISABLE KEYS */;
INSERT INTO `plano` VALUES (0,'    ',0),(1,'Bronze',100),(2,'Prata',120),(3,'Ouro',150);
/*!40000 ALTER TABLE `plano` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `treino`
--

DROP TABLE IF EXISTS `treino`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `treino` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `treino`
--

LOCK TABLES `treino` WRITE;
/*!40000 ALTER TABLE `treino` DISABLE KEYS */;
INSERT INTO `treino` VALUES (1,'novoTreino'),(2,'novoTreino'),(3,'novoTreino'),(4,'novoTreino'),(5,'novoTreino'),(6,'novoTreino'),(7,'novoTreino'),(8,'novoTreino'),(9,'novoTreino'),(10,'novoTreino'),(11,'novoTreino'),(12,'novoTreino'),(13,'novoTreino'),(14,'novoTreino'),(15,'novoTreino'),(16,'novoTreino'),(17,'novoTreino'),(18,'novoTreino'),(19,'novoTreino'),(20,'novoTreino'),(21,'novoTreino'),(22,'novoTreino');
/*!40000 ALTER TABLE `treino` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-06-29 10:31:18
