import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi, toplam = 0, sayac = 0;
        int ilk = 1, ikinci = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayi Girin: ");
        sayi = input.nextInt();

        System.out.print(ilk + " " + ikinci + " ");

        for(int i = 0; i < sayi; i++){
            toplam = ilk + ikinci;
            System.out.print(toplam + " ");
            ilk = ikinci;
            ikinci = toplam;
        }

    }
}