/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MenuPractica4 {

    private static final int MAXPELICULAS = 3000;

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        ArrayList<Pelicula> lista = new ArrayList<>();

        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("1. Añadir Película");
            System.out.println("2. Reservar Película");
            System.out.println("3. Listar Películas");
            System.out.println("4. Buscar Películas");
            System.out.println("");
            System.out.println("5. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = lector.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        añadirPelicula(lista);
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        reservarPeliculas(lista, lector);
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        listarPeliculas(lista);
                        break;
                    case 4:
                        System.out.println("Has seleccionado la opcion 4");
                        buscarPelicula(lista, lector);
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                lector.next();
            }
        }
    }

    public static void añadirPelicula(ArrayList<Pelicula> lista) {
        Pelicula p1 = new Pelicula();
        p1.añadirAtributos();
        lista.add(p1);
    }

    public static void reservarPeliculas(ArrayList<Pelicula> lista, Scanner lector) {
        System.out.println("Las peliculas del videoclub son:");
        listarPeliculas(lista);
        int encontradoId = buscarPorId(lista, lector);
        if (encontradoId != -1) {
            if (lista.get(encontradoId).isDisponibilidad() == false) {
                System.out.println("Esta pelicula no esta disponible");
            } else {
                //AQUI TE RESERVA LA PELICULA PORQUE LA DISPONIBILIDAD ES TRUE
                lista.get(encontradoId).reservarPelicula();
                System.out.println("Has reservado la pelicula");
            }
        }
    }

    //Recibe una lista de peliculas y muestra toda la informacion.
    public static void listarPeliculas(ArrayList<Pelicula> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("=============peli nº" + i + "===============");
            lista.get(i).mostrarAtributos();
        }
    }

    //Buscara la pelicula con lo que le diga el usuario
    //como por ejemplo id o titulo o director, etc
    //COMO HAGO QUE RECIBA EL SCANNER Y QUE EL MENU LO ENVIE?
    public static void buscarPelicula(ArrayList<Pelicula> lista, Scanner lector) {
        boolean salir = false;
        int opcion2; //Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("1. Buscar pelicula por ID");
            System.out.println("2. Buscar pelicula por Titulo");
            System.out.println("3. Buscar pelicula por Director");
            System.out.println("4. Buscar pelicula por Duración");
            System.out.println("5. Buscar pelicula por Genero");
            System.out.println("6. Buscar pelicula por Año");
            System.out.println("7. Buscar pelicula por Disponibilidad");
            System.out.println("");
            System.out.println("8. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion2 = lector.nextInt();

                switch (opcion2) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        buscarPorId(lista, lector);
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        buscarPorTitulo(lista, lector);
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        buscarPorDirector(lista, lector);
                        break;
                    case 4:
                        System.out.println("Has seleccionado la opcion 4");
                        buscarPorDuracion(lista, lector);
                        break;
                    case 5:
                        System.out.println("Has seleccionado la opcion 5");
                        buscarPorGenero(lista, lector);
                        break;
                    case 6:
                        System.out.println("Has seleccionado la opcion 6");
                        buscarPorAño(lista, lector);
                        break;
                    case 7:
                        //CAMBIAR DISPONIBILIDAD
                        System.out.println("Has seleccionado la opcion 7");
                        buscarPorDisponibilidad(lista);
                        break;
                    case 8:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 8");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                lector.next();
            }
        }
    }

    public static void buscarPorDisponibilidad(ArrayList<Pelicula> lista) {
        boolean peliculaEncontrada = false;
        for (int i = 0; i < lista.size(); i++) {
            //sobra el == true?
            if (lista.get(i).isDisponibilidad() == true) {
                lista.get(i).mostrarAtributos();
                peliculaEncontrada = true;
            }
        }
        if (!peliculaEncontrada) {
            System.out.println("No se ha encontrado esta película.");
        }
        /* esto porque falla?
          for (int i = 0; i < lista.size(); i++) {
          System.out.println(lista.get(i).getId() + "_" + lista.get(i).getTitulo() + "_" + lista.get(i).isDisponibilidad());
          }
          System.out.println("Busqueda por disponibilidad:");
          String busqueda7 = lector.nextLine();
          for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).isDisponibilidad() == busqueda7) {
                System.out.println("=========Peli " + i + "========");
                lista.get(i).mostrarAtributos();
            }
        }*/
    }

    public static void buscarPorAño(ArrayList<Pelicula> lista, Scanner lector) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getAño());
        }
        System.out.println("Busqueda por año:");
        int busqueda6 = lector.nextInt();
        boolean peliculaEncontrada = false;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getAño() == busqueda6) {
                System.out.println("=========Peli " + i + "========");
                lista.get(i).mostrarAtributos();
                peliculaEncontrada = true;
            }
        }
        if (!peliculaEncontrada) {
            System.out.println("No se ha encontrado esta película.");
        }
    }

    public static void buscarPorGenero(ArrayList<Pelicula> lista, Scanner lector) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getGenero());
        }
        System.out.println("Busqueda por genero:");
        String busqueda5 = lector.nextLine();
        boolean peliculaEncontrada = false;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getGenero().equals(busqueda5)) {
                System.out.println("=========Peli " + i + "========");
                lista.get(i).mostrarAtributos();
                peliculaEncontrada = true;
            }
        }
        if (peliculaEncontrada == false) {
            System.out.println("No se ha encontrado esta película.");
        }
    }

    public static void buscarPorDuracion(ArrayList<Pelicula> lista, Scanner lector) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getDuracion());
        }
        System.out.println("Busqueda por duración:");
        int busqueda4 = lector.nextInt();
        boolean peliculaEncontrada = false;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getDuracion() == busqueda4) {
                System.out.println("=========Peli " + i + "========");
                lista.get(i).mostrarAtributos();
                peliculaEncontrada = true;
            }
        }
        if (!peliculaEncontrada) {
            System.out.println("No se ha encontrado ninguna película.");
        }
    }

    public static void buscarPorDirector(ArrayList<Pelicula> lista, Scanner lector) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getDirector());
        }
        System.out.println("Busqueda por director:");
        String busqueda3 = lector.nextLine();
        boolean peliculaEncontrada = false;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getDirector().equals(busqueda3)) {
                System.out.println("=========Peli " + i + "========");
                lista.get(i).mostrarAtributos();
                peliculaEncontrada = true;
            }
        }
        if (!peliculaEncontrada) {
            System.out.println("No se ha encontrado ninguna película.");
        }
    }

    public static void buscarPorTitulo(ArrayList<Pelicula> lista, Scanner lector) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getTitulo());
        }
        System.out.println("Busqueda por titulo:");
        String busqueda2 = lector.nextLine();
        boolean peliculaEncontrada = false;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getTitulo().contains(busqueda2)) {
                System.out.println("=========Peli " + i + "========");
                lista.get(i).mostrarAtributos();
                peliculaEncontrada = true;
            }
        }
        if (!peliculaEncontrada) {
            System.out.println("No se ha encontrado ninguna película.");
        }
    }

    public static int buscarPorId(ArrayList<Pelicula> lista, Scanner lector) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getId());
        }
        System.out.println("Busqueda por ID:");
        int busqueda = Integer.parseInt(lector.nextLine());
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == busqueda) {
                System.out.println("=========Peli " + i + "========");
                lista.get(i).mostrarAtributos();
                return i;
            }
        }
        System.out.println("No se ha encontrado esta película.");
        return -1;
    }
}
