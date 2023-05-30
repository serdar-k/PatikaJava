// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String temp = "";

        System.out.print("Bir Kelime Girin: ");
        String test = input.nextLine();
        String test2 = test.toLowerCase();

        for(int i = test.length() - 1; i >=0 ; i--){
            temp += test.charAt(i);
        }

        if(test2.equals(temp.toLowerCase())){
            System.out.println("Girilen Kelime Palindrome Kelimedir!");
        }else{
            System.out.println("Girilen Kelime Palindrome Kelime Degildir!");
        }
    }
}