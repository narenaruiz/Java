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
public class Taxi extends Vehiculo {

    private int numeroDeLicencia;
    private boolean estado;
    private int taxistaMaximosPorLicencia;

    public Taxi() {
    }

    public Taxi(int numeroDeLicencia, boolean estado, int taxistaMaximosPorLicencia, int id, String matricula, String modelo, int potencia) {
        super(id, matricula, modelo, potencia);
        this.numeroDeLicencia = numeroDeLicencia;
        this.estado = estado;
        this.taxistaMaximosPorLicencia = taxistaMaximosPorLicencia;
    }

    public Taxi(Taxi t1) {
        super((Vehiculo) t1);
        this.numeroDeLicencia = t1.numeroDeLicencia;
        this.estado = t1.estado;
        this.taxistaMaximosPorLicencia = t1.taxistaMaximosPorLicencia;
    }

    public int getNumeroDeLicencia() {
        return numeroDeLicencia;
    }

    public void setNumeroDeLicencia() {
        int numeroLicencia = 1000;
        this.numeroDeLicencia = numeroLicencia;
        numeroLicencia++;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getTaxistaMaximosPorLicencia() {
        return taxistaMaximosPorLicencia;
    }

    public void setTaxistaMaximosPorLicencia(int taxistaMaximosPorLicencia) {
        this.taxistaMaximosPorLicencia = taxistaMaximosPorLicencia;
    }

    @Override
    public void mostrarAtributos() {
        super.mostrarAtributos();
        System.out.println("El numero de licencia es: " + this.getNumeroDeLicencia());
        System.out.println("El Estado es: " + this.isEstado());
        System.out.println("Los taxistas maximos por la licencia son: " + this.getTaxistaMaximosPorLicencia());
    }

    @Override
    public void pedirAlta() {
        super.pedirAlta();
        this.setEstado(true);
        this.setNumeroDeLicencia();
        System.out.println("Dime los taxistas maximos por la licencia: ");
        this.setTaxistaMaximosPorLicencia(lector.nextInt());
    }

    public static void ocuparTaxi(ArrayList<Vehiculo> lista) {
        for (int i = 0; i < lista.size(); i++) {
            //Aqui determino que es un taxi.
            if (lista.get(i) instanceof Taxi) {
                //transformo/polimorfissmo el objeto a un taxi.
                if (((Taxi) lista.get(i)).isEstado() == true) {
                    System.out.println(lista.get(i).getId());
                    ((Taxi) lista.get(i)).setEstado(false);
                }
            }
        }
    }

    public static void ponerLibreTaxi(Scanner lector, ArrayList<Vehiculo> lista) {
        int busqueda3 = lector.nextInt();
        for (int i = 0; i < lista.size(); i++) {
            if (((Taxi) lista.get(i)).getId() == busqueda3) {
                ((Taxi) lista.get(i)).setEstado(true);
                ((Taxi) lista.get(i)).mostrarAtributos();
                System.out.println("Se ha actualizado el estado del taxi a libre");

            } else {
                System.out.println("Esta id no esta disponible.");
            }
        }
    }
}
