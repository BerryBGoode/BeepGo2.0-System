Create database [dbBG];
GO
USE [dbBG];
GO

-- Tablas
CREATE TABLE tbPersonal(
	idPersonal int not null identity(1,1) primary key,
	nombre_p varchar(45) not null,
	apellido_p varchar(60) not null,
	fecha_nacimiento date not null,
	correo varchar(60) not null,
	direccion varchar(150) not null,
	documento varchar(20) not null,
	idTipoDocumento int not null,
	idTipoPersonal int not null,
	idGenero int not null,
	idEmpresa int not null,
	Carnet varchar(15) null
);

CREATE TABLE tbTipoPersonal(
	idTipoPersonal int not null identity(1,1) primary key,
	tipo_personal varchar(25) not null
);

CREATE TABLE tbGeneros(
	idGenero int not null identity(1,1) primary key,
	genero varchar(25) not null
);

CREATE TABLE tbContactos(
	idContacto int not null identity(1,1) primary key,
	contacto varchar(30) not null,
	idPersonal int not null,
	idTipoContacto int not null
);

CREATE TABLE tbTipoContacto(
	idTipoContacto int not null identity(1,1) primary key,
	tipo_contacto varchar(50) not null
);

CREATE TABLE tbUsuarios(
	idUsuario int not null identity(1,1) primary key,
	idPersonal int not null,
	nombre_usuario varchar(25) not null,
	contraseña varchar(100) not null,
	PIN varchar(100) not null unique,
	idTipoUsuario int not null,
	idEstadoUsuario int not null,
	imagen image null,
	intentos int not null
);


CREATE TABLE tbEstadoUsuario(
	idEstadoUsuario int not null identity(1,1) primary key,
	estado_usuario varchar(25)not null
);

CREATE TABLE tbTipoUsuario(
	idTipoUsuario int not null identity(1,1) primary key,
	tipo_usuario varchar(25)
);

CREATE TABLE tbEmpresas(
	idEmpresa int not null identity(1,1) primary key,
	nombre_empresa varchar(45) not null,
	representante_legal varchar(75) not null,
	direccion_empresa varchar(150) not null,
	NIT_representante_legal varchar(25) unique not null,
    CNR varchar(35) not null,
	logo image null
);

CREATE TABLE tbAccesos(
	idAcceso int not null identity(1,1) primary key,
	idPersonal int not null,
	fecha date not null,
	hora time not null,
	idTipoAcceso int not null,
	notificacion varchar(125) null
);

CREATE TABLE tbTipoAccesos(
	idTipoAcceso int not null identity(1,1) primary key,
	tipo_acceso varchar(20) not null
);

CREATE TABLE tbEstadoDetalle(
	idEstado INT NOT NULL IDENTITY(1,1) PRIMARY KEY,
	EstadoDetalle VARCHAR(25) NOT NULL
);


CREATE TABLE tbDetallesAccesos(
	idDetalleAcceso int not null identity(1,1) primary key,
	idVehiculo int not null,
	idAcceso int not null,
	idParqueo int not null,
	idEstadoDetalle int not null
);

CREATE TABLE tbParqueos(
	idParqueo int not null identity(1,1) primary key,
	numero_parqueo varchar(50) not null, -- Its not Foreign key
	capacidad int not null, -- Its not Foreign key
	Ubicacion varchar(75) not null 
);

CREATE TABLE tbVehiculos(
	idVehiculo int not null identity(1,1) primary key,
	idPersonal int not null default 0,
	placa varchar(12) not null unique,
	color varchar(25) not null
);
CREATE TABLE tbTipoDocumento(
	idTipoDocumento INT not null IDENTITY(1,1) primary key,
	tipo_documento VARCHAR(25) NOT NULL
);

-- Validaciones 

ALTER TABLE tbPersonal
ADD CONSTRAINT ck_correo
CHECK (correo LIKE '%@%');

-- Llaves Foráneas
ALTER TABLE tbPersonal
ADD CONSTRAINT fk_Personal_tipoPersonal
FOREIGN KEY (idTipoPersonal)
REFERENCES tbTipoPersonal(idTipoPersonal);

