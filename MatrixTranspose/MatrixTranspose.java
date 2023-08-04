import java.util.Arrays;
import java.util.Scanner;
public class Main {
    // MATRİSİ EKRANA YAZDIRAN FONKSİYON
    public static void print(int[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    // MATRİS TRASNPOZUNU BULAN FONKSİYON
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
        // MATRİS BOYUTLARI, 2 SATIR VE 3 SÜTUN
        int row = 2, col = 3;

        // İKİ BOYUTLU DİZİ OLUŞTURMA
        int[][] matrix = new int[row][col];

        // DÖNGÜ İLE 2x3 BOYUTLARINDAKİ MATRİSİN SATIR VE SÜTUNLARINI 0-100 ARASI RASTGELE SAYILAR İLE DOLDURMA İŞLEMİ YAPILIR
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = (int)(Math.random() * 100);
            }
        }

        print(matrix);

        matrixTranspose(matrix, row, col);




    }
}
