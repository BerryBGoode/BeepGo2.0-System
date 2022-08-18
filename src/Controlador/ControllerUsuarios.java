/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ModelUsuarios;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author danlo
 */
public class ControllerUsuarios {
    
    Connection con = ControllerConexion.getConnectionModel();
    ModelUsuarios mdlusu = new ModelUsuarios();
    
    public ResultSet CargarTipoUsuarios_C(){
        return mdlusu.CargarTipoUsuarios(con);
    }
    
    public ResultSet CargarEstadoUsuarios_C(){
        return mdlusu.CargarEstadoUsuarios(con);
    }  
    
     public ResultSet CargarPersonal_C(){
        return mdlusu.CargarPersonal(con);
    }
}
