// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;
public class Main {

    public static void diziSirala(int[] array){
        int min = array[0];
        int temp;
        for(int i = 0; i < array.length; i++){
            for(int j = i; j < array.length; j++){
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizi Boyutunu Girin: ");
        int diziBoyutu = input.nextInt();
        int i = 0, temp;

        int[] numberArray = new int[diziBoyutu];

        while(diziBoyutu > 0){
            i++;
            System.out.print("Dizinin " + i + ". Elemanini Girin: ");
            int inputNumber = input.nextInt();
            numberArray[i-1] = inputNumber;
            diziBoyutu--;
        }

        diziSirala(numberArray);

        for(int value : numberArray){
            System.out.print(value + " ");
        }
    }
}