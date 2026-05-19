package Clases;

import Conexion.CConexion;
import java.beans.Statement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.*;
import java.sql.ResultSet;
import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author sergio
 */
public class CAlumnos {

    //Atributos
    private int codigo;
    private String Nombre;
    private String Apellido;

    //Encapsulamiento
    public int getCodigo() { //get (getter): Método que devuelve el valor de un atributo privado.
        return codigo;
    }

    public void setCodigo(int codigo) {  //set (setter): Método que permite asignar un nuevo valor a un atributo privado.
        this.codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void insertarAlumno(Connection conn, String nombre, String apellido) {

        if (conn == null) {
            JOptionPane.showMessageDialog(null, " No hay conexión a la BD");
            return;
        }

        String sql = "INSERT INTO Alumno (Nombre, Apellido) VALUES (?, ?)";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, " Alumno guardado correctamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Error al guardar\n" + e.getMessage());
        }
    }

    public void MostrarAlumnos(JTable TablaTotalAlumnos) {
        CConexion obj = new CConexion();
        Connection conn = obj.conectar();

        if (conn == null) {
            JOptionPane.showMessageDialog(null, "No hay conexión a la BD");
            return;
        }

        DefaultTableModel modelo = new DefaultTableModel();
        TablaTotalAlumnos.setModel(modelo);

        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");

        String sql = "SELECT IdAlumno, Nombre, Apellido FROM Alumno";

        java.sql.Statement st = null;
        java.sql.ResultSet rs = null;

        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                Object[] fila = new Object[3];
                fila[0] = rs.getInt("IdAlumno");
                fila[1] = rs.getString("Nombre");
                fila[2] = rs.getString("Apellido");

                modelo.addRow(fila);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar alumnos\n" + e.getMessage());
        }
    }

    public void Seleccionar(JTable TablaTotalAlumnos, JTextField Id, JTextField nombre, JTextField apellido) {
        try {
            int fila = TablaTotalAlumnos.getSelectedRow();

            if (fila >= 0) {

                Id.setText((TablaTotalAlumnos.getValueAt(fila, 0).toString()));
                nombre.setText((TablaTotalAlumnos.getValueAt(fila, 1).toString()));
                apellido.setText((TablaTotalAlumnos.getValueAt(fila, 2).toString()));
            } else {
                JOptionPane.showMessageDialog(null, "fila no seleccionada");
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error de seleccion" + e.toString());

        }

    }

    public void ModificarAlumno(Connection conn, JTextField Id,JTextField nombre, JTextField apellido) {
         if (conn == null) {
            JOptionPane.showMessageDialog(null, " No hay conexión a la BD");
            return;
        }
        setCodigo(Integer.parseInt(Id.getText())); //convirtiendo entero a caracter
        setNombre(nombre.getText());
        setApellido(apellido.getText());
        
        //CConexion conesss = new CConexion(); 
        String consulta="UPDATE Alumno SET Alumno.Nombre= ?, Alumno.Apellido = ? WHERE Alumno.IdAlumno = ?;";
        
        try (PreparedStatement cs = conn.prepareStatement(consulta)) {
            //CallableStatement cs =conesss.conectar().prepareCall(consulta);
            cs.setString(1, getNombre());
            cs.setString(2, getApellido());
            cs.setInt(3, getCodigo());
            
            cs.execute();
            
            JOptionPane.showMessageDialog(null, "Se edito correctamente");
            
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, "ERROR AL MODIFICAR"+ e.toString());
            
        }
    }
    
    public void EliminarAlumno(Connection conn, JTextField Id){
        if (conn == null) {
            JOptionPane.showMessageDialog(null, " No hay conexión a la BD");
            return;
        }
        setCodigo(Integer.parseInt(Id.getText())); // de entero a caracter
        String borrar="DELETE FROM Alumno WHERE Alumno.IdAlumno = ?";
        
        try (PreparedStatement cs = conn.prepareStatement(borrar)) {
      
            
            cs.setInt(1, getCodigo());
            
            cs.execute();
            
            JOptionPane.showMessageDialog(null, "Se elimino correctamente");
            
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, "ERROR AL ELIMINAR"+ e.toString());
            
        }
        
    }
}
