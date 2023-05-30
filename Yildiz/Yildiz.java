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
        Scanner input = new Scanner(System.in);
        System.out.print("Satir Sayisi Girin: ");
        sayi = input.nextInt();
        
        for(int i = 1; i < sayi; i++){
            for(int j = sayi - i; j > 0; j--){
                System.out.print(" ");   
            }
            for(int k = 0; k < 2 * i - 1; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
