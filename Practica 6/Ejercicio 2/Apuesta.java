/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg6.ejercicio.pkg2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public abstract class Apuesta { //El abstract para que no se pueda instanciar

    Scanner lector = new Scanner(System.in);

    private static int contadorNumeroDeApuesta = 0;

    private String nombre;
    private String apellido1;
    private String apellido2;
    private int numeroDeApuesta;

    public Apuesta() {
    }

    public Apuesta(String nombre, String apellido1, String apellido2, int numeroDeApuesta) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.setNumeroDeApuesta();
    }

    public Apuesta(Apuesta ap) {
        this.nombre = ap.nombre;
        this.apellido1 = ap.apellido1;
        this.apellido2 = ap.apellido2;
        this.setNumeroDeApuesta();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        for (int i = 0; i < nombre.length(); i++) {
            while (!Character.isUpperCase(nombre.charAt(i))) {
                throw new ExcepcionMayusculas("Nombre", "Error"); //to be falla y no se porque
            }
        }
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        for (int i = 0; i < apellido1.length(); i++) {
            while (!Character.isUpperCase(apellido1.charAt(i))) {
                throw new ExcepcionMayusculas("Primer apellido", "Error"); //to be falla y no se porque
            }
        }
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        for (int i = 0; i < apellido2.length(); i++) {
            while (!Character.isUpperCase(apellido2.charAt(i))) {
                throw new ExcepcionMayusculas("Segundo apellido", "Error"); //to be falla y no se porque
            }
        }
        this.apellido2 = apellido2;
    }

    public int getNumeroDeApuesta() {
        return numeroDeApuesta;
    }

    public void setNumeroDeApuesta() {
        contadorNumeroDeApuesta += 1;
        this.numeroDeApuesta = contadorNumeroDeApuesta;
    }

    public void mostrarApuesta() {
        try {
            System.out.println("======Los datos de la apuesta son estos======");
            System.out.println("El nombre es: " + this.getNombre());
            System.out.println("Los apellidos son: " + this.getApellido1() + " " + this.getApellido2());
            System.out.println("El numero de la apuesta es: " + this.getNumeroDeApuesta());
        } catch (ExcepcionMayusculas ex) { //to be falla y no se porque
            System.out.println(ex.getDato());
            System.out.println(ex.getMensaje());
        }
    }

    public void insertarDatos() {
        System.out.println("Dime el nombre del usuario: ");
        this.setNombre(lector.nextLine());
        System.out.println("Dime el primer apellido:");
        this.setApellido1(lector.nextLine());
        System.out.println("Dime el segundo apellido:");
        this.setApellido2(lector.nextLine());
    }
}
