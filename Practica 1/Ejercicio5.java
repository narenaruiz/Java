/*
 * 5. Leer por teclado dos tablas de 10 números enteros
 * y mezclarlas en una tercera de la forma: el 1º de A,
 * el 1º de B, el 2º de A, el 2º de B, etc.
 */
package practica.pkg1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Nicolás
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.print("Dime 10 numeros enteros: ");
        int[] primeraLista = new int[10];
        int[] segundaLista = new int[10];
        int[] resultado = new int[20];
        
        Scanner lector=new Scanner(System.in).useDelimiter(" ");
        
        for(int i = 0; i<10; i++){
            primeraLista[i] = lector.nextInt();
        }
        
        System.out.print("Dime 10 numeros mas: ");
        lector = new Scanner(System.in).useDelimiter(" ");
        for(int i = 0; i<10; i++){
            segundaLista[i] = lector.nextInt();
        }
        
        for(int i = 0; i<10; i++){
            resultado[2*i] = primeraLista[i];
        }
        
        for(int i = 0; i<10; i++){
            resultado[(2*i)+1] = segundaLista[i];
        }
        System.out.print("El resultado es: ");
        System.out.println(Arrays.toString(resultado));
        /*
         * Me falla el final, no me sale lo de meter unos valores
         * de una variable en otra variable.
        */
    }
    
}
