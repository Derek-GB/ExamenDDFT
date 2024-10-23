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

    public TallerControlador(FrmPrincipal frmPrincipal, FrmServiciosActuales frmActuales, FrmServiciosCompletados frmCompletados, FrmRegistro frmRegistro, ArrayList<Observador> observadores) {
        this.frmPrincipal = frmPrincipal;
        this.frmActuales = frmActuales;
        this.frmCompletados = frmCompletados;
        this.frmRegistro = frmRegistro;
        this.observadores = new ArrayList<>();
        addObservador(frmRegistro);
        addObservador(frmCompletados);
        addObservador(frmActuales);
        gestor = GestorMantenimiento.getInstance();
    }

    public void agregarVehiculo(String matricula, String modelo, String marca) {
        gestor.agregar(new Vehiculo(marca, modelo, matricula));
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
