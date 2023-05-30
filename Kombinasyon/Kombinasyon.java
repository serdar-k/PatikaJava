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
        int elemanSayisi, grupSayisi = 0, faktoriyel1 = 1, faktoriyel2 = 1, faktoriyel3 = 1;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Kumenin Elemanin Sayisini Girin: ");
        elemanSayisi = input.nextInt();
        
        System.out.print("Farkli Grup Yapilacak Eleman Sayisi: ");
        grupSayisi = input.nextInt();
        
        for(int i = 1; i <= elemanSayisi; i++){
            faktoriyel1 *= i;
        }
        
        for(int j = 1; j <= grupSayisi; j++){
            faktoriyel2 *= j;
        }
        
        int fark = elemanSayisi - grupSayisi;
        
        for(int k = 1; k <= fark; k++){
            faktoriyel3 *= k;
        }
        
        int sonuc = (faktoriyel1) / ((faktoriyel2) * (faktoriyel3));
        
        System.out.println("C(" + elemanSayisi + "," + grupSayisi + ") = "+ sonuc);
       
        
    }
}
