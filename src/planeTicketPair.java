import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır. */

        Scanner sca = new Scanner(System.in);

        double km,bilet,indBilet;
        int yas,tarife;

        System.out.print("Mesafeyi km cinsinden giriniz: ");
        km = sca.nextDouble();
        System.out.print("Yaşınızı Giriniz: ");
        yas = sca.nextInt();
        System.out.print("Yolculuk tipini giriniz (Tek yön (>1<)  Gidiş dönüş (>2<) ");
        tarife = sca.nextInt();
        bilet = km*0.10;

        if ((yas>0)&&(km>0)){
            if (yas<12){
                indBilet = bilet - (bilet*0.5);
                switch (tarife ){
                    case 1:
                        System.out.println("Bilet ücretiniz: " + indBilet);
                        break;
                    case 2:
                        System.out.println("Bilet ücretiniz: " + (indBilet-(indBilet * 0.2)));
                        break;
                    default:
                        System.out.println("Hatalı giriş yaptınız!");
                }
            }else if ((yas>=12)&&(yas<=24)){
                indBilet = bilet - (bilet * 0.1);
                switch (tarife){
                    case 1:
                        System.out.println("Bilet ücretiniz: " + indBilet);
                        break;
                    case 2:
                        System.out.println("Bilet ücretiniz: " + 2 * (indBilet-(indBilet*0.2)));
                        break;
                    default:
                        System.out.println("Hatalı giriş yaptınız!");
                }
            }else if (yas>65){
                indBilet= bilet - (bilet*0.3);
                switch (tarife){
                    case 1:
                        System.out.println("Bilet ücretiniz: " + indBilet);
                        break;
                    case 2:
                        System.out.println("Bilet ücretiniz: " + (indBilet-(indBilet*0.2)));
                    default:
                        System.out.println("Hatalı giriş yaptınız!");
                }
            }else{
                System.out.println("Bilet ücretiniz: " + bilet);
            }
        } else {
            System.out.println("Hatalı veri girdiniz!");
        }
    }
}
