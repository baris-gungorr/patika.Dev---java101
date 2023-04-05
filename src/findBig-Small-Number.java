import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n ;
        int number;
        int min = 0;
        int max = 0;

        Scanner sca = new Scanner(System.in);
        System.out.println("Kaç sayı girmek istiyorunuz");
        n = sca.nextInt();

        for (int i = 1; i<= n; i++) {
            System.out.println( i + ". sayıyı girin");
            number = sca.nextInt();

            if (number > max) {
                max = number;
            }
            if (number < min || min == 0) {
                  min = number;
            }

        }
        System.out.println("En küçük eleman: " +min);
        System.out.println("En büyük eleman: " + max);

    }
}
