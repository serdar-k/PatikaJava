// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void print(int[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void matrixTranspose(int[][] matrix, int row, int column){
        int[][] matrixTranspose = new int[column][row];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                matrixTranspose[j][i] = matrix[i][j];
            }
        }
        print(matrixTranspose);

    }

    public static void main(String[] args) {
        int row = 2, col = 3;

        int[][] matrix = new int[row][col];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = (int)(Math.random() * 100);
            }
        }

        print(matrix);

        matrixTranspose(matrix, row, col);




    }
}