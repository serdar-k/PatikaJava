package dairehesapla;

import java.util.Scanner;

public class DaireHesapla {

    public static void main(String[] args) {
       double yariCap, alan, cevre, pi = 3.14;
       
       
       Scanner input = new Scanner(System.in);
       System.out.print("Yari Cap Giriniz: ");
       yariCap = input.nextDouble();
       
       alan = pi * yariCap * yariCap;
       
       cevre = 2 * pi * yariCap;
       
        System.out.println("Alan: " + alan + "\t" + "Cevre: " + cevre);
       
    }
    
}
