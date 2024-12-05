CREATE TABLE IF NOT EXISTS `person` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nome` varchar(80) NOT NULL,
  `sobrenome` varchar(80) NOT NULL,
  `endereco` varchar(180) NOT NULL,
  `genero` varchar(1) NOT NULL,
  PRIMARY KEY (`id`)
)