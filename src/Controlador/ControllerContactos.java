
package Controlador;

import Modelo.ModelContactos;
import java.sql.*;

/**
 *
 * @author Eam
 */
public class ControllerContactos {
    
    public static int idcontacto;
    public static String contacto;
    public static int idpersonal;
    public static int idTipoContacto;

    public static String getContacto() {
        return contacto;
    }

    public static void setContacto(String contacto) {
        ControllerContactos.contacto = contacto;
    }

    public static int getIdpersonal() {
        return idpersonal;
    }

    public static void setIdpersonal(int idpersonal) {
        ControllerContactos.idpersonal = idpersonal;
    }

    public static int getIdTipocontacto() {
        return idTipoContacto;
    }

    public static void setIdTipocontacto(int idTipocontacto) {
        ControllerContactos.idTipoContacto = idTipocontacto;
    }

    public ControllerContactos(String pcontacto, int pidpersonal, int pidTipoContacto) {
        contacto = pcontacto;
        idpersonal = pidpersonal;
        idTipoContacto = pidTipoContacto;
    }
    
    /**
     * 
     * @return 
     */
    
    public ControllerContactos(int pidcontacto, String pcontacto, int pidpersonal, int pidTipoContacto) {
        idcontacto = pidcontacto;
        contacto = pcontacto;
        idpersonal = pidpersonal;
        idTipoContacto = pidTipoContacto;
    }

    public static ResultSet CargarTablaContactos_Controller() {
        return ModelContactos.CargarTablaContactos();
    }
    
    public static ResultSet CargarCMBPersonal_Controller() {
        return ModelContactos.CargarCMBPersonal();
    }
    
    public static ResultSet CargarCMBTipoContactos_Controller() {
        return ModelContactos.CargarCMBTipoContacto();
    }
    
    public static int RegistrarContactos_Controller() {
        return ModelContactos.RegistrarContacto(contacto, idpersonal, idTipoContacto);
    }
    
    public static boolean ActualizarContactos_Controller() {
        return ModelContactos.ActualizarContacto(idcontacto, contacto, idpersonal, idTipoContacto);
    }
    
    public static boolean EliminarContactos_Controller() {
        return ModelContactos.EliminarContacto(idcontacto);
    }
    
}
