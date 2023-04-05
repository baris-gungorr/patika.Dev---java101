public class Main {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean asalMi = true; // Asal sayılar için kontrol değişkeni
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    asalMi = false;
                    break; // Eğer bölen bulunursa içteki döngüden çık
                }
            }
            if (asalMi) {
                System.out.print(i + " ");
            }
        }
    }
}
