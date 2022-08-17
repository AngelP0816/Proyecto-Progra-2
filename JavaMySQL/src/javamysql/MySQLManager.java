/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javamysql;

import java.sql.*;


public class MySQLManager {
    public static final String URL = "jdbc:mysql://localhost/isunah_prog2";
    public static final String USER = "root";
    public static final String CLAVE = "root";
    
    public Connection getConexion() {

        Connection con = null;
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
            System.out.println("Conectado");
        } catch (Exception e) {
            System.out.println("No Conectado");
            System.out.println("Error: " + e.getMessage());
        }
        return con;
    }
    
}
