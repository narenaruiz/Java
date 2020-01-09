/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Nicolás
 */
public class Ejercicio7 {
    
    static Scanner lector = new Scanner(System.in).useDelimiter(" ");
    
    public static void Ejercicio1() {
        System.out.print("Escribe 5 números: ");
        int[] resultado = new int[5];
        
        for (int i = 0; i<5; i++){
            resultado[i] = lector.nextInt();
        }
        
        for (int i = 0; i<5; i++){
            System.out.println(resultado[i]);
        }
    }

    public static void Ejercicio2() {
        System.out.print("Escribe 5 números: ");
        int[] resultado = new int[5];
        
        for (int i = 0; i<5; i++){
            resultado[i] = lector.nextInt();
        }
        
        for (int i = 4; i>=0; i--){
            System.out.println(resultado[i]);
        }
    }

    public static void Ejercicio3() {
        System.out.print("Escribe 5 números: ");
        ArrayList<Integer> positivos = new ArrayList();
        ArrayList<Integer> negativos = new ArrayList();
        ArrayList<Integer> ceros = new ArrayList();
        
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
    }
    
    public static void Ejercicio4() {
        System.out.print("Escribe 10 numeros: ");
        int[] lista = new int[10];
        
        for(int i = 0; i<10; i++){
            lista[i] = lector.nextInt();
            
        }
        
        for(int i = 0; i<5; i++){
            System.out.println(lista[i]);
            System.out.println(lista[9-i]);
        }
    }
        
    public static void Ejercicio5() {
        System.out.print("Dime 10 numeros enteros: ");
        int[] primeraLista = new int[10];
        int[] segundaLista = new int[10];
        int[] resultado = new int[20];
        
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
}
    public static void Ejercicio6() {
        System.out.print("Dime 12 numeros enteros: ");
        int[] primeraLista = new int[12];
        int[] segundaLista = new int[12];
        ArrayList<Integer> resultado = new ArrayList();
        
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
    
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
 
        while (!salir) {
 
            System.out.println("1. Ejercicio1");
            System.out.println("2. Ejercicio2");
            System.out.println("3. Ejercicio3");
            System.out.println("4. Ejercicio4");
            System.out.println("5. Ejercicio5");
            System.out.println("6. Ejercicio6");
            System.out.println("");
            System.out.println("7. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        Ejercicio1();
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        Ejercicio2();
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        Ejercicio3();
                        break;
                    case 4:
                        System.out.println("Has seleccionado la opcion 4");
                        Ejercicio4();
                        break;
                    case 5:
                        System.out.println("Has seleccionado la opcion 5");
                        Ejercicio5();
                        break;
                    case 6:
                        System.out.println("Has seleccionado la opcion 6");
                        Ejercicio6();
                        break;
                    case 7:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }
}
