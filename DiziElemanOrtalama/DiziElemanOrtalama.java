
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

public class Main
{
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double total = 0;
        
        for(int n : numbers){
            total += 1/n;
        }
        System.out.print(total);
    }
}
