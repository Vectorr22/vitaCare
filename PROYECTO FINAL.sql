CREATE DATABASE vitaCareSystem;
USE vitaCareSystem;



CREATE TABLE ocupacionesPacientes(
ocup_idOcupacion		INT PRIMARY KEY,
ocup_tipoOcupacion		VARCHAR(255),
ocup_descripOcupacion	VARCHAR(255)
);


CREATE TABLE especialidadesMedicos(
esp_numEsp					INT PRIMARY KEY,
esp_tipoEspecialidad		VARCHAR(255),
esp_descripEspecialidad		VARCHAR(255)
);


CREATE TABLE paciente(
pac_nssPac			INT PRIMARY KEY,
pac_primNomPac		VARCHAR(100) NOT NULL,
pac_segunNomPac		VARCHAR(100) NOT NULL,
pac_apPatPac		VARCHAR(100) NOT NULL,
pac_apMatPac		VARCHAR(100) NOT NULL,
pac_telPac			VARCHAR(10) NOT NULL,
pac_generoPac		bit NOT NULL,
pac_fechaNacPac		date,
pac_correoPac		VARCHAR(100) NULL,
ocup_idOcupacion	INT NOT NULL
);

BEGIN TRANSACTION;
BEGIN TRY
    ALTER TABLE paciente ADD CONSTRAINT fk_paciente_Ocupacion FOREIGN KEY (ocup_idOcupacion) REFERENCES ocupacionesPacientes (ocup_idOcupacion);
    COMMIT;
END TRY
BEGIN CATCH
    ROLLBACK;
END CATCH;

CREATE TABLE medico(
med_numRegistroMedico	INT PRIMARY KEY,
med_primNomMed			VARCHAR(100) NOT NULL,
med_segunNomMed			VARCHAR(100) NOT NULL,
med_apPatMed			VARCHAR(100) NOT NULL,
med_apMatMed			VARCHAR(100) NOT NULL,
med_telMed				INT NOT NULL,
med_correoMed			VARCHAR(200) NULL,
esp_numEsp				INT NOT NULL
);

BEGIN TRANSACTION;
BEGIN TRY
    ALTER TABLE medico ADD CONSTRAINT fk_medico_especialidad FOREIGN KEY (esp_numEsp) REFERENCES especialidadesMedicos(esp_numEsp);
    COMMIT;
END TRY
BEGIN CATCH
    ROLLBACK;
END CATCH;


CREATE TABLE hospital(
hosp_idHosp				INT PRIMARY KEY,
hosp_nombreHosp			VARCHAR(255) NOT NULL,
hosp_calleHosp			VARCHAR(255) NOT NULL,
hosp_colHosp			VARCHAR(255) NOT NULL,
hosp_numExtHosp			VARCHAR(255) NULL,
hosp_numIntHosp			VARCHAR(255) NULL,
hosp_ciudadHosp			VARCHAR(255) NOT NULL,
hosp_telHosp			INT NOT NULL,
hosp_horarioHosp		VARCHAR(255) NOT NULL,
hosp_paginaWebHosp		VARCHAR(255) NULL,
);


CREATE TABLE cita(
cita_numCita				INT IDENTITY PRIMARY KEY,
cita_horaCita				time,
cita_fechaCita				date,
cita_estadoCita				VARCHAR(100),
cita_observacionesCita		VARCHAR(255),
pac_nssPac					INT,
med_numRegistroMedico		INT,
hosp_idHosp					INT
);

BEGIN TRANSACTION;
BEGIN TRY
    ALTER TABLE cita 
	ADD CONSTRAINT fk_cita_pacNSS FOREIGN KEY (pac_nssPac) REFERENCES paciente (pac_nssPac)
	;

	ALTER TABLE cita
	ADD CONSTRAINT fk_cita_numMedico FOREIGN KEY (med_numRegistroMedico) REFERENCES medico (med_numRegistroMedico)
	;

	ALTER TABLE cita
	ADD CONSTRAINT fk_cita_hospID FOREIGN KEY (hosp_idHosp) REFERENCES hospital (hosp_idHosp)
	;
    COMMIT;
END TRY
BEGIN CATCH
    ROLLBACK;
END CATCH;


