/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg3.ejercicio.pkg2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sn = new Scanner(System.in);

        Libro L1 = new Libro();
        Cliente c1 = new Cliente();
        Alquilar a1 = new Alquilar();

        //L1.solicitarDatos();
        //L1.mostrarDatos();
        //c1.solicitarDatos();
        //c1.mostrarDatos();
        //L1.modificarCantidadCopias(L1);
        //L1.mostrarDatos();
        //a1.solicitarDatos();
        //a1.mostrarDatos(c1, L1);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("1. Solicitar y mostrar");
            System.out.println("2. Modificar cantidad libros");
            System.out.println("3. Alquilar libro");
            System.out.println("");
            System.out.println("4. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        L1.solicitarDatos();
                        L1.mostrarDatos();
                        c1.solicitarDatos();
                        c1.mostrarDatos();
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        L1.solicitarDatos();
                        L1.mostrarDatos();
                        L1.modificarCantidadCopias(L1);
                        L1.mostrarDatos();
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        L1.solicitarDatos();
                        L1.mostrarDatos();
                        c1.solicitarDatos();
                        c1.mostrarDatos();
                        a1.solicitarDatos();
                        a1.mostrarDatos(c1, L1);
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }

}
