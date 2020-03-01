/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg5;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Practica5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // si instanciamos fuera del case solo instanciamos una vez, por lo que
        // siempre modificaremos el mismo objeto.
        Scanner sn = new Scanner(System.in);
        ArrayList<Empleado> lista = new ArrayList<Empleado>();

        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("1. Pedir el alta de empleado");
            System.out.println("2. Pedir el alta de comercial");
            System.out.println("3. Pedir el alta de repartidor");
            System.out.println("4. Mostrar atributos de empleado");
            System.out.println("5. Mostrar atributos de comercial");
            System.out.println("6. Mostrar atributos de repartidor");
            System.out.println("");
            System.out.println("7. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        Empleado ee = new Empleado();
                        ee.pedirAlta();
                        lista.add(ee);
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        Comercial cc = new Comercial();
                        cc.pedirAlta();
                        lista.add(cc);
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        Repartidor rr = new Repartidor();
                        rr.pedirAlta();
                        lista.add(rr);
                        break;
                    case 4:
                        System.out.println("Has seleccionado la opcion 4");
                        System.out.println("Elige un empleado: ");
                        for (int i = 0; i < lista.size(); i++) {
                            if (!(lista.get(i) instanceof Comercial)) {
                                if (!(lista.get(i) instanceof Repartidor)) {
                                    lista.get(i).mostrarAtributos();
                                }
                            }
                        }
                        break;
                    case 5:
                        System.out.println("Has seleccionado la opcion 5");
                        for (int i = 0; i < lista.size(); i++) {
                            if (lista.get(i) instanceof Comercial) {
                                lista.get(i).mostrarAtributos();
                            }
                        }
                        break;
                    case 6:
                        System.out.println("Has seleccionado la opcion 6");
                        for (int i = 0; i < lista.size(); i++) {
                            if (lista.get(i) instanceof Repartidor) {
                                lista.get(i).mostrarAtributos();
                            }
                        }
                        break;
                    case 7:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 5");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }
}
