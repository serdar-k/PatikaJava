public class MineSweeper {
    int row;
    int column;
    String[][] mineArea;
    String[][] tempCoords;
    int mineQuantity;
    int userRight;
    int randomMineRow = 0;
    int randomMineColumn = 0;


    public void mineAreaCreator(int row, int column) {
        this.row = row;
        this.column = column;

        String[][] mineArea = new String[row][column];
        String[][] tempCoords = new String[row][column];

        this.mineArea = mineArea;
        this.tempCoords = tempCoords;

        mineQuantity = (row * column) / 4;
        userRight = (row * column) - mineQuantity;


        for (int i = 0; i < mineArea.length; i++) {
            for (int j = 0; j < mineArea[i].length; j++) {
                mineArea[i][j] = "-";
                tempCoords[i][j] = "-";
            }
        }

        for (int i = 0; i < mineQuantity; i++) {
            randomMineRow = (int) (Math.random() * row);
            randomMineColumn = (int) (Math.random() * column);
            tempCoords[randomMineRow][randomMineColumn] = ("*");
        }
        System.out.println(randomMineRow + " " + randomMineColumn);
    }

    public void printMineArea() {
        for (String[] r : mineArea) {
            for (String c : r) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public void userSelect(int row, int column) {
        int mineCounter = 0;
        if (row <= this.row && column <= this.column) {
            if (tempCoords[row][column].equals("*")) {
                System.out.println("Oyun Bitti! Mayina Bastin!");
                mineArea = tempCoords;
                userRight = 0;
            } else {
                if (row - 1 >= 0) {
                    if (tempCoords[row - 1][column].equals("*")) {
                        mineCounter++;
                    }
                }
                if (column - 1 >= 0) {
                    if (tempCoords[row][column - 1].equals("*")) {
                        mineCounter++;
                    }
                }
                if (row - 1 >= 0 && column - 1 >= 0) {
                    if (tempCoords[row - 1][column - 1].equals("*")) {
                        mineCounter++;
                    }
                }
                if (row + 1 < mineArea.length) {
                    if (tempCoords[row + 1][column].equals("*")) {
                        mineCounter++;
                    }
                }
                if (column + 1 < mineArea[row].length) {
                    if (tempCoords[row][column + 1].equals("*")) {
                        mineCounter++;
                    }
                }
                if (row + 1 < mineArea.length && column + 1 < mineArea[row].length) {
                    if (tempCoords[row + 1][column + 1].equals("*")) {
                        mineCounter++;
                    }
                }
                if (row + 1 < mineArea.length && column - 1 >= 0) {
                    if (tempCoords[row + 1][column - 1].equals("*")) {
                        mineCounter++;
                    }
                }
                if (row - 1 >= 0 && column + 1 < mineArea[row].length) {
                    if (tempCoords[row - 1][column + 1].equals("*")) {
                        mineCounter++;
                    }
                }
                if(true){
                    if(mineCounter > 0){
                        mineArea[row][column] = Integer.toString(mineCounter);
                    }else{
                        mineArea[row][column] = "0";
                        System.out.println("SIFIR AQ");
                    }
                }
                userRight--;
            }
        } else {
            System.out.println("Satir ve Sutun Sinirlari Icerisinde Deger Giriniz!");
        }
    }

    public boolean isGameOver() {
        if (userRight == 0) {
            return false;
        }
        return true;
    }
}
