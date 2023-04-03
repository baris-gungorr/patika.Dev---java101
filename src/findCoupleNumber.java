import java.util.Scanner;
public class Main {
   
  public static void main(String[] args) {
      int j ;
      Scanner sca = new Scanner(System.in);
        System.out.print("Sayı giriniz");
        j = sca.nextInt();

        int i = 0;
        while (i<=j) {
            if (i %2 == 0) {
                System.out.print(" " +i);
            }
            i++;
        }

        // ÖDEV
       /* j = sca.nextInt();
        int i = 0;
        while (i<=j) {
            if (i % 3 ==0 && i % 4 == 0)  {

                System.out.print(i+" ");
                }
                i++;
            } */
        
        }
    }
