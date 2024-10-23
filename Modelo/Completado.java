/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Student
 */
public class Completado extends Estado {

    @Override
    public void completado() {
        System.out.println("El vehiculo esta completado");
    }

    @Override
    public void proceso() {
        System.out.println("El vehiculo esta en proceso");
    }

    @Override
    public void espera() {
        System.out.println("El vehiculo esta en espera");
    }

      
 
 
 
}
