/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Student
 */
public class GestorMantenimiento {

    private static GestorMantenimiento mantenimiento;
    ArrayList<Vehiculo> lista = new ArrayList();
    ServicioMantenimiento servicio;
    Vehiculo vehiculo;

    public Iterator<Vehiculo> getLista() {
        return lista.iterator();
    }

    
    
    public void agregar(Vehiculo vehiculo) {
        lista.add(vehiculo);
    }

    public void actualizar(Vehiculo vehiculo) {
        if (lista.contains(vehiculo.getMatricula())) {
            Vehiculo v = new Vehiculo(vehiculo.getMarca(), vehiculo.getModelo(), vehiculo.getMatricula());
            lista.remove(vehiculo);
            lista.add(v);
        }

    }

    public Estado consultarEstado(Vehiculo vehiculo) {
        return vehiculo.getMantenimiento().getEstado();
    }

    private GestorMantenimiento() {
        GestorMantenimiento mantenimiento = new GestorMantenimiento();
    }

    public static GestorMantenimiento getInstance() {
        if (mantenimiento == null) {
            mantenimiento = new GestorMantenimiento();
            return mantenimiento;
        }
        return mantenimiento;
    }

    public void nose() {
        System.out.println("nose");
    }
}
