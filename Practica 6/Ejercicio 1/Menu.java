/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg6;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);

        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("1. Calcular area y volumen de un cuadrado");
            System.out.println("2. Calcular area y volumen de un cubo");
            System.out.println("3. Calcular area y volumen de un rectangulo");
            System.out.println("4. Calcular area y volumen de un triangulo");
            System.out.println("5. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = lector.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        Cuadrado cc = new Cuadrado();
                        cc.añadirAtributos();
                        cc.imprimirCaracteristicas();
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        Cubo cu = new Cubo();
                        cu.añadirAtributos();
                        cu.imprimirCaracteristicas();
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        Rectangulo re = new Rectangulo();
                        re.añadirAtributos();
                        re.imprimirCaracteristicas();
                        break;
                    case 4:
                        System.out.println("Has seleccionado la opcion 4");
                        Triangulo ti = new Triangulo();
                        ti.añadirAtributos();
                        ti.imprimirCaracteristicas();
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 5");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                lector.next();
            }
        }

    }
}
