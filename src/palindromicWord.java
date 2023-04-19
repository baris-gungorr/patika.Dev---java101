import java.util.Scanner;

public class Main {
    public static boolean isPalindrome(String text){
        int i = 0;
        int j = text.length()-1;
        while(i<j){
            if(text.charAt(i) != text.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input Text : ");
        String text = input.next();
        if(isPalindrome(text)){
            System.out.println(text + " is Palindrome");
        }else{
            System.out.println(text + " not Palindrome");
        }
    }
}
