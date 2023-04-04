import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       /* Scanner sca = new Scanner(System.in);
        System.out.println("Sayı girin");
        int n = sca.nextInt();
        int total = 1;

        int i = 1;
        while ( i<=n) {
            total = total*i;
        i++;
        }
        System.out.println("Faktöriyel: " + total); */

        int n, r, nFac = 1, rFac = 1, subFac = 1, fac;

        Scanner input = new Scanner(System.in);
        System.out.print("Kümenin eleman sayısını giriniz: ");
        n = input.nextInt();
        System.out.print("Kombinasyon oluşturulacak eleman sayısını giriniz: ");
        r = input.nextInt();

        int sub = n - r;
        for (int i = 1; i <= n; i++) {
            nFac = nFac * i;
        }
        for (int i = 1; i <= r; i++) {
            rFac = rFac * i;
        }
        for (int i = 1; i <= sub; i++) {

        }
    }
}
