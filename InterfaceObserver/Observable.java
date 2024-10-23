/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfaceObserver;

/**
 *
 * @author Student
 */
public interface Observable<t> {
    public boolean addObservador(Observador observador);
    public void avisarCambio(t cambio);
}
