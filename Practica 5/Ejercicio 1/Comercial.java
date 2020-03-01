/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg5;

/**
 *
 * @author Usuario
 */
public final class Comercial extends Empleado {

    private int ventasRealizadas;
    private int comision;

    public Comercial() {
    }

    public Comercial(int ventasRealizadas, int comision, String nombre, String apellido1, String apellido2, String nif, int edad, int salario) {
        super(nombre, apellido1, apellido2, nif, edad, salario);
        this.ventasRealizadas = ventasRealizadas;
        this.comision = comision;
    }

    public int getVentasRealizadas() {
        return ventasRealizadas;
    }

    public void setVentasRealizadas(int ventasRealizadas) {
        this.ventasRealizadas = ventasRealizadas;
    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }

    public void pedirAlta() {
        super.pedirAlta();
        System.out.println("Dime las ventas realizadas: ");
        this.setVentasRealizadas(lector.nextInt());
        System.out.println("Dime la comisión: ");
        this.setComision(lector.nextInt());
    }

    public void mostrarAtributos() {
        super.mostrarAtributos();
        System.out.println("Las ventas realizadas son: " + this.getVentasRealizadas());
        System.out.println("La comisión es: " + this.getComision());
    }

}
