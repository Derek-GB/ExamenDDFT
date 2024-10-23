/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Student
 */
public class Proceso extends Estado {

    @Override
    public String completado() {
       return "completado";
    }

    @Override
    public String proceso() {
         return "proceso";
    }

    @Override
    public String espera() {
        return "espera";
    }


    
}
