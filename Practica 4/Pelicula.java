/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Pelicula {
    
    Scanner lector = new Scanner(System.in);
    
    private static int contador = 0;
    private static int prevision = 0;
    
    private int id;
    private String titulo;
    private String director;
    private int duracion;
    private String genero;
    private int año;
    private boolean disponibilidad;
    private int copiasTotal;
    private int copiasReservadas;
    
    public Pelicula() {
    }
    
    public Pelicula(int ID, String Titulo, String Director, int Duracion, String Genero, int Año, boolean Disponibilidad, int copiasTotal, int copiasReservadas) {
        this.setId();
        this.titulo = Titulo;
        this.director = Director;
        this.duracion = Duracion;
        this.genero = Genero;
        this.año = Año;
        this.disponibilidad = Disponibilidad;
        this.copiasTotal = copiasTotal;
        this.copiasReservadas = copiasReservadas;
    }
    
    public int getId() {
        return id;
    }

    //AQUI LA ID ES AUTOMATICA, ADEMAS NO HACE FALTA QUE RECIBA NADA POR ESO NO
    //NO HAY NADA EN LOS PARENTESIS
    public void setId() {
        contador++;
        this.id = contador;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String Titulo) {
        this.titulo = Titulo;
    }
    
    public String getDirector() {
        return director;
    }
    
    public void setDirector(String Director) {
        this.director = Director;
    }
    
    public int getDuracion() {
        return duracion;
    }
    
    public void setDuracion(int Duracion) {
        this.duracion = Duracion;
    }
    
    public String getGenero() {
        return genero;
    }
    
    public void setGenero(String Genero) {
        this.genero = Genero;
    }
    
    public int getAño() {
        return año;
    }
    
    public void setAño(int Año) {
        this.año = Año;
    }
    
    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    //COMO LA DISPONIBILIDAD LA COMPRUEBAS AQUI NO HACE FALTA QUE RECIBA
    //NINGUN BOOLEANO YA QUE NO LO NECESITA.
    public void setDisponibilidad() {
        if (this.getCopiasTotal() - this.getCopiasReservadas() > 0) {
            this.disponibilidad = true;
        } else {
            this.disponibilidad = false;
        }
    }
    
    public int getCopiasTotal() {
        return copiasTotal;
    }
    
    public void setCopiasTotal(int copiasTotal) {
        this.copiasTotal = copiasTotal;
    }
    
    public int getCopiasReservadas() {
        return copiasReservadas;
    }
    
    public void setCopiasReservadas(int copiasReservadas) {
        this.copiasReservadas = copiasReservadas;
    }
    
    public void mostrarAtributos() {
        System.out.println("El id de la pelicula es: " + this.getId());
        System.out.println("El titulo es: " + this.getTitulo());
        System.out.println("El nombre del director es: " + this.getDirector());
        System.out.println("La duracion es: " + this.getDuracion());
        System.out.println("El genero es: " + this.getGenero());
        System.out.println("El año es: " + this.getAño());
        System.out.println("El numero de copias totales es: " + this.getCopiasTotal());
        System.out.println("El numero de copias reservadas es: " + this.getCopiasReservadas());
        if (this.isDisponibilidad() == true) {
            System.out.println("Disponible");
        } else {
            System.out.println("No disponible");
        }
    }
    
    public void añadirAtributos() {
        System.out.println("Dime el titulo de la pelicula: ");
        this.setTitulo(lector.nextLine());
        System.out.println("Dime el nombre del director:");
        this.setDirector(lector.nextLine());
        System.out.println("Dime la duración de la pelicula: ");
        this.setDuracion(Integer.parseInt(lector.nextLine()));
        System.out.println("Dime el genero de la pelicula: ");
        this.setGenero(lector.nextLine());
        System.out.println("Dime el año de la pelicula: ");
        this.setAño(Integer.parseInt(lector.nextLine()));
    }
    
    public void reservarPelicula() {
        this.setCopiasReservadas(this.getCopiasReservadas() + 1);
        this.setDisponibilidad();
    }
}
