/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg6.ejercicio.pkg2;

/**
 *
 * @author Usuario
 */
public class ExcepcionMayusculas extends Exception {

    private String dato;
    private String mensaje;

    public ExcepcionMayusculas(String dato, String mensaje) {
        this.setDato("El " + dato + " tiene que estar en mayusculas entero");
        this.mensaje = mensaje;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}
