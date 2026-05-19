package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CConexion {

    private Connection conn; //

    private final String url = "jdbc:sqlserver://localhost:1433;"
            + "databaseName=colegio;"
            + "integratedSecurity=true;"
            + "encrypt=true;"
            + "trustServerCertificate=true";

    // Conectar
    public Connection conectar() {

        try {
            if (conn == null || conn.isClosed()) {
                conn = DriverManager.getConnection(url);
                System.out.println("✅ Conectado a SQL Server");
            }
            return conn;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "ERROR AL CONECTARSE\n" + e.getMessage()
            );
            return null;
        }
    }

    //  Desconectar
   public void desconectar() {

    try {
        if (conn != null && !conn.isClosed()) {
            conn.close();
            JOptionPane.showMessageDialog(null, " Conexión cerrada");
        } else {
            JOptionPane.showMessageDialog(null, "️ No hay conexión activa");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(
                null,
                "ERROR AL DESCONECTAR\n" + e.getMessage()
        );
    }
}
   
   public Connection getConexion() {
    return conn;
}


}
