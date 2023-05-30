import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static boolean isFind(int[] array, int number) {
        for (int value : array) {
            if (value == number) {
                return true;
            }
        }
        return false;
    }

    public static void showEvenNumbers(int[] array){
        for(int value : array){
            if(value % 2 == 0 && value != 0){
                System.out.print(value + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] numberArray = {21, 17, 92, 1, 1, 100, 50, 100, 64, 17, 27, 21, 48, 100};
        int[] tempArray = new int[numberArray.length];
        int startIndex = 0;

        for (int i = 0; i < numberArray.length; i++) {
            for (int j = i + 1; j < numberArray.length; j++) {
                if (numberArray[i] == numberArray[j]) {
                    if (!isFind(tempArray, numberArray[j])) {
                        tempArray[startIndex++] = numberArray[j];
                    }
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(tempArray));
        showEvenNumbers(tempArray);
    }
}