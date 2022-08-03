/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ModelRecuperacionContra;

/**
 *
 * @author danlo
 */
public class ControllerRecuperacionContra {
    
    public static String usuario;
    public static String contra;
    public static String PIN;

    public static String getUsuario() {
        return usuario;
    }

    public static void setUsuario(String usuario) {
        ControllerRecuperacionContra.usuario = usuario;
    }

    public static String getPIN() {
        return PIN;
    }

    public static void setPIN(String PIN) {
        ControllerRecuperacionContra.PIN = PIN;
    }

    public static String getContra() {
        return contra;
    }

    public static void setContra(String contra) {
        ControllerRecuperacionContra.contra = contra;
    }
    
        
    public int RecuperarContraPINController (){
        return ModelRecuperacionContra.RecuperarContraPIN_ValidarDatos(usuario, PIN);
    }
    
        
    public boolean RecuperarContraController (){
        return ModelRecuperacionContra.RecuperarContra(usuario, contra);
    }
}
