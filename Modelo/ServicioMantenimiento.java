/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Student
 */
public class ServicioMantenimiento {
    
    private String tipo;
    private String detalles;
    private Estado estado; 

    public String getTipo() {
        return tipo;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public ServicioMantenimiento(String tipo, String detalles, Estado estado) {
        this.tipo = tipo;
        this.detalles = detalles;
        this.estado = estado;
    }
    
      public ServicioMantenimiento() {
        this("","",null);
    }

    @Override
    public String toString() {
        return "ServicioMantenimiento{" + "tipo=" + tipo + ", detalles=" + detalles + ", estado=" + estado + '}';
    }
    
    
    
}
