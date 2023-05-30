import java.util.Scanner;
import java.lang.Math;

public class Main {
    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". Sayi: ");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuc: " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kac Adet Sayi Gireceksiniz: ");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". Sayi: ");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuc: " + result);
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". Sayi: ");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuc: " + result);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kac Adet Sayi Gireceksiniz: ");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". Sayi: ");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Bolen Sayi 0 Olamaz!");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }
        System.out.println("Sonuc: " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban Degeri Girin: ");
        int base = scan.nextInt();
        System.out.print("Us Degeri Girin: ");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuc: " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi Giriniz: ");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuc : " + result);
    }

    static void mod() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Modu Alinacak Sayiyi Giriniz: ");
        int n = scan.nextInt();
        System.out.print("Hangi Sayiya Gore Mod Alinacak: ");
        int k = scan.nextInt();

        System.out.println(n % k);
    }

    static void dikdortgenAlanCevre() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dikdortgen Kisa Kenar Uzunlugu Giriniz: ");
        int x = scan.nextInt();
        System.out.print("Dikdortgen Uzun Kenar Uzunlugu Giriniz: ");
        int y = scan.nextInt();

        System.out.println("Alan: " + x * y);
        System.out.println("Cevre: " + 2 * x * y);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "Toplama Islemi: 1\n"
                + "Cikarma Islemi: 2\n"
                + "Carpma Islemi: 3\n"
                + "Bölme Islemi: 4\n"
                + "Uslu Sayi Hesaplama: 5\n"
                + "Faktoriyel Hesaplama: 6\n"
                + "Mod Alma: 7\n"
                + "Dikdortgen Alan ve Cevre Hesabi: 8\n"
                + "Cikis Yap: 0";

        do {
            System.out.println(menu);
            System.out.print("Lutfen Islem Seciniz: ");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    dikdortgenAlanCevre();
                    break;
                default:
                    System.out.println("Yanlis Bir Deger Girdiniz. Tekrar Deneyin!");
                    System.out.println();
            }
        } while (select != 0);
    }
}