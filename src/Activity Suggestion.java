import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner sca = new Scanner(System.in);
        System.out.println("><>< Activity Suggestion ><>< ");
        
        int heat;
        System.out.println("Hava sıcaklığını giriniz.");
        heat = sca.nextInt();
        
        if (heat <= 5) {
            System.out.println("Kayak yapabilirsiniz");
       
        } else if (heat<10 &&heat>=5) {
            System.out.println("Sinemaya gidebilirsiniz");
        
        } else if (heat >=10 && heat<= 15) {
            System.out.println("Sinema ve pikniğe gidebilirsiniz");
        
        } else if (heat >=15 && heat<=20) {
            System.out.println("Pikniğe gidebilirsiniz");
        
        } else {
            System.out.println("Yüzmeye gidebilirsiniz");
        }
    }
    }
