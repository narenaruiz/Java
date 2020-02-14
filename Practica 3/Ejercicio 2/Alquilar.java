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
public class Alquilar {

    Scanner lector = new Scanner(System.in);

    private String fecha;

    public Alquilar(String fecha, Cliente nombreCliente, Libro nombreLibro) {
        this.fecha = fecha;
    }

    public Alquilar() {
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
//insertas la fecha del alquiler
    public void solicitarDatos() {
        System.out.println("Dime la año del alquiler: ");
        this.setFecha(lector.nextLine());
    }
//se muestra que cliente a alquilado un libro ademas de la fecha en que se realiza.
    public void mostrarDatos(Cliente cliente, Libro libro) {
        System.out.println("El cliente que a solicitado el alquiler es: " + cliente.getNombre());
        System.out.println("El libro se llama: " + libro.getTitulo());
        System.out.println("El año del alquiler es en: " + this.getFecha());
    }
}
