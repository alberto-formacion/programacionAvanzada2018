-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         5.6.24 - MySQL Community Server (GPL)
-- SO del servidor:              Win32
-- HeidiSQL Versión:             9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para colegio
CREATE DATABASE IF NOT EXISTS `colegio` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `colegio`;

-- Volcando estructura para tabla colegio.alumno
CREATE TABLE IF NOT EXISTS `alumno` (
  `idAlumno` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idAlumno`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla colegio.alumno: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `alumno` DISABLE KEYS */;
INSERT INTO `alumno` (`idAlumno`, `nombre`) VALUES
	(1, 'santiago'),
	(2, 'indigo'),
	(3, 'julen'),
	(4, 'marta'),
	(5, 'arkaitz'),
	(6, 'asier'),
	(7, 'ainara'),
	(8, 'aida'),
	(9, 'endika');
/*!40000 ALTER TABLE `alumno` ENABLE KEYS */;

-- Volcando estructura para tabla colegio.alumnoasignatura
CREATE TABLE IF NOT EXISTS `alumnoasignatura` (
  `idAlumno` int(11) NOT NULL,
  `idAsignatura` int(11) NOT NULL,
  `nota` int(11) DEFAULT NULL,
  `fecha` datetime DEFAULT NULL,
  PRIMARY KEY (`idAlumno`,`idAsignatura`),
  KEY `fk_asignatura` (`idAsignatura`),
  CONSTRAINT `fk_alumno` FOREIGN KEY (`idAlumno`) REFERENCES `alumno` (`idAlumno`),
  CONSTRAINT `fk_asignatura` FOREIGN KEY (`idAsignatura`) REFERENCES `asignatura` (`idAsignatura`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla colegio.alumnoasignatura: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `alumnoasignatura` DISABLE KEYS */;
INSERT INTO `alumnoasignatura` (`idAlumno`, `idAsignatura`, `nota`, `fecha`) VALUES
	(1, 5, 5, '2019-01-14 20:10:43'),
	(2, 3, 8, '2019-01-14 20:10:59'),
	(3, 1, 7, '2019-01-14 20:11:13'),
	(4, 2, 8, '2019-01-14 20:11:34'),
	(5, 2, 6, '2019-01-14 20:11:53'),
	(6, 1, 9, '2019-01-14 20:12:12'),
	(7, 3, 6, '2019-01-14 20:12:39'),
	(8, 3, 2, '2019-01-14 20:12:53'),
	(9, 4, 7, '2019-01-14 20:13:17');
/*!40000 ALTER TABLE `alumnoasignatura` ENABLE KEYS */;

-- Volcando estructura para tabla colegio.asignatura
CREATE TABLE IF NOT EXISTS `asignatura` (
  `idAsignatura` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL DEFAULT '0',
  PRIMARY KEY (`idAsignatura`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla colegio.asignatura: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `asignatura` DISABLE KEYS */;
INSERT INTO `asignatura` (`idAsignatura`, `nombre`) VALUES
	(1, 'SOA'),
	(2, 'PA'),
	(3, 'POO'),
	(4, 'PCS'),
	(5, 'BD');
/*!40000 ALTER TABLE `asignatura` ENABLE KEYS */;

-- Volcando estructura para tabla colegio.casas
CREATE TABLE IF NOT EXISTS `casas` (
  `idCasa` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idCasa`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla colegio.casas: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `casas` DISABLE KEYS */;
INSERT INTO `casas` (`idCasa`, `nombre`) VALUES
	(1, 'GRIFFINDOR'),
	(2, 'JIGGLYPUF'),
	(3, 'SLYTHERING'),
	(4, 'RAVENCLAW');
/*!40000 ALTER TABLE `casas` ENABLE KEYS */;

-- Volcando estructura para tabla colegio.profesor
CREATE TABLE IF NOT EXISTS `profesor` (
  `idProfesor` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idProfesor`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla colegio.profesor: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `profesor` DISABLE KEYS */;
INSERT INTO `profesor` (`idProfesor`, `nombre`) VALUES
	(1, 'ALEX'),
	(2, 'YISUS'),
	(3, 'BERTO'),
	(4, 'MAIK'),
	(5, 'KEN  LOKKO');
/*!40000 ALTER TABLE `profesor` ENABLE KEYS */;

-- Volcando estructura para tabla colegio.profesorasignatura
CREATE TABLE IF NOT EXISTS `profesorasignatura` (
  `idProfesor` int(11) NOT NULL,
  `idAsignatura` int(11) NOT NULL,
  PRIMARY KEY (`idProfesor`,`idAsignatura`),
  KEY `idAsignatura` (`idAsignatura`),
  CONSTRAINT `idAsignatura` FOREIGN KEY (`idAsignatura`) REFERENCES `asignatura` (`idAsignatura`),
  CONSTRAINT `idProfesor` FOREIGN KEY (`idProfesor`) REFERENCES `profesor` (`idProfesor`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla colegio.profesorasignatura: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `profesorasignatura` DISABLE KEYS */;
INSERT INTO `profesorasignatura` (`idProfesor`, `idAsignatura`) VALUES
	(2, 1),
	(3, 2),
	(4, 3),
	(1, 4),
	(5, 5);
/*!40000 ALTER TABLE `profesorasignatura` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
