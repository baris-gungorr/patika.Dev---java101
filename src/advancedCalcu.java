import java.util.Scanner;

public class Main {

    static void plus() {
        Scanner scan = new Scanner(System.in);
        int n1,n2;
        int islem;
        System.out.println("ilk sayıyı girin");
        n1 = scan.nextInt();
        System.out.println("İkinci sayıyı girin");
        n2 = scan.nextInt();
        islem = n1+n2;
        System.out.println("İşlem sonucu" + islem);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        int n1,n2;
        int islem;
        System.out.println("ilk sayıyı girin");
        n1 = scan.nextInt();
        System.out.println("İkinci sayıyı girin");
        n2= scan.nextInt();
        islem = (n1-n2);
        System.out.println("İşlem sonucu:" + islem);

    }

    static void times() {
       Scanner scan = new Scanner(System.in);
       int a,b;
       int islem;
        System.out.println("Birinci sayı:");
        a = scan.nextInt();
        System.out.println("ikinci sayı:");
        b = scan.nextInt();
        islem = a*b;
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        int a ,b;
        System.out.println("Bölünen sayıyı girin:");
        a = scan.nextInt();
        System.out.println("Bölen sayıyı girin:");
        b = scan.nextInt();
        if (b == 0) {
            System.out.println("Bir sayı 0 a bölünemez.");
        }else {
            System.out.println("Hatalı giriş");
        }
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }

    static void modA(int a, int b) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1.sayıyı giriniz");
        int n1 = scan.nextInt();
        System.out.println("2.sayıyı giriniz");
        int n2 = scan.nextInt();
        int sonuc = 0 ;
        if (n1 > 0 && n2 > 0) {
            sonuc = n1/n2;
        } else if (n2 == 0) {
            System.out.println(" Bir sayı 0 a bölünemez.");
        }else {
            System.out.println("Geçersiz işlem");
        }
        System.out.println("İşlem sonucu" + sonuc );

    }
    static void dikdörtgenAlanCevre(int a,int b){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kısa kenarı giriniz");
        int n1 = scanner.nextInt();
        System.out.println("Uzun kenarı giriniz");
        int n2 = scanner.nextInt();
        int islem;
        if (n1 > 0 && n2 >0){
            islem = 2*(n1+n2);
            System.out.println("Dikdörtgenin alanı:" + islem);

        }else {
            System.out.println("Hatalı giriş");
        }
    }
    public static void main(String[] args) {
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        Scanner scan = new Scanner(System.in);
        int select;

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    modA(0,0);
                    break;
                case 8:
                    dikdörtgenAlanCevre(0,0);
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);

    }
}
