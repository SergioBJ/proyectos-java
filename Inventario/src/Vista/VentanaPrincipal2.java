/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

/**
 *
 * @author ASUS TUF
 */
import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal2 extends JFrame{
        // Campos de texto
    private JTextField txtNombre;
    private JTextField txtPrecio;
    private JTextField txtStock;
    private JTextField txtCategoria;

    // Botones
    private JButton btnGuardar;

    public VentanaPrincipal2() {

        setTitle("Sistema de Inventario");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        iniciarComponentes();

        setVisible(true);
    }

    private void iniciarComponentes() {

        JPanel panel = new JPanel();
        panel.setLayout(null);

        // LABEL NOMBRE
        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(30, 30, 100, 25);
        panel.add(lblNombre);

        // INPUT NOMBRE
        txtNombre = new JTextField();
        txtNombre.setBounds(130, 30, 200, 25);
        panel.add(txtNombre);

        // LABEL PRECIO
        JLabel lblPrecio = new JLabel("Precio:");
        lblPrecio.setBounds(30, 70, 100, 25);
        panel.add(lblPrecio);

        // INPUT PRECIO
        txtPrecio = new JTextField();
        txtPrecio.setBounds(130, 70, 200, 25);
        panel.add(txtPrecio);

        // LABEL STOCK
        JLabel lblStock = new JLabel("Stock:");
        lblStock.setBounds(30, 110, 100, 25);
        panel.add(lblStock);

        // INPUT STOCK
        txtStock = new JTextField();
        txtStock.setBounds(130, 110, 200, 25);
        panel.add(txtStock);

        // LABEL CATEGORIA
        JLabel lblCategoria = new JLabel("Categoría:");
        lblCategoria.setBounds(30, 150, 100, 25);
        panel.add(lblCategoria);

        // INPUT CATEGORIA
        txtCategoria = new JTextField();
        txtCategoria.setBounds(130, 150, 200, 25);
        panel.add(txtCategoria);

        // BOTON GUARDAR
        btnGuardar = new JButton("Guardar");
        btnGuardar.setBounds(130, 200, 120, 30);
        panel.add(btnGuardar);

        add(panel);
    }
}
