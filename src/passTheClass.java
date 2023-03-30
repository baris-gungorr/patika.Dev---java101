import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

      /*  int fzk,kmy,mat,byl,trk;
        Scanner sca = new Scanner(System.in);

        System.out.println("Fizik notunu girin: ");
        fzk = sca.nextInt();
        System.out.println(fzk);

        System.out.println("Kimya notunu girin: ");
        kmy = sca.nextInt();
        System.out.println(kmy);

        System.out.println("Matematik notunu girin: ");
        mat = sca.nextInt();
        System.out.println(mat);

        System.out.println("Biyoloji notunu girin: ");
        byl = sca.nextInt();
        System.out.println(byl);

        System.out.println("Türkçe notunu girin: ");
        trk = sca.nextInt();
        System.out.println(trk);

       double ortalama =(fzk+kmy+mat+byl+trk) /5; */
    
      // Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın. <<<<
       
        Scanner input =new Scanner(System.in);
        int mat,fiz,tr,kim,muzik;
        int toplam=0;
        int dersSayisi=5;

        System.out.println("Matematik notunuzu giriniz:");
        mat=input.nextInt();

        if (mat>100||mat<0){
            System.out.println("Bu ders notu doğru aralıklarda girilmedi <> Ortalamaya dahil edilmeyecek.");
            dersSayisi = dersSayisi -1;
        }else{
            toplam=toplam+mat;
        }
        System.out.println("Fizik notunuzu giriniz:");
        fiz=input.nextInt();
        if (fiz>100||fiz<0){
            System.out.println("Bu ders notu doğru aralıklarda girilmedi <> Ortalamaya dahil edilmeyecek.");
            dersSayisi=dersSayisi-1;
        }else{
            toplam=toplam+fiz;
        }
        System.out.println("Türkçe notunuzu giriniz:");
        tr=input.nextInt();
        if (tr>100||tr<0){
            System.out.println("Bu ders notu doğru aralıklarda girilmedi <> Ortalamaya dahil edilmeyecek.");
            dersSayisi=dersSayisi-1;
        }
      else{
            toplam=toplam+tr;
        }
        System.out.println("Kimya notunuzu giriniz:");
        kim=input.nextInt();
        if (kim>100||kim<0){
            System.out.println("Bu ders notu doğru aralıklarda girilmedi <> Ortalamaya dahil edilmeyecek.");
            dersSayisi=dersSayisi-1;
        }
      else{
            toplam=toplam+kim;
        }
        System.out.println("Müzik notunuzu giriniz:");
        muzik=input.nextInt();
        if (muzik>100||muzik<0){
            System.out.println("Bu ders notu doğru aralıklarda girilmedi <> Ortalamaya dahil edilmeyecek.");
            dersSayisi=dersSayisi-1;
        }
      else{
            toplam=toplam+muzik;
        }
        double ortalama=(toplam)/dersSayisi;

        if(ortalama<=55){
            System.out.println("Maalesef sınıf tekrarı :/ ");
        }
      else {
            System.out.println("Tebrikler! Sınıfı geçtiniz");
        }
        System.out.println("Ortalamanız: " +ortalama);

        }
    }
