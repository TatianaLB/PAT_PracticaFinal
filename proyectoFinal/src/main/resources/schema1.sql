DROP TABLE IF EXISTS CANCION;

CREATE TABLE  "CANCION" (
    "ID" NUMBER NOT NULL PRIMARY KEY,
	"NOMBRE" VARCHAR2(20) NOT NULL,
	"ARTISTA" VARCHAR2(20),
	"ALBUM" VARCHAR2(35) NOT NULL,
	"LONGITUD" NUMBER(3) NOT NULL
);
