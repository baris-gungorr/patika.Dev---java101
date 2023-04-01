import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int dgYil;
        System.out.println("Çin zodyağı hesaplayıcı:");
        System.out.println("Doğum yılınızı girin");
        dgYil = sca.nextInt();

        if (dgYil>1) {
           if (dgYil %12 == 0){
               System.out.println("Çin astrolojisine göre burcunuz Maymun");
           } else if (dgYil %12 ==1) {
               System.out.println("Çin astrolojisine göre burcunuz Horoz");

           }else if (dgYil %12 ==2) {
               System.out.println("Çin astrolojisine göre burcunuz Köpek");

           }else if (dgYil %12 ==3) {
               System.out.println("Çin astrolojisine göre burcunuz Domuz");

           }else if (dgYil %12 ==4) {
               System.out.println("Çin astrolojisine göre burcunuz Fare");

           }else if (dgYil %12 ==5) {
               System.out.println("Çin astrolojisine göre burcunuz Öküz");

           }else if (dgYil %12 ==6) {
               System.out.println("Çin astrolojisine göre burcunuz Kaplan");

           }else if (dgYil %12 ==7) {
               System.out.println("Çin astrolojisine göre burcunuz Tavşan");

           }else if (dgYil %12 ==8) {
               System.out.println("Çin astrolojisine göre burcunuz Ejderha");

           }else if (dgYil %12 ==9) {
               System.out.println("Çin astrolojisine göre burcunuz Yılan");

           }else if (dgYil %12 ==10) {
               System.out.println("Çin astrolojisine göre burcunuz At");

           }else if (dgYil %12 ==11) {
               System.out.println("Çin astrolojisine göre burcunuz Koyun");

           }
        } else {
            System.out.println("Hatalı yıl girişi \n 0+ sayı giriniz");
        }
        }

    }


