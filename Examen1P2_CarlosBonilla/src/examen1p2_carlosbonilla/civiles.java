/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_carlosbonilla;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
/**
 *
 * @author lospe
 */
public class civiles extends Personas{
    String ID;
    String depa;
    Date fechaN;
    ArrayList <Tramites> tramites=new ArrayList();

    public civiles(int depa, Date fechaN, String pw, String name, boolean civil) {
        super(pw, name, civil);
        Random faust=new Random();
        
        this.fechaN = fechaN;
        if (depa==1) {
            this.depa="Francisco Morazan";
            this.ID+="01";
            this.ID+=""+faust.nextInt(28)+1+"-";
            this.ID+=""+this.getFechaN().getYear()+"-";
            this.ID+=""+faust.nextInt(10)+""+faust.nextInt(10)+""+faust.nextInt(10)+""+faust.nextInt(10)+""+faust.nextInt(10);
        }else if(depa==2){
            this.depa="Cortes";
            this.ID+="02";
            this.ID+=""+faust.nextInt(12)+1+"-";
            this.ID+=""+this.getFechaN().getYear()+"-";
            this.ID+=""+faust.nextInt(10)+""+faust.nextInt(10)+""+faust.nextInt(10)+""+faust.nextInt(10)+""+faust.nextInt(10);
        }else if(depa==3){
            this.depa="Comayagua";
            this.ID+="03";
            this.ID+=""+faust.nextInt(21)+1+"-";
            this.ID+=""+this.getFechaN().getYear()+"-";
            this.ID+=""+faust.nextInt(10)+""+faust.nextInt(10)+""+faust.nextInt(10)+""+faust.nextInt(10)+""+faust.nextInt(10);
        
        }
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDepa() {
        return depa;
    }

    public void setDepa(String depa) {
        this.depa = depa;
    }

    public Date getFechaN() {
        return fechaN;
    }

    public void setFechaN(Date fechaN) {
        this.fechaN = fechaN;
    }

    public ArrayList<Tramites> getTramites() {
        return tramites;
    }

    public void setTramites(ArrayList<Tramites> tramites) {
        this.tramites = tramites;
    }

    @Override
    public String toString() {
        return "civiles{" + "ID=" + ID + ", depa=" + depa + ", fechaN=" + fechaN + ", tramites=" + tramites + '}';
    }
    
}