ALTER TABLE tbPersonal
ADD CONSTRAINT fk_Personal_Genero
FOREIGN KEY (idGenero)
REFERENCES tbGeneros(idGenero);

ALTER TABLE tbPersonal
ADD CONSTRAINT fk_Personal_Empresa
FOREIGN KEY (idEmpresa)
REFERENCES tbEmpresas(idEmpresa);

ALTER TABLE tbContactos
ADD CONSTRAINT fk_Contacto_Personal
FOREIGN KEY (idPersonal)
REFERENCES tbPersonal(idPersonal) 
ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE tbContactos
ADD CONSTRAINT fk_Contacto_Tipo
FOREIGN KEY (idTipoContacto)
REFERENCES tbTipoContacto(idTipoContacto);

ALTER TABLE tbUsuarios
ADD CONSTRAINT fk_Personal_Usuario
FOREIGN KEY (idPersonal)
REFERENCES tbPersonal(idPersonal)
ON DELETE CASCADE 
ON UPDATE CASCADE;

ALTER TABLE tbUsuarios
ADD CONSTRAINT fk_Usuario_Tipo
FOREIGN KEY (idTipoUsuario)
REFERENCES tbTipoUsuario(idTipoUsuario);

ALTER TABLE tbUsuarios
ADD CONSTRAINT fk_Usuario_Estado
FOREIGN KEY (idEstadoUsuario)
REFERENCES tbEstadoUsuario(idEstadoUsuario);

ALTER TABLE tbAccesos
ADD CONSTRAINT fk_Accesos_Tipo
FOREIGN KEY (idTipoAcceso)
REFERENCES tbTipoAccesos(idTipoAcceso)
ON DELETE CASCADE 
ON UPDATE CASCADE;

ALTER TABLE tbVehiculos
ADD CONSTRAINT fk_Personal_Vehiculo
FOREIGN KEY (idPersonal)
REFERENCES tbPersonal(idPersonal)
ON DELETE CASCADE
ON UPDATE CASCADE;

ALTER TABLE tbDetallesAccesos
ADD CONSTRAINT fk_vehiculo_detalle
FOREIGN KEY (idVehiculo)
REFERENCES tbVehiculos(idVehiculo)
ON DELETE CASCADE 
ON UPDATE CASCADE;

ALTER TABLE tbDetallesAccesos
ADD CONSTRAINT fk_acceso_detalle
FOREIGN KEY (idAcceso)
REFERENCES tbAccesos(idAcceso)
ON UPDATE CASCADE 
ON DELETE CASCADE;

ALTER TABLE tbDetallesAccesos
ADD CONSTRAINT fk_parqueo_detalle
FOREIGN KEY (idParqueo)
REFERENCES tbParqueos(idParqueo)
ON DELETE CASCADE 
ON UPDATE CASCADE;

Alter table tbPersonal 
add constraint fk_idtipodoc 
Foreign Key (idTipoDocumento) 
references tbTipoDocumento (idTipoDocumento);


ALTER TABLE tbAccesos 
ADD CONSTRAINT fk_personal_acceso
FOREIGN KEY (idPersonal)
REFERENCES tbPersonal(idPersonal)


-- Registros

INSERT INTO tbGeneros
	VALUES	('Masculino'),
			('Femenino'),
			('Prefiero no especificar');

INSERT INTO tbTipoPersonal

	VALUES	('Root'),
			('Personal Administrativo'),
			('Docentes'),
			('Alumnos'),
			('Seguridad'),
			('Proveedor'),			  -- No tiene usuario, mas el registro servira para garantizar acceso
			('Personal de Limpieza'); -- No tiene usuario, mas el registro servira para garantizar acceso



INSERT INTO tbTipoContacto
	VALUES ('Teléfono'),
			('FAX'),
			('Email');



INSERT INTO tbEstadoUsuario
	VALUES	('Activo'),
			('Inactivo'),
			('Presente'),
			('Ausente'),
			('Suspendido'),
			('Expulsado');

INSERT INTO tbTipoUsuario
	VALUES	('Root'),
			('Administrador'),
			('Docente'),
			('Alumno'),
			('Seguridad')



