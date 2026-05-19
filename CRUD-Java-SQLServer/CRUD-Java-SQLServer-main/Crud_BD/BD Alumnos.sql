create database colegio;
use colegio;

create table Alumno
(
IdAlumno Int IDENTITY(1,1) PRIMARY KEY,
Nombre VARCHAR(100),
Apellido VARCHAR(100)
);

Insert into Alumno(Nombre, Apellido) VALUES
('MAFER','JULIO'),
('LUIS','BELLO');

SELECT * FROM Alumno; 