/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import InterfaceObserver.Observable;
import InterfaceObserver.Observador;
import Modelo.Estado;
import Modelo.GestorMantenimiento;
import Modelo.Vehiculo;
import Vista.FrmRegistro;
import Vista.FrmPrincipal;
import Vista.FrmServiciosActuales;
import Vista.FrmServiciosCompletados;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Student
 */
public class TallerControlador implements Observable {

    private FrmPrincipal frmPrincipal;
    private FrmServiciosActuales frmActuales;
    private FrmServiciosCompletados frmCompletados;
    private FrmRegistro frmRegistro;
    private ArrayList<Observador> observadores;
    private GestorMantenimiento gestor;

    public TallerControlador() {
        this.observadores = new ArrayList<>();

        gestor = GestorMantenimiento.getInstance();
    }

    public void agregarVehiculo(String matricula, String modelo, String marca) {
        Vehiculo v = new Vehiculo(marca, modelo, matricula);
        gestor.agregar(v);
        avisarCambio(v);
    }

    public ArrayList<String> mostrarVehiculos(Estado estado) {
        ArrayList<String> lista = new ArrayList<>();
        Iterator iterador = gestor.getLista();
        contarVehiculos(estado, lista, iterador);
        return lista;
    }

    private void contarVehiculos(Estado estado, ArrayList<String> lista, Iterator iterador) {
        if (!iterador.hasNext()) {
            return;
        }
        Vehiculo next = (Vehiculo) iterador.next();
        if (next.getMantenimiento().getEstado() == estado) {
            lista.add(next.toString());
        }
        contarVehiculos(estado, lista, iterador);
    }

    @Override
    public final boolean addObservador(Observador observador) {
        if (!observadores.contains(observador)) {
            observadores.add(observador);

            return true;
        }
        return false;
    }

    @Override
    public void avisarCambio(Object cambio) {
        for (Observador observador : observadores) {
            observador.actualizar(cambio);
        }
    }

}
