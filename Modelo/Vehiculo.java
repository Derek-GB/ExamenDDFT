/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Student
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private String matricula;
    private ServicioMantenimiento mantenimiento;

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public ServicioMantenimiento getMantenimiento() {
        return mantenimiento;
    }
    

    public Vehiculo(String marca, String modelo, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula;
    }
    
    
}
