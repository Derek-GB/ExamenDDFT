/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Student
 */
public class Cliente {
    private String id;
    private String nombre;
    private String numeroContacto;

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public Cliente(String id, String nombre, String numeroContacto) {
        this.id = id;
        this.nombre = nombre;
        this.numeroContacto = numeroContacto;
    }

    public Cliente() {
        this("","","");
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", numeroContacto=" + numeroContacto + '}';
    }
    
    
    
}
