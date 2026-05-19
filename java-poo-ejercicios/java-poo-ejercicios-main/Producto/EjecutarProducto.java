/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Clases.Producto;

/**
 *
 * @author sergio
 */
public class EjecutarProducto {
    
    public static void main(String[] args) {
        
        Producto p1=new Producto("portatil", 30000, 9); //dandole valor al constructor, producto 1 creado
        Producto p2 = new Producto("Pantalla", 95000, 100);
        // Mostrar información inicial
        p1.mostrarinformcion();
        p2.mostrarinformcion();

        // Vender productos
        p1.vender(2);
        p1.vender(10);   // intento inválido
        p1.vender(-1);   // intento inválido
        p2.vender(10);  

        // Reabastecer
        p1.reabastecer(5);
        p1.reabastecer(0); // intento inválido
        p2.reabastecer(1);

        // Mostrar información final
        p1.mostrarinformcion();
        p2.mostrarinformcion();
        
    }
    
}
