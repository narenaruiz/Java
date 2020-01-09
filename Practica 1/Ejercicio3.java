/*
 * 3. Leer 5 números por teclado y a continuación realizar
 * la media de los números positivos, la media de los negativos
 * y contar el número de ceros.
 */
package practica.pkg1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nicolás
 */
public class Ejercicio3 {
    
    public static void main(String[] args) {
        System.out.print("Escribe 5 números: ");
        ArrayList<Integer> positivos = new ArrayList();
        ArrayList<Integer> negativos = new ArrayList();
        ArrayList<Integer> ceros = new ArrayList();
        
        Scanner lector=new Scanner(System.in).useDelimiter(" ");
        
        for (int i = 0; i<5; i++){ 
            int numeroLeido = lector.nextInt();
            
            if (numeroLeido>0){
                positivos.add(numeroLeido);
            }
            else if (numeroLeido<0){
                negativos.add(numeroLeido);
            }
            else{
                ceros.add(numeroLeido);
            }
        }
        
        int sumaPositivos = 0;
        for (Integer positivo: positivos) {
            sumaPositivos += positivo;
        }
        
        int sumaNegativos = 0;
        for (Integer negativo: negativos) {
            sumaNegativos += negativo;
        }
        
        System.out.println("La media de los positivos es: " + (positivos.isEmpty()?"":Math.round(sumaPositivos/positivos.size())));
        System.out.println("La media de los positivos es: " + (negativos.isEmpty()?"":Math.round(sumaNegativos/negativos.size())));
        System.out.println("El número de 0s es: " + ceros.size());
        
        /**
         * Estos tres primeros ejercicios me los hizo y explico
         * Dani, este ultimo me lo explico determinando variables con
         * Arrays pero todavia tengo que revisar como funcionan porque
         * no las entiendo del todo.
         */
        
    }
}
