/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Empleado {

    Scanner lector = new Scanner(System.in);

    private String nombre;
    private String apellido1;
    private String apellido2;
    private String nif;
    private int edad;
    private int salario;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido1, String apellido2, String nif, int edad, int salario) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nif = nif;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        while (!Character.isUpperCase(nombre.charAt(0))) {
            System.out.println("La primera letra no esta en mayusculas.");
            System.out.println("Escribe otra vez el nombre: ");
            nombre = lector.nextLine();
        }
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        while (!Character.isUpperCase(apellido1.charAt(0))) {
            System.out.println("La primera letra no esta en mayusculas.");
            System.out.println("Escribe otra vez el apellido: ");
            apellido1 = lector.nextLine();
        }
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        while (!Character.isUpperCase(apellido2.charAt(0))) {
            System.out.println("La primera letra no esta en mayusculas.");
            System.out.println("Escribe otra vez el apellido: ");
            apellido2 = lector.nextLine();
        }
        this.apellido2 = apellido2;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        while (edad<16) {
            System.out.println("La edad tiene que ser mayor a 16.");
            System.out.println("Vuelve a escribir la edad: ");
            edad = lector.nextInt();
        }
        this.edad = edad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void pedirAlta() {
        //Pido los datos.
        System.out.println("Dime el nombre: ");
        this.setNombre(lector.nextLine());
        System.out.println("Dime el primer apellido: ");
        this.setApellido1(lector.nextLine());
        System.out.println("Dime el segundo apellido: ");
        this.setApellido2(lector.nextLine());
        System.out.println("Dime el nif: ");
        this.setNif(lector.nextLine());
        System.out.println("Dime la edad: ");
        this.setEdad(lector.nextInt());
        System.out.println("Dime el salario: ");
        this.setSalario(lector.nextInt());
    }

    public void mostrarAtributos() {
        //Imprimo los datos.
        System.out.println("El nombre es: " + this.getNombre());
        System.out.println("El primer apellido es: " + this.getApellido1());
        System.out.println("El segundo apellido es: " + this.getApellido2());
        System.out.println("El nif es:" + this.getNif());
        System.out.println("La edad es: " + this.getEdad());
        System.out.println("El salario es: " + this.getSalario());
    }
}
