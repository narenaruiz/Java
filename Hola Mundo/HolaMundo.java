/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO: code application logic here
        System.out.println("Hola Mundo");
        Scanner lector=new Scanner(System.in);
        int mivariable=lector.nextInt();
        System.out.println("mi variable vale "+mivariable);
    }
}
