package Main;

import Vista.FrmPrincipal;
import Vista.FrmRegistro;
import Controlador.TallerControlador;
import Vista.FrmServiciosActuales;
import Vista.FrmServiciosCompletados;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Student
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        TallerControlador control = new TallerControlador();
        
        FrmServiciosActuales frmActuales = new FrmServiciosActuales();
        FrmServiciosCompletados frmCompletados = new FrmServiciosCompletados();
        FrmRegistro frmRegistro = new FrmRegistro();

        FrmPrincipal frmPrincipal = new FrmPrincipal(frmRegistro, frmActuales, frmCompletados);
        
        control.addObservador(frmRegistro);
        control.addObservador(frmCompletados);
        control.addObservador(frmActuales);
        frmPrincipal.setVisible(true);
    }

}
