/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase;

/**
 *
 * @author sergio
 */
public class Habitacion {
//Atributo
    private int numero;
    private double precioPorNoche;
    private boolean ocupada;

    public Habitacion(int Numero, double PrecioPorNoche) {

        this.numero = Numero;
        this.precioPorNoche = PrecioPorNoche;
        this.ocupada = !false;
    }

    //metodos 
    public String estaDisponible() {

        if (ocupada ==false) {
            return "disponible";
        } else {
            return "ocupada";
        }
    }

    public double calcularCosto(int noche) {

        return precioPorNoche * noche;
    }

    public void reservar(int noche) {
        if (noche <= 0) {
            System.out.println("No se puede reservar");
            System.out.println("---------------------------");
        } else {
            if (ocupada == true) {
                System.out.println("la habitacion ya esta ocupada");
                System.out.println("------------------------------");

            } else {
                System.out.println("se reservo la habitacion");
                System.out.println("---------------------------");
            }
        }
    }

    public void Liberar() {
        if (ocupada == false) {
            System.out.println("Se libera habitacion");
            System.out.println("------------------------");
        } else {
            System.out.println("No se libera habitacion porque esta ocupada");
            System.out.println("--------------------------");
        }
    }

    public void mostrarEstado() {
        System.out.println("HabitaciOn #" + numero);
        System.out.println("Precio por noche: " + precioPorNoche);

        if (ocupada == true) {
            System.out.println("Estado: Ocupada");
        } else {
            System.out.println("Estado: Disponible");
        }

        System.out.println("--------------------------");
    }

  
}
