/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author sergio
 */
public class Producto {

    //Atributos
    private String nombre;
    private double precio;
    private int stock;

    //constructor
    public Producto(String nombre, double valor, int stock) {
        this.nombre = nombre;
        this.precio = valor;
        this.stock = stock;
    }

    //metodos
   

    public void vender(int cantidad) {

        if (cantidad <= 0) {

            System.out.println("\n no se puede realizar la venta");
        } else if (cantidad > stock) {
            System.out.println("\n no hay suficiente productos");
        } else {
            stock = stock - cantidad;
            System.out.println("------------------------------------------------");
            System.out.println("\nventas realizadas: " + cantidad + " unidades");
            System.out.println("Stock actual: " + stock);
        }
    }

    public void reabastecer(int cantidad) {

        if(cantidad <=0){
            System.out.println("----------------------------------------------------");
            System.out.println("La cantidad a reabastecer debe ser mayor que cero.");
        }
        else if (cantidad > 0 ){
            System.out.println("----------------------------------------------------");
            System.out.println("\nreabastecimiento exitoso: " + cantidad + " unidades");
            stock= stock + cantidad;
            
            System.out.println("Stock actual: " + stock);
        }
    }

    
     public void mostrarinformcion() {
        System.out.println("\nnombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Strock disponibles: " + stock);

    }
}
