/*
 * 1. Leer 5 números (con bucle por favor, no pongáis 5 scanner
 * consecutivos) y mostrarlos en el mismo orden introducido.
 */
package practica.pkg1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio1 {

    /**
     * public class Ejercicio1 {
    public static void miMetodo()(String.out.println("hola")) {
        
    }
     */
    public static void main(String[] args) {
        System.out.print("Escribe 5 números: ");
        int[] resultado = new int[5];
        
        Scanner lector=new Scanner(System.in).useDelimiter(" ");
        
        for (int i = 0; i<5; i++){
            resultado[i] = lector.nextInt();
        }
        
        for (int i = 0; i<5; i++){
            System.out.println(resultado[i]);
        }
        
    }
    
}
