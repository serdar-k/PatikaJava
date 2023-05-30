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
        int sayi, toplam = 0, sayac = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi Girin: ");
        sayi = input.nextInt();
        
        System.out.println("4'un Kuvvetleri");
        for(int i = 1; i < sayi; i *= 4){
            sayac += 1;
            System.out.println(i);
            if(i * sayac > sayi){
                System.out.println("5'in Kuvvetleri");
                for(int j = 1; j < sayi; j *= 5){
                System.out.println(j);
                }
            }
        }
    }
}
