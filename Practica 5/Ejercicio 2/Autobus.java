/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg5.ejercicio.pkg2;

/**
 *
 * @author Usuario
 */
public class Autobus extends Vehiculo {

    private int numeroDePlazas;
    private int numeroDeParadas;

    public Autobus() {
    }

    public Autobus(int numeroDePlazas, int numeroDeParadas, int id, String matricula, String modelo, int potencia) {
        super(id, matricula, modelo, potencia);
        this.numeroDePlazas = numeroDePlazas;
        this.numeroDeParadas = numeroDeParadas;
    }

    public Autobus(Autobus a1) {
        super((Vehiculo) a1);
        this.numeroDePlazas = a1.numeroDePlazas;
        this.numeroDeParadas = a1.numeroDeParadas;
    }

    public int getNumeroDePlazas() {
        return numeroDePlazas;
    }

    public void setNumeroDePlazas(int numeroDePlazas) {
        this.numeroDePlazas = numeroDePlazas;
    }

    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }

    public void setNumeroDeParadas(int numeroDeParadas) {
        while (numeroDeParadas < 3 && numeroDeParadas > 20) {
            System.out.println("El numero de paradas minimo es 3 y el maximo "
                    + "es 20 escribelo de nuevo:");
            this.setNumeroDeParadas(lector.nextInt());
        }
        this.numeroDeParadas = numeroDeParadas;
    }

    @Override
    public void mostrarAtributos() {
        super.mostrarAtributos();
        System.out.println("El numero de plazas es: " + this.getNumeroDePlazas());
        System.out.println("El numero de paradas es: " + this.getNumeroDeParadas());
    }

    @Override
    public void pedirAlta() {
        super.pedirAlta();
        System.out.println("Dime el numero de plazas: ");
        this.setNumeroDePlazas(lector.nextInt());
        System.out.println("Dime el numero de paradas: ");
        this.setNumeroDeParadas(lector.nextInt());
    }
}
