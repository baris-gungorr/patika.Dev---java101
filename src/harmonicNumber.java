import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     
      Scanner input = new Scanner(System.in);
        System.out.print("N sayısını giriniz: ");
        double sayi= input.nextDouble();
        double sonuc =0.0;
        for (double i =1; i<=sayi; i++){
            sonuc += (1/i);
        }
        System.out.print(sonuc);
    }
}
