import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
      /* "total" değişkenini 1 ile başlatmamız önemlidir. Böylece ilk çarpma işlemi doğru şekilde gerçekleştirilir.
        Üs işleminin matematiksel açıklaması, "n" sayısının "r" kez kendisiyle çarpılmasıdır. Bu nedenle,
        döngüde "total" değişkeni "n" ile güncellenirken,her seferinde kendisiyle değil, "n" ile çarpılır.
        */
        Scanner sca = new Scanner(System.in);
        System.out.print("üssü alınacak sayı ");
        int n = sca.nextInt();
        System.out.print("üs olacak sayı ");
        int r = sca.nextInt();
        int total = 1;

        for (int i = 1; i<=r;i++) {
        total = total*n;
        }
        System.out.println("Cevap: "  +total);

        }
    }
