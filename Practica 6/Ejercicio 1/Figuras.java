/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg6;

import java.util.InputMismatchException;

/**
 *
 * @author Usuario
 */
public interface Figuras {
    //Esta es la interfaz, en las interfaces solo hay los metodos vacios.
    int calcularArea() throws InputMismatchException;
    int calcularVolumen() throws ExcepcionVolumen, InputMismatchException;
    void imprimirCaracteristicas() throws InputMismatchException;
    void añadirAtributos();
}
