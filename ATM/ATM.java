import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int girisHakki = 3;
        int bakiye = 1500;
        int secim;

        Scanner input = new Scanner(System.in);

        while(girisHakki > 0){
            System.out.print("Kullanici Adi: ");
            String username = input.nextLine();
            System.out.print("Parola: ");
            String password = input.nextLine();

            if(username.equals("patika") && password.equals("dev123")){
                System.out.println("Merhaba, Kodluyoruz Bankasina Hos Geldiniz!");

                do {
                    System.out.println("Bir Islem Secin");
                    System.out.println("Para Yatir: 1\n" + "Para Cek: 2\n" + "Bakiye Sorgula: 3\n" + "Cikis: 4");
                    secim = input.nextInt();

                    switch(secim){
                        case 1:
                            System.out.print("Yatirilacak Miktar: ");
                            int yatirilacak = input.nextInt();
                            bakiye += yatirilacak;
                            break;
                        case 2:
                            System.out.print("Cekilecek Miktar: ");
                            int cekilecek = input.nextInt();
                            if(cekilecek > bakiye){
                                System.out.println("Yetersiz Bakiye!");
                            }else{
                                bakiye -= cekilecek;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + bakiye);
                            break;
                    }
                }while(secim != 4);
                System.out.println("Cikis Yapiliyor...");
                break;
            }else{
                System.out.println("Hatali Kullanici Adi veya Sifre!");
                girisHakki--;
                if(girisHakki == 0){
                    System.out.println("Hesabiniz Bloke Edildi! Lutfen Banka Ile Iletisime Gecin!");
                }else{
                    System.out.println("Kalan Giris Hakkiniz: " + girisHakki);
                }
            }
        }
    }
}