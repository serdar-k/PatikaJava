import java.util.Scanner;
import java.lang.Math;

public class Main {

    static boolean isPrime(int n, int i) {
        int counter = 0;
        if (n > 1) {
            if (n % i != 0) {
                if (n > i) {
                    return isPrime(n, i + 1);
                }
            } else if (n == i) {
                System.out.println("Sayi Asal!");
                return true;
            }
            System.out.println("Sayi Asal Degil!");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayi Girin: ");
        n = input.nextInt();
        isPrime(n, 2);
    }
}