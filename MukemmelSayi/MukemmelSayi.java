import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi, toplam = 0, temp;

        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayi Girin: ");
        sayi = input.nextInt();

        for(int i = 1; i < sayi; i++){
            if(sayi % i == 0){
                toplam += i;
            }
        }
        if(toplam == sayi){
            System.out.println(sayi + " Mukemmel Sayidir!");
        }else{
            System.out.println(sayi + " Mukemmel Sayi Degildir!");
        }
    }
}