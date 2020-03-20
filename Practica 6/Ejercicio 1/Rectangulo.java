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
public class Rectangulo implements Figuras {

    Scanner lector = new Scanner(System.in);

    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(Rectangulo rr) {
        this.base = rr.base;
        this.altura = rr.altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public int calcularArea() throws InputMismatchException {
        int resultado = this.getBase() * this.getAltura();
        return resultado;
    }

    @Override
    public int calcularVolumen() throws ExcepcionVolumen, InputMismatchException {
        throw new ExcepcionVolumen("Rectangulo", "error de nicolas");
    }

    @Override
    public void imprimirCaracteristicas() throws InputMismatchException {
        try {
            System.out.println("==============================");
            System.out.println("Calculadora de Nicolás Arena:");
            System.out.println("La base mide: " + this.getBase());
            System.out.println("La altura mide: " + this.getAltura());
            System.out.println("El area mide: " + this.calcularArea());
            System.out.println("El volumen mide: " + this.calcularVolumen());
        } catch (ExcepcionVolumen ex) {
            System.out.println(ex.getMensaje());
            Logger.getLogger(Cuadrado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void añadirAtributos() {
        System.out.println("Escribe cuantos metros mide la base: ");
        this.setBase(lector.nextInt());
        System.out.println("Escribe cuantos metros mide la altura: ");
        this.setAltura(lector.nextInt());
    }

}
