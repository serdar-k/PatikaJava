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
        Scanner input = new Scanner(System.in);
        
        int distance, age, travelType;
        
        double feePerKm = 0.10;
        double totalFee = 0;
        
        System.out.print("Distance: ");
        distance = input.nextInt();
        
        System.out.print("Age: ");
        age = input.nextInt();
        
        System.out.print("Travel Type - (One Way-1 / Departure Return-2): ");
        travelType = input.nextInt();
        
        if((distance > 0) && (age > 0)){
            
            if((travelType == 1 || travelType == 2)){
                totalFee = distance * feePerKm;
                if(age < 12){
                    totalFee = totalFee / 2;
                    if(travelType == 2){
                        totalFee = totalFee - totalFee * 0.2;
                        System.out.println("Toplam Ucret: " + totalFee * 2);
                    }else{
                        System.out.println("Toplam Ucret: " + totalFee);
                    }
                }else if(age >= 12 && age <= 24){
                    totalFee = totalFee - totalFee * 0.1;
                    if(travelType == 2){
                        totalFee = totalFee - totalFee * 0.2;
                        System.out.println("Toplam Ucret: " + totalFee * 2);
                    }else{
                        System.out.println("Toplam Ucret: " + totalFee);

                    }
                }else if(age > 65){
                    totalFee = totalFee - totalFee * 0.3;
                    if(travelType == 2){
                        totalFee = totalFee - totalFee * 0.2;
                        System.out.println("Toplam Ucret: " + totalFee * 2);
                    }else{
                        System.out.println("Toplam Ucret: " + totalFee);
                    }
                }
                else{
                    System.out.println("Toplam Ucret: " + totalFee);
                }
            }
            else if(travelType != 1 || travelType != 2){
                System.out.println("Hatali Veri Girisi!");
            }
            
        }else{
                System.out.println("Hatali Veri Girisi!");
        }
}}
