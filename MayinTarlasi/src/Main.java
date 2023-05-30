// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MineSweeper ms = new MineSweeper();
        ms.mineAreaCreator(6,6);
        ms.printMineArea();

        int userRow = 0, userColumn = 0;

        while(ms.isGameOver()){
            Scanner input = new Scanner(System.in);
            System.out.print("Satir: ");
            userRow = input.nextInt();
            System.out.print("Sutun: ");
            userColumn = input.nextInt();

            ms.userSelect(userRow, userColumn);
            ms.printMineArea();
        }
    }
}