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
        
        System.out.print("Bir Sayi Girin: ");
        sayi = input.nextInt();
        
        for(int i = 0; i < sayi; i++){
            if(i%3 == 0 && i%4 ==0 && i > 0){
                sayac += 1;
                toplam += i;
            }
        }
        if(sayac == 0){
            System.out.println("Girilen Sayiya Kadar 3 ve 4'e Tam Bolunebilen Sayi Yok! ");
        }else{
            System.out.println("Girilen Sayiya Kadar Olan, 3 ve 4'e Tam Bolunebilen Sayilarin Ortalamasi: " + toplam/sayac);        
        }
        
        
    }
}
