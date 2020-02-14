/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Practica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sn = new Scanner(System.in);
        Cuenta c1 = new Cuenta();
        Cuenta c2 = new Cuenta();
        //c1.solicitarDatos();
        //c1.ingreso();
        //c1.mostrarDatos();
        //c1.reintegro();
        //c1.mostrarDatos();
        //c2.solicitarDatos();
        //c1.transferenciaDinero(c2);
        //c1.mostrarDatos();
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("1. Ingreso");
            System.out.println("2. Reintegro");
            System.out.println("3. Traspaso");
            System.out.println("");
            System.out.println("7. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        c1.solicitarDatos();
                        c1.ingreso();
                        c1.mostrarDatos();
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        c1.solicitarDatos();
                        c1.reintegro();
                        c1.mostrarDatos();
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        c1.solicitarDatos();
                        c2.solicitarDatos();
                        c1.transferenciaDinero(c2);
                        c1.mostrarDatos();
                        c2.mostrarDatos();
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
