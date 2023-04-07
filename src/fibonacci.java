import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
      Scanner scan = new Scanner(System.in);
        System.out.println("Fibonacci serisi için kaçıncı terimi hesaplamak istersiniz?");
        int n = scan.nextInt();
        scan.close();

        int fib1 = 0; // İlk Fibonacci sayısı
        int fib2 = 1; // İkinci Fibonacci sayısı

        int fibN = 0; // N. Fibonacci sayısı

        System.out.print("Fibonacci serisi: " + fib1 + ", " + fib2 + ", "); // İlk iki sayıyı yazdır

        for (int i = 3; i <= n; i++) {
            fibN = fib1 + fib2; // N. Fibonacci sayısını hesapla
            System.out.print(fibN + ", "); // N. Fibonacci sayısını yazdır

            fib1 = fib2; // İlk sayıyı güncelle
            fib2 = fibN; // İkinci sayıyı güncelle */
        }
    }
}
