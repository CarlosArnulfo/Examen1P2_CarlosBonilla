/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_carlosbonilla;

import java.util.Date;

/**
 *
 * @author lospe
 */
class Tramites {
    String tram;
    String desc;
    String ID;
    Date fecha;

    public Tramites(String tram, String desc, String ID, Date fecha) {
        this.tram = tram;
        this.desc = desc;
        this.ID = ID;
        this.fecha = fecha;
    }

    public String getTram() {
        return tram;
    }

    public void setTram(String tram) {
        this.tram = tram;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getnumID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Tramites{" + "tram=" + tram + ", desc=" + desc + ", ID=" + ID + ", fecha=" + fecha + '}';
    }
    
}
