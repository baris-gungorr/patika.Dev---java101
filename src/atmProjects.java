import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String kAdi,password;
        int right = 3;
        int balance = 5000;
        int select;
        
        while (right >0) {
            System.out.println("Kullanıcı adını girin");
            kAdi = sca.nextLine();
            System.out.println("Parola girin");
            password = sca.nextLine();

            if (kAdi.equals("java")&&password.equals("123")) {
                System.out.println("Başarılı giriş \nBG bank'a hoş geldiniz");
            do {
                System.out.println("Yapmak istediğiniz işlem nedir ? ");
                System.out.println("1-)Para yatırma");
                System.out.println("2-)Para çekme");
                System.out.println("3-)Bakiye sorgulama");
                System.out.println("4-Çıkış");
                select = sca.nextInt();

              //  if (select ==1) {
                switch (select){
                    case 1:
                    System.out.print("Yatırmak istediğiniz tutar nedir ? ");
                    int price = sca.nextInt();
                    System.out.println("*İşlem öncesi tutar: " + balance);
                    System.out.println("**Güncel bakiye: " + (balance=balance+price));
                    System.out.println("***Yatırılan tutar:" + price);
                    break;
               // } else if (select ==2) {
                    case 2:
                        System.out.print("Çekmek istediğiniz tutar nedir ?");
                     price = sca.nextInt();

                   if (price > balance) {
                       System.out.println("Yetersiz bakiye !");
                       System.out.println("Bakiyeniz: " + balance);
                   }else {
                       System.out.println("Güncel bakiye: "+ (balance = balance-price));
                       System.out.println("Çekilen tutar: " + price);
                   }
                   break;

                // } else if (select == 3) {
                    case 3:
                    System.out.println("Bakiyeniz: " + balance);
                        break;
                }
                }while (select != 4);
                System.out.println("Sistemden Çıkılıyor...");
                System.out.println("Sağlıcakla kalın");

                break;
            }else {
                --right;
               // System.out.println("Hatalı giriş " + right + " hakkınız kaldı");

            } if (right == 0) {
                System.out.println("Hesabınız bloke olmuştur banka ile iletişime geçiniz");
            }else {
                System.out.println("Kalan hakkınız: " + right);
            }
        }
    }
}
