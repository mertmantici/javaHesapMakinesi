package hesapmakinesi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean dongu = true;
        Scanner scan = new Scanner(System.in);

        while (dongu) {
            int sayi1, sayi2;
            char secim;

            System.out.print("\n1- Toplama \n2- Çıkarma \n3- Çarpma \n4- Bölme \n5- Üslü Sayı \n6- Karekök \nq- Çıkış");
            System.out.print("\nLütfen yapmak istediğiniz işlemi seçiniz : ");
            secim = scan.next().charAt(0);

            switch (secim) {
                case '1':
                    System.out.print("Lütfen 1. sayıyı giriniz : ");
                    sayi1 = scan.nextInt();
                    System.out.print("Lütfen 2. sayıyı giriniz : ");
                    sayi2 = scan.nextInt();
                    System.out.println("Toplama işleminin sonucu = " + (sayi1 + sayi2));
                    break;
                case '2':
                    System.out.print("Lütfen 1. sayıyı giriniz : ");
                    sayi1 = scan.nextInt();
                    System.out.print("Lütfen 2. sayıyı giriniz : ");
                    sayi2 = scan.nextInt();
                    System.out.println("Çıkarma işleminin sonucu = " + (sayi1 - sayi2));
                    break;
                case '3':
                    System.out.print("Lütfen 1. sayıyı giriniz : ");
                    sayi1 = scan.nextInt();
                    System.out.print("Lütfen 2. sayıyı giriniz : ");
                    sayi2 = scan.nextInt();
                    System.out.println("Çarpma işleminin sonucu = " + (sayi1 * sayi2));
                    break;
                case '4':
                    System.out.print("Lütfen 1. sayıyı giriniz : ");
                    sayi1 = scan.nextInt();
                    System.out.print("Lütfen 2. sayıyı giriniz : ");
                    sayi2 = scan.nextInt();
                    if (sayi2 == 0) {
                        System.out.println("Bölme işleminde payda 0 olduğu için sonuç belirsizdir.");
                    } else {
                        System.out.println("Bölme işleminin sonucu = " + ((double) sayi1 / sayi2));
                    }
                    break;
                case '5':
                    System.out.print("Lütfen taban sayıyı giriniz : ");
                    sayi1 = scan.nextInt();
                    System.out.print("Lütfen üs sayıyı giriniz : ");
                    sayi2 = scan.nextInt();
                    int sonuc = UstHesapla(sayi1, sayi2);
                    System.out.println("İşlemin sonucu = " + sonuc);
                    break;
                case '6':
                    System.out.print("Lütfen karekökünü almak istediğiniz sayıyı giriniz : ");
                    sayi1 = scan.nextInt();
                    double karekok = Math.sqrt(sayi1);
                    System.out.println("İşlemin sonucu = " + karekok);
                    break;
                case 'q':
                    System.out.println("Çıkış yapılıyor...");
                    dongu = false;
                    scan.close();
                    break;
                default:
                    System.out.println("Lütfen geçerli bir işlem giriniz ...");
            }

            // Döngüye gecikme eklemek için
            try {
                Thread.sleep(1000); // 1 saniye gecikme
            } catch (InterruptedException e) {
                System.out.println("Gecikme sırasında hata oluştu: " + e.getMessage());
            }
        }
    }

    private static int UstHesapla(int taban, int us) {
        if (us > 0) {
            return taban * UstHesapla(taban, us - 1);
        } else {
            return 1;
        }
    }
}
