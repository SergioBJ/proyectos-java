/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import Clases.CuentaBancaria;
/**
 *
 * @author sergio
 */

public class EjecutarCuentaBancaria {
    
        
    public static void main(String[] args) {
        // Crear cuentas
        CuentaBancaria cuenta1 = new CuentaBancaria("Sergio", 1000000); //nombre del titular, sldo inicial
        CuentaBancaria cuenta2 = new CuentaBancaria("Ana", 500000);

      //  Operaciones cuenta 1
        cuenta1.depositar(900000);
        cuenta1.retirar(350000);

//        // Operaciones cuenta 2
        cuenta2.depositar(800000);
        cuenta2.retirar(100000);

        // Mostrar información final
        cuenta1.mostrarinformacion();
        cuenta2.mostrarinformacion();
        
    }
}
