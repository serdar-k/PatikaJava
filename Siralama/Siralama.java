import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int a, b, c;
    
    Scanner input = new Scanner(System.in);

    System.out.print("Birinci Sayi(a): ");
    a = input.nextInt();

    System.out.print("Ikinci Sayi(b): ");
    b = input.nextInt();

    System.out.print("Ucuncu Sayi(c): ");
    c = input.nextInt();

    if((a > b) && (a > c)){
      if(b > c){
        System.out.print("Siralama: a > b > c");
      }else if(c > b){
        System.out.print("Siralama: a > c > b");
      }else{
        System.out.print("Siralama: a > b = c");
      }
    }else if((b > a) && (b > c)){
      if(a > c){
        System.out.print("Siralama: b > a > c");
      }else if(c > a){
        System.out.print("Siralama: b > c > a");
      }else{
        System.out.print("Siralama: b > a = c");
      }
    }else if((c > a) && (c > b)){
      if(b > a){
        System.out.print("Siralama: c > b > a");
      }else if(a > b){
        System.out.print("Siralama: c > a > b");
      }else{
        System.out.print("Siralama: c > b = a");
      }
    }else{
      if((a == b) && (a == c)){
        System.out.print("Siralama: a = b = c");
      }
    }
  }
}