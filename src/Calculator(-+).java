import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
      Scanner scan = new Scanner(System.in);
        System.out.println("Hesap Makinesine Hoşgeldiniz ! ");
        int secim;
        int s1,s2;

        System.out.println("İlk sayıyı giriniz: ");
        s1 = scan.nextInt();
        System.out.println(s1);
        System.out.println("İkinci sayıyı giriniz: ");
        s2 = scan.nextInt();
        System.out.println(s2);

        System.out.println("Yapmak istediğiniz işlemi seçiniz..");
        System.out.println("1-> Toplama (+) \n2-> Çıkarma(-) \n3-> Çarpma(*) \n4-> Bölme(/) ");
        secim = scan.nextInt();

        switch (secim) {
            case 1:
                System.out.println(s1+s2);
                break;
            case 2:
                System.out.println(s1-s2);
                break;
            case 3:
                System.out.println(s1*s2);
                break;
            case 4:
                if (s2 == 0) {
                    System.out.println("Bir sayı sıfıra bölünemez !");
                }else {
                    System.out.println(s1/s2);
                    break;
                }
            default:
                System.out.println("Tam bölünemez iki sayı girdiniz \nEksik veya hatalı tuşlama yaptınız !");
        }
        }
    }
