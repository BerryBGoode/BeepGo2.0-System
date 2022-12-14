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
    
    private static int ID;
    private static int typeAccess;
    private static String date;
    private static String hour;
    private static String justification;
    
    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        ControllerAccesos.ID = ID;
    }

    public static int getTypeAccess() {
        return typeAccess;
    }

    public static void setTypeAccess(int typeAccess) {
        ControllerAccesos.typeAccess = typeAccess;
    }

    public static String getDate() {
        return date;
    }

    public static void setDate(String date) {
        ControllerAccesos.date = date;
    }

    public static String getHour() {
        return hour;
    }

    public static void setHour(String hour) {
        ControllerAccesos.hour = hour;
    }

    public static String getJustification() {
        return justification;
    }

    public static void setJustification(String justification) {
        ControllerAccesos.justification = justification;
    }
        
    public static ResultSet getdata(String tablename){
        return ModelAccesos.getdata(tablename);
    }
    
    public static boolean insertAccess(){
        return ModelAccesos.insertAccess(getID(), getTypeAccess(),getDate(), getHour(), getJustification());
    }
}
