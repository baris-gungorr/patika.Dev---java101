import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     int matematik,fizik,kimya,turkce,tarih,müzik;

     Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunu giriniz");
        matematik = input.nextInt();
        System.out.println("Matematik notu: " + matematik);

        System.out.println("Fizik notunu giriniz");
        fizik = input.nextInt();
        System.out.println("Fizik notu: " +fizik);

        System.out.println("Kimya notunu giriniz");
        kimya = input.nextInt();
        System.out.println("Kimya notunuz: " +kimya);

        System.out.println("Türkçe notunu giriniz");
        turkce = input.nextInt();
        System.out.println("Türkçe notunuz: "+turkce);

        System.out.println("Tarih notunu giriniz");
        tarih = input.nextInt();
        System.out.println("Tarih notunuz: "+tarih);

        System.out.println("Müzik notunu giriniz");
        müzik = input.nextInt();
        System.out.println("Müzik notunuz: " +müzik);

        double ortalama = (matematik+fizik+kimya+turkce+tarih+müzik) /6.0;

        System.out.println("Not ortalamanız: " + ortalama);


       System.out.println(ortalama >= 60 ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız");





    }
}