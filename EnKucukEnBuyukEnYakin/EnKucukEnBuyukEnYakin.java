// NEGATIF SAYILAR ICIN DUZENLEME YAPMAK GEREKLI

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int temp1 = 0, temp2 = 0, inputNumber, min = 0, max = 0, minIndex = 0, maxIndex = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayi Girin: ");
        inputNumber = input.nextInt();

        int[] numbers = {15, 12, 788, 1, -1, 2, -778, 0};
        temp2 = inputNumber - numbers[0];
        if (temp2 < 0) temp2 *= -1;

        for (int i = 0; i < numbers.length; i++) {
            temp1 = inputNumber - numbers[i];
            if (temp1 < 0) {
                temp1 *= -1;
            }
            if (temp1 < temp2) {
                minIndex = i;
                temp2 = temp1;
            }
        }

        max = inputNumber - numbers[0];
        max *= -1;
        for(int j = 0; j < numbers.length; j++){
            temp1 = inputNumber - numbers[j];
            if(temp1 < 0){
                temp1 *= -1;
                if(max > temp1){
                    maxIndex = j;
                }
            }
        }

        System.out.println("Girilen Sayiya Yakin En Kucuk Sayi: " + numbers[minIndex]);
        System.out.println("Girilen Sayiya Yakin En Buyuk Sayi: " + numbers[maxIndex]);
    }

}
