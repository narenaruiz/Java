/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg6;

/**
 *
 * @author Usuario
 */
public class ExcepcionVolumen extends Exception {

    //Hay que hacer un constructor
    //Esta figura no tiene volumen porque es una figura plana.
    private String figura;
    private String Mensaje;

    public ExcepcionVolumen(String figura, String Mensaje) {
        this.figura = figura;
        this.setMensaje("La figura" + figura + "no tiene volumen porque es "
                + "una figura plana.");
    }

    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }

}