INSERT INTO tbTipoAccesos
	VALUES ('Entrada'),
			('Salida');

INSERT INTO tbParqueos
	VALUES	('1',20,'San Salvador'),
			('2',20,'Ricaldone');

INSERT INTO tbTipoDocumento 
VALUES ('DNI') ,('DUI'), ('Carnet'), ('NIT')
INSERT INTO tbEmpresas (nombre_empresa,representante_legal,direccion_empresa,NIT_representante_legal,CNR)
VALUES ('Peak-Tech','José Perez','En el colegio','2134234-3','45353453');

INSERT INTO tbPersonal(nombre_p,apellido_p,fecha_nacimiento,correo,direccion,documento,idTipoDocumento,idTipoPersonal,idGenero,idEmpresa,Carnet) VALUES ('Daniel','Lopez','2004-09-17','DanLop@gmail.com','En la parada','1234567-8',1,3,2,1,'DL20220001'),
('Anderson','Aguilar','2005-10-18','anderdeco@gmail','En la casa','4546455-6',2,2,1,1 ,'AA20220002'),
('Fernando','Mena','2005-08-23','fernadno@gmail.com','En su casa','6576577-5',3,3,2,1,'FM20220003'),
('Guillermo','Castillo','2005-09-24','Guillermo@gmail.com','En la expo','6546678-9',1,2,2,1,'GC20220004'),
('Roberto','Moran','2004-04-17','Rober@gmail.com','En la actividad','235465-6',2,3,1,1,'RM20220005');

INSERT INTO tbPersonal(nombre_p,apellido_p,fecha_nacimiento,correo,direccion,documento,idTipoDocumento,idTipoPersonal,idGenero,idEmpresa) VALUES ('Josue','Guinea','1990-09-17','KAREN@gmail.com','Santa Tecla','12385433-5',2,4,2,1);

INSERT INTO tbUsuarios (idPersonal, nombre_usuario, contraseña,PIN,idTipoUsuario, idEstadoUsuario,intentos)VALUES
(1,'dani3l_l','5825f31854334caf1854061f729bede2','1a6e1468679a90ec179db80c4ccc141e',2,1,1), --password: Daniel PIN: 1234
(2,'AnderA','2f6a50221ba9eef71f7ba84156b83f57','8e4ebf8e57edc040eb62d0a24993afad',1,1,2),
(4, 'TheGuishe', 'a7a8cc895ea77624e5506100e0706e65','42d6562d75e3e042289b878b667a59be',1,1,2),--password: TheGuishe PIN: 2608
(5, 'Rober','2fda6233ac2ab2a22143a96ce26fd463','af60a0a088f81300ca5faa4a95497e66',1,1,2),--password: Rober PIN: 1010
(3, 'Fer', 'e9ec4e11c52057ccdcaca7b319d809f0', 'af53b763be1d97f42034e27f0022208b', 1,1,2);

INSERT INTO tbVehiculos 
VALUES(1,'AQ34345','Negro'),
(2,'Ap456436','Blanco');				

INSERT INTO tbAccesos (idPersonal,fecha,hora,idTipoAcceso)
VALUES (1,'2022-02-23','10:00',1),
(2,'2022-02-23','9:00',1),
(3,'2022-12-21','11:12',1);

INSERT INTO tbEstadoDetalle VALUES	('Disponible'), ('Ocupado');

INSERT INTO tbDetallesAccesos VALUES (1,1,1,1);
--Vistas
go
CREATE VIEW vwAccesos AS
SELECT a.idAcceso, c.Carnet, a.idTipoAcceso, a.fecha, a.hora, tp.tipo_acceso, a.notificacion
FROM tbAccesos a, tbPersonal c, tbTipoAccesos tp
WHERE a.idPersonal = c.idPersonal AND a.idTipoAcceso = tp.idTipoAcceso AND Carnet is not null
go

go
CREATE VIEW vwVehiculos AS
SELECT p.idPersonal, v.idVehiculo, p.Carnet, p.nombre_p, p.apellido_p, v.placa, v.color
FROM tbPersonal p, tbVehiculos v
WHERE v.idPersonal = p.idPersonal AND p.Carnet is not null
go

