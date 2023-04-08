import java.util.Scanner;
public class Main {
    public static int usHesapla(int taban, int us) {
        if (us == 0) { // üs 0 ise sonuç 1'dir
            return 1;
        } else if (us % 2 == 0) { // üs çift sayı ise
            int yariUsSonuc = usHesapla(taban, us / 2);
            return yariUsSonuc * yariUsSonuc;
        } else { // üs tek sayı ise
            return taban * usHesapla(taban, us - 1);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Tabanı girin: ");
        int taban = scanner.nextInt(); // Kullanıcıdan taban değerini al
        System.out.print("Üssü girin: ");
        int us = scanner.nextInt(); // Kullanıcıdan üs değerini al

        int sonuc = usHesapla(taban, us);
        System.out.println(taban + "^" + us + " = " + sonuc);

        scanner.close(); // Scanner nesnesini kapat

    }
}
