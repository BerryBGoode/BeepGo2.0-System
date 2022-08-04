/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author danlo
 */
public class ModelParqueo {
    ResultSet rs;
    PreparedStatement sql;
    Connection con;
    
    public ResultSet getIDPark(int park){
        try {
            con = ModelConexion.getConnection();
            sql = con.prepareStatement("SELECT idParqueo FROM tbParqueos WHERE numero_parqueo = ?");
            sql.setInt(1, park);
            rs = sql.executeQuery();
            return rs;
        } catch (SQLException e) {
            System.out.println("Error: "+e.toString());
            return null;
        }
    }
    
    public boolean insertPark(int idpark, int idacces, int idcar){
        try {
            con = ModelConexion.getConnection();
            sql = con.prepareStatement("INSERT INTO tbDetallesAccesos VALUES (?,?,?)");
            sql.setInt(1, idcar);
            sql.setInt(2, idacces);
            sql.setInt(3, idpark);            
            sql.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("Error: "+e.toString());
            return false;
        }catch (Exception r){
            System.out.println("Error: "+r.toString());
            return false;
        }
    }
}
