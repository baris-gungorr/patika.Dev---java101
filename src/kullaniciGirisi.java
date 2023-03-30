import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       
        /* Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,eğer kullanıcı sıfırlamak isterse yeni
          girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,şifreler aynı ise ekrana
          "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız. */

        Scanner sca = new Scanner(System.in);
        String userName = "patika";
        String password = "java123";
        String s1 = "E";
        String k1;
        String p1;
        String c1;

        System.out.println("Kullanıcı adı giriniz");
        userName = sca.nextLine();
        System.out.println(userName);

        System.out.println("Parolanızı girin");
        password = sca.nextLine();

        if (userName.equals("patika")&& password.equals("java123")) {
            System.out.println("Başarılı giriş");
        }
        else {
            System.out.println("Hatalı giriş");
            System.out.println("Şifrenizi sıfırlamak ister misiniz ?");
            System.out.println("E / " + "H");
            s1 = sca.nextLine();

            if (s1.equals("E")) {
                System.out.println("Yeni kullanıcı adınız ?");
                k1 = sca.nextLine();
                System.out.println(k1);
                System.out.println("Yeni parolanız ?");
                p1 = sca.nextLine();
                if (k1.equals("patika")||p1.equals("java123")) {
                    System.out.println("Şifre oluşturulamadı lütfen başka şifre giriniz !\nBir önceki şifre ile aynı olamaz !");
                }else{
                    System.out.println("Şifre oluşturuldu");
                }
            }else {
                System.out.println("Kullanıcı adı parolanız değiştirilmedi");
            }
        }
    }
}
