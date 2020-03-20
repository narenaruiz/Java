/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg6;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class Cubo implements Figuras {

    Scanner lector = new Scanner(System.in);

    private int arista;

    public Cubo() {
    }

    public Cubo(int arista) {
        this.arista = arista;
    }

    public Cubo(Cubo cc) {
        this.arista = cc.arista;
    }

    public Scanner getLector() {
        return lector;
    }

    public void setLector(Scanner lector) {
        this.lector = lector;
    }

    public int getArista() {
        return arista;
    }

    public void setArista(int arista) {
        this.arista = arista;
    }

    @Override
    public int calcularArea() throws InputMismatchException {
        int resultado = 6 * this.getArista() * this.getArista();
        return resultado;
    }

    @Override
    public int calcularVolumen() throws ExcepcionVolumen, InputMismatchException {
        int resultado = this.getArista() * this.getArista() * this.getArista();
        return resultado;
    }

    @Override
    public void imprimirCaracteristicas() throws InputMismatchException {
        try {
            System.out.println("==============================");
            System.out.println("Calculadora de Nicolás Arena:");
            System.out.println("La arista mide: " + this.getArista());
            System.out.println("El area mide: " + this.calcularArea());
            System.out.println("El volumen mide: " + this.calcularVolumen());
        } catch (ExcepcionVolumen ex) {
            System.out.println(ex.getMensaje());
            Logger.getLogger(Cuadrado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void añadirAtributos() {
        System.out.println("Escribe cuantos metros miden las aristas del cubo: ");
        this.setArista(lector.nextInt());
    }

}
