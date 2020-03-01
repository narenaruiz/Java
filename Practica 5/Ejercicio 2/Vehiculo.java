/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg5.ejercicio.pkg2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Vehiculo {

    Scanner lector = new Scanner(System.in);

    private int id;
    private String matricula;
    private String modelo;
    private int potencia;
    public static int contador = 0;

    //crea una variable sin tener que hacer una instancia.
    public Vehiculo() {
    }

    public Vehiculo(int id, String matricula, String modelo, int potencia) {
        this.id = id;
        this.matricula = matricula;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    public Vehiculo(Vehiculo v1) {
        this.id = v1.id;
        this.matricula = v1.matricula;
        this.modelo = v1.modelo;
        this.potencia = v1.potencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = contador;
        contador++;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        for (int i = 0; i < matricula.charAt(i); i++) {
            while (!Character.isUpperCase(matricula.charAt(i))) {
                System.out.println("La matricula tiene que estar entera en mayusculas");
                System.out.println("Escribe otra vez la marticula: ");
                matricula = lector.nextLine();
            }
        }
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        while (!Character.isUpperCase(modelo.charAt(0))) {
            System.out.println("La primera letra no esta en mayusculas.");
            System.out.println("Escribe otra vez el modelo: ");
            modelo = lector.nextLine();
        }
        this.modelo = modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        while (potencia < 0) {
            System.out.println("La potencia tiene que ser mayor que 0, "
                    + "insertala de nuevo: ");
            this.setPotencia(Integer.parseInt(lector.nextLine()));
        }
        this.potencia = potencia;
    }

    public void mostrarAtributos() {
        System.out.println("El id es: " + this.getId());
        System.out.println("La matricula es: " + this.getMatricula());
        System.out.println("El modelo es: " + this.getModelo());
        System.out.println("La potencia es: " + this.getPotencia());
    }

    public void pedirAlta() {
        this.setId(id);
        System.out.println("Dime la matricula: ");
        this.setMatricula(lector.nextLine());
        System.out.println("Dime el modelo: ");
        this.setModelo(lector.nextLine());
        System.out.println("Dime la potencia: ");
        this.setPotencia(Integer.parseInt(lector.nextLine()));
    }

    public static void listarVehiculos(ArrayList<Vehiculo> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Vehiculo nº " + i);
            lista.get(i).mostrarAtributos();
        }
    }

    public static void busquedaId(Scanner lector, ArrayList<Vehiculo> lista) {
        int busqueda = lector.nextInt();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == busqueda) {
                lista.get(i).mostrarAtributos();
            } else {
                System.out.println("Esta id no esta disponible.");
            }
        }
    }

    public static void busquedaMatricula(Scanner lector, ArrayList<Vehiculo> lista) {
        String busqueda2 = lector.nextLine();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getMatricula().equals(busqueda2)) {
                lista.get(i).mostrarAtributos();
            } else {
                System.out.println("Esta matricula no esta disponible.");
            }
        }
    }

}
