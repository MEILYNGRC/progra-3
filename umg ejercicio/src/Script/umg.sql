DROP DATABASE IF EXISTS umg;
CREATE DATABASE umg;
USE umg;


CREATE TABLE maestros(
    mae_codigo INT AUTO_INCREMENT,
    mae_nombre VARCHAR(100),
    mae_direccion VARCHAR(150),
    mae_estatus TINYINT,
    PRIMARY KEY(mae_codigo)
);

CREATE TABLE alumnos(
    alu_codigo INT AUTO_INCREMENT,
    alu_nombre VARCHAR(100),
    alu_direccion VARCHAR(150),
    alu_estatus TINYINT,
    PRIMARY KEY(alu_codigo)
);

CREATE TABLE carreras(
    car_codigo INT AUTO_INCREMENT,
    car_nombre VARCHAR(100),
    car_estatus TINYINT,
    PRIMARY KEY(car_codigo)
);

CREATE TABLE cursos(
    cur_codigo INT AUTO_INCREMENT,
    cur_nombre VARCHAR(100),
    cur_estatus TINYINT,
    PRIMARY KEY(cur_codigo)
);

CREATE TABLE jornadas(
    JorCodigo int auto_increment,
    JorNombre varchar(100),
    PRIMARY KEY(JorCodigo)
    );
CREATE TABLE asignacion(
    car_codigo INT,
    cur_codigo INT,
    mae_codigo INT,
    alu_codigo INT,
    JorCodigo INT,
    asa_nota DECIMAL(5,2),

    PRIMARY KEY(car_codigo,cur_codigo,mae_codigo,alu_codigo,JorCodigo),

    FOREIGN KEY(car_codigo) REFERENCES carreras(car_codigo),
    FOREIGN KEY(cur_codigo) REFERENCES cursos(cur_codigo),
    FOREIGN KEY(mae_codigo) REFERENCES maestros(mae_codigo),
    FOREIGN KEY(alu_codigo) REFERENCES alumnos(alu_codigo),
    FOREIGN KEY(JorCodigo) REFERENCES jornadas(JorCodigo)
);