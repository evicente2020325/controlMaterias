DROP DATABASE IF EXISTS control_materias;
CREATE DATABASE IF NOT EXISTS control_materias;
USE control_materias;

/**********************************************************************
TABLE Materias
***********************************************************************/
DROP TABLE IF EXISTS materia;
CREATE TABLE materia(
id_materia INT auto_increment NOT NULL,
nombre_materia VARCHAR(45) NOT NULL, 
ciclo_escolar VARCHAR(45),
horario_inicio TIME,
horario_final TIME, 
catedratico VARCHAR(45) NOT NULL,
salon VARCHAR(45) NOT NULL,
cupo_maximo INT, 
cupo_minimo INT, 
primary key(id_materia)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO materia (nombre_materia, ciclo_escolar, horario_inicio, horario_final, catedratico, salon, cupo_maximo, cupo_minimo)
VALUES ("Matematicas", 2010-01-12,12-20,16-30,"Julio","B-5",45,10);
INSERT INTO materia (nombre_materia, ciclo_escolar, horario_inicio, horario_final, catedratico, salon, cupo_maximo, cupo_minimo)
VALUES ("Sociales", "2010-01-12",12-20,16-30,"Samuel","B-2",45,10);
INSERT INTO materia (nombre_materia, ciclo_escolar, horario_inicio, horario_final, catedratico, salon, cupo_maximo, cupo_minimo)
VALUES ("Estadistica", 2010-01-12,12-20,16-30,"Jorge","B-3",45,10);
INSERT INTO materia (nombre_materia, ciclo_escolar, horario_inicio, horario_final, catedratico, salon, cupo_maximo, cupo_minimo)
VALUES ("Ingles", 2010-01-12,12-20,16-30,"Jose","B-4",45,10);	
INSERT INTO materia (nombre_materia, ciclo_escolar, horario_inicio, horario_final, catedratico, salon, cupo_maximo, cupo_minimo)
VALUES ("Ingles", "2010-01-12", '03:14:07', '16:30:07',"Rafael","B-2",45,10);	
INSERT INTO materia (nombre_materia, ciclo_escolar, horario_inicio, horario_final, catedratico, salon, cupo_maximo, cupo_minimo)
VALUES ("Sociales", "2010-01-12",12-20,16-30,"Samuel","B-2",45,10);
INSERT INTO materia (nombre_materia, ciclo_escolar, horario_inicio, horario_final, catedratico, salon, cupo_maximo, cupo_minimo)
VALUES ("Ingles", "2010-01-12", '03:14', '16:30',"Rafael","B-2",45,10);	