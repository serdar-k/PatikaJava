import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int sayi, temp1 = 0, temp2 = 0, sayac, min, max;

    Scanner input = new Scanner(System.in);
    System.out.print("Sayi Adedini Girin: ");
    sayac = input.nextInt();
    
    while(sayac > 0){
      System.out.print("Sayi Girin: ");
      sayi = input.nextInt();
      
      if(sayi > temp1){
        temp1 = sayi;
      }else{
        temp2 = sayi;
      }
      sayac--;
    }
    System.out.println("En Buyuk Sayi: " + temp1);
    System.out.println("En Kucuk Sayi: " + temp2);
      
  }
}