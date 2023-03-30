import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        double armut,elma,domates,muz,patlıcan;
        double armutFiyat =2.14, elmaFiyat = 3.67 , domatFiyat =1.11, muzFiyat = 0.95,patliFiyat = 5.00;
        double islem;

        System.out.print("Armut kaç kilo: ");
        armut = girdi.nextDouble();
        System.out.println(armut);

        System.out.print("Elma kaç kilo: ");
        elma= girdi.nextInt();
        System.out.println(elma);

        System.out.print("Domates kaç kilo: ");
        domates = girdi.nextInt();
        System.out.println(domates);

        System.out.print("Muz kaç kilo: ");
        muz = girdi.nextInt();
        System.out.println(muz);

        System.out.print("Patlıcan kaç kilo: ");
        patlıcan = girdi.nextInt();
        System.out.println(patlıcan);

        islem = (armut*armutFiyat) + (elmaFiyat*elma)+(domates*domatFiyat)+(muz*muzFiyat) + (patlıcan*patliFiyat);

        double toplam = (armut+elma+domates+muz+patlıcan);
       
        System.out.println("Toplam kg : " + toplam + " kg 'dir ");
        System.out.println("Toplam tutar: " + islem + " tl'dir");
        
    }
}
