/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class Database {

    protected Connection conexion;
    private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://localhost/bd_GigaByte";

    private final String USER = "root";
    private final String PASS = "";

    public void Conectar() throws ClassNotFoundException, SQLException {
        try {
            conexion = DriverManager.getConnection(DB_URL, USER, PASS);
            Class.forName(JDBC_DRIVER);
            System.out.println("CONEXION REALIZADA CORRECTAMENTE");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("HUBO UN ERROR EN LA CONEXION");
        }
    }

    public void Cerrar() throws SQLException{
        if(conexion!=null){
            if (!conexion.isClosed()) {
                 conexion.close();
            }
        }
    }
}
