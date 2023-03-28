import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a,b;
        double c;

        // Kullanıcıdan dik kenarların uzunluğunu alan ve hipotenüsü hesaplayan program
        // Hipotenüs: Bir dik üçgendeki 90 a karşılık gelen kenarın uzunluğudur.
        // > Kullanıcıdan dik kenarların (a-b) uzunluğu alınacak ve hipotenüsü hesaplanacaktır

        System.out.println("Birinci kenarı girin");
        a = input.nextInt();
        System.out.println("İkinci kenarı girin");
        b = input.nextInt();

        //c = (a*a)+(b*b); a ve b'nin karesini bu şekilde alabiliriz ancak bu bize c 'nin karesini vermiyor.Bunun için Math sınıfı kullanacağız

        c = Math.sqrt((a*a)+(b*b));  //bir sayının Karekökünü almak için kullanıyoruz

        System.out.println("Hipotenüs: " + c);

        System.out.println("*****************************************");
        System.out.println("*****************************************");

        /* Ödev
        Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

        Formül
        Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

                𝑢 = (a+b+c) / 2

        Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐) */

        Scanner inputt = new Scanner(System.in);
        int x,y,z;
        System.out.println("Birinci kenar uzunluğunu girin");
        x = input.nextInt();
        System.out.println("İkinci kenar uzunluğunu girin");
        y = input.nextInt();
        System.out.println("Üçüncü kenar uzunluğunu girin");
        z= input.nextInt();

        double u = (x+y+z) /2;
        System.out.println("Üçgenin çevresi: " + 2*u);

        double alan;
        alan = Math.sqrt(u*(u-x)*(u-y)*(u-z));
        System.out.println("Üçgenin alanı: " + alan);
        
    }
}
