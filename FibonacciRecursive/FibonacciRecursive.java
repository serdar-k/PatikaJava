import java.util.Scanner;
import java.lang.Math;

public class Main {
    static int fibonacci(int a){
        if(a <= 1){
            return a;
        }
        return fibonacci(a - 1) + fibonacci(a - 2);
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(6));
    }
}