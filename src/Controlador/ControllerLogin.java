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
    private String usuario;
    private String contraseña;
    private int intentos;

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
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

    public boolean IntentosController(){
        return ModelLogin.Intentos(intentos, usuario);
    }
    
    public ResultSet CapturarIntentosController(){
       return ModelLogin.CapturarIntentos(usuario);
    }
    
    public ResultSet CapturarDatosController(){
        return ModelLogin.CapturarDatos(usuario);
    }
}
