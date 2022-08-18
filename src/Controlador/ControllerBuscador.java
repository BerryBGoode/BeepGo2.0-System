/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ModelBuscador;
import java.sql.ResultSet;

/**
 *
 * @author danlo
 */
public class ControllerBuscador {
    
    public int ValorBussqueda;

    public int getValorBussqueda() {
        return ValorBussqueda;
    }

    public void setValorBussqueda(int ValorBussqueda) {
        this.ValorBussqueda = ValorBussqueda;
    }
    
    ModelBuscador mdlB = new ModelBuscador();
    
    public ResultSet ResBusqueda()
    {
        return mdlB.Buscar(ValorBussqueda);
    } 
    
}
