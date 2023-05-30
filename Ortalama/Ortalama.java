import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int turkce, mat, fizik, biyo, kimya;
    double ortalama;
    
    Scanner input = new Scanner(System.in);

    System.out.print("Turkce Not: ");
    turkce = input.nextInt();

    System.out.print("Matematik Not: ");
    mat = input.nextInt();

    System.out.print("Fizik Not: ");
    fizik = input.nextInt();

    System.out.print("Biyoloji Not: ");
    biyo = input.nextInt();

    System.out.print("Kimya Not: ");
    kimya = input.nextInt();

    ortalama = (turkce + mat + fizik + biyo + kimya)/5;

    if(ortalama >= 55){
      System.out.print("Gectiniz!");
      System.out.print("Ortalama: ", ortalama);
    }else{
      System.out.print("Kaldiniz!");
      System.out.print("Ortalama: ", ortalama);
    }
  }
}
