import java.util.Scanner;
public class Main {

    public static void arraySort(int[] array){
        int min = array[0];
        int temp;
        // İÇ İÇE OLAN DÖNGÜ YAPISI; İLK DÖNGÜ İLE SIRALANMAMIŞ DİZİDEKİ İLK ELEMAN SEÇİLİR
        for(int i = 0; i < array.length; i++){
            // İKİNCİ DÖNGÜ; SEÇİLEN İLK ELEMAN İLE DİZİDEKİ DİĞER ELEMANLARI TEK TEK KARŞILAŞTIRIR
            for(int j = i; j < array.length; j++){
                if(array[i] > array[j]){
                    // İLK DÖNGÜDE SEÇİLEN DİZİ ELEMANI, İKİNCİ DÖNGÜDE KARŞILAŞTIRILDIĞI DİZİ ELEMANINDAN BÜYÜK İSE BİR YER DEĞİŞTİRME İŞLEMİ YAPILIR
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // KULLANICI GİRİŞLERİ VE BAŞLANGIÇ DEĞERLERİ
        Scanner input = new Scanner(System.in);
        System.out.print("Dizi Boyutunu Girin: ");
        int arraySize = input.nextInt();
        int i = 0, temp;

        int[] numberArray = new int[arraySize];

        while(arraySize > 0){
            i++;
            System.out.print("Dizinin " + i + ". Elemanini Girin: ");
            int inputNumber = input.nextInt();
            numberArray[i-1] = inputNumber;
            arraySize--;
        }

        arraySort(numberArray);

        for(int value : numberArray){
            System.out.print(value + " ");
        }
    }
}
