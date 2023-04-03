import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sınır sayısı giriniz: ");
        int a = input.nextInt();

        int i = 1, j = 1;
        while (i <= a && j <= a) {
            System.out.println(i + " " + j);
            i *= 4;
            j *= 5;

        }
    }
}
