/*
 * 2. Leer 5 números y mostrarlos en orden inverso al introducido.
 */
package practica.pkg1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
        System.out.print("Escribe 5 números: ");
        int[] resultado = new int[5];
        
        Scanner lector=new Scanner(System.in);
        
        for (int i = 0; i<5; i++){
            resultado[i] = lector.nextInt();
        }
        
        for (int i = 4; i>=0; i--){
            System.out.println(resultado[i]);
        }
    }
}
