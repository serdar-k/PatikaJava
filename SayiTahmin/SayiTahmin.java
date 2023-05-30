// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int right = 5;
        int randomNumber = (int)(Math.random() * 100);
        int choice;
        System.out.println(randomNumber);

        while(right > 0){
            System.out.print("Bir Sayi Girin: ");
            choice = input.nextInt();

            if(choice < 0 || choice > 99){
                System.out.println("Lutfen 0-100 Arasinda Bir Sayi Girin!");

            }else{
                if(choice == randomNumber){
                    System.out.println("Kazandiniz!");
                    break;
                }else{
                    System.out.println("Tekrar Deneyin!");
                    right--;
                    System.out.println("Kalan Hakkiniz: " + right);
                    System.out.println();
                }
            }

        }
    }
}