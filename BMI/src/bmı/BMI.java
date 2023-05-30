package bmı;

import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        double boy, kilo, index;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Boy (m): ");
        boy = input.nextDouble();
        
        System.out.print("Kilo (kg): ");
        kilo = input.nextDouble();
        
        index = kilo / (boy * boy);
        System.out.println("Vucut Kutle Indeksi: " + index);
    }
    
}
