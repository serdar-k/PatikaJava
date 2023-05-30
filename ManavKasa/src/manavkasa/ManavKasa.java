package manavkasa;


import java.util.Scanner;

public class ManavKasa {

    public static void main(String[] args) {
        int adet;
        double tutar = 0;
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Meyve-Sebze Adetlerini Girin");
        
        System.out.print("Elma: ");
        adet = input.nextInt();
        tutar += adet * elma;
        
        System.out.print("Armut: ");
        adet = input.nextInt();
        tutar += adet * armut;
        
        System.out.print("Domates: ");
        adet = input.nextInt();
        tutar += adet * domates;
        System.out.print("Muz: ");
        adet = input.nextInt();
        tutar += adet * muz;
        
        System.out.print("Patlican: ");
        adet = input.nextInt();
        tutar += adet * patlican;
        
        System.out.print("Odenecek Toplam Tutar: " + tutar);
        
    
}
