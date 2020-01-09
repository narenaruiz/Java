/*
 * 4. Leer 10 números enteros. Debemos mostrarlos en
 * el siguiente orden: el primero, el último, el segundo,
 * el penúltimo, el tercero, etc.
 */
package practica.pkg1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nicolás
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.print("Escribe 10 numeros: ");
        int[] lista = new int[10];
        
        Scanner lector=new Scanner(System.in).useDelimiter(" ");
        
        for(int i = 0; i<10; i++){
            lista[i] = lector.nextInt();
            
        }
        
        for(int i = 0; i<5; i++){
            System.out.println(lista[i]);
            System.out.println(lista[9-i]);
        }
        /**
         * Tengo que hacer que se imprima el primero y luego el ultimo
         * y despues segundo y penultimo(revisar)./ He mirado un ejercicio
         * que es igual y es mas o menos como yo pensaba, tengo que intentar no
         * mirar ejercicios resueltos.
         */
    }
}
