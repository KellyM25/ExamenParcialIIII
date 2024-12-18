/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionmedicakmu;

/**
 *
 * @author Kelly
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    static Connection conectar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private Connection c;
    
    public Conexion(String dbName) {
        try {
            /* Driver */
            String driver = "com.mysql.cj.jdbc.Driver";
            System.out.println("=> Cargando el Driver:");
            Class.forName(driver);
            System.out.println("Driver OK");
            /* Definiendo Base de Datos */
            String url = "jdbc:mysql://localhost:3306/" + dbName;
            String user = "root";
            String pass = "";
            /* Conectando */
            System.out.println("=> Conectando a la BD:");
            c = DriverManager.getConnection(url, user, pass);
            System.out.println("Base de Datos OK");
        } catch (Exception x) {
            System.out.println("Error al tratar de conectar a la BD!");
            x.printStackTrace();
        }
    }

    // Método para obtener la conexión
    public Connection getConexion() {
        return c;
    }
}
