import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    double heat;

    Scanner input = new Scanner(System.in);
    System.out.print("Hava Sicakligini Girin: ");
    heat = input.nextDouble();
    
    if(heat < 5){
      System.out.println("Kayak Yapmaya Gidebilirsin!");
    }else if(heat >= 5 && heat < 25){
      if(heat < 15){
        System.out.println("Sinemaya Gidebilirsin!");
      }else{
        System.out.println("Piknige Gidebilirsin!");
      }
    }else{
      System.out.println("Yuzmeye Gidebilirsin!");
    }
  }
}