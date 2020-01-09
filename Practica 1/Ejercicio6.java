/*
 * Leer los datos correspondientes a dos tablas
 * de 12 elementos numéricos, y mezclarlos en una
 * tercera de la forma: 3 de la tabla A, 3 de la B,
 * otros 3 de A, otros 3 de la B, etc.
 */
package practica.pkg1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nicolás
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.print("Dime 12 numeros enteros: ");
        int[] primeraLista = new int[12];
        int[] segundaLista = new int[12];
        ArrayList<Integer> resultado = new ArrayList();
        
        Scanner lector=new Scanner(System.in).useDelimiter(" ");
        
        for(int i = 0; i<12; i++){
            primeraLista[i] = lector.nextInt();
        }
        
        System.out.print("Dime 12 numeros mas: ");
        lector = new Scanner(System.in).useDelimiter(" ");
        for(int i = 0; i<12; i++){
            segundaLista[i] = lector.nextInt();
        }
        
        for(int i = 0; i<12; i=i+3){
            resultado.add(primeraLista[i]);
            resultado.add(primeraLista[i+1]);
            resultado.add(primeraLista[i+2]);
            resultado.add(segundaLista[i]);
            resultado.add(segundaLista[i+1]);
            resultado.add(segundaLista[i+2]);
        }
        
        System.out.println(resultado);
    }
   
}
