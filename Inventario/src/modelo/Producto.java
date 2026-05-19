/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

// Datos y comportamiento del producto
public class Producto {

    //Atributos
    private int id;
    private String nombre;
    private double precio;
    private int stock;
    private String categoria;

// Encapsulamiento
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() { //get (getter): Método que devuelve el valor de un atributo privado.
        return nombre;
    }

    public void setNombre(String nombre) { //set (setter): Método que permite asignar un nuevo valor a un atributo privado.
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    

}
