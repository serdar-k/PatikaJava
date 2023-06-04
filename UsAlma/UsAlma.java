public class Main {

    public static void main(String[] args) {
        int number, power, result = 1;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Taban: ");
        number = input.nextInt();
        
        System.out.print("Us: ");
        power = input.nextInt();
        
        for(int i = 0; i < power; i++){
            result = result * number;
        }
        
        System.out.println(result);
    }
}
