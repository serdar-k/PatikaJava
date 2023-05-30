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
        int yil;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Yil Girin: ");
        yil = input.nextInt();
        boolean isDividedBy100 = false;
        
        if(yil%100 == 0){
            isDividedBy100 = true;
            if(yil%400 == 0){
                System.out.println(yil + " " + "bir artik yildir!");
            }else{
                System.out.println(yil + " " + "bir artik yil degildir!");
            }
        }else if(yil%4 == 0){
            System.out.println(yil + " " + "bir artik yildir!");
        }        
        else{
            System.out.println(yil + " " + "bir artik yil degildir!");
        }
    }
}
