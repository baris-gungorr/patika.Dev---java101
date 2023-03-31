import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int s1, s2, s3;

        Scanner sca = new Scanner(System.in);
        System.out.println("s1 'i giriniz: ");
        s1 = sca.nextInt();
        System.out.println(s1);

        System.out.println("s2 'i giriniz: ");
        s2 = sca.nextInt();
        System.out.println(s2);

        System.out.println("s3 'ü  giriniz: ");
        s3 = sca.nextInt();
        System.out.println(s3);
                                                      
        if ((s1 < s2) && (s1 < s3)) {                 
      if ( s2 < s3) {                                
          System.out.println("s1 < s2 < s3");
      }else {
          System.out.println("s1 < s3 < s2");      
      }

        } else if ((s2>s1) && (s2 < s3)) {             
            if ( s1 < s3) {                           
                System.out.println("s2 < s1 < s3");
            }else {
                System.out.println(" s2 < s3 < s1");   
            }
        }else {
            if (s1 < s2) {
                System.out.println("s3 < s1 < s2");    
            }else {
                System.out.println("s3 < s2 < s1");    
            }
        }
        }
    }
