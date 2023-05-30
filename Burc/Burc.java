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
        int month, day;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Dogdugunuz Ayi Sayi Ile Girin: ");
        month = input.nextInt();
        
        System.out.print("Dogdugunuz Gunu Sayi Ile Girin: ");
        day = input.nextInt();
        
        switch(month){
            case 1:
                if(day > 0 && day <= 31){
                    if(day >= 21){
                    System.out.println("Burcunuz Kova");
                    }else{
                        System.out.println("Burcunuz Oglak");
                    }
                }else{
                    System.out.println("Gecersiz Gun Girisi!");
                }
                break;
                case 2:
                if(day > 0 && day <= 29){
                    if(day >= 21){
                    System.out.println("Burcunuz Balik");
                    }else{
                        System.out.println("Burcunuz Kova");
                    }
                }else{
                    System.out.println("Gecersiz Gun Girisi!");
                }
                                break;

                case 3:
                if(day > 0 && day <= 31){
                    if(day >= 21){
                    System.out.println("Burcunuz Koc");
                    }else{
                        System.out.println("Burcunuz Balik");
                    }
                }else{
                    System.out.println("Gecersiz Gun Girisi!");
                }
                                break;

                case 4:
                if(day > 0 && day <= 30){
                    if(day >= 21){
                    System.out.println("Burcunuz Boga");
                    }else{
                        System.out.println("Burcunuz Koc");
                    }
                }else{
                    System.out.println("Gecersiz Gun Girisi!");
                }
                                break;

                case 5:
                if(day > 0 && day <= 31){
                    if(day >= 22){
                    System.out.println("Burcunuz Ikizler");
                    }else{
                        System.out.println("Burcunuz Boga");
                    }
                }else{
                    System.out.println("Gecersiz Gun Girisi!");
                }
                                break;

                case 6:
                if(day > 0 && day <= 30){
                    if(day >= 23){
                    System.out.println("Burcunuz Yengec");
                    }else{
                        System.out.println("Burcunuz Ikizler");
                    }
                }else{
                    System.out.println("Gecersiz Gun Girisi!");
                }
                                break;

                case 7:
                if(day > 0 && day <= 31){
                    if(day >= 23){
                    System.out.println("Burcunuz Aslan");
                    }else{
                        System.out.println("Burcunuz Yengec");
                    }
                }else{
                    System.out.println("Gecersiz Gun Girisi!");
                }
                                break;

                case 8:
                if(day > 0 && day <= 31){
                    if(day >= 23){
                    System.out.println("Burcunuz Basak");
                    }else{
                        System.out.println("Burcunuz Aslan");
                    }
                }else{
                    System.out.println("Gecersiz Gun Girisi!");
                }
                                break;

                case 9:
                if(day > 0 && day <= 30){
                    if(day >= 23){
                    System.out.println("Burcunuz Terazi");
                    }else{
                        System.out.println("Burcunuz Basak");
                    }
                }else{
                    System.out.println("Gecersiz Gun Girisi!");
                }
                                break;

                case 10:
                if(day > 0 && day <= 31){
                    if(day >= 21){
                    System.out.println("Burcunuz Akrep");
                    }else{
                        System.out.println("Burcunuz Terazi");
                    }
                }else{
                    System.out.println("Gecersiz Gun Girisi!");
                }
                                break;

                case 11:
                if(day > 0 && day <= 30){
                    if(day >= 22){
                    System.out.println("Burcunuz Yay");
                    }else{
                        System.out.println("Burcunuz Terazi");
                    }
                }else{
                    System.out.println("Gecersiz Gun Girisi!");
                }
                                break;

                case 12:
                if(day > 0 && day <= 31){
                    if(day >= 22){
                    System.out.println("Burcunuz Oglak");
                    }else{
                        System.out.println("Burcunuz Yay");
                    }
                }else{
                    System.out.println("Gecersiz Gun Girisi!");
                }
                
                default:
                    System.out.println("Gecersiz Ay Girisi!");
                
        }
    }
}
