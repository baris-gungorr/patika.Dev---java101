import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Kullanıcıdan Mesafe (KM), Yaş ve Yolculuk Tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın
        System.out.print("Mesafeyi km türünden giriniz: ");
        int mesafe = input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        int yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş-Dönüş): ");
        int yolculukTipi = input.nextInt();

        // Hatalı veri girişi kontrolü
        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }

        // Mesafe başına ücret 0,10 TL / km olarak alınır.
        double birimFiyat = 0.10;
        double toplamFiyat = mesafe * birimFiyat;

        // Yaşa göre indirim uygulanır
        if (yas < 12) {
            toplamFiyat *= 0.5; // %50 indirim
        } else if (yas >= 12 && yas <= 24) {
            toplamFiyat *= 0.9; // %10 indirim
        } else if (yas >= 65) {
            toplamFiyat *= 0.7; // %30 indirim
        }

        // Yolculuk tipine göre indirim uygulanır
        if (yolculukTipi == 2) {
            toplamFiyat *= 2; // normal fiyatın 2 katı
            toplamFiyat *= 0.8; // %20 indirim
        }

        // Sonuçları ekrana yazdırın
        System.out.println("Toplam Tutar: " + toplamFiyat + " TL");
    }
}


