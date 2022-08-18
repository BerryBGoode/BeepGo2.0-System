/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import com.sun.org.apache.bcel.internal.generic.SWITCH;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author danlo
 */
public class ModelBuscador {
   
    public ResultSet Buscar (int ValorBusqueda){
        
        Connection con;
        PreparedStatement ps;
        int val = ValorBusqueda;
        
        try
        {
            switch(val)
            {
                case 1:
                    ModelParqueo mdlPark = new ModelParqueo();
                    mdlPark.loadPark();
                    break;
            }
            
            return null;
        } catch (Exception e)
        {
            return null;
        }
        
    }
    
}
