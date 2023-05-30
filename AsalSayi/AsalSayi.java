import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi, toplam = 0, sayac = 0;
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Bir Sayi Girin: ");
//        sayi = input.nextInt();

        for(int i = 2; i < 100; i++){
            for(int j = 1; j < i; j++){
                if(i % j == 0){
                    sayac += 1;
                }
            }
            if(sayac == 1){
                System.out.print(i + " ");
            }
            sayac = 0;
        }
    }
}