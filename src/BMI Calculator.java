import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
        double sonuc;

        double boy;
        System.out.println("Boy bilginizi cm cinsinden yazınız (182): ");
        boy = input.nextDouble();
        System.out.println("Girilen boy: " +boy);

        double kilo;
        System.out.println("Kilo bilginizi km cinsinden giriniz: ");
        kilo = input.nextDouble();
        System.out.println("Girdiğiniz kilo: " + kilo);


         sonuc = kilo/(boy * boy);


        System.out.println("Boyunuz: " + boy);
        System.out.println("Kilonuz: " + kilo);


        System.out.println("Vücut kitle endeksiniz: " + sonuc); 

    }
}
