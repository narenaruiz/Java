/*
 * No puedo poner el enunciado porque son muchos ejercicios.
 */
package practica.pkg2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Nicolás
 */
public class Practica2 {

    static Scanner lector = new Scanner(System.in);
    
    public static void crearTabla(){
        int tabla [][] = new int[5][5];
        for (int i = 0; i<tabla.length; i++){
            for (int j = 0; j<tabla.length; j++){
                tabla[i][j] = i+j;
            }
        }
        
        for (int i = 0; i<tabla.length; i++){
                System.out.println(Arrays.toString(tabla[i]));
        }
    }
    
    public static void comprobarSimetria(){
        int tabla [][] = new int[4][4];
        boolean band = true;
        
        for (int i = 0; i<4; i++){
            for (int j = 0; j<4; j++){
                tabla[i][j] = i+j;
            }
        }
        
        for (int i = 0; i<4; i++){
                System.out.println(Arrays.toString(tabla[i]));
        }
        for (int i = 0; i<4; i++){
            for (int j = 0; j<4; j++){
                if(tabla[i][j] != tabla[j][i]){
                    band = false;
                    i = 4;
                    break;
                }
            }
        }
        System.out.println(band);
    }
    
    public static void sumaMatrices(){
        int tabla1 [][] = new int[3][3];
        int tabla2 [][] = new int[3][3];
        int resultado [][] = new int[3][3];
        
        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                tabla1[i][j] = i+j;
                tabla2[i][j] = i+j;
            }
        }
        
        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                resultado [i][j] = tabla1[i][j] + tabla2[i][j];
            }
        }
        
        for (int i = 0; i<3; i++){
            System.out.println(Arrays.toString(resultado[i]));
        }
    }
    
    public static void rellenarDiagonal(){
        int tabla [][] = new int[7][7];
        
        for (int i = 0; i<7; i++){
            for (int j = 0; j<7; j++){
                if(i==j){
                    tabla[i][j]=1;
                }
            }
        }
        
        for (int i = 0; i<7; i++){
            System.out.println(Arrays.toString(tabla[i]));
        }    
    }
    
    public static void marco(){
        int tabla [][] = new int[8][6];
        
        for (int i = 0; i<8; i++){
            tabla[i][0]=1;
            tabla[i][5]=1;
            if(i<6){
                tabla[0][i]=1;
                tabla[7][i]=1;
            }
        }
        
        for (int i = 0; i<8; i++){
            System.out.println(Arrays.toString(tabla[i]));
        }
    }
    
    public static void elegirMarco(){
        System.out.print("Escribe un numero y luego otro: ");
        int tabla [][] = new int[lector.nextInt()][lector.nextInt()];
        
        for (int i = 0; i<tabla.length; i++){
            tabla[i][0]=1;
            tabla[i][tabla[i].length-1]=1;
            if(i<tabla[i].length-1){
                tabla[0][i]=1;
                tabla[tabla.length-1][i]=1;
            }
        }
        
        for (int i = 0; i<tabla.length; i++){
            System.out.println(Arrays.toString(tabla[i]));
        }
        
    }
    
    public static void main(String[] args) {
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
 
        while (!salir) {
 
            System.out.println("1. crearTabla");
            System.out.println("2. comprobarSimetria");
            System.out.println("3. sumaMatrices");
            System.out.println("4. rellenarDiagonal");
            System.out.println("5. marco");
            System.out.println("6. elegirMarco");
            System.out.println("");
            System.out.println("7. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = lector.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        crearTabla();
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        comprobarSimetria();
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        sumaMatrices();
                        break;
                    case 4:
                        System.out.println("Has seleccionado la opcion 4");
                        rellenarDiagonal();
                        break;
                    case 5:
                        System.out.println("Has seleccionado la opcion 5");
                        marco();
                        break;
                    case 6:
                        System.out.println("Has seleccionado la opcion 6");
                        elegirMarco();
                        break;
                    case 7:
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
}