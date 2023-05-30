/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.burc;

import java.util.Scanner;
/**
 *
 * @author serdar
 */
public class Burc {

    public static void main(String[] args) {
        
        int sayi;
        double toplam = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayi Girin: ");
        sayi = input.nextInt();
        
        for(double i = 1; i <= sayi; i++){
            toplam += 1/(i);
        }
        
        System.out.println(toplam);
    }
}
