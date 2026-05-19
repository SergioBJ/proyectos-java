/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author sergio
 */

//Encapsulamiento = atributos privados + métodos públicos que los controlan
public class CuentaBancaria {

    
    //Atributos
    private String Titular;
    private double saldo;

    //constructor
    public CuentaBancaria(String titular, double saldoInicial) {
        this.Titular = titular;
        this.saldo = saldoInicial;
    }

   

    //metodos
    public  void depositar(double monto) {
       if (monto > 0) {
            saldo += monto;
            System.out.println("Deposito exitoso: " + monto);
        } else {
            System.out.println("El monto a depositar debe ser mayor que cero.");
        }

    }

    public void retirar(double monto) {
         if (monto <= 0) {
            System.out.println("El monto a retirar debe ser mayor que cero.");
        } else if (monto > saldo) {
            System.out.println("Fondos insuficientes.");
        } else {
            saldo -= monto;
            System.out.println("Retiro exitoso: " + monto);
        }

    }

    public void mostrarinformacion() {
        System.out.println("----------------------");
        System.out.println("Titular: " + Titular);
        System.out.println("Saldo: " + saldo);
        System.out.println("----------------------");

    }
}
