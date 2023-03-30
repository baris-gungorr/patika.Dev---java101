import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("><>< Activity Suggestion ><>< ");
        int heat;
        System.out.println("Hava sıcaklığını giriniz.");
        heat = sca.nextInt();

        if (heat <= 5) {
            System.out.println("Kayak etkinliği");
        } else if (heat <= 25) {
            if (heat <= 15) {
                System.out.println("Sinemaya gidebilirsiniz");
            }
                if (heat >= 10) {
                    System.out.println("Pikniğe gidebilirsiniz");

                } else {
                    System.out.println("Yüzmeye gidebilirsiniz");
                }
            }
        }
    }
