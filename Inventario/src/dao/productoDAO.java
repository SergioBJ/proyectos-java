/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

// Habla con la base de datos
//DAO = Data Access Object
import java.sql.*;
import Conexion.Conexion;
import modelo.Producto;
import java.util.ArrayList;
import javax.swing.JTable;

public class productoDAO {

    public void guardarProducto(Producto producto) {

        Connection conn = null;

        try {

            conn = Conexion.getConexion();

            String sql = "INSERT INTO producto(nombre, precio, stock, categoria) VALUES (?, ?, ?, ?)";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, producto.getNombre());
            ps.setDouble(2, producto.getPrecio());
            ps.setInt(3, producto.getStock());
            ps.setString(4, producto.getCategoria());

            ps.executeUpdate();

            System.out.println("Producto guardado correctamente");

            ps.close();
            conn.close();

        } catch (Exception e) {

            System.out.println("Error al guardar producto: " + e.getMessage());

        }
    }

    public ArrayList<Producto> listarProductos() {

        ArrayList<Producto> listaProductos = new ArrayList<>();

        Connection conn = null;

        try {

            conn = Conexion.getConexion();

            String sql = "SELECT * FROM producto";

            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Producto producto = new Producto();

                producto.setId(rs.getInt("id"));
                producto.setNombre(rs.getString("nombre"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setStock(rs.getInt("stock"));
                producto.setCategoria(rs.getString("categoria"));

                listaProductos.add(producto);
            }

            rs.close();
            ps.close();
            conn.close();

        } catch (Exception e) {

            System.out.println("Error al listar productos: " + e.getMessage());
        }

        return listaProductos;
    }
    
    public void eliminarProducto(int id) {

    Connection conn = null;

    try {

        conn = Conexion.getConexion();

        String sql = "DELETE FROM producto WHERE id = ?";

        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setInt(1, id);

        int filasEliminadas = ps.executeUpdate();

        if (filasEliminadas > 0) {

            System.out.println("Producto eliminado correctamente");

        } else {

            System.out.println("No existe un producto con ese ID");
        }

        ps.close();
        conn.close();

    } catch (Exception e) {

        System.out.println("Error al eliminar producto: " + e.getMessage());
    }
}
    
    public void actualizarProducto(Producto producto) {

    Connection conn = null;

    try {

        conn = Conexion.getConexion();

        String sql = "UPDATE producto SET nombre = ?, precio = ?, stock = ?, categoria = ? WHERE id = ?";

        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setString(1, producto.getNombre());
        ps.setDouble(2, producto.getPrecio());
        ps.setInt(3, producto.getStock());
        ps.setString(4, producto.getCategoria());
        ps.setInt(5, producto.getId());

        int filasActualizadas = ps.executeUpdate();

        if (filasActualizadas > 0) {

            System.out.println("Producto actualizado correctamente");

        } else {

            System.out.println("No existe un producto con ese ID");
        }

        ps.close();
        conn.close();

    } catch (Exception e) {

        System.out.println("Error al actualizar producto: " + e.getMessage());
    }
}

 

    

}
