import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int turkce, mat, fizik, kimya, tarih, muzik;
        double toplam;

        Scanner input = new Scanner(System.in);

        System.out.println("Notlarinizi Giriniz:");

        System.out.print("Turkce: ");
        turkce = input.nextInt();


        System.out.print("Matematik: ");
        mat = input.nextInt();


        System.out.print("Fizik: ");
        fizik = input.nextInt();


        System.out.print("Kimya: ");
        kimya = input.nextInt();


        System.out.print("Tarih: ");
        tarih = input.nextInt();


        System.out.print("Muzik: ");
        muzik = input.nextInt();

        toplam = turkce + mat + fizik + kimya + tarih + muzik;
        System.out.println("Tum Notlarin Ortalamsi: " +  toplam/6);
    }
}
