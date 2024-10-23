/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelo;

/**
 *
 * @author Student
 */
public interface Command {
   
    void agregar(Vehiculo vehiculo);
    void actualizar(Vehiculo vehiculo);
    void consultarEstado(Vehiculo vehiculo);
    
}
