import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);

         System.out.println("1.sayıyı girin");
        int n1 = scan.nextInt();
        System.out.println("İkinci sayıyı girin");
        int n2 = scan.nextInt();
        int ebob = 1;

        int i = 1;
        while (i <= n1 * n2) {
            if (i % n1 == 0 && i % n2 == 0) {
                System.out.println(i);
                break;
            }
            i++;
        }
     
      int k = 1;
        while (i <= n1) {
            if (n1 % k == 0 && n2 % k == 0) {
                ebob = k;
            }
            k++;
        }
        
    }
    }