CREATE TABLE asignacionMedico(
asig_idAsig				INT IDENTITY PRIMARY KEY,
pac_nssPac				INT,
med_numRegistroMedico	INT,
FOREIGN KEY(pac_nssPac) REFERENCES paciente (pac_nssPac),
FOREIGN KEY(med_numRegistroMedico) REFERENCES medico(med_numRegistroMedico)
);

CREATE TABLE plazaMedico(
plaza_idPlaza			INT IDENTITY PRIMARY KEY,
med_numRegistroMedico	INT,
hosp_idHosp				INT,
FOREIGN KEY (med_numRegistroMedico) REFERENCES medico (med_numRegistroMedico),
FOREIGN KEY (hosp_idHosp) REFERENCES hospital (hosp_idHosp)
);


CREATE TABLE auditoria(
idAuditoria		INT IDENTITY PRIMARY KEY,
usuario			VARCHAR(255),
fechaHora		DATETIME,
tipoAccion		VARCHAR(50),
descripcion		VARCHAR(MAX),
tablaAfectada	VARCHAR(100),
conexion		VARCHAR(MAX)
);

GO

CREATE TRIGGER auditoria_medico
ON medico
AFTER INSERT, UPDATE, DELETE
AS
BEGIN
    DECLARE @tipoAccion VARCHAR(50);
    DECLARE @descripcion VARCHAR(MAX);

    IF EXISTS(SELECT * FROM inserted)
    BEGIN
        IF EXISTS(SELECT * FROM deleted)
            SET @tipoAccion = 'Actualización';
        ELSE
            SET @tipoAccion = 'Inserción';
    END
    ELSE
        SET @tipoAccion = 'Eliminación';

    SET @descripcion = 'Se ha realizado una ' + @tipoAccion + ' en la tabla medico.';

    INSERT INTO auditoria (usuario, fechaHora, tipoAccion, descripcion, tablaAfectada,conexion)
    VALUES (SUSER_SNAME(), GETDATE(), @tipoAccion, @descripcion, 'medico',HOST_NAME());
END

GO

CREATE TRIGGER auditoria_cita
ON cita
AFTER INSERT, UPDATE, DELETE
AS
BEGIN
    DECLARE @tipoAccion VARCHAR(50);
    DECLARE @descripcion VARCHAR(MAX);

    IF EXISTS(SELECT * FROM inserted)
    BEGIN
        IF EXISTS(SELECT * FROM deleted)
            SET @tipoAccion = 'Actualización';
        ELSE
            SET @tipoAccion = 'Inserción';
    END
    ELSE
        SET @tipoAccion = 'Eliminación';

    SET @descripcion = 'Se ha realizado una ' + @tipoAccion + ' en la tabla cita.';

    INSERT INTO auditoria (usuario, fechaHora, tipoAccion, descripcion, tablaAfectada,conexion)
    VALUES (SUSER_SNAME(), GETDATE(), @tipoAccion, @descripcion, 'cita',HOST_NAME());
END

GO

CREATE TRIGGER auditoria_paciente
ON paciente
AFTER INSERT, UPDATE, DELETE
AS
BEGIN
    DECLARE @tipoAccion VARCHAR(50);
    DECLARE @descripcion VARCHAR(MAX);

    IF EXISTS(SELECT * FROM inserted)
    BEGIN
        IF EXISTS(SELECT * FROM deleted)
            SET @tipoAccion = 'Actualización';
        ELSE
            SET @tipoAccion = 'Inserción';
    END
    ELSE
        SET @tipoAccion = 'Eliminación';

    SET @descripcion = 'Se ha realizado una ' + @tipoAccion + ' en la tabla paciente.';

    INSERT INTO auditoria (usuario, fechaHora, tipoAccion, descripcion, tablaAfectada,conexion)
    VALUES (SUSER_SNAME(), GETDATE(), @tipoAccion, @descripcion, 'paciente',HOST_NAME());
END

GO

CREATE TRIGGER auditoria_hospital
ON hospital
AFTER INSERT, UPDATE, DELETE
AS
BEGIN
    DECLARE @tipoAccion VARCHAR(50);
    DECLARE @descripcion VARCHAR(MAX);

    IF EXISTS(SELECT * FROM inserted)
    BEGIN
        IF EXISTS(SELECT * FROM deleted)
            SET @tipoAccion = 'Actualización';
        ELSE
            SET @tipoAccion = 'Inserción';
    END
    ELSE
        SET @tipoAccion = 'Eliminación';

    SET @descripcion = 'Se ha realizado una ' + @tipoAccion + ' en la tabla hospital.';

    INSERT INTO auditoria (usuario, fechaHora, tipoAccion, descripcion, tablaAfectada,conexion)
    VALUES (SUSER_SNAME(), GETDATE(), @tipoAccion, @descripcion, 'hospital',HOST_NAME());
