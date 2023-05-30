import java.util.Scanner;
import java.lang.Math;

public class Main {

    static int usAlma(int base, int pow){
        if(pow == 0){
            return 1;
        }
        if(pow == 1){
            return base;
        }
        return usAlma(base, pow - 1) * base;
    }
        public static void main(String[] args) {
        System.out.println(usAlma(3,5));
    }
}