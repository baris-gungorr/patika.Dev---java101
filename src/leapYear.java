import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     
      Scanner sca = new Scanner(System.in);
        int grlnYil;
        System.out.println("Artık Yıl Hesaplayıcı:");
        System.out.println("Yıl giriniz:");
        grlnYil = sca.nextInt();

        if (grlnYil%400==0){
            System.out.println(grlnYil+" bir artık yıldır!");
        }else{
            if (grlnYil%100!=0 && grlnYil%4==0){
                System.out.println(grlnYil+" bir artık yıldır!");
            }else{
                System.out.println(grlnYil+" bir artık yıl değildir!");
            }
        }
    }
}
