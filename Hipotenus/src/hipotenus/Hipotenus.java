/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package hipotenus;

import java.util.Scanner;

/**
 *
 * @author Serdar
 */
public class Hipotenus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double kenar_1, kenar_2, kenar_3;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ucgenin Kenar Uzunluklarini Girin");
        System.out.print("Kenar 1: ");
        kenar_1 = input.nextInt();
 
        System.out.print("Kenar 2: ");
        kenar_2 = input.nextInt();
        
        System.out.print("Kenar 3: ");
        kenar_3 = input.nextInt();
        
        double cevre = kenar_1 + kenar_2 + kenar_3;
        double u = cevre / 2;
        double araDeger = (u * (u - kenar_1) * (u - kenar_2) * (u - kenar_3));
        double alan =  Math.pow(araDeger, 0.5);
        
        System.out.println("Ucgenin Alani: " + alan);
    }
    
}