END


GO
SELECT * FROM auditoria;
INSERT INTO ocupacionesPacientes VALUES(1, 'Estudiante','Estudiante universitario');
INSERT INTO ocupacionesPacientes VALUES(2,	'Empleado',	'Ingeniero de software');
INSERT INTO ocupacionesPacientes VALUES(3,	'Jubilado',	'Profesor retirado');

INSERT INTO especialidadesMedicos VALUES(1,'Cardiología',	'Especialidad en enfermedades del corazón');
INSERT INTO especialidadesMedicos VALUES(2,'Pediatría',	'Especialidad en atención infantil');
INSERT INTO especialidadesMedicos VALUES(3,'Dermatología',	'Especialidad en enfermedades de la piel');

INSERT INTO paciente VALUES(1501458713,	'Juan',	'Manuel',	'Pérez',	'González',	'5551234567', 0, '1985-05-10',	'juan@example.com',	1);
INSERT INTO paciente VALUES(1276459761,	'Victor',	'Manuel',	'Rodriguez',	'González',	'123456', 0, '1995-05-10',	null,	2);
INSERT INTO paciente VALUES(1724608451,	'Victoria',	'Manuel',	'Pérez',	'González',	'6545635', 1, '2001-05-10',	'prueba.com',	3);
INSERT INTO paciente VALUES(1,	'Juan',	'Manuel',	'Pérez',	'González',	'5551234567', 0, '1985-05-10',	'juan@example.com',	1);


INSERT into medico VALUES(2001,	'Laura',	'Sofia',	'Sánchez',	'González',	'12',	'laura@example.com',	1);
INSERT into medico VALUES(2002,	'Miguel',	'Sofia',	'Sánchez',	'González',	'13',	null,	2);
INSERT into medico VALUES(2003,	'Sofia',	'Sofia',	'Sánchez',	'González',	'14',	'viccc@example.com',	3);

INSERT INTO hospital VALUES(3001,	'Hospital ABC',	'Calle Principal',	'Centro',	'123', null, 'Ciudad A',	'555777888',	'09:00-18:00',	'www.hospitalabc.com');
INSERT INTO hospital VALUES(3002,	'Hospital DBC',	'Calle aaa',	'Centro',	'123', null, 'Ciudad A',	'555777888',	'09:00-18:00',	'www.hospitalabc.com');
INSERT INTO hospital VALUES(3003,	'Hospital FFA',	'Calle pp',	'Centro', null, 12, 'Ciudad A',	'555777888',	'09:00-18:00',	null);

INSERT INTO cita VALUES ('06:15:14','08/06/2023','COMPLETADA','Ninguna',1501458713,2001,3001);
INSERT INTO cita VALUES ('11:11:11','08/06/2023','COMPLETADA','Ninguna',1,2001,3001);
INSERT INTO cita VALUES ('01:01:10','10-05-2023','AUSENTE','Ninguna',1276459761,2002,3003);
INSERT INTO cita VALUES ('06:15:14','08/06/2023','COMPLETADA','Se desmayo',1276459761,2003,3003);

SELECT * FROM auditoria;

GO

CREATE PROCEDURE insertarPlazaMedico
    @med_numRegistroMedico INT,
    @hosp_idHosp INT
AS
BEGIN
    INSERT INTO plazaMedico (med_numRegistroMedico, hosp_idHosp)
    VALUES (@med_numRegistroMedico, @hosp_idHosp);
END;

GO

CREATE PROCEDURE insertarAsignacionMedico
    @pac_nssPac INT,
    @med_numRegistroMedico INT
AS
BEGIN
    INSERT INTO asignacionMedico (pac_nssPac, med_numRegistroMedico)
    VALUES (@pac_nssPac, @med_numRegistroMedico);
END;


GO

