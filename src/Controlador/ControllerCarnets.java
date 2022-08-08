/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ModelCarnets;
import java.sql.ResultSet;

/**
 *
 * @author danlo
 */
public class ControllerCarnets {
    ModelCarnets ObjModel=new ModelCarnets();
    public ResultSet cargarTablaController(){
        return ObjModel.cargarTabla();
    }
    
}
