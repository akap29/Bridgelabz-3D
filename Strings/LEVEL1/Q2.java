package Strings.LEVEL1;
import java.util.Scanner;

public class Q2 {

    static String substringUsingCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    static boolean compare(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String sub1 = substringUsingCharAt(text, start, end);
        String sub2 = text.substring(start, end);

        System.out.println("Manual substring: " + sub1);
        System.out.println("Built-in substring: " + sub2);
        System.out.println("Are they equal? " + compare(sub1, sub2));
    }
}