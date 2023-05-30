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
        int basamakSayisi = 0;
        int sonuc = 1;
        int sayi;
        int kalan;
        int tabanKuvvetToplam = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Bir Sayi Giriniz: ");
        sayi = input.nextInt();
        int yedekSayi = sayi;
        int yedekSayi2 = sayi;
        
        while(sayi > 0){
            sayi = sayi / 10;
            basamakSayisi += 1;
        }
        
        while(yedekSayi > 0){
            
            kalan = yedekSayi % 10;
            
            for(int i = 0; i < basamakSayisi; i++){
                sonuc = sonuc * kalan;
            }
            
            tabanKuvvetToplam += sonuc;
            
            yedekSayi = yedekSayi / 10;
            sonuc = 1;
        }
        
        if(yedekSayi2 == tabanKuvvetToplam){
            System.out.println("Girilen Sayi Bir Armstrong Sayisidir!");
        }else{
            System.out.println("Girilen Sayi Bir Armstrong Sayisi Degildir!");
        }
    }
}
