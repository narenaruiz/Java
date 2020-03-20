/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg6.ejercicio.pkg2;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Primitiva extends Apuesta {

    ArrayList<Apuesta> listaNum = new ArrayList<>(); //to be cambiar a un array[]
    private static int aciertos;
    private int numeroPrimitiva;

    public Primitiva() {
    }

    public Primitiva(int numeroPrimitiva, String nombre, String apellido1, String apellido2, int numeroDeApuesta) {
        super(nombre, apellido1, apellido2, numeroDeApuesta);
        this.numeroPrimitiva = numeroPrimitiva;
    }

    public Primitiva(Primitiva pp) {
        super((Apuesta) pp);
    }

    public static int getAciertos() {
        return aciertos;
    }

    public static void setAciertos() {
        Primitiva.aciertos = 0;
    }

    public int getNumeroPrimitiva() {
        return numeroPrimitiva;
    }

    public void setNumeroPrimitiva(int numeroPrimitiva) {
        this.numeroPrimitiva = numeroPrimitiva;
    }

    @Override
    public void mostrarApuesta() {
        super.mostrarApuesta();
        System.out.println("Los aciertos son: "); //No me deja poner 
        //el + this.getAciertos
    }

    public void crearApuestaPrimitiva() {
        System.out.println("Dime los 6 numeros de la apuesta: ");
        this.setNumeroPrimitiva(lector.nextInt());
        if (this.getNumeroPrimitiva() > 999999) {
            System.out.println("Solo pueden ser 6 numeros: ");
            this.setNumeroPrimitiva(lector.nextInt());
        } else if (this.getNumeroPrimitiva() < 100000) {
            System.out.println("Tienen que ser minimo 6 numeros: ");
            this.setNumeroPrimitiva(lector.nextInt());
        }
    }
}