CREATE VIEW vwParqueos AS
SELECT a.fecha, a.hora,pe.Carnet ,pe.nombre_p, pe.apellido_p, v.placa, v.color,  park.numero_parqueo, dta.idAcceso, dta.idDetalleAcceso, dta.idParqueo, dta.idVehiculo
FROM tbParqueos park, tbDetallesAccesos dta, tbAccesos a, tbVehiculos v, tbPersonal pe
WHERE dta.idAcceso = a.idAcceso AND dta.idParqueo = park.idParqueo AND dta.idVehiculo = v.idVehiculo AND v.idPersonal = pe.idPersonal AND pe.Carnet is not null
go

create view vwPSinCarnet AS
SELECT a.nombre_p,a.apellido_p,b.tipo_personal,a.documento from tbPersonal a, tbTipoPersonal b WHERE a.idTipoPersonal=b.idTipoPersonal AND Carnet is null
go

CREATE VIEW vwPConCarnet AS
SELECT a.nombre_p,a.apellido_p,a.Carnet,d.tipo_personal FROM tbPersonal a,tbTipoPersonal d WHERE a.idTipoPersonal=d.idTipoPersonal AND a.Carnet is not null
go


create view vwProfesores AS
SELECT a.nombre_p,a.apellido_p,a.fecha_nacimiento,a.Carnet,a.documento,b.tipo_personal,a.idPersonal, a.idTipoDocumento, a.idTipoPersonal,a.idGenero, c.genero,d.tipo_documento,a.direccion,a.correo FROM tbPersonal a, tbTipoPersonal b,tbGeneros c ,tbTipoDocumento d WHERE a.idTipoPersonal=b.idTipoPersonal AND a.idTipoPersonal!=4 AND a.idGenero=c.idGenero AND a.idTipoDocumento=d.idTipoDocumento
go

create view vwAlumnos AS
SELECT a.nombre_p,a.apellido_p,a.fecha_nacimiento,a.Carnet,a.documento,b.tipo_personal,a.idPersonal, a.idTipoDocumento, a.idTipoPersonal,a.idGenero, c.genero,d.tipo_documento,a.direccion,a.correo FROM tbPersonal a, tbTipoPersonal b,tbGeneros c ,tbTipoDocumento d WHERE a.idTipoPersonal=b.idTipoPersonal AND a.idTipoPersonal=4 AND a.idGenero=c.idGenero AND a.idTipoDocumento=d.idTipoDocumento
go


-- Vistas para Contactos CRUD

CREATE VIEW vwContactos AS
SELECT c.idContacto, c.contacto, CONCAT(a.nombre_p, ' ' , a.apellido_p) AS [Personal], b.tipo_contacto, a.idPersonal, b.idTipoContacto
FROM tbPersonal a, tbTipoContacto b, tbContactos c
WHERE a.idPersonal = c.idPersonal AND b.idTipoContacto = c.idTipoContacto
GO

CREATE VIEW vwPersonal_Contactos AS
SELECT a.idPersonal, CONCAT(a.nombre_p, ' ', a.apellido_p) AS [Personal], a.fecha_nacimiento, a.documento, b.tipo_personal
FROM tbPersonal a, tbTipoPersonal b
WHERE a.idTipoPersonal = b.idTipoPersonal;
GO

-- Vistas para Vehiculos CRUD
CREATE VIEW vwVehiculos_g AS
SELECT  a.idVehiculo, CONCAT(b.nombre_p, ' ', b.apellido_p) AS [Personal], b.Carnet, a.placa, a.color, b.idPersonal
FROM tbVehiculos a, tbPersonal b
WHERE a.idPersonal = b.idPersonal

CREATE VIEW vwVehiculos_Personal AS
SELECT  a.idPersonal, CONCAT(a.nombre_p, ' ', a.apellido_p) AS [Personal], a.documento, c.tipo_documento, d.tipo_personal, a.Carnet
FROM tbPersonal a, tbTipoDocumento c, tbTipoPersonal d
WHERE a.idTipoDocumento = c.idTipoDocumento AND a.idTipoPersonal = d.idTipoPersonal