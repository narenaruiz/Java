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
public class Cuadrado implements Figuras {

    Scanner lector = new Scanner(System.in);

    private int ladoCuadrado;

    public Cuadrado() {
    }

    public Cuadrado(int ladoCuadrado) {
        this.ladoCuadrado = ladoCuadrado;
    }

    public Cuadrado(Cuadrado cc) {
        this.ladoCuadrado = cc.ladoCuadrado;
    }

    public int getLadoCuadrado() {
        return ladoCuadrado;
    }

    public void setLadoCuadrado(int ladoCuadrado) {
        this.ladoCuadrado = ladoCuadrado;
    }

    @Override
    public int calcularArea() throws InputMismatchException{
        int resultado = this.getLadoCuadrado() * this.getLadoCuadrado();
        return resultado;
    }

    @Override
    public int calcularVolumen() throws ExcepcionVolumen, InputMismatchException{
        //Tengo que crear una excepcion porque no tiene volumen
        throw new ExcepcionVolumen("cuadrado", "error de nicolas");

    }

    @Override
    public void imprimirCaracteristicas() throws InputMismatchException{
        try {
            System.out.println("==============================");
            System.out.println("Calculadora de Nicolás Arena:");
            System.out.println("El costado mide: " + this.getLadoCuadrado());
            System.out.println("El area mide: " + this.calcularArea());
            System.out.println("El volumen mide: " + this.calcularVolumen());
        } catch (ExcepcionVolumen ex) {
            System.out.println(ex.getMensaje());
            Logger.getLogger(Cuadrado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void añadirAtributos() {
        System.out.println("Escribe cuantos metros miden los costados del cuadrado: ");
        this.setLadoCuadrado(lector.nextInt());
    }

}
