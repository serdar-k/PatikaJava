package kdv;

import java.util.Scanner;

public class KDV {

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        double KDV, tutar;
        KDV = 0.18;
        
        System.out.print("Ucret: ");
        tutar = input.nextDouble();
        
        tutar += KDV * tutar;
        System.out.println("KDV'li Tutar: " + tutar);
               
        
        
        
    }
    
}
