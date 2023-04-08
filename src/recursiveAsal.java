public class Main {
    public static void main(String[] args) {
         class AsalSayiHesaplama {

            // Recursive fonksiyon ile asal sayı hesaplama
            public static boolean isPrime(int num, int divisor) {
                // Taban durumlar
                if (num <= 1) {
                    return false;
                } else if (divisor == 1) {
                    return true;
                }

                // Eğer num, divisor'e tam bölünüyorsa asal sayı değil
                if (num % divisor == 0) {
                    return false;
                }

                // Bir sonraki böleni kontrol etmek için recursive çağrı
                return isPrime(num, divisor - 1);
            }

            public static void main(String[] args) {
                int num = 17; // Asal sayıyı kontrol etmek istediğimiz sayı
                boolean result = isPrime(num, num - 1); // Recursive fonksiyonu çağır

                if (result) {
                    System.out.println(num + " asal bir sayıdır.");
                } else {
                    System.out.println(num + " asal bir sayı değildir.");
                }
            }
        }

    }
}
