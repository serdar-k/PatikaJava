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
       int sayi1, sayi2;
       int sayac1 = 2;
       int sayac2 = 1;
       int temp1 = 0, temp2 = 0;
       int buyukSayi = 0, kucukSayi = 0;
       boolean isEKOK = true;
       
       Scanner input = new Scanner(System.in);
       
        System.out.print("Birinci Sayi: ");
        sayi1 = input.nextInt();
        
        System.out.print("Ikinci Sayi: ");
        sayi2 = input.nextInt();
        if(sayi1 > sayi2){
            buyukSayi = sayi1;
            kucukSayi = sayi2;
        }else if(sayi2 > sayi1){
            buyukSayi = sayi2;
            kucukSayi = sayi1;
        }else if(buyukSayi == kucukSayi){
            System.out.println("Sayilar Esit, EBOB: " + sayi1 + ", " + "EKOK: " + sayi1);
        }else{
            while(kucukSayi != sayac1){
            if(kucukSayi % sayac1 == 0){
                if(buyukSayi % sayac1 == 0){
                    temp1 = sayac1;
                    }
                }   
                sayac1++;
            }
            System.out.println("EBOB: " + temp1);
        
            while(isEKOK){
                temp1 = kucukSayi * sayac2;

                if(temp1 >= buyukSayi && temp1 % buyukSayi == 0){
                    System.out.println("EKOK: " + temp1);
                    isEKOK = false;
                }
                sayac2++;
            }
        }
        
        
    }
}