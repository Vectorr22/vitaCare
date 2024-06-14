/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author vmtg2
 */
public class ConexionBD {
    public static String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=vitaCareSystem;encrypt=false;useSSL=false;loginTimeout=5";
    public static String DB_URL2 = "jdbc:sqlserver://localhost:1433;databaseName=master;encrypt=false;useSSL=false;loginTimeout=5";
    public static String DB_USER = "vitaCareAdmin.";
    public static String DB_PASSWORD = "12345";
    public static String DB_NAME = "vitaCareSystem";
    public static String DB_NAME2 = "master";
    public static String DB_ROLE = "";
    public static Connection con;
    //vitacareadmin1
    public static Connection getConexion(Connection conexion) throws SQLException{
        try{
            conexion= DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            System.out.println("Conexión establecida");
            return conexion;
        }catch(SQLException ex){
            System.out.println(ex.toString());
            return null;
        }
    }
    
    
    public static void creacionDB() throws SQLException{
        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            if (verificarExistenciaBD(connection, DB_NAME)) {
                System.out.println("La base de datos ya existe.");
                String queryUsarDB = "USE " + DB_NAME;
                Statement statement = connection.createStatement();
                statement.executeUpdate(queryUsarDB);
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos");
            System.out.println("Creando la base de datos...");
            Connection connection = DriverManager.getConnection(DB_URL2, DB_USER, DB_PASSWORD);
            crearDB(connection, DB_NAME);
        }
        
    }
    
    public static boolean verificarExistenciaBD(Connection connection, String databaseName) throws SQLException {
        DatabaseMetaData metaData = connection.getMetaData();
        ResultSet resultSet = metaData.getCatalogs();
        while (resultSet.next()) {
            String catalogo = resultSet.getString(1);
            if (catalogo.equalsIgnoreCase(databaseName)) {
                return true;
            }
        }
        return false;
    }
    
