import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      /*  double tutar;
        double kdvOranı =0.18;

        Scanner scan = new Scanner(System.in);
        System.out.println("Tutarı giriniz");
        tutar = scan.nextDouble();

        double kdvTutarı = tutar*kdvOranı;

        System.out.println("Kdv uygulanmış hali: " + (kdvTutarı+tutar));
        System.out.println("Kdvsiz fiyat: " + tutar);
        System.out.println("Kdv oranı: " + kdvOranı);
        System.out.println("Kdv tutarı: "+ kdvTutarı);*/

        /* Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
        tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız. */

        Scanner input = new Scanner(System.in);
        double tutar;
        double kdvOran;
        double kdvTutar;
        double kdvLiTutar;

        System.out.println("Tutarı giriniz: ");
        tutar = input.nextDouble();

        kdvOran = (tutar>0) && (tutar <1000) ? 0.18 :0.8;
        kdvTutar = (tutar*kdvOran);
        kdvLiTutar = tutar+kdvTutar;

        System.out.println("Kdv'li tutar: " +kdvLiTutar);
        System.out.println("Kdv tutarı: " + kdvTutar);
        System.out.println("Kdv oranı: " + kdvOran);

    }
}