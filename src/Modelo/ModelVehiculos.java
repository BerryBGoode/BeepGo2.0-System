
package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author danlo
 */
public class ModelVehiculos {
    
    public static PreparedStatement ps;
    public static ResultSet rs;
    
    public static ResultSet CargarTabla() {
        
        Connection connect;
        
        try {
            connect = ModelConexion.getConnection();
            String query = "SELECT * FROM vwVehiculos_g";
            ps = connect.prepareStatement(query);
            rs = ps.executeQuery();
            return rs;
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
        
    }
    
    public static ResultSet CargarTablaPersonal() {
        
        Connection connect;
        
        try {
            connect = ModelConexion.getConnection();
            String query = "SELECT * FROM vwVehiculos_Personal";
            ps = connect.prepareStatement(query);
            rs = ps.executeQuery();
            return rs;
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
        
    }
    
    
    public static boolean RegistrarVehiculo(int idpersonal, String placa, String color) {
        Connection connect;
        try {
            connect = ModelConexion.getConnection();
            String query = "INSERT INTO tbVehiculos(idpersonal,placa,color) VALUES (?,?,?)";
            ps = connect.prepareStatement(query);
            ps.setInt(1, idpersonal);
            ps.setString(2, placa);
            ps.setString(3, color);
            ps.execute();
            return true;
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un problema durante el proceso de insersión, vuelva a intentarlo" + e.toString(), "Proceso de insersion", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
    }
    
    public static ResultSet Capturar_IDpersonal() {
        Connection connect;
        try {
            connect = ModelConexion.getConnection();
            ps = connect.prepareStatement("SELECT idPersonal FROM tbVehiculos");
            rs = ps.executeQuery();
            return rs;
        } catch (Exception e) {
            return null;
        }
    }
    
    public static boolean ActualizarVehiculo(int idVehiculo, int idpersonal, String placa, String color) {
      Connection connect;
      try {
          connect = ModelConexion.getConnection();
          String query = "UPDATE tbVehiculos SET idPersonal = ?, placa = ?, color = ? WHERE idVehiculo = ?";
          ps = connect.prepareStatement(query);
          ps.setInt(1, idpersonal);
          ps.setString(2, placa);
          ps.setString(3, color);
          ps.setInt(4, idVehiculo);
          ps.execute();
          return true;
      } catch (SQLException e) {
          JOptionPane.showMessageDialog(null, "Ocurrio un error mientras se actualizaba el registro, vuelva a intentarlo" + e.toString(), "Proceso de actualizacion", JOptionPane.ERROR_MESSAGE);
          return false;
      }
    }
    
    public static boolean EliminarVehiculo(int idVehiculo) {
        Connection connect;
        try {
            connect = ModelConexion.getConnection();
            String query = "DELETE tbVehiculos WHERE idVehiculo = ?";
            ps = connect.prepareStatement(query);
            ps.setInt(1, idVehiculo);
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error durante el proceso de eliminacion del registro" + e.toString(), "Proceso de eliminacion", JOptionPane.ERROR_MESSAGE);
            return false;
        } 
    }
    
}
