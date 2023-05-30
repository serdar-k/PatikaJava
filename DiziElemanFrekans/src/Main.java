import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] numberArray = {10, 20, 20, 10, 10, 20, 5, 20, 0, 0, 0};

        int counter = 0;

        for (int i = 0; i < numberArray.length; i++) {
            for (int j = 0; j < numberArray.length; j++) {
                if (numberArray[i] == numberArray[j]) {
                    if (i > j) {
                        break;
                    }
                    counter += 1;
                }
            }
            if (counter > 0) {
                System.out.println(numberArray[i] + " " + "Elemani" + " " + counter + " " + "Kere Tekrar Edildi!");
            }
            counter = 0;
        }
    }
}