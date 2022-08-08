/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author danlo
 */
public class ModelCarnets {
    PreparedStatement ps;
    Connection con;
    public ResultSet cargarTabla(){
        try {
           con=ModelConexion.getConnection(); 
            String query="SELECT * FROM vwCarnet";
            ps=con.prepareStatement(query);
            ResultSet rs= ps.executeQuery();
           return rs;           
        } catch (Exception e) {
            System.out.println("No se logro cargar la informacion de la tabla");
            return null;
        }
    }
    
}
