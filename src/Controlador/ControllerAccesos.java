/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.ResultSet;
import Modelo.ModelAccesos;
/**
 *
 * @author danlo
 */
public class ControllerAccesos {
    public static ResultSet getdata(String tablename){
        return ModelAccesos.getdata(tablename);
    }
}
