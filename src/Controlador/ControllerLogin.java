/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ModelLogin;
import java.sql.ResultSet;

/**
 *
 * @author danlo
 */
public class ControllerLogin {
    public static String usuario;
    public String contraseña;

    public static String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public static void setUsuario(String usuario) {
        ControllerLogin.usuario = usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public int validarUsuarioController(){
        return ModelLogin.ValidarUsuario(usuario);
    }
    
    public int validarLoginC(){
        return ModelLogin.ValidarLogin(usuario, contraseña);
     }   
 
    public int ValidarUsuarioActivoController(){
        return ModelLogin.ValidarUsuarioActivo(usuario);
    }
    
    public boolean BloquearUsuarioController(){
        return ModelLogin.BloquearUsuario(usuario);
    }

    public boolean IntentosController(int intentos){
        return ModelLogin.Intentos(intentos, usuario);
    }
    
    public ResultSet CapturarIntentosController(){
       return ModelLogin.CapturarIntentos(usuario);
    }
    
    public ResultSet CapturarDatosController(){
        return ModelLogin.CapturarDatos(usuario);
    }
}
