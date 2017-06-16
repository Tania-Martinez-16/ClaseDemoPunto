/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasedemopunto;

import java.util.Scanner;
import modelo.Punto;

/**
 *
 * @author tatia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int x,y;
        System.out.println("Ingrese x:");
        x = entrada.nextInt();
        System.out.println("Ingrese y");
        y = entrada.nextInt();
        
        Punto mipunto = new Punto();
        System.out.println("p: ("+ mipunto.getx(x) + "," + mipunto.gety(y) + ")");
    }
    
}
