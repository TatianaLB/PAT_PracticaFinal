DROP TABLE IF EXISTS USUARIO;

CREATE TABLE  "USUARIO" (
    "USERNAME" VARCHAR2(100) NOT NULL PRIMARY KEY,
	"NOMBRE" VARCHAR2(100) NOT NULL,
	"APELLIDO" VARCHAR2(100),
	"EMAIL" VARCHAR2(100) NOT NULL,
	"EDAD" NUMBER ,
	"PASSWORD" VARCHAR2(100) NOT NULL

);
