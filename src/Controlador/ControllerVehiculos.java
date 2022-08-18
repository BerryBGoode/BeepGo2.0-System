
package Controlador;

import java.sql.ResultSet;

import Modelo.ModelVehiculos;

/**
 *
 * @author Eam
 */
public class ControllerVehiculos {
    
    public static int idvehiculo;
    public static int idpersonal;
    public static String placa;
    public static String color;

    public static ResultSet CargarTablaVehiculos_Controller() {
        return ModelVehiculos.CargarTabla();
    }
    
    public static ResultSet CargarTablaPersonal_Controller() {
        return ModelVehiculos.CargarTablaPersonal();
    }
    
    public boolean RegistrarVehiculo_Controller() {
        return ModelVehiculos.RegistrarVehiculo(idpersonal, placa, color);
    }
    
    public static ResultSet getIdPersonal() {
        return ModelVehiculos.Capturar_IDpersonal();
    }
    
    public boolean ActualizarVehiculo_Controller() {
        return ModelVehiculos.ActualizarVehiculo(idvehiculo, idpersonal, placa, color);
    }
    
    public boolean EliminarVehiculo_Controller() {
        return ModelVehiculos.EliminarVehiculo(idvehiculo);
    }
}
