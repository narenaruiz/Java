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
public final class Repartidor extends Empleado {

    private int horasTrabajadas;
    private String zona;

    public Repartidor() {
    }

    public Repartidor(int horasTrabajadas, String zona, String nombre, String apellido1, String apellido2, String nif, int edad, int salario) {
        super(nombre, apellido1, apellido2, nif, edad, salario);
        this.horasTrabajadas = horasTrabajadas;
        this.zona = zona;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public void pedirAlta() {
        super.pedirAlta();
        System.out.println("Dime el numero de horas trabajadas: ");
        this.setHorasTrabajadas(lector.nextInt());
        System.out.println("Dime la zona: ");
        this.setZona(lector.nextLine());
    }

    public void mostrarAtributos() {
        super.mostrarAtributos();
        System.out.println("El numero de horas trabajadas es: " + this.getHorasTrabajadas());
        System.out.println("La zona es: " + this.getZona());
    }

}
