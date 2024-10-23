/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import InterfaceObserver.Observable;
import InterfaceObserver.Observador;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Student
 */
public class TallerControlador implements Observable {

    private ArrayList<Observador> observadores;

    @Override
    public boolean addObservador(Observador observador) {
        if (!observadores.contains(observador)) {
            observadores.add(observador);
            
            return true;
        }
        return false;
    }

    @Override
    public void avisarCambio(Object cambio) {
        for(Observador observador:observadores){
            observador.actualizar(cambio);
        }
    }

}
