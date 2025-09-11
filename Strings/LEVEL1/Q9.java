package Strings.LEVEL1;
import java.util.Scanner;

public class Q9 {

    static String toUpperCaseCustom(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result += (char)(ch - 32);
            } else {
                result += ch;
            }
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
        String text = sc.nextLine();

        String custom = toUpperCaseCustom(text);
        String builtin = text.toUpperCase();

        System.out.println("Custom: " + custom);
        System.out.println("Built-in: " + builtin);
        System.out.println("Are equal? " + compare(custom, builtin));
    }
}