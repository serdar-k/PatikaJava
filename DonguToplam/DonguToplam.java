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
        
        do {            
            System.out.print("Bir Sayi Girin: ");
            sayi = input.nextInt();
            
            if(sayi % 4 == 0){
                toplam += sayi;
            }
            
            else if(sayi % 2 == 1){
                System.out.println("Tek Sayi Girildi. Programdan Cikiliyor!");
                break;
            }
        } while (sayi % 2 == 0);
             
        System.out.println("Toplam: " + toplam);
    }
}
