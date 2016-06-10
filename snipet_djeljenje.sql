
CREATE DATABASE IF NOT EXISTS `snipet_djeljenje` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `snipet_djeljenje`;


DROP TABLE IF EXISTS `account`;
CREATE TABLE IF NOT EXISTS `account` (
  `username` varchar(24) NOT NULL,
  `password` varchar(25) NOT NULL,
  `name` varchar(20) NOT NULL,
  `secondname` varchar(20) NOT NULL,
  `email` varchar(45) NOT NULL,
  PRIMARY KEY (`username`),
  UNIQUE KEY `usename_UNIQUE` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `snipet`;
CREATE TABLE IF NOT EXISTS `snipet` (
  `snipetid` int(11) NOT NULL AUTO_INCREMENT,
  `textsnipet` text NOT NULL,
  `idusername` varchar(24) NOT NULL,
  PRIMARY KEY (`snipetid`),
  KEY `idusername` (`idusername`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


--
ALTER TABLE `snipet`
  ADD CONSTRAINT `snipet_ibfk_1` FOREIGN KEY (`idusername`) REFERENCES `account` (`username`);