CREATE VIEW VistaCitas AS
SELECT cita.cita_numCita, cita.cita_horaCita, cita.cita_fechaCita,
       paciente.pac_nssPac, paciente.pac_primNomPac, paciente.pac_apPatPac,
       medico.med_numRegistroMedico, medico.med_primNomMed, medico.med_apPatMed,
       hospital.hosp_idHosp, hospital.hosp_nombreHosp
FROM cita
INNER JOIN paciente ON cita.pac_nssPac = paciente.pac_nssPac
INNER JOIN medico ON cita.med_numRegistroMedico = medico.med_numRegistroMedico
INNER JOIN hospital ON cita.hosp_idHosp = hospital.hosp_idHosp;

GO


CREATE PROCEDURE randomNSS
    @nss INT OUTPUT
AS
BEGIN
    SET NOCOUNT ON;
    DECLARE @randomNumber INT;

    
    SET @randomNumber = CAST((RAND() * 899999999) + 100000000 AS INT);

    
    WHILE EXISTS (SELECT 1 FROM paciente WHERE pac_nssPac = @randomNumber)
    BEGIN
        SET @randomNumber = CAST((RAND() * 899999999) + 100000000 AS INT);
    END;

    SET @nss = @randomNumber;
END;

GO

CREATE FUNCTION buscarMedicosEspecialidad
(
    @especialidad VARCHAR(255)
)
RETURNS TABLE
AS
RETURN
(
    SELECT med_numRegistroMedico, med_primNomMed, med_apPatMed
    FROM medico
    INNER JOIN especialidadesMedicos ON medico.esp_numEsp = especialidadesMedicos.esp_numEsp
    WHERE especialidadesMedicos.esp_tipoEspecialidad = @especialidad
);


GO

CREATE TRIGGER autoInserts
ON cita
AFTER INSERT
AS
BEGIN
    DECLARE @med_numRegistroMedico INT;
    DECLARE @hosp_idHosp INT;
    DECLARE @pac_nssPac INT;
    
    SELECT @med_numRegistroMedico = med_numRegistroMedico, @hosp_idHosp = hosp_idHosp, @pac_nssPac = pac_nssPac
    FROM inserted;

    
    EXEC insertarPlazaMedico @med_numRegistroMedico, @hosp_idHosp;
    EXEC insertarAsignacionMedico @pac_nssPac,@med_numRegistroMedico;
END;

GO



--Obtener la lista de médicos disponibles en un hospital para una fecha y hora específicas:
SELECT *
FROM medico
WHERE med_numRegistroMedico NOT IN (
    SELECT med_numRegistroMedico
    FROM cita
    WHERE cita_fechaCita = '09/06/2023' AND cita_horaCita = '14:00:00'
) AND med_numRegistroMedico IN (
    SELECT med_numRegistroMedico
    FROM plazaMedico
    WHERE hosp_idHosp = 3001
);

--Obtener el promedio de citas por médico en un hospital específico:
SELECT AVG(citas_por_medico) AS promedio_citas
FROM (
    SELECT COUNT(*) AS citas_por_medico
    FROM cita
    WHERE med_numRegistroMedico IN (
        SELECT med_numRegistroMedico
        FROM plazaMedico
        WHERE hosp_idHosp = 2001
    )
    GROUP BY med_numRegistroMedico
) AS subconsulta;


--
SELECT m.med_numRegistroMedico, m.med_primNomMed, m.med_apPatMed, COUNT(c.cita_numCita) AS total_citas
FROM medico m
LEFT JOIN cita c ON m.med_numRegistroMedico = c.med_numRegistroMedico
GROUP BY m.med_numRegistroMedico, m.med_primNomMed, m.med_apPatMed
ORDER BY total_citas DESC;
	
GO

CREATE FUNCTION buscarMedicosPorEspecialidad(@especialidad INT)
RETURNS TABLE
AS
RETURN (
    SELECT m.med_numRegistroMedico, m.med_primNomMed, m.med_apPatMed, m.esp_numEsp, e.esp_tipoEspecialidad
    FROM medico m
    INNER JOIN especialidadesMedicos e ON m.esp_numEsp = e.esp_numEsp
    WHERE m.esp_numEsp = @especialidad
);

GO

SELECT med_numRegistroMedico, med_primNomMed, med_apPatMed, esp_numEsp, esp_tipoEspecialidad
FROM buscarMedicosPorEspecialidad(1)
ORDER BY med_primNomMed;







