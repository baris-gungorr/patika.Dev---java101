import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      
        Scanner sca = new Scanner(System.in);
        int month;
        int day;
        String burc = "";
        boolean isError = false;

        System.out.println("Doğdunuz ay (1--12)");
        month = sca.nextInt();
        System.out.println(month);

        System.out.println("Doğduğunuz gün ?");
        day = sca.nextInt();
        System.out.println(day);

        if (month == 1) {
            if (day > 1 && day < 31 ) {
                if (day > 22) {
                    burc = "Oğlak";
                } else {
                    burc = "Kova";
                }
            } else {
                isError = true;
            }
        } else if (month == 2) {
            if (day > 1 && day < 29 ) {
                if (day > 19) {
                    burc = "Balık";
                } else {
                    burc = "Kova";
                }
            } else {
                isError = true;
            }
        } else if (month == 3) {
            if (day > 1 && day < 31 ) {
                if (day > 20) {
                    burc = "Koç";
                } else {
                    burc = "Balık";
                }
            } else {
                isError = true;
            }
        } else if (month == 4) {
            if (day > 1 && day < 30 ) {
                if (day > 20) {
                    burc = "Boğa";
                } else {
                    burc = "Koç";
                }
            } else {
                isError = true;
            }
        } else if (month == 5) {
            if (day > 1 && day < 31 ) {
                if (day > 21) {
                    burc = "İkizler";
                } else {
                    burc = "Boğa";
                }
            } else {
                isError = true;
            }
        } else if (month == 6) {
            if (day > 1 && day < 30 ) {
                if (day > 22) {
                    burc = "Yengeç";
                } else {
                    burc = "İkizler";
                }
            } else {
                isError = true;
            }
        } else if (month == 7) {
            if (day > 1 && day < 31 ) {
                if (day > 22) {
                    burc = "Aslan";
                } else {
                    burc = "Yengeç";
                }
            } else {
                isError = true;
            }
        } else if (month == 8) {
            if (day > 1 && day < 31 ) {
                if (day > 22) {
                    burc = "Başak";
                } else {
                    burc = "Aslan";
                }
            } else {
                isError = true;
            }
        } else if (month == 9) {
            if (day > 1 && day < 30) {
                if (day > 22) {
                    burc = "Terazi";
                } else {
                    burc = "Başak";
                }
            } else {
                isError = true;
            }
        } else if (month == 10) {
        if (day > 1 && day < 31 ) {
            if (day > 22) {
                burc = "Akrep";
            } else {
                burc = "Terazi";
            }
        } else {
            isError = true;
        }
        } else if (month == 11) {
            if (day > 1 && day < 30 ) {
                if (day > 21) {
                    burc = "Yay";
                } else {
                    burc = "Akrep";
                }
            } else {
                isError = true;
            }
        } else if (month == 12) {
            if (day > 1 && day < 31 ) {
                if (day > 21) {
                    burc = "Oğlak";
                } else {
                    burc = "Yay";
                }
            } else {
                isError = true;
            }
        } else {
            isError = true;
        }

        if (isError) {
            System.out.println("Hatalı giriş yaptınız!");
        } else {
            System.out.println("Burcunuz: " + burc);
        }
    }
}
