import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi, toplam = 0, temp;

        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayi Girin: ");
        sayi = input.nextInt();

        for(int i = sayi; i > 0; i--){
            for(int k = 0; k < sayi - i; k++){
                System.out.print(" ");
            }
            for(int j = (2*i)-1; j > 0; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}