import java.util.Scanner;
import java.lang.Math;

public class Main {

    static int numberPattern(int n, int init, boolean flag) {
        System.out.print(n + " ");
        if(n > 0 && flag){
            n -= 5;
            if(n <= 0){
                flag = false;
                return numberPattern(n, init, flag);
            }
        }else if(n >= 0 && !flag){
            n += 5;
            if(n == init){
                return init;
            }
        }
        else if(n <= 0 && !flag){
            n += 5;
        }
        return numberPattern(n, init, flag);
    }

    public static void main(String[] args) {
        int n, init;
        boolean flag = true;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        init = n;
        System.out.println(numberPattern(n, init, flag));
    }
}