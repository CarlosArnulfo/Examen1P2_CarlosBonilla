/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_carlosbonilla;

/**
 *
 * @author lospe
 */
class Personas {

    String pw;
    String name;
    boolean civil;

    public Personas(String pw, String name, boolean civil) {
        this.pw = pw;
        this.name = name;
    }

    public String getPw() {
        return pw;
    }

    public void setCivil(boolean civil) {
        this.civil = civil;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCivil() {
        return civil;
    }

    @Override
    public String toString() {
        return "Personas{" + "pw=" + pw + ", name=" + name + '}';
    }

}
