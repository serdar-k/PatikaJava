import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        int num1, num2;
        String userChoice, userName;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("First Number: ");
        num1 = input.nextInt();
        
        System.out.print("Second Number: ");
        num2 = input.nextInt();
        
        System.out.println("Choose the arithmetic operation:"
                + "\n Addition: 1"
                + "\n Subtraction: 2"
                + "\n Multiply: 3"
                + "\n Divide: 4");
                
        userChoice = input.next();
                
        switch(userChoice){
            case("1"):
                System.out.println(num1 + num2);
                break;
            case("2"):
                System.out.println(num1 - num2);
                break;
            case("3"):
                System.out.println(num1 * num2);
                break;
            case("4"):
                switch(num2){
                    case(0):
                        System.out.println("Divided by zero error!");
                        break;
                    default:
                        System.out.println(num1 / num2);
                }
                break;
            default:
                System.out.println("Please Try Again!");
        }
    }
}
