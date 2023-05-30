import java.util.Scanner;
import java.lang.Math;

public class Main {
    static boolean isPalindrome(int a){
        int temp, temp2 = a, counter = 0, total = 0;
        while(a > 0){
            a /= 10;
            counter++;
        }
        a = temp2;
        while(counter - 1 >= 0){
            temp = a % 10;
            total += temp * Math.pow(10,counter - 1);
            counter--;
            a /= 10;
        }

        if (total == temp2){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(9889));
    }
}