import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     
      /*  Taksimetre Programı
        Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

      ->  Taksimetre KM başına 2.20 TL tutmaktadır.
       ->  Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        -> Taksimetre açılış ücreti 10 TL'dir. */

     Scanner input = new Scanner(System.in);
     int kmBigisi;
     double kmP = 2.20;
     double total;
     int startPrice = 10;


     System.out.println("Mesafeyi km cinsinden girin: ");
     kmBigisi = input.nextInt();

     total = (kmBigisi*kmP);
     total = total+startPrice;

        total =(total<20) ? 20 : total;

        System.out.println("Ödeyeceğiniz ücret: " + total);
    }
}
