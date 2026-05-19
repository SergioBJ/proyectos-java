/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author sergio
 */
import Clase.Habitacion;

public class Main {
    
    public static void main(String[] args) {
       Habitacion h = new Habitacion(101, 120.0);

        h.mostrarEstado();

        String disponible = h.estaDisponible();
        System.out.println("Estado: " + disponible);

         
        System.out.println("Costo por 2 noches: " + h.calcularCosto(2) );

        h.reservar(4);  // # de dias reservado 
        //h.reservar(2);

        h.Liberar();
        //h.Liberar();

        h.mostrarEstado();
    }
    }
    

