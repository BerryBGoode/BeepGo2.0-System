
package Modelo;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author danlo
 */
public class ModelContactos {
    
    private static PreparedStatement ps;
    private static ResultSet rs;
    
    public static ResultSet CargarTablaContactos() {
        
        Connection connect;
        
        try {
            connect = ModelConexion.getConnection();
            String query = "SELECT * FROM tbContactos";
            ps = connect.prepareStatement(query);
            rs = ps.executeQuery();
            return rs;
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "No se han podido cargar los datos");
            return null;    
        }   
        
    }
    
    public static ResultSet CargarCMBPersonal() {
        
        Connection connect;
        
        try {
            connect = ModelConexion.getConnection();
            String query = "SELECT nombre_p, apellido_p FROM tbPersonal";
            ps = connect.prepareStatement(query);
            rs = ps.executeQuery();
            return rs;
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar los datos");
            return null;
        }
        
    }
    
    public static ResultSet CargarCMBTipoContacto() {
        
        Connection connect;
        
        try {
            connect = ModelConexion.getConnection();
            String query = "SELECT * tbTipoContacto";
            ps = connect.prepareStatement(query);
            rs = ps.executeQuery();
            return rs;
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar los datos");
            return null;
        }
        
    }
    
    public static int RegistrarContacto(String contacto, int idpersonal, int idtipocontacto) {
        
        Connection connect;
        
        try {
            connect = ModelConexion.getConnection();
            String query = "INSERT INTO tbContactos VALUES (?,?,?)";
            ps = connect.prepareStatement(query);
            ps.setString(1, contacto);
            ps.setInt(2, idpersonal);
            ps.setInt(3, idtipocontacto);
            ps.execute();
            return 1;
        } catch(SQLException e) {
            return 0;
        }
        
    }
    
    public static boolean ActualizarContacto(int idcontacto, String contacto, int idpersonal, int idtipocontacto) {
        
        Connection connect;
        
        try {
            connect = ModelConexion.getConnection();
            String query = "UPDATE tbContactos SET contacto = ?, idPersonal = ?, idTipoContacto = ? WHERE idContacto = ?";
            ps = connect.prepareStatement(query);
            ps.setString(1, contacto);
            ps.setInt(2, idpersonal);
            ps.setInt(3, idtipocontacto);
            ps.setInt(4, idcontacto);
            ps.execute();
            return true;
        } catch(SQLException e) {
            return false;
        }
        
    }
    
    public static boolean EliminarContacto(int idcontacto) {
        
        Connection connect;
        
        try {
            connect = ModelConexion.getConnection();
            String query = "DELETE tbContactos WHERE idContacto = ?";
            ps = connect.prepareStatement(query);
            ps.setInt(1, idcontacto);
            ps.execute();
            return true;
        } catch(SQLException e) {
            return false;
        }
        
    }
    
}
