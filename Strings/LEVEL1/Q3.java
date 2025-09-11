package Strings.LEVEL1;
import java.util.Scanner;

public class Q3 {

    static char[] customToCharArray(String text) {
        char[] arr = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }
        return arr;
    }

    static boolean compareArrays(char[] a1, char[] a2) {
        if (a1.length != a2.length) return false;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        char[] arr1 = customToCharArray(text);
        char[] arr2 = text.toCharArray();

        System.out.println("Custom Array Length: " + arr1.length);
        System.out.println("Builtin Array Length: " + arr2.length);
        System.out.println("Arrays equal? " + compareArrays(arr1, arr2));
    }
}