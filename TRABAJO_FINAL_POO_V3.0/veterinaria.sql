--
-- File generated with SQLiteStudio v3.3.3 on vie. jul. 9 22:41:49 2021
--
-- Text encoding used: System
--
PRAGMA foreign_keys = off;
BEGIN TRANSACTION;

-- Table: categoria
CREATE TABLE categoria (idCategoria INTEGER PRIMARY KEY AUTOINCREMENT, idServicio INTEGER REFERENCES servicio (idServicio), nomCate VARCHAR (20));

-- Table: cliente
CREATE TABLE cliente (idCliente INTEGER PRIMARY KEY AUTOINCREMENT, DNI VARCHAR (10), nombreClie VARCHAR (50), apellidoClie VARCHAR (50), correo VARCHAR (20), direccion VARCHAR (30), distrito VARCHAR (20), celular VARCHAR (10), contraseña VARCHAR (50));
INSERT INTO cliente (idCliente, DNI, nombreClie, apellidoClie, correo, direccion, distrito, celular, contraseña) VALUES (1, '72021804', 'amy', 'garcia', 'amy@gmail.com', 'av123', 'paucarpata', '12345678', '12345');
INSERT INTO cliente (idCliente, DNI, nombreClie, apellidoClie, correo, direccion, distrito, celular, contraseña) VALUES (2, '72021805', 'pedro', 'flores', 'pedro@gmail.com', 'avhola', 'fafdff', '98745632', '1234');

-- Table: mascota
CREATE TABLE mascota (idMasco INTEGER PRIMARY KEY AUTOINCREMENT, nombreMasco VARCHAR (20), raza VARCHAR (20), color VARCHAR (10), tamaño VARCHAR (20), peso DOUBLE (5));

-- Table: presupuesto
CREATE TABLE presupuesto (idPresu INTEGER PRIMARY KEY AUTOINCREMENT, fecha DATE (10), idCliente INTEGER REFERENCES cliente (idCliente), idServicio INTEGER REFERENCES servicio (idServicio));
INSERT INTO presupuesto (idPresu, fecha, idCliente, idServicio) VALUES (1, '09/07/2021', 1, 2);
INSERT INTO presupuesto (idPresu, fecha, idCliente, idServicio) VALUES (2, '11/07/2021', 2, 1);
INSERT INTO presupuesto (idPresu, fecha, idCliente, idServicio) VALUES (3, '12/07/2021', 2, 1);

-- Table: servicio
CREATE TABLE servicio (idServicio INTEGER PRIMARY KEY AUTOINCREMENT, nomServicio VARCHAR (20), descripcion VARCHAR (100), comentario VARCHAR (50), precio DOUBLE (10));
INSERT INTO servicio (idServicio, nomServicio, descripcion, comentario, precio) VALUES (1, 'peluqueria', 'ASDHJKLJGDRG', 'BUEN SERVICIO', 17.0);
INSERT INTO servicio (idServicio, nomServicio, descripcion, comentario, precio) VALUES (2, 'cirugia', 'ASDHJKLJGDRG', 'BUEN SERVICIO', 40.0);

COMMIT TRANSACTION;
PRAGMA foreign_keys = on;
