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
        int taban, us, sonuc = 1;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Taban: ");
        taban = input.nextInt();
        
        System.out.print("Us: ");
        us = input.nextInt();
        
        for(int i = 0; i < us; i++){
            sonuc = sonuc * taban;
        }
        
        System.out.println(sonuc);
    }
}