    public static void crearDB(Connection connection, String databaseName) throws SQLException {
        Statement statement = connection.createStatement();
        String query = "CREATE DATABASE " + databaseName;
        statement.executeUpdate(query);
        System.out.println("La base de datos ha sido creada exitosamente.");
        String queryUsarDB = "USE " + DB_NAME;
        statement.executeUpdate(queryUsarDB);
        String query1, query2, query3, query4, query5;
        query5 = "CREATE TABLE ocupacionesPacientes (ocup_idOcupacion INT PRIMARY KEY, "
                + "ocup_tipoOcupacion VARCHAR(255), ocup_descripOcupacion VARCHAR(255));";
        
        query1 = "INSERT INTO ocupacionesPacientes VALUES(1,'Estudiante','El paciente es estudiante de nivel medio o superior');";
        query2 = "INSERT INTO ocupacionesPacientes VALUES(2,'Trabajador','El paciente es un trabajador dado de alta en el SAT');";
        query3 = "INSERT INTO ocupacionesPacientes VALUES(3,'Ama/o de casa','El paciente no estudia ni trabaja');";
        query4 = "INSERT INTO ocupacionesPacientes VALUES(4,'Jubilado/a','El paciente está jubilado, tiene más de 60 años');";
        
        String query6 = "CREATE TABLE especialidadesMedicos(" +
                "esp_numEsp INT PRIMARY KEY," +
                "esp_tipoEspecialidad VARCHAR(255)," +
                "esp_descripEspecialidad VARCHAR(255)" +
                ")";
        
        String query17 = "INSERT INTO especialidadesMedicos (esp_numEsp, esp_tipoEspecialidad, esp_descripEspecialidad)\n"
                + "VALUES\n"
                + "  (1, 'Cardiología', 'Diagnóstico y tratamiento de enfermedades del corazón y sistema circulatorio'),\n"
                + "  (2, 'Dermatología', 'Diagnóstico y tratamiento de trastornos de la piel, cabello y uñas'),\n"
                + "  (3, 'Gastroenterología', 'Diagnóstico y tratamiento de enfermedades del aparato digestivo'),\n"
                + "  (4, 'Neurología', 'Diagnóstico y tratamiento de enfermedades del sistema nervioso'),\n"
                + "  (5, 'Oftalmología', 'Diagnóstico y tratamiento de enfermedades oculares');";
        
        String query7 = "CREATE TABLE paciente (" +
                "pac_nssPac INT PRIMARY KEY," +
                "pac_primNomPac VARCHAR(100) NOT NULL," +
                "pac_segunNomPac VARCHAR(100) NOT NULL," +
                "pac_apPatPac VARCHAR(100) NOT NULL," +
                "pac_apMatPac VARCHAR(100) NOT NULL," +
                "pac_telPac VARCHAR(10) NOT NULL," +
                "pac_generoPac BIT NOT NULL," +
                "pac_fechaNacPac DATE," +
                "pac_correoPac VARCHAR(100) NULL," +
                "ocup_idOcupacion INT NOT NULL" +
                ")";
        
        String query9 = "CREATE TABLE medico (" +
                "med_numRegistroMedico INT PRIMARY KEY," +
                "med_primNomMed VARCHAR(100) NOT NULL," +
                "med_segunNomMed VARCHAR(100) NOT NULL," +
                "med_apPatMed VARCHAR(100) NOT NULL," +
                "med_apMatMed VARCHAR(100) NOT NULL," +
                "med_telMed INT NOT NULL," +
                "med_correoMed VARCHAR(200) NULL," +
                "esp_numEsp INT NOT NULL" +
                ")";

        

        String query11 = "CREATE TABLE hospital (" +
                "hosp_idHosp INT PRIMARY KEY," +
                "hosp_nombreHosp VARCHAR(255) NOT NULL," +
                "hosp_calleHosp VARCHAR(255) NOT NULL," +
                "hosp_colHosp VARCHAR(255) NOT NULL," +
                "hosp_numExtHosp VARCHAR(255) NULL," +
                "hosp_numIntHosp VARCHAR(255) NULL," +
                "hosp_ciudadHosp VARCHAR(255) NOT NULL," +
                "hosp_telHosp INT NOT NULL," +
                "hosp_horarioHosp VARCHAR(255) NOT NULL," +
                "hosp_paginaWebHosp VARCHAR(255) NULL" +
                ")";
        String query12 = "CREATE TABLE cita (" +
                "cita_numCita INT IDENTITY PRIMARY KEY," +
                "cita_horaCita TIME," +
                "cita_fechaCita DATE," +
                "cita_estadoCita VARCHAR(100)," +
                "cita_observacionesCita VARCHAR(255)," +
                "pac_nssPac INT," +
                "med_numRegistroMedico INT," +
                "hosp_idHosp INT" +
                ")";
        
        
        
        String query14 = "CREATE TABLE asignacionMedico (\n" +
        "    asig_idAsig INT IDENTITY PRIMARY KEY,\n" +
        "    pac_nssPac INT,\n" +
        "    med_numRegistroMedico INT,\n" +
        "    FOREIGN KEY(pac_nssPac) REFERENCES paciente (pac_nssPac),\n" +
        "    FOREIGN KEY(med_numRegistroMedico) REFERENCES medico(med_numRegistroMedico)\n" +
        ");";

        String query15 = "CREATE TABLE plazaMedico("
        + "plaza_idPlaza INT IDENTITY PRIMARY KEY,"
        + "med_numRegistroMedico INT,"
        + "hosp_idHosp INT,"
        + "FOREIGN KEY (med_numRegistroMedico) REFERENCES medico (med_numRegistroMedico),"
        + "FOREIGN KEY (hosp_idHosp) REFERENCES hospital (hosp_idHosp)"
        + ");";
        
        String query16 = "CREATE TABLE auditoria ("
        + "idAuditoria INT IDENTITY PRIMARY KEY,"
        + "usuario VARCHAR(255),"
        + "fechaHora DATETIME,"
        + "tipoAccion VARCHAR(50),"
        + "descripcion VARCHAR(MAX),"
        + "tablaAfectada VARCHAR(100),"
        + "conexion VARCHAR(MAX)"
        + ");";
        
        Statement st2 = connection.createStatement();
        st2.addBatch(query5);
        st2.addBatch(query1);
        st2.addBatch(query2);
        st2.addBatch(query3);
        st2.addBatch(query4);
        st2.addBatch(query6);
        st2.addBatch(query17);
        st2.addBatch(query7);
        st2.addBatch(query9);
        st2.addBatch(query11);
        st2.addBatch(query12);
        st2.addBatch(query14);
        st2.addBatch(query15);
        st2.addBatch(query16);
        
        int[] res = st2.executeBatch();
        if (res.length > 0) {
            System.out.println("Tablas creadas");
        } else {
            System.out.println("Error en alta de tablas");
        }
        statement.close();
        st2.close();
        connection.close();
    }
    
    
    public static void cerrarConexion(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Conexión cerrada exitosamente.");
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
    
}

