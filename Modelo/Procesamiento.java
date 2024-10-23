/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Student
 */
public class Procesamiento extends Thread{
    Proceso proceso;
    Completado completado;
    Vehiculo vehiculo;
    ServicioMantenimiento servicio;
    
    public void run(){
        revisar();
    }
    
    public boolean revisar(){
        if (GestorMantenimiento.getInstance().consultarEstado(vehiculo)==proceso){
            vehiculo.getMantenimiento().setEstado(completado);
            return true;
        }
        return false;
    }
}
