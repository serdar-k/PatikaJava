// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String[][] letter = new String[7][3];

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (j == 0) {
                    letter[i][j] = "*   ";
                }
                if (i % 3 == 0 && j == 1) {
                    letter[i][j] = "* * *";

                }

                if((i == 1 || i== 2 || i== 4 || i== 5) && (j == 1)){
                    letter[i][j] = "    ";
                }
                if ((i != 3 || i != 6) && j == 2) {
                    letter[i][j] = "    *   ";
                }
                if(j == 2 && ((i==0) || (i==3) || (i == 6))){
                    letter[i][j] = "";
                }
            }
        }

        for (String[] row : letter) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}