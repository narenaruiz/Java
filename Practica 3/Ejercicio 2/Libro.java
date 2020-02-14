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
public class Libro {
//el static no te hace falta tener el objeto hecho y en el que no es static (instancia) el objeto ya esta hecho.

    Scanner lector = new Scanner(System.in);

    private String titulo;
    private String autor;
    private String sinopsis;
    private String editorial;
    private int añoDeEstreno;
    private int cantidadCopias;

    public Libro(String titulo, String autor, String sinopsis, String editorial, int añoDeEstreno, int cantidadCopias) {
        this.titulo = titulo;
        this.autor = autor;
        this.sinopsis = sinopsis;
        this.editorial = editorial;
        this.añoDeEstreno = añoDeEstreno;
        this.cantidadCopias = cantidadCopias;
    }

    public Libro() {
    }

    public Scanner getLector() {
        return lector;
    }

    public void setLector(Scanner lector) {
        this.lector = lector;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAñoDeEstreno() {
        return añoDeEstreno;
    }

    public void setAñoDeEstreno(int añoDeEstreno) {
        this.añoDeEstreno = añoDeEstreno;
    }

    public int getCantidadCopias() {
        return cantidadCopias;
    }

    public void setCantidadCopias(int cantidadCopias) {
        this.cantidadCopias = cantidadCopias;
    }
//el usuario inserta los datos
    public void solicitarDatos() {
        System.out.println("Dime el titulo del libro: ");
        this.setTitulo(lector.nextLine());
        System.out.println("Dime el nombre/pseudonimo del autor: ");
        this.setAutor(lector.nextLine());
        System.out.println("Dime la sinopsis: ");
        this.setSinopsis(lector.nextLine());
        System.out.println("Dime la editorial del libro: ");
        this.setEditorial(lector.nextLine());
        System.out.println("Dime el año de estreno del libro: ");
        this.setAñoDeEstreno(lector.nextInt());
        System.out.println("Dime la cantidad de copias: ");
        this.setCantidadCopias(lector.nextInt());
    }
//se muestran los datos.
    public void mostrarDatos() {
        System.out.println("El titulo del libro es: " + this.getTitulo());
        System.out.println("El nombre/pseudonimo del autor es: " + this.getAutor());
        System.out.println("Sinopsis: " + this.getSinopsis());
        System.out.println("El nombre de la editorial es: " + this.getEditorial());
        System.out.println("El año de estreno del libro fue en " + this.getAñoDeEstreno());
        System.out.println("La cantidad de copias de este libro es: " + this.getCantidadCopias());
    }
//esto es para que la cantidad de copias aumente o disminuya.
    public void modificarCantidadCopias(Libro L1) {
        System.out.println("Dime el numero de libros que haya mas/menos: ");

        int cantidad = lector.nextInt();

        L1.setCantidadCopias(L1.getCantidadCopias() + cantidad);
    }
}
