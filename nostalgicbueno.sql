-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema nostalgicbueno
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema nostalgicbueno
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `nostalgicbueno` DEFAULT CHARACTER SET latin1 ;
USE `nostalgicbueno` ;

-- -----------------------------------------------------
-- Table `nostalgicbueno`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `nostalgicbueno`.`usuario` (
  `idusuario` INT(11) NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(45) NULL DEFAULT NULL,
  `NickName` VARCHAR(45) NULL DEFAULT NULL,
  `Telefono` VARCHAR(45) NULL DEFAULT NULL,
  `Email` VARCHAR(45) NULL DEFAULT NULL,
  `Contraseña` VARCHAR(45) NULL DEFAULT NULL,
  `Lista_Contacto` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`idusuario`))
ENGINE = InnoDB
AUTO_INCREMENT = 7
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `nostalgicbueno`.`conversacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `nostalgicbueno`.`conversacion` (
  `idconversacion` INT(11) NOT NULL AUTO_INCREMENT,
  `Usuario_1` INT(11) NULL DEFAULT NULL,
  `Usuario_2` INT(11) NULL DEFAULT NULL,
  `Time` DATETIME NULL DEFAULT NULL,
  `Actualizar` BIT(1) NULL DEFAULT NULL,
  `Usuario_1_Leido` BIT(1) NULL DEFAULT NULL,
  `Usuario_2_Leido` BIT(1) NULL DEFAULT NULL,
  PRIMARY KEY (`idconversacion`),
  INDEX `fk_Usuario1_idx` (`Usuario_1` ASC),
  INDEX `fk_Usuario2_idx` (`Usuario_2` ASC),
  CONSTRAINT `fk_Usuario1`
    FOREIGN KEY (`Usuario_1`)
    REFERENCES `nostalgicbueno`.`usuario` (`idusuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Usuario2`
    FOREIGN KEY (`Usuario_2`)
    REFERENCES `nostalgicbueno`.`usuario` (`idusuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `nostalgicbueno`.`reply`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `nostalgicbueno`.`reply` (
  `idreply` INT(11) NOT NULL AUTO_INCREMENT,
  `Reply` TEXT NULL DEFAULT NULL,
  `User` INT(11) NULL DEFAULT NULL,
  `Time` DATETIME NULL DEFAULT NULL,
  `Status` BIT(1) NULL DEFAULT NULL,
  `Status_1_Recibido` BIT(1) NULL DEFAULT NULL,
  `Status_2_Recibido` BIT(1) NULL DEFAULT NULL,
  `idConversacion` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`idreply`),
  INDEX `fk_Reply_Usuario_idx` (`User` ASC),
  INDEX `fk_Reply_Conversacion_idx` (`idConversacion` ASC),
  CONSTRAINT `fk_Reply_Conversacion`
    FOREIGN KEY (`idConversacion`)
    REFERENCES `nostalgicbueno`.`conversacion` (`idconversacion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Reply_Usuario`
    FOREIGN KEY (`User`)
    REFERENCES `nostalgicbueno`.`usuario` (`idusuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 8
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
