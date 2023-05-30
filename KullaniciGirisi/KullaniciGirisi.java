
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, userPass;
        
        System.out.print("User Name: ");
        userName = input.next();
        
        System.out.print("Password: ");
        userPass = input.next();
        
        if(userName.equals("Serdar") && userPass.equals("101318")){
            System.out.println("You are logged in!");
        }else{
            System.out.println("Incorrect user name or password!");
        }
    }
}
