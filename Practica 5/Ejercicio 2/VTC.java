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
public class VTC extends Vehiculo {

    private int numeroMaximoHorasTrabajadas;
    private int radioDeAccion;
    private String ciudad;

    public VTC() {
    }

    public VTC(int numeroMaximoHorasTrabajadas, int radioDeAccion, String ciudad, int id, String matricula, String modelo, int potencia) {
        super(id, matricula, modelo, potencia);
        this.numeroMaximoHorasTrabajadas = numeroMaximoHorasTrabajadas;
        this.radioDeAccion = radioDeAccion;
        this.ciudad = ciudad;
    }

    public VTC(VTC vt1) {
        super((Vehiculo) vt1);
        this.numeroMaximoHorasTrabajadas = numeroMaximoHorasTrabajadas;
        this.radioDeAccion = radioDeAccion;
        this.ciudad = ciudad;
    }

    public int getNumeroMaximoHorasTrabajadas() {
        return numeroMaximoHorasTrabajadas;
    }

    public void setNumeroMaximoHorasTrabajadas(int numeroMaximoHorasTrabajadas) {
        while (numeroMaximoHorasTrabajadas > 24) {
            System.out.println("El numero maximo de horas no puede ser"
                    + "mayor a 24 horas, vuleve escribir el numero maximo "
                    + "de horas trabajadas: ");
            this.setNumeroMaximoHorasTrabajadas(Integer.parseInt(lector.nextLine()));
        }
        this.numeroMaximoHorasTrabajadas = numeroMaximoHorasTrabajadas;
    }

    public int getRadioDeAccion() {
        return radioDeAccion;
    }

    public void setRadioDeAccion(int radioDeAccion) {
        while (radioDeAccion > 50) {
            System.out.println("El radio de accion no puede ser mayor a 50km, "
                    + "vuelve a insertar el radio de accion: ");
            this.setRadioDeAccion(Integer.parseInt(lector.nextLine()));
        }
        this.radioDeAccion = radioDeAccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public void mostrarAtributos() {
        super.mostrarAtributos();
        System.out.println("El numero maximo de horas trabajadas son: " + this.getNumeroMaximoHorasTrabajadas());
        System.out.println("El radio de acción es: " + this.getRadioDeAccion());
        System.out.println("La ciudad es: " + this.getCiudad());
    }

    @Override
    public void pedirAlta() {
        super.pedirAlta();
        System.out.println("Dime el numero maximo de horas: ");
        this.setNumeroMaximoHorasTrabajadas(lector.nextInt());
        System.out.println("Dime el radio de accion: ");
        this.setRadioDeAccion(lector.nextInt());
        System.out.println("Dime la ciudad: ");
        this.setCiudad(lector.nextLine());
    }
}
