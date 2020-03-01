/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg5.ejercicio.pkg2;

import java.util.ArrayList;
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
        ArrayList<Vehiculo> lista = new ArrayList<Vehiculo>();
        Scanner lector = new Scanner(System.in);

        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("1. Pedir el alta de autobus");
            System.out.println("2. Pedir el alta de taxi");
            System.out.println("3. Pedir el alta de vtc");
            System.out.println("4. Buscar vehiculo por su ID");
            System.out.println("5. Buscar vehiculo por su matricula");
            System.out.println("6. Buscar taxi libre y ocuparlo");
            System.out.println("7. Buscar un taxi por id y establecer que esta libre");
            System.out.println("8. Mostrar todos los vehiculos guardados");
            System.out.println("9. ");
            System.out.println("11. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = lector.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        Autobus aa = new Autobus();
                        aa.pedirAlta();
                        lista.add(aa);
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        Taxi tt = new Taxi();
                        tt.pedirAlta();
                        lista.add(tt);
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        VTC vv = new VTC();
                        vv.pedirAlta();
                        lista.add(vv);
                        break;
                    case 4:
                        System.out.println("Has seleccionado la opcion 4");
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.println(lista.get(i).getId());
                        }
                        System.out.println("Busca por id: ");
                        Vehiculo.busquedaId(lector, lista);
                        break;
                    case 5:
                        System.out.println("Has seleccionado la opcion 5");
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.println(lista.get(i).getMatricula());
                        }
                        System.out.println("Busca por matricula: ");
                        Vehiculo.busquedaMatricula(lector, lista);
                        break;
                    case 6:
                        System.out.println("Has seleccionado la opcion 6");
                        Taxi.ocuparTaxi(lista);
                        break;
                    case 7:
                        System.out.println("Has seleccionado la opcion 7");
                        System.out.println("Busqueda por id: ");
                        Taxi.ponerLibreTaxi(lector, lista);
                        break;
                    case 8:
                        System.out.println("Has seleccionado la opcion 8");
                        Vehiculo.listarVehiculos(lista);
                        break;
                    case 9:
                        System.out.println("Has seleccionado la opcion 9");
                        break;
                    case 10:
                        System.out.println("Has seleccionado la opcion 9");
                        break;
                    case 11:
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
