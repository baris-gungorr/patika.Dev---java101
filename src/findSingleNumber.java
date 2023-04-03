import java.util.Scanner;
public class Main {
   
  public static void main(String[] args) {
     // tek bir sayı girilene kadar girdi alan ve girilen değerlerden çift ve 4 ün katları olan sayıları toplayıp ekrana basan program 
     
        int n;
        int total = 0;
        Scanner sca = new Scanner(System.in);


        do {
            System.out.println("Sayı girin");
            n = sca.nextInt();
            if (n %2 ==0 && n%4==0) {
                total = total+n;
            }
        }while (n %2 ==0);  // 

        System.out.println("Tek sayıların toplamı: " + total);
    }
}

********************************
// 0 dan büyük olan ve çift olan sayıları toplayan program

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     // tek bir sayı girilene kadar girdi alan ve girilen değerlerden çift ve 4 ün katları olan sayıları toplayıp ekrana basan program

        int n;
        int total = 0;
        Scanner sca = new Scanner(System.in);


        do {
            System.out.println("Sayı girin");
            n = sca.nextInt();
            if (n %2 ==0 ) {
                total = total+n;
            }
        }while (n > 0);  //

        System.out.println("Tek sayıların toplamı: " + total);
    }
}
