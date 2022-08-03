/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.*;
/**
 *
 * @author danlo
 */
public class ModelAccesos {
    
    static ResultSet rs;
    static PreparedStatement sql;
    static Connection con;
    
    public static ResultSet getdata(String tablename){
        try {
            con = ModelConexion.getConnection();
            sql = con.prepareStatement("SELECT * FROM "+tablename);
            rs = sql.executeQuery();
            return rs;
        } catch (SQLException e) {
            System.out.println("Error: "+e.toString());
            return null;
        }
    }    
}
