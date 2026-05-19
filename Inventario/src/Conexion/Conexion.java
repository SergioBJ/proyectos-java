/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

/**
 *
 * @author ASUS TUF
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {

    public static Connection getConexion() {

        Connection conexion = null;
        String url = "jdbc:mysql://localhost:3306/Iventario?serverTimezone=UTC";
        String user = "root";
        String pass = "admin";

        try {

            conexion = DriverManager.getConnection(url, user, pass);

            System.out.println("Conexión exitosa");

        } catch (SQLException e) {

            System.out.println("Error: " + e.getMessage());

        }

        return conexion;
    }
}
