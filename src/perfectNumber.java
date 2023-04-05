public class Main {
    public static void main(String[] args) {
        /* Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı
        kendisine eşit olan sayıya mükemmel sayı denir. */
        // 6 mükemmel sayıdır çünkü 1, 2 ve 3 pozitif tam bölenleridir ve 1 + 2 + 3 = 6

        int number;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı girin: ");
        number = input.nextInt();

        for (int i = 1; i <= number/2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum == number) {
            System.out.println(number + " bir mükemmel sayıdır.");
        } else {
            System.out.println(number + " bir mükemmel sayı değildir.");
        }
    }
}
