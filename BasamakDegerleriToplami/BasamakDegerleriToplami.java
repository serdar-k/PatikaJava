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
        
        int basamakSayisi;
        int sayi;
        int sayac = 0;
        int kalan = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Bir Sayi Girin: ");
        sayi = input.nextInt();
        
        while(sayi > 0){
            kalan = sayi % 10;
            
            sayac += kalan;
            
            sayi = sayi / 10;
        }
        System.out.println(sayac);
    }
}
