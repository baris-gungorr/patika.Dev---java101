import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     
      Scanner scan = new Scanner(System.in);
      double boy;
      double kilo;
      double bmı;

      System.out.println("Boyunuzu girin");
      boy = scan.nextDouble();
      System.out.println("Boyunuz: " + boy);
      System.out.println("Kilonuzu girin");
      kilo = scan.nextDouble();
      System.out.println("Kilonuz: " + kilo);

         bmı = kilo / (boy*boy);

        if (bmı >= 0 && bmı <= 18) {
            System.out.println("Zayıf");
        } else if (bmı >= 18 && bmı <= 24) {
            System.out.println("Normal ağırlık");
        } else if (bmı >=25 && bmı <=30) {
            System.out.println("Kilolu");
        } else if (bmı >= 30 && bmı <= 35) {
            System.out.println("1.Derece obezite");
        } else if (bmı >=35 && bmı <= 40) {
            System.out.println("2.Derece obezite");
        }else if (bmı >= 30) {
            System.out.println("Profesyonel bir destek alın.");
        }
        System.out.println("Beden kitle endeksiniz: " + bmı);
    }
}
