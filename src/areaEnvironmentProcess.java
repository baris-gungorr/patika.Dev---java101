import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int r;
        double pi = 3.14;

        System.out.println("Yarıçap giriniz");
        r = input.nextInt();

        double alan = (pi*r*r);
        double cevre = (2*pi*r);

        System.out.println("alan: " + alan);
        System.out.println("Çevre: " + cevre); 

       /* Ödev
        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

        𝜋 sayısını = 3.14 alınız.

                Formül : (𝜋 * (r*r) * 𝛼) / 360 */
        
        Scanner input1 = new Scanner(System.in);
        int rr;
        int a;
        double pii = 3.14;
        
        System.out.println("Yarıçap giriniz.");
        rr = input1.nextInt();
        System.out.println(rr);

        System.out.println("Merkez açısının ölçüsünü girin");
        a = input1.nextInt();
        System.out.println(a);

        double formül = ((pii*(rr*rr)*a)/360);

        System.out.println("Daire diliminin alanı: " + formül);

    }
}
