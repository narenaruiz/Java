/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Cuenta {

    Scanner lector = new Scanner(System.in);
    private String nombre;
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(String nombre, String numeroCuenta, double tipoInteres, double saldo) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }

    public Cuenta(Cuenta c1) {
        this.nombre = c1.nombre;
        this.numeroCuenta = c1.numeroCuenta;
        this.tipoInteres = c1.tipoInteres;
        this.saldo = c1.saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void solicitarDatos() {
        System.out.println("Dime el nombre: ");
        this.setNombre(lector.nextLine());
        System.out.println("Dime el numero de cuenta");
        this.setNumeroCuenta(lector.nextLine());
        System.out.println("Dime el Interes: ");
        this.setTipoInteres(lector.nextDouble());
        System.out.println("Dime el saldo");
        this.setSaldo(lector.nextDouble());
    }

    public boolean ingreso() {
        System.out.println("Cuanto se tiene que aumentar el saldo:");
        double ingresarDinero = lector.nextDouble();
        boolean respuesta = false;

        if (ingresarDinero > 0) {
            this.setSaldo(this.getSaldo() + ingresarDinero);
            respuesta = true;
        }
        return respuesta;
    }

    public boolean reintegro() {
        System.out.println("Cuanto se tiene que disminuir el saldo:");

        double reintegroDinero = lector.nextDouble();
        boolean respuesta = false;

        if (reintegroDinero > 0) {
            if (this.getSaldo() > reintegroDinero) {
                this.setSaldo(this.getSaldo() - reintegroDinero);
                respuesta = true;
            }
        }
        return respuesta;
    }

    public boolean transferenciaDinero(Cuenta cc) {
        System.out.println("Cuanto quieres traspasar: ");

        double traspasoDinero = lector.nextDouble();
        boolean respuesta = false;
        
        if (traspasoDinero <= this.getSaldo()) {
            this.setSaldo(this.getSaldo()-traspasoDinero);
            cc.setSaldo(cc.getSaldo()+traspasoDinero);
            respuesta = true;
        }
        return respuesta;
    }

    public void mostrarDatos() {
        System.out.println("El nombre es: " + this.getNombre());
        System.out.println("El numero de cuenta es " + this.getNumeroCuenta());
        System.out.println("El tipo dr interes es " + this.getTipoInteres());
        System.out.println("El sueldo es :" + this.getSaldo());
    }
}
