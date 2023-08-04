import java.util.Scanner;
import java.lang.Math;

public class Main {

    static int numberPattern(int n, int init, boolean flag) {
        // GİRİLEN SAYI İLK OLARAK EKRANA YAZDIRILIR
        System.out.print(n + " ");
        
        if(n > 0 && flag){
            // SAYI 0'DAN BÜYÜKSE SAYIDAN 5 ÇIKARILIR
            n -= 5;
            if(n <= 0){
                // SAYI 0 YA DA DAHA KÜÇÜK BİR DEĞERE SAHİP OLURSA 'flag' KONTROL BAYRAĞI FALSE YAPILIR VE FONKSİYON TEKRAR KENDİNİ ÇAĞIRIR
                flag = false;
                return numberPattern(n, init, flag);
            }
        }else if(n >= 0 && !flag){
            // EĞER SAYI SIFIRDAN BÜYÜK EŞİT VE 'flag' KONTROL BAYRAĞI BAŞLANGIÇ DEĞERİNİN TERSİ İSE
            // (BU DURUMUN GERÇEKLEŞMESİ YUKARIDAKİ IF BLOĞUNA GİRİLMESİ İLE GERÇEKLEŞİR)
            n += 5;
            if(n == init){
                return init;
            }
        }
        else if(n <= 0 && !flag){
            // SAYI 0 YA DA DAHA KÜÇÜK BİR DEĞERE SAHİP OLURSA VE 'flag' KONTROL BAYRAĞI BAŞLANGIÇ DEĞERİNİN TERSİ İSE BU KOŞUL SAĞLANIR VE SAYIYA 5 EKLENİR
            n += 5;
        }
        return numberPattern(n, init, flag);
    }

    public static void main(String[] args) {
        // BAŞLANGIÇ DEĞERLERİ
        int n, init;
        boolean flag = true;
        
        // KULLANICIDAN SAYI ALMA
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        init = n;

        // numberPattern FONKSİYONU ÇAĞRISI
        System.out.println(numberPattern(n, init, flag));
    }
}
