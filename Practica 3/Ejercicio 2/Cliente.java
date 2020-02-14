/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg3.ejercicio.pkg2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Cliente {

    Scanner lector = new Scanner(System.in);

    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private int edad;

    public Cliente(String nombre, String primerApellido, String segundoApellido, int edad) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.edad = edad;
    }

    public Cliente() {
    }

    public Scanner getLector() {
        return lector;
    }

    public void setLector(Scanner lector) {
        this.lector = lector;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
//el usuario inserta los datos
    public void solicitarDatos() {
        System.out.println("Dime el nombre del cliente: ");
        this.setNombre(lector.nextLine());
        System.out.println("Dime el primer apellido: ");
        this.setPrimerApellido(lector.nextLine());
        System.out.println("Dime el segundo apellido: ");
        this.setSegundoApellido(lector.nextLine());
        System.out.println("Dime la edad: ");
        this.setEdad(lector.nextInt());
    }
//se muestran los datos.
    public void mostrarDatos() {
        System.out.println("El nombre del cliente es: " + this.getNombre());
        System.out.println("El primer apellido es: " + this.getPrimerApellido());
        System.out.println("El segundo apellido es: " + this.getSegundoApellido());
        System.out.println("La edad es: " + this.getEdad());
    }
}
